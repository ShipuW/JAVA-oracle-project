package com.cqupt.annotion;

import java.util.ArrayList;
import java.util.List;

public class TestAnnotaion {
	private int age;
	@Override
	public String toString(){
		return "hello";
	}
	public static void main(String[] args){
		@SuppressWarnings({"rawtupe","uused"})
		List l = new ArrayList();
		@SuppressWarnings("unused")
		int a=9;
		add(10);
		
		int c =99;
	}
	@Deprecated
	public static  int add(int a)
	{
		return a;
	}
	@Test(value="hello",age="20")
	public void hello()
	{
		
	}
	
}
