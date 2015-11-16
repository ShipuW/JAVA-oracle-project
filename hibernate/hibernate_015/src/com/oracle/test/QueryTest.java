package com.oracle.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oracle.model.Student;
import com.oracle.util.HibernateUtil;

/**
 * 联合组件的查询 使用Serializabler的原因在于使用get或load方法的时候要先构建出来该实体的对象，并且将查询依据(联合主键)设置进去，
 * 然后作为get或load方法的第二个参数传递进去即可。
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
			//创建对象
			Student studentPrimaryKey = new Student();
			//设置值
			studentPrimaryKey.setCardId("123");
			studentPrimaryKey.setName("zhangsan");
			//查询
			Student student=(Student)session.get(Student.class, studentPrimaryKey);
			System.out.println(studentPrimaryKey.getAge());
			System.out.println(student.getAge());
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
