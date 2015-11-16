package com.cqupt.qq.server.window;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.cqupt.qq.server.thread.ServerThread;

public class ServerWindow extends JFrame {
	private JButton btnstart = new JButton("启动服务");
	private JButton btnstop = new JButton("停止服务");
	private JTextArea infotxt;
	private JPanel panel;
	private JScrollPane jsp;
	public ServerWindow(){
		infotxt = new JTextArea();
		panel =  new JPanel();
		this.setLayout(new BorderLayout());
		jsp = new JScrollPane(infotxt);
		this.infotxt.setLineWrap(true);
		this.add(jsp,BorderLayout.CENTER);
		this.add(panel,BorderLayout.SOUTH);
		this.panel.add(btnstart);
		this.panel.add(btnstop);
		btnstart.addActionListener(new ServerList());
		btnstop.addActionListener(new ServerList());
		this.setTitle("服务端处理");
		this.setBounds(300, 100, 400, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private class ServerList implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = e.getActionCommand();
			if(s.equals("启动服务")){
				new Thread(new ServerThread(infotxt,"服务端主线程")).start();
			}else
			{
				
			}
			
		}
		
		
	}
	public static void main(String[] args) {
		new ServerWindow();
	}
}
