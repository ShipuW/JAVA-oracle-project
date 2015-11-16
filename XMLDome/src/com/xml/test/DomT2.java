package com.xml.test;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * 通过根元素节点解析xml
 * 
 * @author Administrator
 * 
 */
public class DomT2 {
	public static void main(String[] args) throws Exception {
		// 第一步：得到解析器工厂
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		// 第二步：得到解析器
		DocumentBuilder db = dbf.newDocumentBuilder();
		// 第三步:得到document对象
		Document doc = db.parse(new File("student.xml"));

		// /得到我们的元素节点
		Element root = doc.getDocumentElement();
		// 根元素节点的名字
		String tagName = root.getTagName();
		System.out.println("元素的名字：" + tagName);
		// 所有的节点集合
		NodeList list = root.getChildNodes();
		// 这时list是多少个？
		// 会出现5个节点原因在于dom解析时会把节点中的空当做是一个节点
		System.out.println("节点数：" + list.getLength());
		System.out.println("====================================");
		// 输出所有的节点
		for (int i = 0; i < list.getLength(); i++) {
			System.out.println(list.item(i).getNodeName());
		}
		System.out.println("=====================================");
		for (int i = 0; i < list.getLength(); i++) {
			// 节点
			Node no = list.item(i);
			// getNodeType节点的类型
			System.out.println(no.getNodeType() + ":" + no.getNodeName());
			short type = no.getNodeType();
			if (type == Node.ELEMENT_NODE) {
				System.out.println("节点" + i);
			} else if (type == Node.COMMENT_NODE) {
				System.out.println("注释");
			} else if (type == Node.TEXT_NODE) {
				System.out.println("文本");
			}
		}
		System.out.println("=========輸出文本內容========");
		for (int i = 0; i < list.getLength(); i++) {
			Node no = list.item(i);
			System.out.println(no.getTextContent());
		}
		System.out.println("=========輸出屬性=====================");
		// 输出属性
		NodeList nodeList = doc.getElementsByTagName("student");
		System.out.println(nodeList.getLength());
		// 输出属性
		for (int i = 0; i < nodeList.getLength(); i++) {
			// 得到namednodemap
			//属性值在namednodemap中的排序以  属性值name名大小为序！
			NamedNodeMap nnm = nodeList.item(i).getAttributes();
			// 属性名字
			String attrName = nnm.item(0).getNodeName();
			// 属性值
			String attrValue = nnm.item(0).getNodeValue();
			System.out.println(attrName + "=" + attrValue);
		}
		
	}
}
