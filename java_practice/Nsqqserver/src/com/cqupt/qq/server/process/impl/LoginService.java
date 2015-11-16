package com.cqupt.qq.server.process.impl;

import java.net.Socket;

import javax.swing.JTextArea;

import com.cqupt.qq.bean.PropertiesUtil;
import com.cqupt.qq.bean.Request;
import com.cqupt.qq.bean.Response;
import com.cqupt.qq.bean.User;
import com.cqupt.qq.server.proces.ServerProcessI;
import com.cqupt.qq.server.thread.ServerSonThread;

public class LoginService implements ServerProcessI{

	@Override
	public void Service(Request req, Socket sk, JTextArea infot,
			ServerSonThread th) {
		User u = req.getUser();
		int id = u.getUid();
		String pass = u.getPass();
		infot.setText(infot.getText()+"\r\n�ʺ�"+id+"�ڳ��Ե�½");
		Response resp = new Response();
		if(PropertiesUtil.check(id)){
			if(PropertiesUtil.checkpass(id, pass)){
				//��UӦ�������һ���Ե�ֵ
				resp.setToUser(u);
				resp.setResponseCode(resp.LOGIN_OK);
				infot.setText(infot.getText()+"\r\n�ʺ�"+id+"��½�ɹ�");
			}else{
				resp.setResponseCode(resp.LOGIN_ERR_PASS);
				infot.setText(infot.getText()+"\r\n�ʺ�"+id+"�������");
			}
			
		}else{
			resp.setResponseCode(resp.LOGIN_ERR_NAME);
			infot.setText(infot.getText()+"\r\n�ʺ�"+id+"������");
		}
		//��֪�ͻ��˱�ʾ
		resp.setResponseServerName("login");
		//���ظ��ͻ���
		resp.send(sk);
		
	}
	
	
}
