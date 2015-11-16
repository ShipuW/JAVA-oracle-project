package com.xml.test;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * ͨ��dom����xMl
 * 
 * @author mountain
 * 
 */
public class DomT1 {
	/**
	 * ������ڷ���
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// ��һ�����õ��������Ĺ���(���ã����ڴ������ǵĽ�����)
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		// �ڶ������õ�������
		DocumentBuilder db = dbf.newDocumentBuilder();
		// ���������õ�document����������xml�ĵ�
		Document doc = db.parse(new File("student.xml"));
		// �õ����еĽڵ�
		NodeList list = doc.getElementsByTagName("student");
		System.out.println("�ڵ������" + list.getLength());
		// ����ڵ��Ԫ��
		for (int i = 0; i < list.getLength(); i++) {
			// �õ��ڵ�Ԫ��
			Element el = (Element) list.item(i);
			// �õ��ڵ��µ��ı�����
			// String
			// content=el.getElementsByTagName("name").item(0).getFirstChild().getNodeName();
			// System.out.print(content);
			String content = el.getElementsByTagName("name").item(0)
					.getFirstChild().getNodeValue();
			System.out.println("������" + content);
			content = el.getElementsByTagName("age").item(0).getFirstChild()
					.getNodeValue();
			System.out.println("���䣺" + content);
			content = el.getElementsByTagName("sex").item(0).getFirstChild()
					.getNodeValue();
			System.out.println("�Ա�" + content);

			content = el.getElementsByTagName("height").item(0).getFirstChild()
					.getNodeValue();
			System.out.println("��ߣ�" + content);
			System.out.println("===================================");
		}
	}
}
