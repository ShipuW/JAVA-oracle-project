package ex07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 批量新增
 * 
 * @author Administrator
 * 
 */
public class JDBCTest7 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stm = null;
		String url = "jdbc:mysql://localhost:3308/tests";
		String user = "root";
		String pwd = "123456";
		String sql = "select * from student where id<20;";
		// 加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pwd);
			// 没有移动前的数据
			stm=conn.createStatement();
			
			//将给定的 SQL 命令添加到此 Statement 对象的当前命令列表中。
			stm.addBatch("insert into student(name,age) values ('成龍',56) ");
			stm.addBatch("insert into student(name,age) values ('成龍',56) ");
			stm.addBatch("insert into student(name,age) values ('成龍',56) ");
			stm.addBatch("insert into student(name,age) values ('成龍',56) ");
			stm.addBatch("insert into student(name,age) values ('成龍',56) ");
			
			int num[]=stm.executeBatch();
			System.out.println(num.length);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
