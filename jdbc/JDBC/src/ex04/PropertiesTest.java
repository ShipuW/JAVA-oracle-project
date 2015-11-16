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
		//�õ��ļ�����
		File f=new File("src/test.properties");
		try {
			//�õ�ݔ����
			InputStream input=new BufferedInputStream(new FileInputStream(f));
			//���������ļ�����
			Properties p=new Properties();
			//���������ж�ȡ�����б�����Ԫ�ضԣ���
			p.load(input);
			//�ر�������
			input.close();
			//�õ�����KEY��ֵ
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
