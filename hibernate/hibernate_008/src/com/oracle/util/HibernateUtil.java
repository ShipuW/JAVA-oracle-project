package com.oracle.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	// 创建SessionFactory对象，通过
	// 因为只创建一次，所以定义为属性，在静态代码块中创建
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
