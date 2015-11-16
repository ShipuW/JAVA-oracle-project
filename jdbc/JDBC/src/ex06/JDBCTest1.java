package ex06;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest1 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Connection conn = null;
		CallableStatement cmt = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3308/tests";
		String user = "root";
		String pwd = "123456";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pwd);
			// 存储过程操作对象
			cmt = conn.prepareCall("{call proc_select_test(?) }");
			// 給？賦值
			cmt.setInt(1, 1);
			rs = cmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + rs.getString("name")
						+ rs.getInt("age"));
			}
			long end = System.currentTimeMillis();
			System.out.println(end - start);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
				if (cmt != null) {
					cmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
	}
}
