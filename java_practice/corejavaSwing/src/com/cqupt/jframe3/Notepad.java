package com.cqupt.jframe3;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Notepad extends JFrame {
//	JFileChooser jfc = new JFileChooser();
	JOptionPane jo = new JOptionPane();
	JFrame  jf = new JFrame();
	Notepad(){
		
//		jfc.showOpenDialog(null);
	
		jo.showConfirmDialog(null, (Object)"Are you sure?");
		this.setBounds(385, 250, 400, 350);
		this.setVisible(true);
	}
}
