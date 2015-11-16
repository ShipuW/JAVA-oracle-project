package cqupt.java.five2;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTester2 {

	/**
	 * 第五题：阅读程序，并给出输出结果
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] num = {"one","two","three","four","five",
				"six","seven","eight","nine","ten"};
		/*
		 * 构造一个包含指定List元素的向量，这些元素按照List的迭代器返回元素的顺序排列
		 * List<T> asList(T..a)返回一个受指定数组支持的固定大小的列表 
		 */
		Vector<String> aVector = new Vector<String>(java.util.Arrays.asList(num));
		System.out.println("Before Vector:"+aVector);
		//输出结果为：Before Vector:[one, two, three, four, five, six, seven, eight, nine, ten]
		Enumeration<String> nums = aVector.elements();//返回此向量组件的枚举
		//循环条件：此枚举是否还包含更多的元素
		while(nums.hasMoreElements()){
			String aString = (String)nums.nextElement();
			System.out.println(aString);
			//输出结果：one<br>two<br>three<br>five<br>six<br>seven<br>nine<br>Ten
			if(aString.length()>4){
				aVector.remove(aString);
			}
		}
		System.out.println("After Vector:"+aVector);
		//输出结果：After Vector:[one, two, four, five, six, eight, nine, ten]
 	}

}
