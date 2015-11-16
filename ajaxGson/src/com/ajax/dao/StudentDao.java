package com.ajax.dao;

import java.util.ArrayList;
import java.util.List;

import com.ajax.entity.Student;

/**
 * 查询一个或多个学生信息
 * 
 * @author 朱帅
 *
 */
public class StudentDao {
	/**
	 * 查询一个学生对象
	 * 
	 */
	public Student queryById(String stuId){
		Student stu = new Student();
		if(stuId.equals("oracle")){
			stu.setStuId("oracle");
			stu.setName("oracle for java");
			stu.setAge(50);
		}else{
			stu.setStuId("test");
			stu.setName("test for java");
			stu.setAge(10);
		}
		return stu;
	}
	/**
	 * 查询多个学生对象
	 * 
	 */
	public List<Student> queryAll(){
		List<Student> list = new ArrayList<Student>();
		for (int i = 0; i < 50; i++) {
			Student stu = new Student();
			stu.setStuId("马尾"+i);
			stu.setName("马尾 for me"+i);
			stu.setAge(i);
			list.add(stu);
		}
		return list;
	}
}
