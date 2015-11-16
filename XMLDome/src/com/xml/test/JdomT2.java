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
		// �����ĵ�����
		Document document = new Document();
		// �����ڵ����
		Element root = new Element("root");
		// ���ڵ���ӵ��ĵ�������
		document.addContent(root);
		// ���ע��
		Comment comment = new Comment("����һ��ע��");
		// ��ӵ�Ԫ�غ��
		root.addContent(comment);
		// ���һ��Ԫ��
		Element e = new Element("hello");
		// �������
		e.setAttribute("he", "ccc");
		root.addContent(e);

		Element e2 = new Element("test");
		Attribute att = new Attribute("cc", "cc");
		e2.setAttribute(att);
		e.addContent(e2);

		e2.addContent(new Element("aaa").setAttribute("a", "b")
				.setAttribute("cc", "cc").setAttribute("c", "d").setText("ͬʱ��Ӷ������"));

		//���ݔ����ʽ
		Format format=Format.getPrettyFormat();
		//���4���ո�
		format.setIndent("    ");
		// ���
		XMLOutputter out = new XMLOutputter(format);
		out.output(document, new FileOutputStream("jdom.xml"));
	}
}
