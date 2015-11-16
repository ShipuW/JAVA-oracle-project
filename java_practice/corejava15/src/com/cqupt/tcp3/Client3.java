package com.cqupt.tcp3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
//one to one
public class Client3 {
	public static void main(String[] args) throws Exception, IOException {
		Socket sk = new Socket("127.0.0.1",2000);
		InputStream is = sk.getInputStream();
		//OutputStream os = sk.getOutputStream();
		cinputThread cin = new cinputThread(is);
		couThread cou = new couThread(sk);
		cou.start();
		cin.start();
		
	}
}
	class cinputThread extends Thread{
		InputStream is = null;
		public cinputThread(InputStream is) {
			this.is = is;
		}
		public void run(){
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			while(true){
				String s;
				try {
					s = br.readLine();
					if(s.equals("exit"))break;
					System.out.println("server say:"+s);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	class couThread extends Thread{
		Socket sk = null;
		OutputStream os = null;
		public couThread(Socket sk) throws IOException{
			this.sk = sk; 
			this.os= sk.getOutputStream();
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
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
						
			}
			//如果之前键盘输出是 exit，在这里就要刷新下printwriter，才能在服务端调用输入流，也就是这里的输出流。
			
		}
		
		
	}


