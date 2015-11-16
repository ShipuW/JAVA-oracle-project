package com.stu.dao.Imp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.stu.dao.StudentDao;
import com.stu.model.Course;
import com.stu.model.Student;
import com.stu.util.DBUtil;

public class StudentDaoImp implements StudentDao{

	@Override
	public boolean add(Student stu) {
		// TODO Auto-generated method stub
		boolean status=false;
		Connection conn=null;
		PreparedStatement pstm=null;
		String sql="insert into student values "
				+ "("+stu.getSno()+","+stu.getSname()+","+stu.getSsex()+","+stu.getSage()+","+stu.getSdept()+");"; 	
		DBUtil db=new DBUtil();
		try {
			conn=db.getConn();
			pstm=conn.prepareStatement(sql);
			
			if(pstm.executeUpdate()>0){
				status=true;
			}else{
				status=false;
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean del(String sno) {
		// TODO Auto-generated method stub
		boolean status=false;
		
		Connection conn=null;
		Statement stm=null;
		
		String sql="delete from student where sno="+sno+";";
		String sql2="delete from sc where sno="+sno+";";;
		DBUtil db=new DBUtil();
		
		try {
			conn=db.getConn();
			conn.setAutoCommit(false);
			stm=conn.createStatement();
			stm.addBatch(sql);
			stm.addBatch(sql2);
			stm.executeBatch();
			conn.setAutoCommit(true);
			status=true;
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			try {
				if(conn!=null){
				conn.rollback();
				conn.setAutoCommit(true);
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			status=false;
		}
		return status;
	}

	@Override
	public boolean update(Student stu) {
		// TODO Auto-generated method stub
		boolean status=false;
		
		Connection conn=null;
		PreparedStatement pstm=null;
		String sql="update student set sname="+stu.getSname()+",ssex="+stu.getSsex()+",sage="+stu.getSage()+",sdept="+stu.getSdept()+" "
				+ "where sno="+stu.getSno()+";";
		
		DBUtil db=new DBUtil();
		
		try {
			conn=db.getConn();
			pstm=conn.prepareStatement(sql);
			
			if(pstm.executeUpdate()>0){
				status=true;
			}else{
				status=false;
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Student findByNo(String sno) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		String sql="select * from student where sno="+sno+";";
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		
		DBUtil db=new DBUtil();
		
		try {
			conn=db.getConn();
			pstm=conn.prepareStatement(sql);
			rs=pstm.executeQuery();

			while(rs.next()){
				stu.setSno(rs.getString("sno"));
				stu.setSname(rs.getString("sname"));
				stu.setSage(rs.getInt("sage"));
				stu.setSsex(rs.getString("ssex"));
				stu.setSdept(rs.getString("sdept"));
			}
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return stu;
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		String sql="select * from student;";
		List<Student> list=new ArrayList<Student>();
		
		Connection conn=null;
		PreparedStatement pstm=null;
		DBUtil db=new DBUtil();
		ResultSet rs=null;
		
		try {
			conn=db.getConn();
			pstm=conn.prepareStatement(sql);
			rs=pstm.executeQuery();
			
			while(rs.next()){
				Student stu=new Student();
				stu.setSno(rs.getString("sno"));
				stu.setSname(rs.getString("sname"));
				stu.setSage(rs.getInt("sage"));
				stu.setSsex(rs.getString("ssex"));
				stu.setSdept(rs.getString("sdept"));
				list.add(stu);
			}
			
		} catch (ClassNotFoundException | IOException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return list;
	}
}
