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
		//���������Ӧ�÷���ѭ�������������ͣ�����ڶ���ѭ���õ������������
		//���ܱ��������ܵ����ܱ�����һ���ܵ���ֵ��
		/*InputStream is = null;
		ObjectInputStream ois = null;*/
		while(runable){
		try {
			
			InputStream is = sk.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
				//��������˵���Ӧ��
				Response res = (Response)ois.readObject();
				//��ȡ����˵���Ӧ��ʾ
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
