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
 * �ͷ���
 * @author Administrator
 *
 */
public class Tcpclient {
	public static void main(String[] args) throws Exception, IOException {
		//Ѱ������ ͨ���˿����Ӷ�Ӧ�ĳ���
		Socket sk = new Socket("127.0.0.1", 9000);
		//ͨ��socket �õ������
		OutputStream os = sk.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		//���ܼ�������
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		String s = null;
		//��ȡ�������������
		while(!(s=br.readLine()).equals("exit"))
		{
			//ͨ������� д��ȥ
			bw.write(s);
			bw.newLine();
			//bw.write("\r\n");
			//ˢ��
			bw.flush();
		}
		
		br.close();
		bw.close();
		
		sk.close();
	}
}
