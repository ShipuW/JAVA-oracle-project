package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 测试数据库操作
 * @author Administrator
 *
 */
public class TestJDBC {
	/**
	 * 程序的入口方法
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
			//加载驱动
			Class.forName(className);
			//得到连接
			conn=DriverManager.getConnection(url,user,pwd);
			//数据库操作
			stm=conn.createStatement();
			//得到结果集
			rs=stm.executeQuery(sql);
			//输出学生信息
			System.out.println("學生學號\t學生姓名\t\t學生年齡");
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
