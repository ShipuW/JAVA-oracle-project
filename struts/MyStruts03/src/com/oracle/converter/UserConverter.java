package com.oracle.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.struts2.util.StrutsTypeConverter;

import com.oracle.bean.User;

public class UserConverter extends StrutsTypeConverter{

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		List<User> list = new ArrayList<User>();
		for (String str : arg1) {
			User user = new User();
			StringTokenizer st = new StringTokenizer(str,";");
			user.setUsername(st.nextToken());
			user.setPassword(st.nextToken());
			list.add(user);
		}
		return list;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		List<User> list = (List<User>)arg1;
		StringBuffer sbf = new StringBuffer();
		for (User user : list) {
			sbf.append(user.getUsername()).append(user.getPassword());
		}
		return sbf.toString();
	}
	
}
