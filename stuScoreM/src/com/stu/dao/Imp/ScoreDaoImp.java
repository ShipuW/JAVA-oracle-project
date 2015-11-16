package com.stu.dao.Imp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.stu.dao.ScoreDao;
import com.stu.model.Score;
import com.stu.util.DBUtil;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class ScoreDaoImp implements ScoreDao{

	@Override
	public List<Score> getByCourse(int cno) {
		// TODO Auto-generated method stub
		List<Score> list=new ArrayList<Score>();
		String sql="select * from sc where cid="+cno+";";
		Connection conn=null;
		Statement stm=null;
		ResultSet rs=null;

		DBUtil db=new DBUtil();
		try {
			conn=db.getConn();
			stm=conn.createStatement();
			rs=stm.executeQuery(sql);
			while(rs.next()){
				Score s=new Score();
				s.setScid(rs.getInt("scid"));
				s.setScore(rs.getInt("score"));
				s.setSno("sno");
				s.setCourseid(rs.getInt("cid"));
				list.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Score> getByStu(String sno) {
		List<Score> list=new ArrayList<Score>();
		String sql="select * from sc where sno="+sno+";";
		Connection conn=null;
		Statement stm=null;
		ResultSet rs=null;

		DBUtil db=new DBUtil();
		try {
			conn=db.getConn();
			stm=conn.createStatement();
			rs=stm.executeQuery(sql);
			
			while(rs.next()){
				Score s=new Score();
				s.setScid(rs.getInt("scid"));
				s.setScore(rs.getInt("score"));
				s.setSno("sno");
				s.setCourseid(rs.getInt("cid"));
				list.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean delByCno(int cid) {
		// TODO Auto-generated method stub
		boolean status=false;
		String sql="delete from sc where cid="+cid+";";
		Connection conn=null;
		Statement stm=null;

		DBUtil db=new DBUtil();
		try {
			conn=db.getConn();
			stm=conn.createStatement();
			if(stm.executeUpdate(sql)>0){
				status=true;
			}else{
				status=false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean delBystu(String sno) {
		// TODO Auto-generated method stub
		boolean status=false;
		String sql="delete from sc where sno="+sno+";";
		Connection conn=null;
		Statement stm=null;

		DBUtil db=new DBUtil();
		try {
			conn=db.getConn();
			stm=conn.createStatement();
			if(stm.executeUpdate(sql)>0){
				status=true;
			}else{
				status=false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean delByscid(int scid) {
		// TODO Auto-generated method stub
		boolean status=false;
		String sql="delete from sc where scid="+scid+";";
		Connection conn=null;
		Statement stm=null;

		DBUtil db=new DBUtil();
		try {
			conn=db.getConn();
			stm=conn.createStatement();
			if(stm.executeUpdate(sql)>0){
				status=true;
			}else{
				status=false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean updateByscid(Score sc) {
		// TODO Auto-generated method stub
		boolean status=false;
		String sql="update sc set grade="+sc.getScore()+" where scid="+sc.getScid()+";";
		Connection conn=null;
		Statement stm=null;

		DBUtil db=new DBUtil();
		try {
			conn=db.getConn();
			stm=conn.createStatement();
			if(stm.executeUpdate(sql)>0){
				status=true;
			}else{
				status=false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

}
