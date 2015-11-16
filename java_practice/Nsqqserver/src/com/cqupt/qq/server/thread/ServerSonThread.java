package com.cqupt.qq.server.thread;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import java.net.Socket;

import javax.swing.JTextArea;

import com.cqupt.qq.bean.Request;
import com.cqupt.qq.server.proces.ServerProcessI;
import com.cqupt.qq.server.process.impl.ServerUtil;

public class ServerSonThread implements Runnable{
	private Socket sk;
	private JTextArea infot;
	public ServerSonThread(){
		super();
	}
	public ServerSonThread(Socket sk,JTextArea infot){
		super();
		this.sk = sk;
		this.infot = infot;
	}
	@Override
	public void run() {
		infot.setText(infot.getText()+"\r\n服务端启动一个子线程 代表有一个连接。。。");
		
		InputStream is;
		ObjectInputStream os;
		try {
			is=sk.getInputStream();
			os=new ObjectInputStream(is);
			while(true){
				Request re =(Request)os.readObject();
				/*if(re.getRequestServerName().equals("reg")){
					new RegService().Service(re,null,infot,this);
				}else if(re.getRequestServerName().equals("login")){
					new LoginService().Service(re,null,infot,this);	
				}*/
				String option = re.getRequestServerName();
				Class<?> obj = Class.forName(ServerUtil.getBykey(option));
				ServerProcessI spi = (ServerProcessI)obj.newInstance();
				Class<?>[]para = new Class[]{Request.class,Socket.class,JTextArea.class,ServerSonThread.class};
				Method mt = obj.getDeclaredMethod("Service", para);
				mt.invoke(spi,new Object[]{re,sk,infot,this});
				System.out.println(mt);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
