package ex04;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) {
		//得到文件对象
		File f=new File("src/test.properties");
		try {
			//得到輸入流
			InputStream input=new BufferedInputStream(new FileInputStream(f));
			//创建属性文件对象
			Properties p=new Properties();
			//从输入流中读取属性列表（键和元素对）。
			p.load(input);
			//关闭输入流
			input.close();
			//得到属性KEY的值
			System.out.println(p.getProperty("jdbc.drivers"));
			System.out.println(p.getProperty("jdbc.url"));
			System.out.println(p.getProperty("jdbc.user"));
			System.out.println(p.getProperty("jdbc.pwd"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
