package com.cqupt.list;

import java.util.Collection;
import java.util.Iterator;

public class UseIterator {
	public static void PrintIte(Collection li) {
		Iterator it = li.iterator();
		while (it.hasNext()) {
			Object ob = it.next();
			Student stu = (Student) ob;
			System.out.println(stu);
		}

	}

}
