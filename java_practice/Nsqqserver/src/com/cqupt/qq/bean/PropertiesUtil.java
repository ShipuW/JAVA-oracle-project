package com.cqupt.qq.bean;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class PropertiesUtil {
	public static boolean checkpass(int id,String pass){
		Properties pro = new Properties();
		String path = System.getProperty("user.dir");
		try {
			InputStream is = new FileInputStream(path+"/src/com/cqupt/qq/bean/User.properties");
			pro.load(is);
			is.close();
			if(pro.getProperty(id+".pass").equals(pass)){
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	public static boolean check(int id){
		Properties pro = new Properties();
		String path = System.getProperty("user.dir");
		try {
			InputStream is = new FileInputStream(path+"/src/com/cqupt/qq/bean/User.properties");
			pro.load(is);
			is.close();
			if(pro.getProperty(id+".id")!=null){
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	public static List<User>getFriendListByqq(int qq){
		List<User> li = new ArrayList<User>();
		Properties pro = new Properties();
		String path = System.getProperty("user.dir");
		try {
			InputStream is = new FileInputStream(path+"/src/com/cqupt/qq/bean/"+qq+".properties");
			pro.load(is);
			is.close();
			Set<Object> s = pro.keySet();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}
	public static User getUserByqq(int qq){
		//这里应该检测该帐号是否存在
		User u = new User();
		Properties pro = new Properties();
		String path = System.getProperty("user.dir");
		try {
			InputStream is = new FileInputStream(path+"/src/com/cqupt/qq/bean/User.properties");
			pro.load(is);
			is.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		u.setUid(Integer.parseInt(pro.getProperty(qq+".id")));
		u.setPass(pro.getProperty(qq+".pass"));
		u.setUname(pro.getProperty(qq+".name"));
		u.setTel(pro.getProperty(qq+".tel"));
		return u;
	}
}
