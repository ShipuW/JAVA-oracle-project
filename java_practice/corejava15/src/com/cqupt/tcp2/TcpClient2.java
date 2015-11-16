package com.cqupt.tcp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;



public class TcpClient2 {
	public static void main(String[] args) {
		Socket sk = null;
		try {
			 sk = new Socket("127.0.0.1",3000);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		OutputStream os = null;
		PrintWriter pw = null;
		InputStream is = null;
		BufferedReader bfr = null;
		try {
			 os  = sk.getOutputStream();
			 pw = new PrintWriter(os);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 is = sk.getInputStream();
			 bfr = new BufferedReader(new InputStreamReader(is));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true){
			System.out.println("please input:");
			String s;
			try {
				s = br.readLine();
				pw.println(s);
				pw.flush();
				String str = bfr.readLine();
				System.out.println("server say:"+str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*pw.close();
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/

			
		}
		
		
		
	}
}
