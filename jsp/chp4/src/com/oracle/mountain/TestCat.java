package com.oracle.mountain;

import java.util.ArrayList;
import java.util.List;


/**
 * 把猫的信息添加到集合中去
 * 
 * @author Administrator
 *
 */
public class TestCat {
	/**
	 * 得到所有猫的集合信息
	 * 
	 * @return
	 *
	 */
	public List<Cat> getAll(){
		List<Cat> list = new ArrayList<Cat>();
		for (int i = 0; i < 10; i++) {
			 Cat cat = new Cat();
			 cat.setName("小花"+i);
			 cat.setAge(i);
			 cat.setClor("黄色"+i);
			 list.add(cat);
		}
		return list;
	}
	public static void main(String[] args) {
		TestCat test = new TestCat();
		List<Cat> list = test.getAll();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
