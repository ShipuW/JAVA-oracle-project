package com.cqupt.tcpofzenghong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * �����
 * @author Administrator
 *
 */
public class Tcpserver {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(9000);
		//�ڵȴ��ͷ�������  ����
		System.out.println("�ȴ�����......");
		Socket sk =ss.accept();
		System.out.println("���ӳɹ�");
		//ͨ��socket�õ�������
		InputStream is = sk.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("�ȴ��ͻ�������.....");
		
		String s =null;
		//���д��������ܵ���ȡ������
		while(!(s=br.readLine()).equals("exit"))
		{
			System.out.println("client:"+s);
		}
		br.close();
		sk.close();
	}
}
