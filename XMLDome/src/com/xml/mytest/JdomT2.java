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
		//�����ĵ�����
		Document doc = new Document();
		//�����ڵ����
		Element root = new Element("root");
		//���ڵ���ӵ��ĵ�������
		doc.addContent(root);
		//���ע��
		Comment com = new Comment("����һ��ע��");
		//��ӵ�Ԫ�غ��
		root.addContent(com);
		//���һ��Ԫ��
		Element e = new Element("hello");
		//�������
		e.setAttribute("he", "ccc");
		root.addContent(e);
		
		Element e2 = new Element("test");
		Attribute attr = new Attribute("cc", "cc");
		e2.setAttribute(attr);
		e.addContent(e2);
		
		e2.addContent(new Element("aaa").setAttribute("a", "b")
				.setAttribute("cc", "cc").setAttribute("c","c").setText("ͬʱ��Ӷ�����Ժ�����"));
		
		//��������ʽ
		Format format = Format.getPrettyFormat();
		//����ĸ��ո�
		format.setIndent("    ");
		
		//���
		XMLOutputter out = new XMLOutputter(format);
		out.output(doc, new FileOutputStream("jdom.xml"));
	}
}
