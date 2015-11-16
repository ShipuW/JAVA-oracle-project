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
		// 创建session
		Session session = HibernateUtil.openSession();
		// 事务
		Transaction tx = null;
		try {
			// 开启事务
			tx = session.beginTransaction();
			// 查询所有子类中对应的属性值..这种方式 的查询称为多态查询
			//查询所有的数据库表信息
			Query query = session.createQuery("from java.lang.Object");
			Iterator iter = query.iterate();
			while (iter.hasNext()) {
				System.out.println(iter.next().getClass().getName());
			}
			// 提交事务
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
