package com.cqupt.tcpofzenghong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 * @author Administrator
 *
 */
public class Tcpserver {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(9000);
		//在等待客服端连接  阻塞
		System.out.println("等待连接......");
		Socket sk =ss.accept();
		System.out.println("连接成功");
		//通过socket拿到输入流
		InputStream is = sk.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("等待客户端内容.....");
		
		String s =null;
		//按行从输入流管道中取得数据
		while(!(s=br.readLine()).equals("exit"))
		{
			System.out.println("client:"+s);
		}
		br.close();
		sk.close();
	}
}
