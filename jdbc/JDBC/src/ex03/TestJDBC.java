package ex03;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
	public static void main(String[] args) {
		test(1000, 2);
	}

	public static void test(int age, int id) {
		Connection conn = null;
		Statement stm = null;
		String url = "jdbc:mysql://localhost:3308/tests";
		String user = "root";
		String pwd = "123456";
		String sql = "update student set age = " + age + " where id=" + id
				+ ";";
		try {
			// 通过new 创注册驱动
			Driver dir = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(dir);
			// 得到连接
			conn = DriverManager.getConnection(url, user, pwd);
			// 数据库操作
			stm = conn.createStatement();
			int count = stm.executeUpdate(sql);
			if (count > 0) {
				System.out.println("修改学生信息成功！");
			} else {
				System.out.println("失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
