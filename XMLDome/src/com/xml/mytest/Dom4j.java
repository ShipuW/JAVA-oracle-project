package com.xml.mytest;

import java.io.FileOutputStream;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;


public class Dom4j {
	public static void main(String[] args) throws Exception {
		//��һ�ַ�ʽ
		//�����ĵ�����
		Document doc = DocumentHelper.createDocument();
		//������Ԫ�ؽڵ�
		Element root = DocumentHelper.createElement("student");
		//���ø�Ԫ�ؽڵ�
		doc.setRootElement(root);
		//�ڶ��ַ�ʽ
		/*Element root = DocumentHelper.createElement("student");
		Document doc = DocumentHelper.createDocument(root);
		*/
		
		//Ԫ���������
		root.addAttribute("name", "����");
		//�����Ԫ��
		Element helloElement = root.addElement("hello");
		Element worldElement = root.addElement("world");
		//�����ı�����
		helloElement.setText("hello");
		worldElement.setText("world");
		//��helloElement����һ������
		helloElement.addAttribute("age", "20");
		
		//���������̨
		XMLWriter xmlWriter = new XMLWriter(new OutputFormat("   ",true));
		xmlWriter.write(doc);
		//���浽xml�ļ���
		XMLWriter xmlWriter1 = new XMLWriter(new FileOutputStream("t.xml"),
				new OutputFormat("   ",true));
		xmlWriter1.write(doc);
		
	}
}
