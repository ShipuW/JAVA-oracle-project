package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * �������ݿ����
 * @author Administrator
 *
 */
public class TestJDBC {
	/**
	 * �������ڷ���
	 * @param args
	 */
	public static void main(String[] args) {
		//con
		Connection conn=null;
		Statement stm=null;
		ResultSet rs = null;
		String className="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3308/tests";
		String user="root";
		String pwd="123456";
		String sql="select * from student;";
		try {
			//��������
			Class.forName(className);
			//�õ�����
			conn=DriverManager.getConnection(url,user,pwd);
			//���ݿ����
			stm=conn.createStatement();
			//�õ������
			rs=stm.executeQuery(sql);
			//���ѧ����Ϣ
			System.out.println("�W���W̖\t�W������\t\t�W�����g");
			while(rs.next()){
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString("name")+"\t\t");
				System.out.print(rs.getInt("age")+"\t\n");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs!=null){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}if(stm!=null){
				try {
					stm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
