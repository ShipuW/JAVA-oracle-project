package com.cqupt.unsolvedfile;
import java.io.File;
import java.io.IOException;

public class TestFiles {
	public static void main(String[] args) {
		//操作文件
/*		File file = new File("1.txt");
		if(!file.exists())
		{
			try {
				//创建一个文件
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//获取文件大小
		System.out.println(file.length());*/
		
		//操作目录
		File file = new File("a/b/c");
		
		System.out.println(file.exists());
		
		if(!file.exists())
		{
			file.mkdirs();
		}
		File files = new File("5.txt");
		try {
			files.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
