package com.oracle.test;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oracle.model.Address;
import com.oracle.model.Student;
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
			Address address=new Address();
			
			student.setName("zhangsan");
			address.setHomeAddress("重庆沙坪坝");
			address.setSchoolAddress("邮电大学");
			
			student.setAddress(address);
			
			session.saveOrUpdate(student);
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
