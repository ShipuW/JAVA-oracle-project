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
public class QueryTest {
	public static void main(String[] args) {
		// 创建session
		Session session = HibernateUtil.openSession();
		// 事务
		Transaction tx = null;
		try {
			// 开启事务
			tx = session.beginTransaction();
			// 查询所有子类中对应的属性值..这种方式 的查询称为多态查询
			//如果没有hbm文件时必须加上com.oracle.model.完整的包的路徑
			Query query = session.createQuery("from com.oracle.model.Person");
			Iterator iter = query.iterate();
			while (iter.hasNext()) {
				Person p = (Person) iter.next();
				System.out.println(p.getClass().getName());
				System.out.println(p.getName());
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
