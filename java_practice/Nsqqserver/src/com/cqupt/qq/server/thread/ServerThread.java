package com.cqupt.qq.server.thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JTextArea;

public class ServerThread implements Runnable{
	JTextArea infotxt;
	String name;
	

	public ServerThread(JTextArea infotxt,String s) {
		super();
		this.infotxt = infotxt;
		this.name = name;
	}


	@Override
	public void run() {
		infotxt.setText("服务端主线程已启动。。。");
		ServerSocket ss;
		try {
			ss = new ServerSocket(1500);
			while(true){
				Socket sk = ss.accept();
				Thread th = new Thread(new ServerSonThread(sk,infotxt));
				th.start();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
