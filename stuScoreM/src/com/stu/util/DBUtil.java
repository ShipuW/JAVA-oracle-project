package com.stu.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
	/**
	 * �õ����ݿ�����ͨ�÷���
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public Connection getConn() throws IOException, ClassNotFoundException,
			SQLException {
		
		Connection conn = null;
		
		Properties p = new Properties();
		p.load(this.getClass().getClassLoader().getResourceAsStream("connection.properties"));
		
		String className = p.getProperty("jdbc.Driver");
		String url = p.getProperty("jdbc.url");
		String username = p.getProperty("jdbc.user");
		String password = p.getProperty("jdbc.pwd");
	
		Class.forName(className);
		conn = DriverManager.getConnection(url, username, password);
		return conn;
	}
	
	
	/**
	 * ͨ�ùرշ���
	 * 
	 * @param rs
	 *            �Y����
	 * @param pstm
	 * @param conn
	 * @throws SQLException
	 */
	
	public void close(ResultSet rs, PreparedStatement pstm,
			Connection conn) throws SQLException {
		if (rs != null) {
			rs.close();
		}
		if (pstm != null) {
			pstm.close();
		}
		if (conn != null) {
			conn.close();
		}
	}
}
