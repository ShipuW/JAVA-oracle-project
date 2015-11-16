package com.oracle.test;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oracle.model.Team;
import com.oracle.util.HibernateUtil;

public class QueryTest {
	public static void main(String[] args) {
		// 创建session
		Session session = HibernateUtil.openSession();
		// 事务
		Transaction tx = null;
		try {
			// 开启事务
			tx = session.beginTransaction();
			//前提你知道该查询只返回一个对象uniqueResult
			Team team=(Team)session.createQuery("from Team t where t.teamName='team1'").uniqueResult();
			Map map=team.getStudents();
			Collection col=map.values();
			Iterator iter=col.iterator();
			
			while(iter.hasNext()){
				System.out.println(iter.next());
			}
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
