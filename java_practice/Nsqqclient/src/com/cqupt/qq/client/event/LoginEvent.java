package com.cqupt.qq.client.event;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import com.cqupt.qq.bean.Request;
import com.cqupt.qq.bean.User;
import com.cqupt.qq.client.thread.ClientThread;
import com.cqupt.qq.client.window.LoginWindow;
import com.cqupt.qq.client.window.RegWindow;

/**
 * 登陆窗体事件
 * 
 * @author Administrator
 * 
 */
public class LoginEvent implements ActionListener {
	public LoginWindow loginwindow;

	public LoginEvent(LoginWindow lw) {
		this.loginwindow = lw;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("注册"))
		{
			new RegWindow();
			this.loginwindow.setVisible(false);
		}
		else if(e.getActionCommand().equals("登陆"))
		{
			//产生一个socket连接
			OutputStream os;
			Socket sk = null;	
			try {
				sk = new Socket("127.0.0.1",1500);			
				os = sk.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				//发送相应对象到服务端
				User u = new User();
				u.setUqq(Integer.valueOf(loginwindow.getQq().getText()));
//				u.setUqq(Integer.parseInt(loginwindow.getQq().getText()));
				
				u.setPass(loginwindow.getPass().getText());
				Request re = new Request();
				re.setUser(u);
				re.setRequestServerName("login");
				oos.writeObject(re);
				oos.flush();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//产生一个线程来等待服务端的回应  而且这个线程应该是一直在读服务端响应流
			//转向线程去分析
			new Thread(new ClientThread(sk,null)).start();
			/*Runnable rab = new ClientThread(sk);
			Thread th = new Thread(rab);
			th.start();*/
		}
	}

}
