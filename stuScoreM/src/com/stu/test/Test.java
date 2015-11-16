package com.stu.test;

import java.util.List;

import com.stu.dao.CourseDao;
import com.stu.dao.StudentDao;
import com.stu.dao.Imp.CourseDaoImp;
import com.stu.dao.Imp.StudentDaoImp;
import com.stu.model.Course;
import com.stu.model.Student;

public class Test {
	public static void main(String[] args) {
		CourseDao cdao=new CourseDaoImp();
		List<Course> clist=cdao.getAll();
		
		StudentDao sdao=new StudentDaoImp();
		List<Student> slist=sdao.getAll();
		
		for(Student stu:slist){
			System.out.println(stu.getSno()+"  "+stu.getSname());
		}
		
		for(Course cos:clist){
			System.out.println(cos.getCourseid()+"   "+cos.getCname());
		}
		
	}
}
