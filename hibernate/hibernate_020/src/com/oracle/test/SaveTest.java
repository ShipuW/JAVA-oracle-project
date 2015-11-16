package com.oracle.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.oracle.model.Student;
import com.oracle.model.Teacher;
import com.oracle.util.HibernateUtil;

/**
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
			student.setCardId("123456");
			student.setName("zhangsan");
			
			Teacher teacher=new Teacher();
			teacher.setSalary(1000);
			teacher.setName("����");
				
			session.save(student);
			session.save(teacher);
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
