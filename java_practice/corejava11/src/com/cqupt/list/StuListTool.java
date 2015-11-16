package com.cqupt.list;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StuListTool {
	// ������������
	public static Student findByName(String s, List li) {
		Iterator it = li.iterator();
		for (int i = 0; i < li.size(); i++) {
			Student stu = (Student) it.next();
			if (stu.getName().equals(s)) {
				return stu;
			}
		}
		System.out.println("������󣬸�ͬѧ�Ҳ�����");
		return null;
	}
	//���ѧ��
	public static void addStu(List li){
		Student stu=null;
		stu.setName((String)Input.input("����ѧ������:"));
		stu.setAge(Input.input("����ѧ�����䣺"));
	    stu.setId((String)Input.input("����ѧ��ѧ�ţ�"));
	    stu.setSex((String)Input.input("����ѧ���Ա�:"));
		
		
		li.add(stu);
		UseIterator.PrintIte(li);	
	}

	// ɾ��һ��ѧ��
	public static void deleteByName(String name, List li) {
		Student stu = findByName(name, li);
		if (stu != null) {
			li.remove(stu);
			UseIterator.PrintIte(li);
		}
	}
}
