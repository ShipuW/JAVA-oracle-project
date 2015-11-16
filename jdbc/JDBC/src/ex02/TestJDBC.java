package ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJDBC {
	public static void main(String[] args) {
		// con
		Connection conn = null;
		Statement stm = null;
		String className = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3308/tests";
		String user = "root";
		String pwd = "123456";
		String sql = "update student set age = 12 where id=1;";
		String sql1="insert into student values (default,'李小龍',60)";
		String sql2="delete from student where id=11;";
		try {
			// 加载驱动
			Class.forName(className);
			// 得到连接
			conn = DriverManager.getConnection(url, user, pwd);
			// 数据库操作
			stm = conn.createStatement();
			int count = stm.executeUpdate(sql2);
			if(count>0){
				System.out.println("修改学生信息成功！");
			}else{
				System.out.println("失败");
			}
			
		} catch (Exception e) {

		}
	}
}