package com.stu.biz;

import java.util.List;

import com.stu.model.Student;

public interface StudentBiz {
	
	public boolean addStu(Student stu);
	
	public boolean delStu(String sno);
	
	public boolean updateStu(Student stu);
	
	public Student getStuInfo(String sno);
	
	public List<Student> getAllStu();
}
