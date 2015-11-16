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
 * ��½�����¼�
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
		if(e.getActionCommand().equals("ע��"))
		{
			new RegWindow();
			this.loginwindow.setVisible(false);
		}
		else if(e.getActionCommand().equals("��½"))
		{
			//����һ��socket����
			OutputStream os;
			Socket sk = null;	
			try {
				sk = new Socket("127.0.0.1",1500);			
				os = sk.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				//������Ӧ���󵽷����
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
			//����һ���߳����ȴ�����˵Ļ�Ӧ  ��������߳�Ӧ����һֱ�ڶ��������Ӧ��
			//ת���߳�ȥ����
			new Thread(new ClientThread(sk,null)).start();
			/*Runnable rab = new ClientThread(sk);
			Thread th = new Thread(rab);
			th.start();*/
		}
	}

}
