package com.stu.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

/**
 * 得到数据库的连接工厂类
 * 
 * @author 朱帅
 *
 */
public class DBUtil {
	//通过线程来得到连接，保证我们的连接对象是相同的
	private static ThreadLocal<Connection> connLoc = new ThreadLocal<Connection>();
	//得到属性文件
	private static Properties pros = System.getProperties();
	//当类加载时我们的到属性对象
	static{
		try {
			InputStream is = DBUtil.class
					.getResourceAsStream("jdbc.properties");
			pros.load(is);
			is.close();
		} catch (IOException e) {
			System.out.println("加载文件属性失败！");
			e.printStackTrace();
		}
	}
	//得到连接
	public Connection getConnection(){
		Connection conn = connLoc.get();
		try {
			//通过连接池得到数据源
			DataSource ds = BasicDataSourceFactory.createDataSource(pros);
			if(conn == null){
				//通过数据源得到连接对象
				conn = ds.getConnection();
				//设置到线程对象中
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
			System.out.println("连接成功");
		}else{
			System.out.println("连接失败");
		}
	}*/
	
}
