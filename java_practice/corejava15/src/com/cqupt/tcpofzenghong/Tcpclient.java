package com.cqupt.tcpofzenghong;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 客服端
 * @author Administrator
 *
 */
public class Tcpclient {
	public static void main(String[] args) throws Exception, IOException {
		//寻找主机 通过端口连接对应的程序
		Socket sk = new Socket("127.0.0.1", 9000);
		//通过socket 拿到输出流
		OutputStream os = sk.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		//接受键盘输入
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		String s = null;
		//读取键盘输入的数据
		while(!(s=br.readLine()).equals("exit"))
		{
			//通过输出流 写出去
			bw.write(s);
			bw.newLine();
			//bw.write("\r\n");
			//刷新
			bw.flush();
		}
		
		br.close();
		bw.close();
		
		sk.close();
	}
}
