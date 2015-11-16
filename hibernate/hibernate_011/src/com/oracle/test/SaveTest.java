package com.oracle.test;

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
			Team team1 = new Team();
			team1.setTeamName("team2");

			Student stu1=new Student();
			Student stu2=new Student();
			Student stu3=new Student();
			Student stu4=new Student();
			Student stu5=new Student();
			Student stu6=new Student();
			
			stu1.setName("成龙");
			stu2.setName("李小龙");
			stu3.setName("周洹");
			stu4.setName("顺利");
			stu5.setName("胆小鬼");
			stu6.setName("别克");
			stu1.setTeam(team);
			stu2.setTeam(team);
			stu3.setTeam(team1);
			stu4.setTeam(team1);
			stu5.setTeam(team1);
			stu6.setTeam(team1);
			
			team.getStudents().add(stu1);
			team.getStudents().add(stu2);
			
			
			team1.getStudents().add(stu3);
			team1.getStudents().add(stu4);
			team1.getStudents().add(stu5);
			team1.getStudents().add(stu6);
			session.save(team);
			session.save(team1);
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
