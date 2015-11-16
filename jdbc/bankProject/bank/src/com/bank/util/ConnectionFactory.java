package com.bank.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

/**
 * �õ����ݿ�����ӹ�����
 * 
 * @author Administrator
 * 
 */
public class ConnectionFactory {
	// ͨ���߳����õ����ӣ���֤���ǵ����Ӷ�������ͬ��
	private static ThreadLocal<Connection> connLoc = new ThreadLocal<Connection>();
	// �õ������ļ�
	private static Properties pros = System.getProperties();
	// �������ʱ���ǵõ����Զ���
	static {
		try {
			InputStream is = ConnectionFactory.class
					.getResourceAsStream("jdbc.properties");
			pros.load(is);
			is.close();
		} catch (IOException e) {
			System.out.println("���������ļ�ʧ��!");
			e.printStackTrace();
		}
	}

	// �õ�����
	public Connection getConnection() {
		Connection conn = connLoc.get();
		try {
			// ͨ�����ӳصõ�����Դ
			DataSource ds = BasicDataSourceFactory.createDataSource(pros);
			if (conn == null) {
				// ͨ������Դ�õ����Ӷ���
				conn = ds.getConnection();
				// ���õ��̶߳�����
				connLoc.set(conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * ͨ�õĹرշ���
	 * 
	 * @throws SQLException
	 * 
	 */
	public void close(ResultSet rs, Statement stm, PreparedStatement pstm,
			Connection conn) throws SQLException {
		if (rs != null) {
			rs.close();
		}
		if (stm != null) {
			stm.close();
		}
		if (pstm != null) {
			pstm.close();
		}
		if (conn != null) {
			conn.close();
		}
	}

	public static void main(String[] args) {
		ConnectionFactory f = new ConnectionFactory();
		if (f.getConnection() != null) {
			System.out.println("���ӳɹ�");
		} else {
			System.out.println("����ʧ��");
		}
	}
}
