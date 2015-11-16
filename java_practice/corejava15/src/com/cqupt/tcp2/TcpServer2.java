package com.cqupt.tcp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer2 {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(3000);
		Socket sk = ss.accept();
		InputStream is = sk.getInputStream();
		OutputStream os = sk.getOutputStream();
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		PrintWriter pw = new PrintWriter(os);
		while(true){
			String s = br.readLine();
			System.out.println("client:"+s);
			System.out.println("please input:");
			String str = bfr.readLine();
			pw.println(str);
			pw.flush();
			
		}
	}

}
