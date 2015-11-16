package com.cqupt.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestCopyFile2 {
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("c:/1.txt");
		FileOutputStream fos = new FileOutputStream("C:/3.txt");
		int count=0;
		int i=1;
		byte[] b = new byte[10];
		while((fis.read(b))!=-1){
			fos.write(b);
			for (byte c : b) {
				System.out.println((i++)+": "+c);
			}
			count++;
		}
		System.out.println("*******************");
		System.out.println(count);
		fis.close();
		fos.close();
	}
	/*public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("c:/1.txt");
		
		
		FileOutputStream fos = new FileOutputStream("d:/1.txt");
		
		byte[] b = new byte[10];
		
		int count=0;
		while(fis.read(b)!=-1)
		{
			
			fos.write(b);
			
			for (byte c : b) {
				System.out.print((char)c);
			}
			count++;
		}
		System.out.println(count);

	}
*/
}
