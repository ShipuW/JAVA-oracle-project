package com.xml.test;


import java.io.FileOutputStream;


import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;

public class JdomT1 {
	public static void main(String[] args) throws Exception {
		// �����ĵ�����
		Document document = new Document();
		// �����ڵ����
		Element element = new Element("root");
		// ���ڵ���ӵ��ĵ�������
		document.addContent(element);

		// ���
		XMLOutputter out = new XMLOutputter();
		out.output(document, new FileOutputStream("jdom.xml"));
	}
}
