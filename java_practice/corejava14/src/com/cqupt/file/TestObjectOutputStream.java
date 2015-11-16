package com.cqupt.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class TestObjectOutputStream {
	public static void main(String[] args) throws Exception {
		/*Student stu1 = new Student("zhangsan",18);
		Student stu2 = new Student("lisi",18);
		FileOutputStream fos = new FileOutputStream("stu.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(stu1);
		oos.writeObject(stu2);
		oos.close();*/
		FileInputStream fin = new FileInputStream("stu.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		Student stu1 = (Student)oin.readObject();
		Student stu2 = (Student)oin.readObject();
		System.out.println(stu1.name+" "+stu1.age);
		System.out.println(stu2.name+" "+stu2.age);
		
	}
	

}
