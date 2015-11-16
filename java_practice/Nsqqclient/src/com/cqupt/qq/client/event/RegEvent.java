package com.cqupt.qq.client.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

import com.cqupt.qq.bean.Request;
import com.cqupt.qq.bean.Response;
import com.cqupt.qq.bean.User;
import com.cqupt.qq.client.window.RegWindow;

public class RegEvent implements ActionListener{
	private RegWindow rw;
	public RegEvent(RegWindow rw)
	{
		this.rw=rw;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//��װ����
		User u = new User();
		u.setUname(rw.getTxtname().getText());
		u.setPass(rw.getTxtpass().getText());
		u.setTel(rw.getTxttel().getText());
		
		Request req = new Request();
		
		req.setUser(u);
		req.setRequestServerName("reg");//..
	
		try {
			//��������socket
			Socket sk = new Socket("127.0.0.1", 1500);
			OutputStream os = sk.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			//���Ͷ���
			oos.writeObject(req);
			
			oos.flush();
			//����Ӧ
			 InputStream is = sk.getInputStream();
		     ObjectInputStream ois = new ObjectInputStream(is);
			
		     Response rs = (Response)ois.readObject();
		     JOptionPane.showMessageDialog(null, "���qq����:"+rs.getToUser().getUqq());
		}catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
		
	}

}
