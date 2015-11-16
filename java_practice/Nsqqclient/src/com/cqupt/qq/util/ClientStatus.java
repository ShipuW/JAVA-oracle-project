package com.cqupt.qq.util;

import java.net.Socket;

import com.cqupt.qq.bean.User;

/**
 * 客户端状态信息保存类
 * @author Administrator
 *
 */

//单态
public class ClientStatus {
	
	public static Socket clientsk;
	public static User loginUser;
	
	public User getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(User loginUser) {
		this.loginUser = loginUser;
	}
	private static ClientStatus cs=null;
	
	private ClientStatus(){}
	public static ClientStatus getInstances(){
		if(cs == null){
			return cs = new ClientStatus();
		}
		return cs;
	}
	/*public static void main(String[] args) {
		ClientStatus cs1 = ClientStatus.getInstances();
		ClientStatus cs2 = ClientStatus.getInstances();
		ClientStatus cs3 = ClientStatus.getInstances();
		ClientStatus cs4 = ClientStatus.getInstances();
		System.out.println(cs1==cs2);
	}*/
}
