package com.oracle.test;

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
			// team = (Team) session.get(Team.class,"402881e5487c999501487c9996f80000");
			 //System.out.println(team.getName());
			Student student=(Student)session.get(Student.class, "402881e5487c999501487c9997170001");
			System.out.println(student.getName());
			System.out.println(student.getIdCarid().getNumber());
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
