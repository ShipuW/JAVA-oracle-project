package com.oracle.mountain;

import java.util.ArrayList;
import java.util.List;


/**
 * ��è����Ϣ��ӵ�������ȥ
 * 
 * @author Administrator
 *
 */
public class TestCat {
	/**
	 * �õ�����è�ļ�����Ϣ
	 * 
	 * @return
	 *
	 */
	public List<Cat> getAll(){
		List<Cat> list = new ArrayList<Cat>();
		for (int i = 0; i < 10; i++) {
			 Cat cat = new Cat();
			 cat.setName("С��"+i);
			 cat.setAge(i);
			 cat.setClor("��ɫ"+i);
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
