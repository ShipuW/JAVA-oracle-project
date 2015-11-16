package com.cqupt.qq.client.window;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.cqupt.qq.client.event.LoginEvent;

public class LoginWindow extends JFrame{
	private JLabel lab;
	private JLabel labpass;
	
	private JButton btnreg;
	private JButton btnlogin;
	private JTextField qq;
	private JPasswordField pass;
	
	public JTextField getQq() {
		return qq;
	}
	public void setQq(JTextField qq) {
		this.qq = qq;
	}
	public JPasswordField getPass() {
		return pass;
	}
	public void setPass(JPasswordField pass) {
		this.pass = pass;
	}
	public LoginWindow() {
		
		lab = new JLabel("ÕËºÅ");
		labpass = new JLabel("ÃÜÂë");
		btnreg = new JButton("×¢²á");
		btnlogin = new JButton("µÇÂ½");
		qq = new JTextField();
		pass = new JPasswordField();
		
		this.btnreg.addActionListener(new LoginEvent(this));
		this.btnlogin.addActionListener(new LoginEvent(this));
		
		this.setLayout(new GridLayout(3, 2));
		this.add(lab);
		this.add(qq);
		this.add(labpass);
		this.add(pass);
		this.add(btnreg);
		this.add(btnlogin);
		
		this.setVisible(true);
		this.setSize(250, 200);
		this.setLocation(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new LoginWindow();
	}
}
