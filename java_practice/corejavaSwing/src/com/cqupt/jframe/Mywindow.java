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
	private JLabel jla = new JLabel("�ʺ�");
	private JLabel jlb = new JLabel("����");
	
	private JTextField jtf = new JTextField();  
	private JPasswordField jpf = new JPasswordField();  
	
	private JButton jb = new JButton("ȷ��");
	private JButton jbt = new JButton("ȡ��");
	
	private ImageIcon icon = new ImageIcon("C:/2.jpg");
	
	public Mywindow(String s) {
		/*super("�ҵĵ�һ��JFrame����");
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
		
		//�����Խ�����С������󻯡��رհ�ť��
		//����������߽�Ҳû��
		//this.setUndecorated(true);
		
		//����һ��û����󻯰�ť�Ĵ���   �����޷��ı��С
		this.setResizable(false);
		
		/*����һ�������Ͻ�Сͼ��Ĵ���
		this.setIconImage(icon.getImage());
*/
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		this.setVisible(true);
	}
	public Mywindow(){
		super();
	}
}
