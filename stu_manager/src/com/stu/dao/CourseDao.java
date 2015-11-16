package com.stu.dao;

import java.sql.ResultSet;
import java.util.List;

import com.stu.entity.Course;

public interface CourseDao {
	public List<Course> add(List<Course> listcourse );
	public boolean update(List<Course> listcourse);
	public boolean del(int courseid);
	public List<Course> getAll();
	public ResultSet result();
}
