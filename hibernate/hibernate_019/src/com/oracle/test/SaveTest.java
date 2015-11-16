package com.oracle.test;

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
public class SaveTest {
	public static void main(String[] args) {
		// 创建session
		Session session = HibernateUtil.openSession();
		// 事务
		Transaction tx = null;
		try {
			// 开启事务
			tx = session.beginTransaction();
			Student student = new Student();
			student.setCardId("123456");
			student.setName("zhangsan");
			
			Teacher teacher=new Teacher();
			teacher.setSalary(1000);
			teacher.setName("重庆");
				
			session.save(student);
			session.save(teacher);
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
