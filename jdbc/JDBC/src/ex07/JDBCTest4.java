package ex07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ������α궨λ
 * 
 * @author Administrator
 * 
 */
public class JDBCTest4 {
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
			pstm=conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs = pstm.executeQuery();
			// û���ƶ�ǰ������
			System.out.println("δ�޸�ǰ������");
			while (rs.next()) {
				System.out.println(rs.getInt("id") + "\t"
						+ rs.getString("name") + "\t" + rs.getInt("age"));
			}
			//���Զ�λ
			rs.absolute(1);
			rs.updateString(2, "��С");
			rs.updateInt(3, 1000);
			rs.updateRow();
			//�����ꔵ�������²�ԃһ��
			System.out.println("���º�Ĕ���");
			rs=pstm.executeQuery();
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
