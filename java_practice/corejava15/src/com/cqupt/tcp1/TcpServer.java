package com.cqupt.tcp1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(2600);
		System.out.println("�ȴ����ӡ�������");
		Socket sk = ss.accept();
		System.out.println("���ӳɹ�");
		InputStream is = sk.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader bis = new BufferedReader(isr);
		System.out.println("�ȴ��ͻ������ݡ�������");
		String s = null;
		while(!(s=bis.readLine()).equals("exit")){
			System.out.println("client:"+s);
			
		}
		bis.close();
		ss.close();
		
	}

}
