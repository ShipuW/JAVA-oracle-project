package com.xml.mytest;


import java.io.FileOutputStream;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;


public class JdomT1 {
	public static void main(String[] args) throws Exception {
		//创建文档对象
		Document doc = new Document();
		//创建节点对象
		Element element = new Element("student");
		//将节点添加到文档对象中
		doc.addContent(element);
		
		//输出
		XMLOutputter out = new XMLOutputter();
		out.output(doc, new FileOutputStream("jdom.xml"));
	}
}
