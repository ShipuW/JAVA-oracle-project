package ex07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ��������
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
		// ��������
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pwd);
			// û���ƶ�ǰ������
			stm=conn.createStatement();
			
			//�������� SQL ������ӵ��� Statement ����ĵ�ǰ�����б��С�
			stm.addBatch("insert into student(name,age) values ('����',56) ");
			stm.addBatch("insert into student(name,age) values ('����',56) ");
			stm.addBatch("insert into student(name,age) values ('����',56) ");
			stm.addBatch("insert into student(name,age) values ('����',56) ");
			stm.addBatch("insert into student(name,age) values ('����',56) ");
			
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
