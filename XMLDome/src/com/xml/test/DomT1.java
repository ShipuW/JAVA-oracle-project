package com.xml.test;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * 通过dom解析xMl
 * 
 * @author mountain
 * 
 */
public class DomT1 {
	/**
	 * 程序入口方法
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// 第一步：得到解析器的工厂(作用，用于创建我们的解析器)
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		// 第二步：得到解析器
		DocumentBuilder db = dbf.newDocumentBuilder();
		// 第三步：得到document对象，整个的xml文档
		Document doc = db.parse(new File("student.xml"));
		// 得到所有的节点
		NodeList list = doc.getElementsByTagName("student");
		System.out.println("节点的总数" + list.getLength());
		// 输出节点的元素
		for (int i = 0; i < list.getLength(); i++) {
			// 得到节点元素
			Element el = (Element) list.item(i);
			// 得到节点下的文本内容
			// String
			// content=el.getElementsByTagName("name").item(0).getFirstChild().getNodeName();
			// System.out.print(content);
			String content = el.getElementsByTagName("name").item(0)
					.getFirstChild().getNodeValue();
			System.out.println("姓名：" + content);
			content = el.getElementsByTagName("age").item(0).getFirstChild()
					.getNodeValue();
			System.out.println("年龄：" + content);
			content = el.getElementsByTagName("sex").item(0).getFirstChild()
					.getNodeValue();
			System.out.println("性别：" + content);

			content = el.getElementsByTagName("height").item(0).getFirstChild()
					.getNodeValue();
			System.out.println("身高：" + content);
			System.out.println("===================================");
		}
	}
}
