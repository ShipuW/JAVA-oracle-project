package ex05;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
	public static void main(String[] args) {
		test(100, 2);
	}

	public static void test(int age, int id) {
		Connection conn = null;
		PreparedStatement pstm=null;
		String url = "jdbc:mysql://localhost:3308/tests";
		String user = "root";
		String pwd = "123456";
		//?号的操作
		String sql = "update student set age =? where id=?;";
		try {
			// 通过new 创注册驱动
			Driver dir = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(dir);
			// 得到连接
			conn = DriverManager.getConnection(url, user, pwd);
			// 数据库操作,预编译
			pstm = conn.prepareStatement(sql);
			//?給？賦值
			pstm.setInt(1, age);
			pstm.setInt(2, id);
			int count=pstm.executeUpdate();
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
