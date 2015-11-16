package com.cqupt.testppt;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Set set=new HashSet();
		Set set=new HashSet();
		/*String  s = new String("abc");
		set.add("abc");
		set.add("ab");
		set.add("ac");
		set.add("bc");
		set.add("abcd");
		set.add(s);
		System.out.println(set.size());
		Iterator it=set.iterator();
		for (int i = 0; i < set.size(); i++) {
			System.out.println(it.next());
			
		}*/
		Student s1  = new Student(1, "z");
		Student s2 = new Student(1, "z");
		Student s3  = new Student(1, "z");
		Student s4  = new Student(1, "z");
		Student s5  = new Student(1, "z");
		System.out.println(s1.equals(s5));
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		Iterator it=set.iterator();
		for (int i = 0; i < set.size(); i++) {
			System.out.println(it.next());
			
		}
	}

}
