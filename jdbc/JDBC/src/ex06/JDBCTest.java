package ex06;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {
	public static void main(String[] args) {
		Connection conn=null;
		CallableStatement cmt=null;
		String url = "jdbc:mysql://localhost:3308/tests";
		String user = "root";
		String pwd = "123456";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url,user,pwd);
			//�洢���̲�������
			cmt=conn.prepareCall("{call proc_insert_test(?,?) }");
			//�o���xֵ
			cmt.setString(1, "����");
			cmt.setInt(2, 32);
			//���и���
			int count=cmt.executeUpdate();
			System.out.println(count);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
