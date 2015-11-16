package com.smart.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import com.smart.entity.Student;
import com.smart.util.DBUtil;
import com.sun.xml.internal.ws.org.objectweb.asm.Type;

public class StudentDao {
	Connection conn = null;
	CallableStatement cs = null;
	DBUtil db = new DBUtil();
	/**
	 * ѧ����Ϣ���
	 */
	public boolean insertStuInfo(Student stu) {
		conn = db.getConnection();
		try {
				cs = conn.prepareCall("{call insePro(?,?,?,?,?,?,?,?)}");
				cs.setString(1, stu.getProvince());
				cs.setString(2, stu.getUniversity());
				cs.setString(3, stu.getDepartment());
				cs.setString(4, stu.getMajor());
				cs.setString(5, stu.getClas());
				cs.setString(6, stu.getName());
				cs.setString(7, stu.getId());
				cs.registerOutParameter(8, Types.INTEGER);
				cs.execute();
				if(cs.getInt(8)==1){
					return true;
				}else{
					return false;
				}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			db.close(conn,cs);
		}
	}
	/**
	 * �޸�ѧ����Ϣ
	 * @param stu
	 */
	public int modStuInfo(Student stu){
		try {
			conn = db.getConnection();
			cs = conn.prepareCall("{call ModPro(?,?,?,?,?)}");
			cs.setString(1, stu.getUniversity());
			cs.setString(2, stu.getDepartment());
			cs.setString(3, stu.getMajor());
			cs.setString(4, stu.getClas());
			cs.setString(5, stu.getName());
			cs.execute();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			db.close(conn,cs);
		}
	}
	/**
	 * ɾ��ѧ����Ϣ
	 * @param args
	 */
	public int deleStuInfo(Student stu){
		try {
			conn = db.getConnection();
			cs = conn.prepareCall("{call delePro(?,?,?)}");			
			cs.setString(1, stu.getName());
			cs.setString(2, stu.getId());
			cs.registerOutParameter(3, Type.INT);
			cs.execute();
			if(cs.getInt(3) == 1){				
				return 1;
			}else{
				return 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			db.close(conn,cs);
		}
	}
	/**
	 * ��ѯѧ����Ϣ
	 * @param args
	 */
	public List<Student> seleStuInfo(Student stu){
		List<Student> list = new ArrayList<Student>();
		ResultSet rs = null;
		try {
			conn = db.getConnection();
			cs = conn.prepareCall("{call selePro(?)}");			
			cs.setString(1, stu.getName());
			rs = cs.executeQuery();
			while(rs.next()){
				Student stu1 = new Student();
				stu1.setUniversity(rs.getString("ѧУ����"));
				stu1.setDepartment(rs.getString("ѧԺ����"));
				stu1.setMajor(rs.getString("רҵ����"));
				stu1.setClas(rs.getString("�༶����"));
				stu1.setName(rs.getString("ѧ������"));
				stu1.setId(rs.getString("ѧ��ѧ��"));
				list.add(stu1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(conn,cs);
		}
		return list;
	}
	/**
	 * ��ѯѧ���Ƿ����
	 * @param args
	 */
	public int isIdExist(String clas,String name,String id){
		int i = 0;
		try {
			conn = db.getConnection();
			cs = conn.prepareCall("{call seleIdExt(?,?,?,?)}");			
			cs.setString(1, clas);
			cs.setString(2, name);
			cs.setString(3,id);
			cs.registerOutParameter(4, Types.INTEGER);
			cs.execute();
			i = cs.getInt(4);
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			db.close(conn,cs);
		}	
	}
	
	public static void main(String[] args) {
		StudentDao studao = new StudentDao();
		Student stu = new Student();
		stu.setName("�쿡�");
		stu.setId("2012211796");
		System.out.println(studao.deleStuInfo(stu));
	/*	List<Student> list = new ArrayList<Student>();
		list = studao.seleStuInfo(stu);
		
		for (Student student : list) {
			System.out.println("ѧУ"+student.getUniversity()+"ѧԺ"+student.getDepartment()+
					"רҵ"+student.getMajor()+"�༶"+student.getClas()+"����"+student.getName()+"ѧ��"+student.getId());
		}*/
		
	}
}
