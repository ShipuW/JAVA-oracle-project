package com.cqupt.unsolvedfile;
import java.io.File;
import java.io.IOException;

public class TestFiles {
	public static void main(String[] args) {
		//�����ļ�
/*		File file = new File("1.txt");
		if(!file.exists())
		{
			try {
				//����һ���ļ�
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//��ȡ�ļ���С
		System.out.println(file.length());*/
		
		//����Ŀ¼
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
