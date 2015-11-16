package com.cqupt.qq.server.process.impl;

import java.net.Socket;

import javax.swing.JTextArea;

import com.cqupt.qq.bean.PropertiesUtil;
import com.cqupt.qq.bean.Request;
import com.cqupt.qq.bean.Response;
import com.cqupt.qq.bean.User;
import com.cqupt.qq.server.proces.ServerProcessI;
import com.cqupt.qq.server.thread.ServerSonThread;

public class LoginService implements ServerProcessI{

	@Override
	public void Service(Request req, Socket sk, JTextArea infot,
			ServerSonThread th) {
		User u = req.getUser();
		int id = u.getUid();
		String pass = u.getPass();
		infot.setText(infot.getText()+"\r\n帐号"+id+"在尝试登陆");
		Response resp = new Response();
		if(PropertiesUtil.check(id)){
			if(PropertiesUtil.checkpass(id, pass)){
				//对U应该在添加一属性的值
				resp.setToUser(u);
				resp.setResponseCode(resp.LOGIN_OK);
				infot.setText(infot.getText()+"\r\n帐号"+id+"登陆成功");
			}else{
				resp.setResponseCode(resp.LOGIN_ERR_PASS);
				infot.setText(infot.getText()+"\r\n帐号"+id+"密码错误");
			}
			
		}else{
			resp.setResponseCode(resp.LOGIN_ERR_NAME);
			infot.setText(infot.getText()+"\r\n帐号"+id+"不存在");
		}
		//告知客户端标示
		resp.setResponseServerName("login");
		//返回给客户端
		resp.send(sk);
		
	}
	
	
}
