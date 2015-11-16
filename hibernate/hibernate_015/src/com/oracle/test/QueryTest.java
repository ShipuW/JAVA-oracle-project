package com.oracle.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oracle.model.Student;
import com.oracle.util.HibernateUtil;

/**
 * ��������Ĳ�ѯ ʹ��Serializabler��ԭ������ʹ��get��load������ʱ��Ҫ�ȹ���������ʵ��Ķ��󣬲��ҽ���ѯ����(��������)���ý�ȥ��
 * Ȼ����Ϊget��load�����ĵڶ����������ݽ�ȥ���ɡ�
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
		try {
			// ��������
			tx = session.beginTransaction();
			//��������
			Student studentPrimaryKey = new Student();
			//����ֵ
			studentPrimaryKey.setCardId("123");
			studentPrimaryKey.setName("zhangsan");
			//��ѯ
			Student student=(Student)session.get(Student.class, studentPrimaryKey);
			System.out.println(studentPrimaryKey.getAge());
			System.out.println(student.getAge());
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
