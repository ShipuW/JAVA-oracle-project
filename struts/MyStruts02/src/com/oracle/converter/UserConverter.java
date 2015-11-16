package com.oracle.converter;

import java.lang.reflect.Member;
import java.util.Map;
import java.util.StringTokenizer;

import ognl.DefaultTypeConverter;

import com.oracle.bean.User;



public class UserConverter extends DefaultTypeConverter {

	@Override
	public Object convertValue(Map context, Object target, Member member,
			String propertyName, Object value, Class toType) {
		if(User.class == toType){
			String[] str = (String[])value;
			String firstValue = str[0];
			StringTokenizer st = new StringTokenizer(firstValue,";");
			String username = st.nextToken();
			String password = st.nextToken();
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			return user;
		}else if(String.class == toType){
			User user = (User)value;
			String userInfo = "Username:"+user.getUsername()+"   Pssword:"+user.getPassword();
			return userInfo;
		}
		return null;
	}
	
}
