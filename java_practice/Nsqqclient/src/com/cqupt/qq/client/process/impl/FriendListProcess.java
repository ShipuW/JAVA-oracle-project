package com.cqupt.qq.client.process.impl;

import java.net.Socket;
import java.util.Iterator;
import java.util.List;

import com.cqupt.qq.bean.Response;
import com.cqupt.qq.bean.User;
import com.cqupt.qq.client.proces.ClientProcessI;
import com.cqupt.qq.client.window.FriendWindow;

public class FriendListProcess implements ClientProcessI{

	@Override
	public void process(Socket sk, Response rep) {
		List<User>li = rep.getFriendlist();
		
		for (User user : li) {
			System.out.println(user.getUqq());
		}
		User[] user = (User[])li.toArray();
		FriendWindow.jl.setListData(user);//会调用user的toString方法
		FriendWindow.jl.repaint();
			
		}
	}
	


