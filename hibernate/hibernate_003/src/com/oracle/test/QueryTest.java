package com.oracle.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oracle.model.Student;
import com.oracle.util.HibernateUtil;

/**
 * ������ѯ
 * 
 * @author Mountainpeople
 * 
 */
public class QueryTest {
	public static void main(String[] args) {
		// ����session
		Session session = HibernateUtil.openSession();
		// ����
		Transaction tx = null;
		Student student = null;
		try {
			// ��������
			tx = session.beginTransaction();
			student = (Student) session.get(Student.class,
					"402881e5487c5ce601487c5ce7b60000");
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
		System.out.println(student.getName());
		System.out.println(student.getIdCarid().getNumber());
		System.exit(0);
	}
}
