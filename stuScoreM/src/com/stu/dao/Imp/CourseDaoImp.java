package com.stu.dao.Imp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.stu.dao.CourseDao;
import com.stu.model.Course;
import com.stu.util.DBUtil;

public class CourseDaoImp implements CourseDao{

	@Override
	public boolean add(Course course) {
		// TODO Auto-generated method stub
		boolean status=false;
		
		Connection conn=null;
		PreparedStatement pstm=null;
		DBUtil db=new DBUtil();
		
		String sql="insert into course (cname) values ("+course.getCname()+");";

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
	public boolean del(int cno) {
		// TODO Auto-generated method stub
		boolean status=false;
		String sql="delete from course where courseid="+cno+";";
		String sql2="delete from sc where cid="+cno+";";;
		Connection conn=null;
		Statement stm=null;
		DBUtil db=new DBUtil();
		
		
		try {
			conn=db.getConn();
			conn.setAutoCommit(false);
			stm=conn.createStatement();
			stm.addBatch(sql);
			stm.addBatch(sql2);
			stm.executeBatch();
			conn.commit();
			conn.setAutoCommit(true);
			status=true;
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			//出现异常则回滚，并把事务提交方式设为默认（true），把状态值设为false
			if (conn != null) {  
                try {
					conn.rollback();
					conn.setAutoCommit(true);  
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}  
            }
			status=false;
		}
	
		return status;
	}

	@Override
	public boolean update(Course course) {
		// TODO Auto-generated method stub
		boolean status=false;
		
		String sql="update course set cname="+course.getCname()+"where courseid="+course.getCourseid()+";";
		Connection conn=null;
		PreparedStatement pstm=null;
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
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		List<Course> list=new ArrayList<Course>();
		Connection conn=null;
		PreparedStatement pstm=null;
		DBUtil db=new DBUtil();
		ResultSet rs=null;
		String sql="select * from course";
		
		try {
			conn=db.getConn();
			pstm=conn.prepareStatement(sql);
			rs=pstm.executeQuery();
		} catch (ClassNotFoundException | IOException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			while(rs.next()){
				Course cos=new Course();
				cos.setCourseid(rs.getInt("courseid"));
				cos.setCname(rs.getString("cname"));
				list.add(cos);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
}
