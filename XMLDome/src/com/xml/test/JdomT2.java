package com.xml.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jdom.Attribute;
import org.jdom.Comment;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class JdomT2 {
	public static void main(String[] args) throws Exception {
		// 创建文档对象
		Document document = new Document();
		// 创建节点对象
		Element root = new Element("root");
		// 将节点添加到文档对象中
		document.addContent(root);
		// 添加注释
		Comment comment = new Comment("这是一个注释");
		// 添加到元素后边
		root.addContent(comment);
		// 添加一个元素
		Element e = new Element("hello");
		// 添加属性
		e.setAttribute("he", "ccc");
		root.addContent(e);

		Element e2 = new Element("test");
		Attribute att = new Attribute("cc", "cc");
		e2.setAttribute(att);
		e.addContent(e2);

		e2.addContent(new Element("aaa").setAttribute("a", "b")
				.setAttribute("cc", "cc").setAttribute("c", "d").setText("同时添加多个属性"));

		//添加輸出格式
		Format format=Format.getPrettyFormat();
		//输出4个空格
		format.setIndent("    ");
		// 输出
		XMLOutputter out = new XMLOutputter(format);
		out.output(document, new FileOutputStream("jdom.xml"));
	}
}
