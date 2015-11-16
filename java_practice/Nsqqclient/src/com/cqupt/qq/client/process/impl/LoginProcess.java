package com.cqupt.qq.client.process.impl;

import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

import com.cqupt.qq.bean.Response;
import com.cqupt.qq.client.proces.ClientProcessI;
import com.cqupt.qq.client.window.FriendWindow;

public class LoginProcess implements ClientProcessI{

	@Override
	public void process(Socket sk, Response rep) {
		if(rep.getResponseCode()  == Response.LOGIN_OK){
			JOptionPane.showMessageDialog(null, "��½�ɹ�");
			new FriendWindow();
			
		}else if(rep.getResponseCode() == Response.LOGIN_ERR_NAME){
			JOptionPane.showMessageDialog(null, "�ʺŲ�����");
			try {
				sk.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(rep.getResponseCode() == Response.LOGIN_ERR_PASS){
			JOptionPane.showMessageDialog(null, "�������");
			try {
				sk.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}
