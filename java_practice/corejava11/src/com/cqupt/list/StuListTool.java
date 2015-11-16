package com.cqupt.list;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StuListTool {
	// 根据姓名查找
	public static Student findByName(String s, List li) {
		Iterator it = li.iterator();
		for (int i = 0; i < li.size(); i++) {
			Student stu = (Student) it.next();
			if (stu.getName().equals(s)) {
				return stu;
			}
		}
		System.out.println("输入错误，该同学找不到！");
		return null;
	}
	//添加学生
	public static void addStu(List li){
		Student stu=null;
		stu.setName((String)Input.input("输入学生姓名:"));
		stu.setAge(Input.input("输入学生年龄："));
	    stu.setId((String)Input.input("输入学生学号："));
	    stu.setSex((String)Input.input("输入学生性别:"));
		
		
		li.add(stu);
		UseIterator.PrintIte(li);	
	}

	// 删除一个学生
	public static void deleteByName(String name, List li) {
		Student stu = findByName(name, li);
		if (stu != null) {
			li.remove(stu);
			UseIterator.PrintIte(li);
		}
	}
}
