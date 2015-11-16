package com.oracle.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oracle.model.Course;
import com.oracle.model.Student;
import com.oracle.util.HibernateUtil;

public class Update {
	public static void main(String[] args) {
		// 创建session
		Session session = HibernateUtil.openSession();
		// 事务
		Transaction tx = null;
		try {
			// 开启事务
			tx = session.beginTransaction();
			Student student=(Student)session.get(Student.class, "402881e5487d720201487d72039e0000");
			Course course =(Course)session.get(Course.class, "402881e5487d720f01487d7210c90001");
			student.getCourses().add(course);
			course.getStudents().add(student);
			
			//删除不选择的课程
			//student.getCourses().remove(course);
			// 提交事务
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			HibernateUtil.close(session);
		}
		System.exit(0);
	}
}
