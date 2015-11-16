package com.oracle.converter;

import java.util.Map;
import java.util.StringTokenizer;

import org.apache.struts2.util.StrutsTypeConverter;

import com.oracle.bean.User;

public class UserConverter extends StrutsTypeConverter{

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		// TODO Auto-generated method stub
		User user = new User();
		String str = arg1[0];
		System.out.println(str);
		StringTokenizer st = new StringTokenizer(str,";");
		user.setUsername(st.nextToken());
		user.setPassword(st.nextToken());
		return user;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		User user = (User)arg1;
		String username = user.getUsername();
		String password = user.getPassword();
		String userInfo = "username:"+username+"   password"+password;
		System.out.println("1"+userInfo);
		return userInfo;
	}
	
}
