package ex07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * �����Ĭ�����ԣ���ǰ�����
 * 
 * @author Administrator
 * 
 */
public class JDBCTest1 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3308/tests";
		String user = "root";
		String pwd = "123456";
		String sql = "select * from student where id<20;";
		// ��������
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pwd);
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);
			// û���ƶ�ǰ������
			System.out.println("δ�ƶ�ǰ������");
			while (rs.next()) {
				System.out.println(rs.getInt("id") + "\t"
						+ rs.getString("name") + "\t" + rs.getInt("age"));
			}
			//�ƶ���ǰ��
			rs.beforeFirst();
			System.out.println("�Ƶ���ǰ������");
			while (rs.next()) {
				System.out.println(rs.getInt("id") + "\t"
						+ rs.getString("name") + "\t" + rs.getInt("age"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
