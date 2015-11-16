package com.xml.test;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomT3 {
	public static void main(String[] args) throws Exception {
		// �õ���������
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		// �õ�������
		DocumentBuilder db = dbf.newDocumentBuilder();
		// �õ�Document����
		Document doc = db.parse(new File("student.xml"));
		// �õ���Ԫ�ؽڵ�
		Element root = doc.getDocumentElement();

		parseElement(root);

	}

	// �����ݹ鷽��
	private static void parseElement(Element element) {
		// �õ�Ԫ�ص�����
		String tagName = element.getNodeName();

		System.out.print("<" + tagName);
		// elementԪ�ص��������������ɵ�namedNodeMap������Ҫ��������ж�
		NamedNodeMap map = element.getAttributes();
		// �����Ԫ�ش�������
		if (null != map) {
			for (int i = 0; i < map.getLength(); i++) {
				// ��ø�Ԫ�ص�ÿһ������
				Attr attr = (Attr) map.item(i);
				// ����������ֵ
				String attrName = attr.getName();
				String attrValue = attr.getValue();
				System.out.print(" " + attrName + "=\"" + attrValue + "\"");
			}
		}
		System.out.print(">");
		// �õ�element�µ���Ԫ��
		NodeList children = element.getChildNodes();

		// �����Ԫ��
		for (int i = 0; i < children.getLength(); i++) {
			// ��Ԫ��
			Node node = children.item(i);
			// �õ��ڵ������
			short nodeType = node.getNodeType();
			// �����һ��Ԫ�أ������Լ��ķ���
			if (nodeType == Node.ELEMENT_NODE) {
				// ��Ԫ�أ������ݹ�
				parseElement((Element) node);
				// ������ı�
			} else if (nodeType == Node.TEXT_NODE) {
				// �ݹ����
				System.out.print(node.getNodeValue());
			}
			// �����ע��
			else if (nodeType == Node.COMMENT_NODE) {
				System.out.print("<!--");
				// ����һ��Comment����
				Comment comment = (Comment) node;
				// �õ�ע������
				String data = comment.getData();
				System.out.print(data);
				System.out.print(">");
			}
		}
		System.out.print("</" + tagName + ">");

	}
}
