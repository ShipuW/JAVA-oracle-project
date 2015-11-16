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
		//第一种方式
		//创建文档对象
		Document doc = DocumentHelper.createDocument();
		//创建根元素节点
		Element root = DocumentHelper.createElement("student");
		//设置根元素节点
		doc.setRootElement(root);
		//第二种方式
		/*Element root = DocumentHelper.createElement("student");
		Document doc = DocumentHelper.createDocument(root);
		*/
		
		//元素添加属性
		root.addAttribute("name", "张三");
		//添加子元素
		Element helloElement = root.addElement("hello");
		Element worldElement = root.addElement("world");
		//设置文本内容
		helloElement.setText("hello");
		worldElement.setText("world");
		//给helloElement设置一个属性
		helloElement.addAttribute("age", "20");
		
		//输出到控制台
		XMLWriter xmlWriter = new XMLWriter(new OutputFormat("   ",true));
		xmlWriter.write(doc);
		//保存到xml文件中
		XMLWriter xmlWriter1 = new XMLWriter(new FileOutputStream("t.xml"),
				new OutputFormat("   ",true));
		xmlWriter1.write(doc);
		
	}
}
