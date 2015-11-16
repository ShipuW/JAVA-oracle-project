package com.oracle.test;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oracle.model.Contact;
import com.oracle.model.Student;
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
			student.setName("����");
			Contact contact1=new Contact();
			contact1.setMethod("telphone");
			contact1.setAddress("88888888");
			

			Contact contact2=new Contact();
			contact2.setMethod("address");
			contact2.setAddress("����");
			
			student.getContacts().add(contact1);
			student.getContacts().add(contact2);
			
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
