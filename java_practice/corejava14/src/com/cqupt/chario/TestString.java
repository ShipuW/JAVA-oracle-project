package com.cqupt.chario;

import java.io.UnsupportedEncodingException;

public class TestString {
public static void main(String[] args) throws Exception {
	String name = "�й�";
	byte[] b = name.getBytes("utf-8");
	String s = new String(b,"Utf-8");
	System.out.println(name);
	System.out.println(s);
	
			
}
}
