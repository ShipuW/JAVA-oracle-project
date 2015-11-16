package com.stu.biz;

import java.util.List;

import com.stu.model.Course;

public interface CourseBiz {
	
	public boolean addCos(Course course);
	
	public boolean delCos(int cno);
	
	public boolean updateCos(Course course);
	
	public List<Course> getAllCos();
 }
