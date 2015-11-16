package com.oracle.test;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oracle.model.Team;
import com.oracle.util.HibernateUtil;

public class Query {
	public static void main(String[] args) {
		// ����session
		Session session = HibernateUtil.openSession();
		// ����
		Transaction tx = null;
		try {
			// ��������
			tx = session.beginTransaction();
			Team team=(Team)session.get(Team.class, "402881e74882c491014882c4924c0000");
			Set set=team.getStudents();
			Iterator iter=set.iterator();
			while(iter.hasNext()){
				System.out.println(iter.next());
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
