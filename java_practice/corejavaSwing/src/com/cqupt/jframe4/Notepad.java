package com.cqupt.jframe4;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Notepad extends JFrame {
	private JTextArea jf = new JTextArea();
	
	
	Notepad(){
		this.setLayout(new BorderLayout());
		this.add(jf,BorderLayout.CENTER);
		jf.setLineWrap(true);
		jf.setFont(new Font("Fixedsys",Font.PLAIN,16));
	
		
		
		
		
		
		
		this.setBounds(150, 150, 765, 525);
		this.setTitle("我的文本文档.txt-记事本");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
		
	}

}
