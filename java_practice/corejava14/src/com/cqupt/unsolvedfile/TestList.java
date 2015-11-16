package com.cqupt.unsolvedfile;


import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) throws Exception {
		//List<Student> li = new ArrayList<Student>();
		/*li.add(new Student(1, "zhangsan1", 20, 'f'));
		li.add(new Student(2, "zhangsan2", 20, 'f'));
		li.add(new Student(3, "zhangsan3", 20, 'f'));
		
		
		FileOutputStream fos = new FileOutputStream("c:/2.dat");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(li);
		
		fos.close();
	*/
		FileInputStream fis = new FileInputStream("c:/2.dat");
		ObjectInputStream ois  = new ObjectInputStream(fis);
		
		Object ob = ois.readObject();
		List<Student> li =(ArrayList<Student>)ob;
		for (Student student : li) {
			System.out.println(student);
		}
		
	}
}
