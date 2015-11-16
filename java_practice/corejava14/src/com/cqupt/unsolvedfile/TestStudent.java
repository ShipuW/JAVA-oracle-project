package com.cqupt.unsolvedfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudent {
	public static void main(String[] args) throws Exception {
		/*Student s = new Student(1, "zhangsan", 20, 'f');
		
		FileOutputStream fos = new FileOutputStream("1.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s);
		
		fos.close();*/
		
		
		FileInputStream fis = new FileInputStream("1.txt");
		ObjectInputStream ois  = new ObjectInputStream(fis);
		
		Object ob = ois.readObject();
		System.out.println(ob);
		
		Student s =(Student)ob;
		
		System.out.println(s);
		
		fis.close();
		
		
	}
}
