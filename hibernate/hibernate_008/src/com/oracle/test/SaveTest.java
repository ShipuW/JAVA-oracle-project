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
		// ����session
		Session session = HibernateUtil.openSession();
		// ����
		Transaction tx = null;
		try {
			// ��������
			tx = session.beginTransaction();
			Team team = new Team();
			team.setTeamName("team1");
			Map map = team.getStudents();
			
			Student stu1=new Student();
			stu1.setAge(10);
			stu1.setCardId("����");
			stu1.setTeam(team);
			
			Student stu2=new Student();
			stu2.setAge(10);
			stu2.setCardId("���B");
			stu2.setTeam(team);
			
			Student stu3=new Student();
			stu3.setAge(10);
			stu3.setCardId("С��");
			stu3.setTeam(team);
			
			map.put("111", stu1);
			map.put("222", stu2);
			map.put("333", stu3);
			
			session.save(team);
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
