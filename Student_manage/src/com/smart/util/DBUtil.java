package com.smart.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
	public Connection getConnection(){
		Connection conn = null;
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";//驱动名称
		String url = "jdbc:sqlserver://localhost:1433;DatabaseName=Test_Student";//连接数据库的url
		String user ="sa";//用户名
		String password = "123456";//密码
		try {
			//1.加载驱动
			Class.forName(driver);
			//2.得到数据库的连接对象
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("数据库连接错误！");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("数据库连接错误！");
		}
		return conn;
	}
	public void close(Connection conn,CallableStatement cs){
		//关闭从大到小
		if(cs !=null){
			try {
				cs.close();
				cs = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn != null){
			try {
				conn.close();
				conn = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}	
	//测试
	public static void main(String[] args) {
		DBUtil db = new DBUtil();
		Connection conn = db.getConnection();
		if(conn!=null){
			System.out.println("连接成功");
		}else{
			System.out.println("连接失败");
		}
	}
}
