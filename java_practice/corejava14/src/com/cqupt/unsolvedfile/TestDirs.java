package com.cqupt.unsolvedfile;

import java.io.File;

public class TestDirs {
public static void main(String[] args) {
		
		//showfile(new File("C:/Program Files/Java/jdk1.7.0_17"));
		File files = new File("c:\\");
		System.out.println(files.listRoots().length);
		File [] s = files.listRoots();
		for (File file : s) {
			System.out.println(file.getPath());
		}
	}
	//ตÝน้
	public static void showfile(File file)
	{
		File[] fs = file.listFiles();
		for (File file2 : fs) {
			
			if(file2.isDirectory())
			{
				
				showfile(file2);
			}else
			{
				System.out.println(file2.getPath());
			}
		}
		
	}

}
