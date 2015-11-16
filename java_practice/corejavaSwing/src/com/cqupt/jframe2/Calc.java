package com.cqupt.jframe2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calc extends JFrame{
	private JPanel jp1 = new JPanel();
	private JPanel jp2 = new JPanel();
	private JTextField jf = new JTextField();
	
	private JButton btadd = new JButton("+");
	private JButton btj = new JButton("-");
	private JButton btc = new JButton("*");
	private JButton btdiv = new JButton("/");
	private JButton btd = new JButton("=");
	
	public Calc(){
		this.jp1.setLayout(new BorderLayout());
		this.jp1.add(jf);
		jf.setHorizontalAlignment(JTextField.RIGHT);
		
		
		for (int i = 0; i <=9; i++) {
			JButton jb = new JButton(String.valueOf(i));
			jb.addActionListener(new mishu());
			this.jp2.add(jb);
			
		}	
		
		this.jp2.add(btadd);
		this.jp2.add(btj);
		this.jp2.add(btc);
		this.jp2.add(btdiv);
		this.jp2.add(btd);
		
		this.setLayout(new BorderLayout());
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2,BorderLayout.CENTER);
		
		
		this.setTitle("¼ÆËãÆ÷");
		this.setBounds(385, 250, 260, 240);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	String s ="";
	class mishu implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			s=e.getActionCommand();
			jf.setText(s);
		}
	}
}
