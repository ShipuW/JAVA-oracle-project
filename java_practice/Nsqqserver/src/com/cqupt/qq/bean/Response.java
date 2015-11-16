package com.cqupt.qq.bean;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.List;

public class Response implements Serializable {
	private static final long serialVersionUID =1L;
	
	//×¢²á×´Ì¬
	public static final int REG_OK=200;
	public static final int REG_err=201;
	//µÇÂ½×´Ì¬
	public static final int LOGIN_OK=100;
	public static final int LOGIN_ERR_NAME=101;
	public static final int LOGIN_ERR_PASS=102;
		
	
	private String responseServerName;
	private int responseCode;
	private User fromUser;
	private User toUser;
	private List<User> friendlist;
	
	public List<User> getFriendlist() {
		return friendlist;
	}
	public void setFriendlist(List<User> friendlist) {
		this.friendlist = friendlist;
	}
	public Response() {
		super();
	}
	public Response(String responseServerName, int responseCode, User fromUser,
			User toUser) {
		super();
		this.responseServerName = responseServerName;
		this.responseCode = responseCode;
		this.fromUser = fromUser;
		this.toUser = toUser;
	}
	public String getResponseServerName() {
		return responseServerName;
	}
	public void setResponseServerName(String responseServerName) {
		this.responseServerName = responseServerName;
	}
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	public User getFromUser() {
		return fromUser;
	}
	public void setFromUser(User fromUser) {
		this.fromUser = fromUser;
	}
	public User getToUser() {
		return toUser;
	}
	public void setToUser(User toUser) {
		this.toUser = toUser;
	}
	public void send(Socket sk){
		OutputStream os; 
		try {
			os = sk.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(this);
			oos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}
