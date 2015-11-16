package com.oracle.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	// ����SessionFactory����ͨ��
	// ��Ϊֻ����һ�Σ����Զ���Ϊ���ԣ��ھ�̬������д���
	private static SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static Session openSession() {
		Session session = sessionFactory.openSession();
		return session;
	}

	public static void close(Session session) {
		if (session != null) {
			session.close();
		}
	}
}
