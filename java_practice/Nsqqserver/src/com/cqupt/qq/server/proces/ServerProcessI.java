package com.cqupt.qq.server.proces;

import java.net.Socket;

import javax.swing.JTextArea;

import com.cqupt.qq.bean.Request;
import com.cqupt.qq.server.thread.ServerSonThread;

/**
 * �����ͨ�ô���ӿ�
 * @author Administrator
 *
 */
public interface ServerProcessI {
	void Service(Request req, Socket sk, JTextArea infot,
			ServerSonThread th);
}
