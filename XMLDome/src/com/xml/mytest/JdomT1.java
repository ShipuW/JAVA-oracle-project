package com.xml.mytest;


import java.io.FileOutputStream;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;


public class JdomT1 {
	public static void main(String[] args) throws Exception {
		//�����ĵ�����
		Document doc = new Document();
		//�����ڵ����
		Element element = new Element("student");
		//���ڵ���ӵ��ĵ�������
		doc.addContent(element);
		
		//���
		XMLOutputter out = new XMLOutputter();
		out.output(doc, new FileOutputStream("jdom.xml"));
	}
}
