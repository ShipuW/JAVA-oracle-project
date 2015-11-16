package com.oracle.test;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oracle.model.Student;
import com.oracle.model.Team;
import com.oracle.util.HibernateUtil;

/**
 * 级联查询
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
		Team team = null;
		try {
			// 开启事务
			tx = session.beginTransaction();
			team = (Team) session.get(Team.class,
					"402881e74882e879014882e87aef0000");
			Set<Student> set = team.getStudents();
			for (Iterator<Student> iter = set.iterator(); iter.hasNext();) {
				System.out.println(iter.next().getName());
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
