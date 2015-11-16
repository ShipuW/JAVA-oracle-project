package com.cqupt.qq.client.window;


import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.cqupt.qq.client.event.RegEvent;

public class RegWindow extends JFrame {
	private JLabel labname;
	private JLabel labpass;
	private JLabel labtel;
	
	private JTextField txtname;
	private JTextField txtpass;
	private JTextField txttel;
	
	public JTextField getTxtname() {
		return txtname;
	}
	public void setTxtname(JTextField txtname) {
		this.txtname = txtname;
	}
	public JTextField getTxtpass() {
		return txtpass;
	}
	public void setTxtpass(JTextField txtpass) {
		this.txtpass = txtpass;
	}
	public JTextField getTxttel() {
		return txttel;
	}
	public void setTxttel(JTextField txttel) {
		this.txttel = txttel;
	}

	
	
	
	private JButton btnok;
	private JButton btncancel;
	
	public RegWindow(){
		this.labname = new JLabel("昵称");
		this.labpass= new JLabel("密码");
		this.labtel = new JLabel("电话");
		
		this.txtname = new JTextField();
		this.txtpass = new JTextField();
		this.txttel = new JTextField();
		
		this.btnok = new JButton("确定");
		this.btncancel = new JButton("取消");
		this.setLayout(new GridLayout(4, 2));
		
		this.btnok.addActionListener(new RegEvent(this));
		
		this.add(labname);
		this.add(txtname);
		this.add(labpass);
		this.add(txtpass);
		this.add(labtel);
		this.add(txttel);
		
		this.add(btnok);
		this.add(btncancel);
		
		this.setSize(200, 250);
		this.setLocation(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new RegWindow();
	}
}
