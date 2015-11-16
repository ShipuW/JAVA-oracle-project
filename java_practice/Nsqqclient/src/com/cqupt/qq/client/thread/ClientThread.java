package com.cqupt.qq.client.thread;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

import javax.swing.JFrame;

import com.cqupt.qq.bean.Response;
import com.cqupt.qq.client.process.impl.LoginProcess;

public class ClientThread implements Runnable{
	private Socket sk;
	private boolean runable=true;
	private JFrame jf = null;
	
	public ClientThread(Socket sk,JFrame jf) {
		super();
		this.jf = jf;
		this.sk = sk;
	}
	public ClientThread() {
		super();
	}
	public void run(){
		//输入输出流应该放在循环里来引用类型，否则第二次循环得到的输入输出流
		//不能被辩立（管道不能被另外一个管道赋值）
		/*InputStream is = null;
		ObjectInputStream ois = null;*/
		while(runable){
		try {
			
			InputStream is = sk.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
				//读到服务端的响应流
				Response res = (Response)ois.readObject();
				//获取服务端的响应标示
				String servname = res.getResponseServerName();
				if(servname.equals("login")){
					new LoginProcess().process(sk,res);
			}
		} catch (Exception e) {
			this.runable=false;
			e.printStackTrace();
		}
		}
	}
}
