package com.cqupt.list;

import java.util.ArrayList;
import java.util.List;

public class TestStulist {
	public static void main(String[] args) {
		int a=Menuehelp.menu();
		
		switch(a) {
		case 1:
			
			break;

		default:System.out.println("输入错误，请重新输入");
		
		}
		List li=new ArrayList();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		li.add(s5);
		//遍历集合里面的对象
		UseIterator.PrintIte(li);
		//调用添加学生方法
	    System.out.println(StuListTool.findByName("Lisi1", li));
		//调用删除一个学生的方法
		
	}

}
