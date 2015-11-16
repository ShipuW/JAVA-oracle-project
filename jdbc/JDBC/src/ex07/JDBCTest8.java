package ex07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 使用PreparedStatement批量更新
 * 
 * @author Administrator
 * 
 */
public class JDBCTest8 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstm = null;
		String url = "jdbc:mysql://localhost:3308/tests";
		String user = "root";
		String pwd = "123456";
		// 加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pwd);
			String sql="insert into student (name,age) values(?,?)";
			// 没有移动前的数据
			pstm=conn.prepareStatement(sql);
			//賦值
			pstm.setString(1, "中國重慶");
			pstm.setInt(2, 100);
			//添加到命令集中
			pstm.addBatch();
			//賦值
			pstm.setString(1, "中國重慶");
			pstm.setInt(2, 100);
			//添加到命令集中
			pstm.addBatch();
			//賦值
			pstm.setString(1, "中國重慶");
			pstm.setInt(2, 100);
			//添加到命令集中
			pstm.addBatch();
			//賦值
			pstm.setString(1, "中國重慶");
			pstm.setInt(2, 100);
			//添加到命令集中
			pstm.addBatch();
			//賦值
			pstm.setString(1, "中國重慶");
			pstm.setInt(2, 100);
			//添加到命令集中
			pstm.addBatch();
			//賦值
			pstm.setString(1, "中國重慶");
			pstm.setInt(2, 100);
			//添加到命令集中
			pstm.addBatch();
			//賦值
			pstm.setString(1, "中國重慶");
			pstm.setInt(2, 100);
			//添加到命令集中
			pstm.addBatch();
			//賦值
			pstm.setString(1, "中國重慶");
			pstm.setInt(2, 100);
			//添加到命令集中
			pstm.addBatch();
			//执行添加的操作
			int num[]=pstm.executeBatch();
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
