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
		// ����session
		Session session = HibernateUtil.openSession();
		// ����
		Transaction tx = null;
		try {
			// ��������
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
			
			stu1.setName("����");
			stu2.setName("��С��");
			stu3.setName("���");
			stu4.setName("˳��");
			stu5.setName("��С��");
			stu6.setName("���");
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
			// �ύ����
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
