package com.cqupt.testppt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(14, "wwww");
		Student s2 = new Student(18, "wwww");
		Student s3 = new Student(13, "wwww");
		Student s4 = new Student(16, "wwww");
		List li = new ArrayList();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		Iterator it = li.iterator();
		for (int i = 0; i < li.size(); i++) {
			// Student stu=(Student)it.next();
			System.out.println(it.next());
		}
		System.out.println("-----------------");
		Collections.sort(li);
		it = li.iterator();
		for (int i = 0; i < li.size(); i++) {
			Student stu = (Student) it.next();
			System.out.println(stu);
		}

	}

}
