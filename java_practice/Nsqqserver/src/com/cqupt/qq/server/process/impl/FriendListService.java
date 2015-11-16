package com.cqupt.qq.server.process.impl;


import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextArea;

import com.cqupt.qq.bean.Request;
import com.cqupt.qq.bean.Response;
import com.cqupt.qq.bean.User;
import com.cqupt.qq.server.proces.ServerProcessI;
import com.cqupt.qq.server.thread.ServerSonThread;

public class FriendListService implements ServerProcessI{

	@Override
	public void Service(Request req, Socket sk, JTextArea infot,
			ServerSonThread th) {
		int qq = req.getUser().getUid();
		infot.setText(infot.getText()+"\r\n"+req.getUser().getUid()+"正在请求好友列表");
		List<User> li = new ArrayList<User>();
		li.add(new User(100,"a","b","c"));
		li.add(new User(101,"a","b","c"));
		li.add(new User(102,"a","b","c"));
		
		Response rep = new Response();
		rep.setFriendlist(li);
		rep.setResponseServerName("friendlist");
		rep.send(sk);
		
		
		
	}
	

}
