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
			// ͨ��new ��ע������
			Driver dir = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(dir);
			// �õ�����
			conn = DriverManager.getConnection(url, user, pwd);
			// ���ݿ����
			stm = conn.createStatement();
			int count = stm.executeUpdate(sql);
			if (count > 0) {
				System.out.println("�޸�ѧ����Ϣ�ɹ���");
			} else {
				System.out.println("ʧ��");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
