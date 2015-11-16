package com.oracle.test;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oracle.model.Course;
import com.oracle.model.Student;
import com.oracle.util.HibernateUtil;

/**
 * 查詢出學生選擇那些課程
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
			Student student=(Student)session.get(Student.class, "402881e5487d720201487d72039e0000");
			Set<Course> set=student.getCourses();
			for(Iterator<Course> iter=set.iterator();iter.hasNext();){
				System.out.println(iter.next().getName());
			}
			//提交事务
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
