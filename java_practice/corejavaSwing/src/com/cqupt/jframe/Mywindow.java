package com.cqupt.jframe;

import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Mywindow extends JFrame{
	private JLabel jla = new JLabel("帐号");
	private JLabel jlb = new JLabel("密码");
	
	private JTextField jtf = new JTextField();  
	private JPasswordField jpf = new JPasswordField();  
	
	private JButton jb = new JButton("确定");
	private JButton jbt = new JButton("取消");
	
	private ImageIcon icon = new ImageIcon("C:/2.jpg");
	
	public Mywindow(String s) {
		/*super("我的第一个JFrame窗口");
		super.setVisible(true);
		super.setBounds(500, 200, 600, 300);*/
		this.setTitle(s);
		this.setSize(250,250);
		this.setLocation(385,250);
		
		this.setLayout(new GridLayout(3, 1));
		
		this.getContentPane().add(jla);
		this.getContentPane().add(jtf);
		this.getContentPane().add(jlb);
		this.getContentPane().add(jpf);
		this.getContentPane().add(jb);
		this.getContentPane().add(jbt);
		
		//这句可以禁用最小化、最大化、关闭按钮，
		//并且令窗体连边界也没有
		//this.setUndecorated(true);
		
		//建立一个没有最大化按钮的窗口   窗口无法改变大小
		this.setResizable(false);
		
		/*建立一个带左上角小图标的窗口
		this.setIconImage(icon.getImage());
*/
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		this.setVisible(true);
	}
	public Mywindow(){
		super();
	}
}
