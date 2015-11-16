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
		//?�ŵĲ���
		String sql = "update student set age =? where id=?;";
		try {
			// ͨ��new ��ע������
			Driver dir = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(dir);
			// �õ�����
			conn = DriverManager.getConnection(url, user, pwd);
			// ���ݿ����,Ԥ����
			pstm = conn.prepareStatement(sql);
			//?�o���xֵ
			pstm.setInt(1, age);
			pstm.setInt(2, id);
			int count=pstm.executeUpdate();
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
