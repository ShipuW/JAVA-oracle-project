package com.oracle.test;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oracle.model.Course;
import com.oracle.model.Student;
import com.oracle.util.HibernateUtil;

/**
 * ��������
 * 
 * @author Mountainpeople
 * 
 */
public class SaveTest {
	public static void main(String[] args) {
		// ����session
		Session session = HibernateUtil.openSession();
		// ����
		Transaction tx = null;
		try {
			// ��������
			tx = session.beginTransaction();
			Student student = new Student();
			student.setName("����");
			
			Course course=new Course();
			course.setName("�Z��");
			
			student.setCourses(new HashSet<Course>());
			course.setStudents(new HashSet<Student>());
			
			student.getCourses().add(course);
			course.getStudents().add(student);
			
			session.save(student);
			// �ύ����
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
