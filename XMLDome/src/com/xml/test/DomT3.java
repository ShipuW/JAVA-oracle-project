package com.xml.test;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomT3 {
	public static void main(String[] args) throws Exception {
		// 得到解析工厂
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		// 得到解析器
		DocumentBuilder db = dbf.newDocumentBuilder();
		// 得到Document对象
		Document doc = db.parse(new File("student.xml"));
		// 得到根元素节点
		Element root = doc.getDocumentElement();

		parseElement(root);

	}

	// 创建递归方法
	private static void parseElement(Element element) {
		// 得到元素的名字
		String tagName = element.getNodeName();

		System.out.print("<" + tagName);
		// element元素的所有属性所构成的namedNodeMap对象，需要对其进行判断
		NamedNodeMap map = element.getAttributes();
		// 如果该元素存在属性
		if (null != map) {
			for (int i = 0; i < map.getLength(); i++) {
				// 获得该元素的每一个属性
				Attr attr = (Attr) map.item(i);
				// 属性名，和值
				String attrName = attr.getName();
				String attrValue = attr.getValue();
				System.out.print(" " + attrName + "=\"" + attrValue + "\"");
			}
		}
		System.out.print(">");
		// 得到element下的子元素
		NodeList children = element.getChildNodes();

		// 输出子元素
		for (int i = 0; i < children.getLength(); i++) {
			// 子元素
			Node node = children.item(i);
			// 得到节点的类型
			short nodeType = node.getNodeType();
			// 如果是一个元素，调用自己的方法
			if (nodeType == Node.ELEMENT_NODE) {
				// 是元素，继续递归
				parseElement((Element) node);
				// 如果是文本
			} else if (nodeType == Node.TEXT_NODE) {
				// 递归出口
				System.out.print(node.getNodeValue());
			}
			// 如果是注释
			else if (nodeType == Node.COMMENT_NODE) {
				System.out.print("<!--");
				// 创建一个Comment对象
				Comment comment = (Comment) node;
				// 得到注释内容
				String data = comment.getData();
				System.out.print(data);
				System.out.print(">");
			}
		}
		System.out.print("</" + tagName + ">");

	}
}
