package ex04;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 通過屬性文件操作連接數據庫
 * 
 * @author Administrator
 * 
 */
public class TestJDBCPropertes {
	public static void main(String[] args) {
		long start=System.nanoTime();
		long start1=System.currentTimeMillis();
		// 得到文件對象
		File f = new File("src/test.properties");
		// 输入流
		InputStream input;
		Connection conn = null;
		try {
			input = new BufferedInputStream(new FileInputStream(f));
			// 得到属性对象
			Properties p = new Properties();
			// //从输入流中读取属性列表（键和元素对）。
			p.load(input);
			// 半閉輸入流
			input.close();
			// 数据库连接的操作
			// 注册或者加载驱动
			Class.forName(p.getProperty("jdbc.drivers"));
			// 得到連接
			conn = DriverManager.getConnection(p.getProperty("jdbc.url"),
					p.getProperty("jdbc.user"), p.getProperty("jdbc.pwd"));
			if(conn!=null){
				System.out.println("连接成功");
			}else{
				System.out.println("连接失败");
			}
			long end=System.nanoTime();
			long end1=System.currentTimeMillis();
			System.out.println("开始时间"+start);
			System.out.println("程序運行時間"+(end-start));
			System.out.println("结束时间"+end);
			
			System.out.println("currentTimeMillis"+(end1-start1));
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
