package com.oracle.test;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oracle.model.Course;
import com.oracle.model.Student;
import com.oracle.util.HibernateUtil;

/**
 * 级联保存
 * 
 * @author Mountainpeople
 * 
 */
public class SaveTest {
	public static void main(String[] args) {
		// 创建session
		Session session = HibernateUtil.openSession();
		// 事务
		Transaction tx = null;
		try {
			// 开启事务
			tx = session.beginTransaction();
			Student student = new Student();
			student.setName("成龍");
			
			Course course=new Course();
			course.setName("語文");
			
			student.setCourses(new HashSet<Course>());
			course.setStudents(new HashSet<Student>());
			
			student.getCourses().add(course);
			course.getStudents().add(student);
			
			session.save(student);
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
