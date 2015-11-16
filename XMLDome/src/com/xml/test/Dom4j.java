package com.xml.test;

import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class Dom4j {
	public static void main(String[] args) throws Exception {
		// 第一种方式
		// 创建文档对象
		/*
		 * Document document = DocumentHelper.createDocument(); // 创建根元素节点
		 * Element root = DocumentHelper.createElement("student"); // 设置根元素节点
		 * document.setRootElement(root);
		 */
		Element root = DocumentHelper.createElement("student");
		Document document = DocumentHelper.createDocument(root);

		// 元素添加属性
		root.addAttribute("name", "张三");
		// 添加子元素
		Element helloElement = root.addElement("hello");
		Element worldElement = root.addElement("world");
		// 设置文本内容
		helloElement.setText("hello");
		worldElement.setText("world");

		// 给hello设置一个属性
		helloElement.addAttribute("age", "20");

		// 输出到
		XMLWriter xmlWriter = new XMLWriter();
		xmlWriter.write(document);

		// 保存到xml文件中
		XMLWriter xmlWriter1 = new XMLWriter(new FileOutputStream("t.xml"),
				new OutputFormat("    ", true));
		xmlWriter1.write(document);
	}

}
