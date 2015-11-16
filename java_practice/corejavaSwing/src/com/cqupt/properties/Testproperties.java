package com.cqupt.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;



public class Testproperties {
	public static void main(String[] args) throws Exception {
		Properties pro = new Properties();
		String s = System.getProperty("user.dir");
		System.out.println(s);

		FileInputStream fis = new FileInputStream(s+"/src/com/cqupt/properties/user.properties/");
		pro.load(fis);
		
		System.out.println(pro.getProperty("name"));
		pro.setProperty("name", "xqq");
		System.out.println(pro.getProperty("name"));
		
		
		System.out.println(pro.getProperty("shenggao"));
		pro.setProperty("shenggao", "178");
		System.out.println(pro.getProperty("shenggao"));
		
		
		FileOutputStream fos = new FileOutputStream(s+"/src/com/cqupt/properties/user.properties/"); 
		pro.store(fos,"Hello!");
	}
}
