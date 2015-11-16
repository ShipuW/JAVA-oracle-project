package com.smart.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
	public Connection getConnection(){
		Connection conn = null;
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";//��������
		String url = "jdbc:sqlserver://localhost:1433;DatabaseName=Test_Student";//�������ݿ��url
		String user ="sa";//�û���
		String password = "123456";//����
		try {
			//1.��������
			Class.forName(driver);
			//2.�õ����ݿ�����Ӷ���
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("���ݿ����Ӵ���");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("���ݿ����Ӵ���");
		}
		return conn;
	}
	public void close(Connection conn,CallableStatement cs){
		//�رմӴ�С
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
	//����
	public static void main(String[] args) {
		DBUtil db = new DBUtil();
		Connection conn = db.getConnection();
		if(conn!=null){
			System.out.println("���ӳɹ�");
		}else{
			System.out.println("����ʧ��");
		}
	}
}
