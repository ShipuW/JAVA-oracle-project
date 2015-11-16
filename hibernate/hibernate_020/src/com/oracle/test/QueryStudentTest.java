package com.oracle.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oracle.model.Student;
import com.oracle.model.Teacher;
import com.oracle.util.HibernateUtil;

/**
 * 
 * @author Mountainpeople
 * 
 */
public class QueryStudentTest {
	public static void main(String[] args) {
		// 创建session
		Session session = HibernateUtil.openSession();
		// 事务
		Transaction tx = null;
		try {
			// 开启事务
			tx = session.beginTransaction();
			Query query = session.createQuery("from Person");
			List list = query.list();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) instanceof Student) {
					Student stu = (Student) list.get(i);
					System.out.println(stu.getCardId());
				}
				if (list.get(i) instanceof Teacher) {
					Teacher teac = (Teacher) list.get(i);
					System.out.println(teac.getSalary());
				}
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
