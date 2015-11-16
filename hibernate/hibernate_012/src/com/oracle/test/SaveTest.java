package com.oracle.test;

import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;

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
			map.put("zhangsan", "123");
			map.put("lisi", "3223");
			map.put("hangsan", "32434");
			map.put("lisi", "rer");
			map.put("ngsan", "44");
			map.put("si", "3333");
			
			
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
