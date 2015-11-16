package com.cqupt.qq.bean;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Test {
	public static void main(String[] args) {
		try {
			Socket sk = new Socket("127.0.0.1",8000);
		
			
			User user = new User();
			user.setUname("tom");
			user.setPass("12345");
			user.setTel("110");
			
			Request request = new Request();
			request.setUser(user);
			request.setRequestServerName("reg");
			
			OutputStream  os = sk.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			oos.writeObject(request);
			
			oos.flush();
			System.out.println("in");
			
			//input
			 InputStream is = sk.getInputStream();
		     ObjectInputStream ois = new ObjectInputStream(is);
			
		     Response rs = (Response)ois.readObject();
		     
		     System.out.println("ÄãµÄqqºÅÂë£º"+rs.getToUser().getUqq());
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
