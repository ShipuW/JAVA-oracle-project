package com.cqupt.chario;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestRead {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("c:/1.txt");
		byte[] b = new byte[20];
		/*int a= 0;
		int count = 0;
		while((a= fis.read())!=-1)
		{
			System.out.print((char)a);
			count++;
		}*/
		int length;
		length = fis.read(b);
		String s = new String(b,0,length);
		System.out.println(s);
		fis.close();
		
	}

}
