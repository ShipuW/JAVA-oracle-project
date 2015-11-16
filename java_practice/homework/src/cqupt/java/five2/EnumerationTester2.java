package cqupt.java.five2;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTester2 {

	/**
	 * �����⣺�Ķ����򣬲�����������
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] num = {"one","two","three","four","five",
				"six","seven","eight","nine","ten"};
		/*
		 * ����һ������ָ��ListԪ�ص���������ЩԪ�ذ���List�ĵ���������Ԫ�ص�˳������
		 * List<T> asList(T..a)����һ����ָ������֧�ֵĹ̶���С���б� 
		 */
		Vector<String> aVector = new Vector<String>(java.util.Arrays.asList(num));
		System.out.println("Before Vector:"+aVector);
		//������Ϊ��Before Vector:[one, two, three, four, five, six, seven, eight, nine, ten]
		Enumeration<String> nums = aVector.elements();//���ش����������ö��
		//ѭ����������ö���Ƿ񻹰��������Ԫ��
		while(nums.hasMoreElements()){
			String aString = (String)nums.nextElement();
			System.out.println(aString);
			//��������one<br>two<br>three<br>five<br>six<br>seven<br>nine<br>Ten
			if(aString.length()>4){
				aVector.remove(aString);
			}
		}
		System.out.println("After Vector:"+aVector);
		//��������After Vector:[one, two, four, five, six, eight, nine, ten]
 	}

}
