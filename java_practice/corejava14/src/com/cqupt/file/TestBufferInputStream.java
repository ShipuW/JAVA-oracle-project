package com.cqupt.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestBufferInputStream {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("c:/1.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int a = 0;
		int count = 0;
		bis.skip(2);
		while ((a = bis.read()) != -1) {
			System.out.println((char) a);
			count++;
		}
		System.out.println(count);
		fis.close();
		bis.close();
	}
}
