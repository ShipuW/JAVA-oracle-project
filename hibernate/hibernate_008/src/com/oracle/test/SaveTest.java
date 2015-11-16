package com.oracle.test;

import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oracle.model.Student;
import com.oracle.model.Team;
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
			Team team = new Team();
			team.setTeamName("team1");
			Map map = team.getStudents();
			
			Student stu1=new Student();
			stu1.setAge(10);
			stu1.setCardId("成龍");
			stu1.setTeam(team);
			
			Student stu2=new Student();
			stu2.setAge(10);
			stu2.setCardId("李連");
			stu2.setTeam(team);
			
			Student stu3=new Student();
			stu3.setAge(10);
			stu3.setCardId("小陳陳");
			stu3.setTeam(team);
			
			map.put("111", stu1);
			map.put("222", stu2);
			map.put("333", stu3);
			
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
