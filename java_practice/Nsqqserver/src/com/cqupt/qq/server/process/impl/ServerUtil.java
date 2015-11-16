package com.cqupt.qq.server.process.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ServerUtil {
	public static String getBykey(String key){
		String name = null;
		InputStream is = ServerUtil.class.getResourceAsStream("server.properties");
		Properties pro = new Properties();
		try {
			pro.load(is);
			name = pro.getProperty(key);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;
	}
	//ºÚµ•≤‚ ‘
	/*public static void main(String[] args) {
		System.out.println(getBykey("reg"));
	}*/

}
