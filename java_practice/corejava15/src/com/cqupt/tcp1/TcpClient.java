package com.cqupt.tcp1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	public static void main(String[] args) throws Exception, Exception{
		Socket sk = new Socket("127.0.0.1", 2600);
		OutputStream os = sk.getOutputStream();
		OutputStreamWriter osw= new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		while(!(s=br.readLine()).equals("exit")){
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
		sk.close();
		
	}
}
