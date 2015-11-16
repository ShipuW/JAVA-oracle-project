package com.ajax.dao;

import java.util.ArrayList;
import java.util.List;

import com.ajax.entity.Student;

/**
 * ��ѯһ������ѧ����Ϣ
 * 
 * @author ��˧
 *
 */
public class StudentDao {
	/**
	 * ��ѯһ��ѧ������
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
	 * ��ѯ���ѧ������
	 * 
	 */
	public List<Student> queryAll(){
		List<Student> list = new ArrayList<Student>();
		for (int i = 0; i < 50; i++) {
			Student stu = new Student();
			stu.setStuId("��β"+i);
			stu.setName("��β for me"+i);
			stu.setAge(i);
			list.add(stu);
		}
		return list;
	}
}
