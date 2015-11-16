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
 * HQL检索查询
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
	 * 查询出学生的姓名和年龄
	 */
	public static void query1() {
		// 创建session
		Session session = HibernateUtil.openSession();
		// 事务
		Transaction tx = null;
		try {
			// 开启事务
			tx = session.beginTransaction();
			Query query = session
					.createQuery("select s.name, s.age from Student s");
			List list = query.list();
			for (int i = 0; i < list.size(); i++) {
				Object[] obj = (Object[]) list.get(i);
				System.out.println("学生的姓名: " + obj[0] + " 学生的年龄: " + obj[1]);
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

	/**
	 * 查询出学生的姓名和年龄，并转换为Student对象
	 */
	public static void query2() {
		// 创建session
		Session session = HibernateUtil.openSession();
		// 事务
		Transaction tx = null;
		try {
			// 开启事务
			tx = session.beginTransaction();
			Query query = session
					.createQuery("select new Student(s.name,s.age) from Student s");
			List list = query.list();
			for (int i = 0; i < list.size(); i++) {
				Student stu = (Student) list.get(i);
				System.out.println("学生的姓名: " + stu.getName() + " 学生的年龄: "
						+ stu.getAge());
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
	/**
	 * 班级和学生表的内连接查询
	 */
	public static void query3() {
		// 创建session
		Session session = HibernateUtil.openSession();
		// 事务
		Transaction tx = null;
		try {
			// 开启事务
			tx = session.beginTransaction();
			Query query = session
					.createQuery("from Team t join t.students");
			List list = query.list();
			for (int i = 0; i < list.size(); i++) {
				Object[] obj = (Object[]) list.get(i);
				Team team=(Team)obj[0];
				Student stu=(Student)obj[1];
				System.out.println("班级ID:"+team.getId());
				System.out.println("学生ID："+stu.getId());
				System.out.println("=================");
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
