package com.oracle.test;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oracle.model.Student;
import com.oracle.model.Team;
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
		Team team = null;
		try {
			// ��������
			tx = session.beginTransaction();
			team = (Team) session.get(Team.class,
					"402881e74882e879014882e87aef0000");
			Set<Student> set = team.getStudents();
			for (Iterator<Student> iter = set.iterator(); iter.hasNext();) {
				System.out.println(iter.next().getName());
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
