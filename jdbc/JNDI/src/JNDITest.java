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
 * JNDI����
 * @author Administrator
 *
 */
public class JNDITest {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//���������ļ�����
		Properties pro=new Properties();
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		//���������еõ�����
		try {
			pro.load(new FileInputStream("jdbc.properties"));
			//�õ�����Դ
			DataSource ds=BasicDataSourceFactory.createDataSource(pro);
			conn=ds.getConnection();
			/*
			if(conn!=null){
				System.out.println("ʹ�Ô���Դ�B�ӳɹ�");
			}else{
				System.out.println("ʹ�Ô���Դ�B��ʧ��");
			}*/
			//���ѧ������Ϣ
			String sql="select * from student;";
			pstm =conn.prepareStatement(sql);
			rs=pstm.executeQuery();
			System.out.println("ѧ��iD\tѧ������\tѧ������");
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
