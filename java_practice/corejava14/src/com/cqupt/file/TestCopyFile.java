package com.cqupt.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class TestCopyFile {
	public static void main(String[] args) {
	FileInputStream fis = null;
	FileOutputStream fow = null;
	try {
		fow = new FileOutputStream("c:/2.txt");
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	/*String s = "cqupt";
	byte[] b = s.getBytes();
	try {
		fow.write(b);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}*/
	try {
		fis = new FileInputStream("C:/1.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("没有找到该文件！");
		e.printStackTrace();
	}
	int a = 0;
	try {
			for(int i = 0;(a=fis.read())!=-1;i++){
				System.out.println((char)a);
				fow.write(a);
		
			}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
