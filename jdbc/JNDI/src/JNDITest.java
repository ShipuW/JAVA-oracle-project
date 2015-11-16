import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

/**
 * JNDI测试
 * @author Administrator
 *
 */
public class JNDITest {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//创建属性文件对象
		Properties pro=new Properties();
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		//从输入流中得到属性
		try {
			pro.load(new FileInputStream("jdbc.properties"));
			//得到數據源
			DataSource ds=BasicDataSourceFactory.createDataSource(pro);
			conn=ds.getConnection();
			/*
			if(conn!=null){
				System.out.println("使用數據源連接成功");
			}else{
				System.out.println("使用數據源連接失敗");
			}*/
			//输出学生的信息
			String sql="select * from student;";
			pstm =conn.prepareStatement(sql);
			rs=pstm.executeQuery();
			System.out.println("学生iD\t学生姓名\t学生年龄");
			while(rs.next()){
				System.out.print(rs.getInt("id"));
				System.out.print(rs.getString("name"));
				System.out.print(rs.getInt("age"));
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
