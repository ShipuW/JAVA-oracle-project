package com.xml.test;


import java.io.FileOutputStream;


import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;

public class JdomT1 {
	public static void main(String[] args) throws Exception {
		// 创建文档对象
		Document document = new Document();
		// 创建节点对象
		Element element = new Element("root");
		// 将节点添加到文档对象中
		document.addContent(element);

		// 输出
		XMLOutputter out = new XMLOutputter();
		out.output(document, new FileOutputStream("jdom.xml"));
	}
}
