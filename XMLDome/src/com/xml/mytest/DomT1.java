package com.xml.mytest;


import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


public class DomT1 {
	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		System.out.println(dbf.getClass());
		System.out.println(dbf.getClass().getName());
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new File("student.xml"));
		
		NodeList list = doc.getElementsByTagName("student");
		System.out.println("�ڵ��������"+list.getLength());
		for (int i = 0; i < list.getLength(); i++) {
			//�õ��ڵ�Ԫ��
			Element e = (Element) list.item(i);
			//String content = e.getElementsByTagName("name").item(0).getFirstChild().getNodeName();
			//System.out.println(content);
			//short content = e.getElementsByTagName("name").item(0).getFirstChild().getNodeType();
			//System.out.println(content);
			//String content = e.getElementsByTagName("name").item(0).getNodeName();
			//System.out.println(content);
			//short content = e.getElementsByTagName("name").item(0).getNodeType();
			//System.out.println(content);
			//String content = e.getElementsByTagName("name").item(0).getNodeValue();
			//System.out.println(content);
			String content = e.getElementsByTagName("name").item(0).getFirstChild().getNodeValue();
			System.out.println("������"+content);
			content = e.getElementsByTagName("age").item(0).getFirstChild().getNodeValue();
			System.out.println("���䣺"+content);
			content = e.getElementsByTagName("sex").item(0).getFirstChild().getNodeValue();
			System.out.println("�Ա�"+content);
			content = e.getElementsByTagName("height").item(0).getFirstChild().getNodeValue();
			System.out.println("��ߣ�"+content);
			System.out.println("=================================");
		}
		
		
		
	}
}
