package ex07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ʹ��PreparedStatement��������
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
		// ��������
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pwd);
			String sql="insert into student (name,age) values(?,?)";
			// û���ƶ�ǰ������
			pstm=conn.prepareStatement(sql);
			//�xֵ
			pstm.setString(1, "�Ї��ؑc");
			pstm.setInt(2, 100);
			//��ӵ������
			pstm.addBatch();
			//�xֵ
			pstm.setString(1, "�Ї��ؑc");
			pstm.setInt(2, 100);
			//��ӵ������
			pstm.addBatch();
			//�xֵ
			pstm.setString(1, "�Ї��ؑc");
			pstm.setInt(2, 100);
			//��ӵ������
			pstm.addBatch();
			//�xֵ
			pstm.setString(1, "�Ї��ؑc");
			pstm.setInt(2, 100);
			//��ӵ������
			pstm.addBatch();
			//�xֵ
			pstm.setString(1, "�Ї��ؑc");
			pstm.setInt(2, 100);
			//��ӵ������
			pstm.addBatch();
			//�xֵ
			pstm.setString(1, "�Ї��ؑc");
			pstm.setInt(2, 100);
			//��ӵ������
			pstm.addBatch();
			//�xֵ
			pstm.setString(1, "�Ї��ؑc");
			pstm.setInt(2, 100);
			//��ӵ������
			pstm.addBatch();
			//�xֵ
			pstm.setString(1, "�Ї��ؑc");
			pstm.setInt(2, 100);
			//��ӵ������
			pstm.addBatch();
			//ִ����ӵĲ���
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
