package com.cqupt.qq.server.process.impl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Properties;

import javax.swing.JTextArea;

import com.cqupt.qq.bean.Request;
import com.cqupt.qq.bean.Response;
import com.cqupt.qq.bean.User;
import com.cqupt.qq.server.proces.ServerProcessI;
import com.cqupt.qq.server.thread.ServerSonThread;

public class RegService implements ServerProcessI{

	@Override
	public void Service(Request req, Socket sk, JTextArea infot,
			ServerSonThread th) {
		infot.setText(infot.getText()+"\r\n已经进入RegService");
		System.out.println("客户要注册的用户名:"+req.getUser().getUname());
		System.out.println("客户的电话号码："+req.getUser().getTel());
		System.out.println("客户的密码："+req.getUser().getPass());
		//生成QQ
		int qq = buildqq();
		
		
		//写文件 记录当前用户信息
		String  path = System.getProperty("user.dir");
		try {
			FileInputStream fis =  new FileInputStream(path+"/src/com/cqupt/qq/bean/User.properties");
			Properties pr = new Properties();
			pr.load(fis);
			fis.close();
			OutputStream os = new FileOutputStream(path+"/src/com/cqupt/qq/bean/User.properties");
			pr.setProperty(qq+".id", String.valueOf(qq));
			pr.setProperty(qq+".name", req.getUser().getUname());
			pr.setProperty(qq+".pass", req.getUser().getPass());
			pr.setProperty(qq+".tel", req.getUser().getTel());
		
			pr.store(os, "Hello");
			os.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		User u = new User(qq,req.getUser().getUname(),req.getUser().getTel(),req.getUser().getPass());
		Response rep = new Response();
		rep.setToUser(u);
		rep.send(sk);
		
		
	}
	
	public int buildqq(){
		int qq = (int)((int)10000*Math.random());
		if(!checkqq(qq)){
			return qq;
		}else{
			buildqq();
		}
		return qq;
	}
	public boolean checkqq(int qq){
		String path = System.getProperty("user.dir");
		Properties pro = new Properties();
		FileInputStream is;
		try {
			is = new FileInputStream(path+"/src/com/cqupt/qq/bean/User.properties");
			pro.load(is);
			is.close();
			String key = pro.getProperty(String.valueOf(qq));
			if(key!=null){
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
