package com.xml.mytest;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomT2 {
	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new File("student.xml"));
		
		Element root = doc.getDocumentElement();
		System.out.println(root.getTagName());
		NodeList list = root.getChildNodes();
		System.out.println(list.getLength());
		for (int i = 0; i < list.getLength(); i++) {
			System.out.println(list.item(i).getNodeName());
			System.out.println(list.item(i).getNodeType());
			System.out.println(list.item(i).getNodeValue());
			System.out.println("==========================");
		}
		for (int i = 0; i < list.getLength(); i++) {
			Node n = list.item(i);
			System.out.println(n.getNodeType()+":"+n.getNodeValue());
		}
		for (int i = 0; i < list.getLength(); i++) {
			System.out.println(list.item(i).getTextContent());
			System.out.println("====================");
		}
		NodeList list2 = doc.getElementsByTagName("student");
		System.out.println(list2.getLength());
		for (int i = 0; i < 3; i++) {
			NamedNodeMap nnm = list2.item(0).getAttributes();
			String attrName = nnm.item(i).getNodeName();
			String attrValue = nnm.item(i).getNodeValue();
			System.out.println(attrName+"="+attrValue);
		}
	}
}
