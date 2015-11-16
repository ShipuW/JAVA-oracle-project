package com.oracle.test;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.oracle.model.Student;
import com.oracle.model.Team;
import com.oracle.util.HibernateUtil;

/**
 * 级联保存
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
			student.setName("color");
			student.setAge(18);
			student.setCardId("123");
			
			Student student1 = new Student();
			student1.setName("edf");
			student1.setAge(18);
			student1.setCardId("123");
			
			Student student2 = new Student();
			student2.setName("abc");
			student2.setAge(18);
			student2.setCardId("321");
			

			Team team=new Team();
			team.setName("team1");
			team.setStudents(new HashSet<Student>());
			
			team.getStudents().add(student);
			team.getStudents().add(student1);
			team.getStudents().add(student2);
			
			student.setTeam(team);
			student1.setTeam(team);
			student2.setTeam(team);
			
			session.save(team);
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
