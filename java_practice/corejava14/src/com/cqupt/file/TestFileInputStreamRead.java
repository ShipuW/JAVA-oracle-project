package com.cqupt.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestFileInputStreamRead {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("c:/1.txt");
	byte[] b  = new byte[10];
		
		fis.read(b, 3, 5);
		
		for (byte c : b) {
			System.out.println((char)c);
		}
		fis.close();
	}
	}


