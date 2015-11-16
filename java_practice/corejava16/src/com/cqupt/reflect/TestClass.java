package com.cqupt.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestClass {
	public static void main(String[] args) throws Exception {
		Class c1 = Student.class;
		
		Student s = new Student();
		
		Class c2 = s.getClass();
		
		
		Class c3 = Class.forName("com.cqupt.reflect.Student");
		
		System.out.println("全名:"+c1.getName());
		System.out.println("简单名称:"+c2.getSimpleName());
		System.out.println("super class:"+c2.getSuperclass().getName());
		Class [] infs = c2.getInterfaces();
		for (Class in : infs) {
			System.out.println(in.getName());
		}
		System.out.println("---------Method--------getDeclaredMethods- me-------------------");
		Method[] th = c2.getDeclaredMethods();
		System.out.println("student method:");
		for (Method method : th) {
			System.out.println(method);
		}
		System.out.println("---------Method-------getMethods public--------------------");
		Method[] th2 = c2.getMethods();
		for (Method method : th2) {
			System.out.println(method);
		}
		System.out.println(th2.length);
		System.out.println("----------Field-------------getDeclaredFields---me-all-------------------------");
		Field[] fis = c2.getDeclaredFields();
		for (Field field : fis) {
			System.out.println(field);
		}
		System.out.println("----------Field-------------getFields--------public---------------------");
		Field[] fiss = c2.getFields();
		for (Field field : fiss) {
			System.out.println(field);
		}
		System.out.println("--------------newInstance--------------------");
		Student ss = (Student) c2.newInstance(); //调用无参构造方法
		System.out.println(ss.age);
		System.out.println("--------------setAccessible--------------------");
		System.out.println(ss.getMoney());
		Field f =c2.getDeclaredField("my");//改变访问属性
		f.setAccessible(true);
		f.set(ss, 88);
		System.out.println(ss.getMoney());
		
}
}
