package com.oracle.test;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.oracle.bean.Person;

/**
 * ���� gson
 * 
 * @author Administrator
 * 
 */
public class GsonTest {
	public static void main(String[] args) {
		// *******************����ת��ΪGson****************************
		// ................��ȡ���ݿ�������Ӧ��������Ϣ
		Person person = new Person();
		// ����ֵ�����ǿ�����Ŀʱ��ͨ���õ����ݿ��ֵ��������
		person.setName("java");
		person.setAge(30);

		// �õ�gson����
		Gson gson = new Gson();
		// /���ý�����ת��Ϊgson
		String str = gson.toJson(person);
		System.out.println(str);
		// {"name":"java","age":30}

		// *******************Gsonת��Ϊ�������*********************************************
		// ��gson����ת��Ϊ�������
		Person p1 = gson.fromJson(str, Person.class);
		// ���gsonת�����ֵ
		System.out.println(p1.getName());
		System.out.println(p1.getAge());

		// ********************��ѯ���б����Ϣ�����ص�List��*************************************
		List<Person> list = new ArrayList<Person>();
		// ͨ�����ݿ�õ�ֵ
		for (int i = 0; i < 2; i++) {
			// ����һ���������
			Person p = new Person();
			p.setName("oracle" + (i + 1));
			p.setAge(i + 1);
			// �����������ӵ�������ȥ
			list.add(p);
		}
		System.out.println("\n��ʾListת�����ֵ");
		// ת��ΪGson����
		String strlist = gson.toJson(list);
		System.out.println(strlist);

		// ************��gson�е�listת��ΪList*********************
		// fromJson(gson�Ķ����ַ���, ����Ӧ������)
		// new TypeToken<T>() {}.getType();
		// 1.new TypeToken()
		// 2.new TypeToken<List<Person>>()
		// 3.new TypeToken<List<Person>>() { }.getType()
		List<Person> list1 = gson.fromJson(strlist,
				new TypeToken<List<Person>>() {
				}.getType());
		for (int i = 0; i < list1.size(); i++) {
			Person per = list1.get(i);
			System.out.println("��������еĵ�" + (i + 1) + "����" + per.getName()
					+ "����:" + per.getAge());
		}
	}
}
