package com.xml.test;

import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class Dom4j {
	public static void main(String[] args) throws Exception {
		// ��һ�ַ�ʽ
		// �����ĵ�����
		/*
		 * Document document = DocumentHelper.createDocument(); // ������Ԫ�ؽڵ�
		 * Element root = DocumentHelper.createElement("student"); // ���ø�Ԫ�ؽڵ�
		 * document.setRootElement(root);
		 */
		Element root = DocumentHelper.createElement("student");
		Document document = DocumentHelper.createDocument(root);

		// Ԫ���������
		root.addAttribute("name", "����");
		// �����Ԫ��
		Element helloElement = root.addElement("hello");
		Element worldElement = root.addElement("world");
		// �����ı�����
		helloElement.setText("hello");
		worldElement.setText("world");

		// ��hello����һ������
		helloElement.addAttribute("age", "20");

		// �����
		XMLWriter xmlWriter = new XMLWriter();
		xmlWriter.write(document);

		// ���浽xml�ļ���
		XMLWriter xmlWriter1 = new XMLWriter(new FileOutputStream("t.xml"),
				new OutputFormat("    ", true));
		xmlWriter1.write(document);
	}

}
