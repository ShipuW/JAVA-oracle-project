package com.bank.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

/**
 * �õ����ݿ�����ӹ�����
 * 
 * @author ��˧
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
			System.out.println("���������ļ�ʧ�ܣ�");
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

	public static void main(String[] args) {
		ConnectionFactory f = new ConnectionFactory();
		if (f.getConnection() != null) {
			System.out.println("���ӳɹ�");
		} else {
			System.out.println("����ʧ��");
		}

	}

}
