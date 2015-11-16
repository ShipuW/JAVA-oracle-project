package com.cqupt.file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestDataOutputStream {
	public static void main(String[] args) throws Exception  {
		/*FileOutputStream pos = new FileOutputStream("c:/113.txt");
		DataOutputStream dps = new DataOutputStream(pos);
		double a = 123.456;
		dps.writeDouble(a);
		pos.close();
		dps.close();*/
		FileInputStream fis = new FileInputStream("c:/113.txt");
		DataInputStream dis = new DataInputStream(fis);
		System.out.println(dis.readDouble());
		fis.close();
		dis.close();
		
		}
		
	}
	

