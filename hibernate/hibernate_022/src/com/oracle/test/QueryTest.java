package com.oracle.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oracle.model.Student;
import com.oracle.model.Team;
import com.oracle.util.HibernateUtil;

/**
 * 
 * HQL������ѯ
 * @author Mountainpeople
 * 
 */
public class QueryTest {
	public static void main(String[] args) {
		// query1();
		//query2();
		query3();
	}

	/**
	 * ��ѯ��ѧ��������������
	 */
	public static void query1() {
		// ����session
		Session session = HibernateUtil.openSession();
		// ����
		Transaction tx = null;
		try {
			// ��������
			tx = session.beginTransaction();
			Query query = session
					.createQuery("select s.name, s.age from Student s");
			List list = query.list();
			for (int i = 0; i < list.size(); i++) {
				Object[] obj = (Object[]) list.get(i);
				System.out.println("ѧ��������: " + obj[0] + " ѧ��������: " + obj[1]);
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

	/**
	 * ��ѯ��ѧ�������������䣬��ת��ΪStudent����
	 */
	public static void query2() {
		// ����session
		Session session = HibernateUtil.openSession();
		// ����
		Transaction tx = null;
		try {
			// ��������
			tx = session.beginTransaction();
			Query query = session
					.createQuery("select new Student(s.name,s.age) from Student s");
			List list = query.list();
			for (int i = 0; i < list.size(); i++) {
				Student stu = (Student) list.get(i);
				System.out.println("ѧ��������: " + stu.getName() + " ѧ��������: "
						+ stu.getAge());
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
	/**
	 * �༶��ѧ����������Ӳ�ѯ
	 */
	public static void query3() {
		// ����session
		Session session = HibernateUtil.openSession();
		// ����
		Transaction tx = null;
		try {
			// ��������
			tx = session.beginTransaction();
			Query query = session
					.createQuery("from Team t join t.students");
			List list = query.list();
			for (int i = 0; i < list.size(); i++) {
				Object[] obj = (Object[]) list.get(i);
				Team team=(Team)obj[0];
				Student stu=(Student)obj[1];
				System.out.println("�༶ID:"+team.getId());
				System.out.println("ѧ��ID��"+stu.getId());
				System.out.println("=================");
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
