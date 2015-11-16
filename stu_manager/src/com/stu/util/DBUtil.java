package com.stu.util;

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
public class DBUtil {
	//ͨ���߳����õ����ӣ���֤���ǵ����Ӷ�������ͬ��
	private static ThreadLocal<Connection> connLoc = new ThreadLocal<Connection>();
	//�õ������ļ�
	private static Properties pros = System.getProperties();
	//�������ʱ���ǵĵ����Զ���
	static{
		try {
			InputStream is = DBUtil.class
					.getResourceAsStream("jdbc.properties");
			pros.load(is);
			is.close();
		} catch (IOException e) {
			System.out.println("�����ļ�����ʧ�ܣ�");
			e.printStackTrace();
		}
	}
	//�õ�����
	public Connection getConnection(){
		Connection conn = connLoc.get();
		try {
			//ͨ�����ӳصõ�����Դ
			DataSource ds = BasicDataSourceFactory.createDataSource(pros);
			if(conn == null){
				//ͨ������Դ�õ����Ӷ���
				conn = ds.getConnection();
				//���õ��̶߳�����
				connLoc.set(conn);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;	
	}
	/*public static void main(String[] args) {
		DBUtil dbu = new DBUtil();
		if(dbu.getConnection()!=null){
			System.out.println("���ӳɹ�");
		}else{
			System.out.println("����ʧ��");
		}
	}*/
	
}
