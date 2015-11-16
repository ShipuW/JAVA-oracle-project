package com.oracle.test;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.oracle.model.Person;
import com.oracle.util.HibernateUtil;

/**
 * 
 * @author Mountainpeople
 * 
 */
public class QueryObjectTest {
	public static void main(String[] args) {
		// ����session
		Session session = HibernateUtil.openSession();
		// ����
		Transaction tx = null;
		try {
			// ��������
			tx = session.beginTransaction();
			// ��ѯ���������ж�Ӧ������ֵ..���ַ�ʽ �Ĳ�ѯ��Ϊ��̬��ѯ
			//��ѯ���е����ݿ����Ϣ
			Query query = session.createQuery("from java.lang.Object");
			Iterator iter = query.iterate();
			while (iter.hasNext()) {
				System.out.println(iter.next().getClass().getName());
			}
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
