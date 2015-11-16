package com.cqupt.tcp3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.PublicKey;

public class Server3 {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(2000);
		Socket sk = ss.accept();
		InputStream is = sk.getInputStream();
		OutputStream os  = sk.getOutputStream();
		outpuThread ot = new outpuThread(os);
		inputThread it = new inputThread(is);
		it.start();
		ot.start();
		
	}
	
}
class inputThread extends Thread{
	InputStream is = null;
	public inputThread(InputStream is) {
		this.is = is;
	}
	public void run(){
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		while(true){
			String s;
			try {
					s = br.readLine();
					if(s.equals("exit"))break;
					System.out.println("client:"+s);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("***********");
			}
		}
	}
}
class outpuThread extends Thread{
	OutputStream os = null;
	public outpuThread(OutputStream os){
		this.os=os;

	}
	public void run(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(os);
		while(true){
			System.out.println("please input:");
			String s;
			try {
				s = br.readLine();
				if(s.equals("exit"))break;
				pw.println(s);
				pw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
