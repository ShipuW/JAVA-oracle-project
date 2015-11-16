package com.oracle.test;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.oracle.bean.Person;

/**
 * 测试 gson
 * 
 * @author Administrator
 * 
 */
public class GsonTest {
	public static void main(String[] args) {
		// *******************对象转换为Gson****************************
		// ................读取数据库里所对应的人类信息
		Person person = new Person();
		// 设置值，你们开发项目时是通过得到数据库的值进行设置
		person.setName("java");
		person.setAge(30);

		// 得到gson对象
		Gson gson = new Gson();
		// /调用将对象转换为gson
		String str = gson.toJson(person);
		System.out.println(str);
		// {"name":"java","age":30}

		// *******************Gson转换为人类对象*********************************************
		// 将gson对象转换为人类对象
		Person p1 = gson.fromJson(str, Person.class);
		// 输出gson转换后的值
		System.out.println(p1.getName());
		System.out.println(p1.getAge());

		// ********************查询所有表的信息《返回的List》*************************************
		List<Person> list = new ArrayList<Person>();
		// 通过数据库得到值
		for (int i = 0; i < 2; i++) {
			// 创建一个人类对象
			Person p = new Person();
			p.setName("oracle" + (i + 1));
			p.setAge(i + 1);
			// 把人类对象添加到集合中去
			list.add(p);
		}
		System.out.println("\n显示List转换后的值");
		// 转换为Gson对象
		String strlist = gson.toJson(list);
		System.out.println(strlist);

		// ************把gson中的list转换为List*********************
		// fromJson(gson的对象字符串, 所对应的类型)
		// new TypeToken<T>() {}.getType();
		// 1.new TypeToken()
		// 2.new TypeToken<List<Person>>()
		// 3.new TypeToken<List<Person>>() { }.getType()
		List<Person> list1 = gson.fromJson(strlist,
				new TypeToken<List<Person>>() {
				}.getType());
		for (int i = 0; i < list1.size(); i++) {
			Person per = list1.get(i);
			System.out.println("人类对象中的第" + (i + 1) + "姓名" + per.getName()
					+ "年龄:" + per.getAge());
		}
	}
}
