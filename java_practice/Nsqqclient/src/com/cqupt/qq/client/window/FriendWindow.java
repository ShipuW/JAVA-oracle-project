package com.cqupt.qq.client.window;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.cqupt.qq.bean.User;
import com.cqupt.qq.util.ClientUtil;

public class FriendWindow extends JFrame{
	private JButton btn;
	public static JList<User> jl;
	public FriendWindow()
	{
		btn = new JButton("添加好友");
		JPanel pan = new JPanel();
		TitledBorder tb = BorderFactory.createTitledBorder("好友列表");
		pan.setBorder(tb);
		pan.setLayout(new BorderLayout());
		jl = new JList<User>();
		
		//String[] s = {"a","b","c"}; 
		//jl.setListData(s);
		pan.add(jl);
		
		this.setLayout(new BorderLayout());
		this.add(pan,BorderLayout.CENTER);
		this.add(btn,BorderLayout.SOUTH);
		this.setBounds(700, 50, 200, 650);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//好友列表窗体构建的时候应该发送请求 请求自己的所有好友
		ClientUtil.refFriendList();
		
	}
	public static void main(String[] args) {
		new FriendWindow();
	}

}
