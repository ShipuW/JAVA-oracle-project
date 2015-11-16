package ex07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ������������ã�Ĭ��ǰ�������������������ͣ�
 * 
 * @author Administrator
 * 
 */
public class JDBCTest2 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3308/tests";
		String user = "root";
		String pwd = "123456";
		String sql = "select * from student where id<20;";
		// ��������
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pwd);
			//TYPE_SCROLL_INSENSITIVE ��ǰ�������������������ݿ����ݸ���Ӱ��
			//CLOSE_CURSORS_AT_COMMIT �ύ����ʱ�رս��������
			pstm=conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CLOSE_CURSORS_AT_COMMIT );
			rs = pstm.executeQuery();
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
