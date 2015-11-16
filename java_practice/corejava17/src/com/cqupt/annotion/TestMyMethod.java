package com.cqupt.annotion;

import java.lang.reflect.Method;

public class TestMyMethod {
	public static void main(String[] args) throws Exception, IllegalAccessException {
		Class c = MyMethod.class;
		
		Method[] mt = c.getDeclaredMethods();
		
		Object ob = c.newInstance();
		
		for (Method method : mt) {
			
			boolean b =method.isAnnotationPresent(MyAnnotaion.class);
			if(b)
			{
				MyAnnotaion my = method.getAnnotation(MyAnnotaion.class);
				
				method.invoke(ob, String.valueOf(my.order()));
			}
			
		}
		
	}
}
