package com.xml.mytest;

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
		//创建文档对象
		Document doc = new Document();
		//创建节点对象
		Element root = new Element("root");
		//将节点添加到文档对象中
		doc.addContent(root);
		//添加注释
		Comment com = new Comment("这是一个注释");
		//添加到元素后边
		root.addContent(com);
		//添加一个元素
		Element e = new Element("hello");
		//添加属性
		e.setAttribute("he", "ccc");
		root.addContent(e);
		
		Element e2 = new Element("test");
		Attribute attr = new Attribute("cc", "cc");
		e2.setAttribute(attr);
		e.addContent(e2);
		
		e2.addContent(new Element("aaa").setAttribute("a", "b")
				.setAttribute("cc", "cc").setAttribute("c","c").setText("同时添加多个属性和内容"));
		
		//添加输出格式
		Format format = Format.getPrettyFormat();
		//输出四个空格
		format.setIndent("    ");
		
		//输出
		XMLOutputter out = new XMLOutputter(format);
		out.output(doc, new FileOutputStream("jdom.xml"));
	}
}
