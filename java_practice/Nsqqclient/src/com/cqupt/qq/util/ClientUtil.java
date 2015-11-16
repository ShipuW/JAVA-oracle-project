package com.cqupt.qq.util;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.cqupt.qq.bean.Request;

public class ClientUtil {
	
	/**
	 * 客户端发送请求对象的通用方法
	 * @author Administrator
	 *
	 */
	public static void sendRequest(Request req){
		try {
			OutputStream os = ClientStatus.clientsk.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(req);
			oos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * 刷新好友列表
	 * @author Administrator
	 *
	 */
	public static void refFriendList(){
		Request req = new Request();
		req.setUser(ClientStatus.getInstances().getLoginUser());
		req.setRequestServerName("friendList");
		sendRequest(req);
	}
	

}
