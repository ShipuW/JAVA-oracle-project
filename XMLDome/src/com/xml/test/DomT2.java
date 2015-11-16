package com.xml.test;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * ͨ����Ԫ�ؽڵ����xml
 * 
 * @author Administrator
 * 
 */
public class DomT2 {
	public static void main(String[] args) throws Exception {
		// ��һ�����õ�����������
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		// �ڶ������õ�������
		DocumentBuilder db = dbf.newDocumentBuilder();
		// ������:�õ�document����
		Document doc = db.parse(new File("student.xml"));

		// /�õ����ǵ�Ԫ�ؽڵ�
		Element root = doc.getDocumentElement();
		// ��Ԫ�ؽڵ������
		String tagName = root.getTagName();
		System.out.println("Ԫ�ص����֣�" + tagName);
		// ���еĽڵ㼯��
		NodeList list = root.getChildNodes();
		// ��ʱlist�Ƕ��ٸ���
		// �����5���ڵ�ԭ������dom����ʱ��ѽڵ��еĿյ�����һ���ڵ�
		System.out.println("�ڵ�����" + list.getLength());
		System.out.println("====================================");
		// ������еĽڵ�
		for (int i = 0; i < list.getLength(); i++) {
			System.out.println(list.item(i).getNodeName());
		}
		System.out.println("=====================================");
		for (int i = 0; i < list.getLength(); i++) {
			// �ڵ�
			Node no = list.item(i);
			// getNodeType�ڵ������
			System.out.println(no.getNodeType() + ":" + no.getNodeName());
			short type = no.getNodeType();
			if (type == Node.ELEMENT_NODE) {
				System.out.println("�ڵ�" + i);
			} else if (type == Node.COMMENT_NODE) {
				System.out.println("ע��");
			} else if (type == Node.TEXT_NODE) {
				System.out.println("�ı�");
			}
		}
		System.out.println("=========ݔ���ı�����========");
		for (int i = 0; i < list.getLength(); i++) {
			Node no = list.item(i);
			System.out.println(no.getTextContent());
		}
		System.out.println("=========ݔ������=====================");
		// �������
		NodeList nodeList = doc.getElementsByTagName("student");
		System.out.println(nodeList.getLength());
		// �������
		for (int i = 0; i < nodeList.getLength(); i++) {
			// �õ�namednodemap
			//����ֵ��namednodemap�е�������  ����ֵname����СΪ��
			NamedNodeMap nnm = nodeList.item(i).getAttributes();
			// ��������
			String attrName = nnm.item(0).getNodeName();
			// ����ֵ
			String attrValue = nnm.item(0).getNodeValue();
			System.out.println(attrName + "=" + attrValue);
		}
		
	}
}
