package com.oracle.test;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oracle.model.IdCard;
import com.oracle.model.Student;
import com.oracle.model.Team;
import com.oracle.util.HibernateUtil;

/**
 * ��������
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
			Student student = new Student();
			student.setName("color");

			IdCard idCard = new IdCard();
			idCard.setNumber(123456);

			student.setIdCarid(idCard);
			idCard.setStudent(student);

			Team team=new Team();
			team.setName("team1");
			team.setStudents(new HashSet<Student>());
			
			team.getStudents().add(student);
			
			student.setTeam(team);
			
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
