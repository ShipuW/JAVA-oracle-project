package com.stu.dao;

import java.util.List;

import com.stu.model.Course;

	public interface CourseDao {
		
		
	public boolean add(Course course);
	
	public boolean del(int cno);
	
	public boolean update(Course course);
	
	public List<Course> getAll();
}
