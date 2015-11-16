package com.stu.dao;

import java.util.List;

import com.stu.model.Student;

public interface StudentDao {
	
	public boolean add(Student stu);
	
	public boolean del(String sno);
	
	public boolean update(Student stu);
	
	public Student findByNo(String sno);
	
	public List<Student> getAll();
}
