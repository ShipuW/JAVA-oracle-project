package com.ajax.biz;

import java.util.List;

import com.ajax.dao.StudentDao;
import com.ajax.entity.Student;
import com.google.gson.Gson;

/**
 * ��ѯѧ����Ϣ
 * 
 * @author ��˧
 *
 */
public class StudentBiz{
	public Student quryById(String stuId) {
		return new StudentDao().queryById(stuId);
	}
	public List<Student> quryAll(){
		return new StudentDao().queryAll();
	}
	public static void main(String[] args) {
		List<Student> list = new StudentBiz().quryAll();
		//Gsonת��
		Gson gson = new Gson();
		System.out.println(gson.toJson(list));
	}
}
