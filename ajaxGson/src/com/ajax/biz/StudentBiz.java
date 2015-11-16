package com.ajax.biz;

import java.util.List;

import com.ajax.dao.StudentDao;
import com.ajax.entity.Student;
import com.google.gson.Gson;

/**
 * 查询学生信息
 * 
 * @author 朱帅
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
		//Gson转换
		Gson gson = new Gson();
		System.out.println(gson.toJson(list));
	}
}
