package ex07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 结果集游标定位
 * 
 * @author Administrator
 * 
 */
public class JDBCTest3 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3308/tests";
		String user = "root";
		String pwd = "123456";
		String sql = "select * from student where id<20;";
		// 加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pwd);
			pstm=conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			// 没有移动前的数据
			System.out.println("未移动前的数据");
			while (rs.next()) {
				System.out.println(rs.getInt("id") + "\t"
						+ rs.getString("name") + "\t" + rs.getInt("age"));
			}
			//绝对位置
			rs.absolute(5);
			System.out.println("绝对位置");
			while (rs.next()) {
				System.out.println(rs.getInt("id") + "\t"
						+ rs.getString("name") + "\t" + rs.getInt("age"));
			}
			//把移动最后一位
			rs.last();
			System.out.println("向上一行输出");
			do{
				System.out.println(rs.getInt("id") + "\t"
						+ rs.getString("name") + "\t" + rs.getInt("age"));
			}while(rs.previous());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
