package ex04;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * ͨ�^�����ļ������B�Ӕ�����
 * 
 * @author Administrator
 * 
 */
public class TestJDBCPropertes1 {
	public static void main(String[] args) {
		long start = System.nanoTime();
		long start1 = System.currentTimeMillis();
		// �õ��ļ�����
		File f = new File("src/test.properties");
		// ������
		InputStream input;
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;
		try {
			input = new BufferedInputStream(new FileInputStream(f));
			// �õ����Զ���
			Properties p = new Properties();
			// //���������ж�ȡ�����б�����Ԫ�ضԣ���
			p.load(input);
			// ���]ݔ����
			input.close();
			// ���ݿ����ӵĲ���
			// ע����߼�������
			Class.forName(p.getProperty("jdbc.drivers"));
			// �õ��B��
			conn = DriverManager.getConnection(p.getProperty("jdbc.url"),
					p.getProperty("jdbc.user"), p.getProperty("jdbc.pwd"));
			if (conn != null) {
				System.out.println("���ӳɹ�");
			} else {
				System.out.println("����ʧ��");
			}
			// �õ����ݽ��
			String sql = "select * from student;";
			stm = conn.createStatement();
			// �Y�鼯
			rs = stm.executeQuery(sql);
			System.out.println("id\tname\tage");
			while (rs.next()) {
				System.out.print(rs.getInt("id"));
				System.out.print(rs.getString("name"));
				System.out.println(rs.getInt("age"));
			}
			long end = System.nanoTime();
			long end1 = System.currentTimeMillis();
			System.out.println("��ʼʱ��" + start);
			System.out.println("�����\�Еr�g" + (end - start));
			System.out.println("����ʱ��" + end);

			System.out.println("currentTimeMillis" + (end1 - start1));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
