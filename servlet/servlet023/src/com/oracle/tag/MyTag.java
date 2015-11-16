package com.oracle.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * ������һ����ǩ
 * 
 * @author Mountainpeople
 * 
 */
public class MyTag extends TagSupport {
	// ��д�����doEndTag()��doStartTag()����
	@Override
	public int doStartTag() throws JspException {
		try {
			// ��ҳ�����������
			this.pageContext.getOut().println("hello word");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return EVAL_BODY_INCLUDE;
	}

	@Override
	public int doEndTag() throws JspException {
		// ��ҳ��������ַ���
		try {
			this.pageContext.getOut().println("welcome");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ��������ҳ��
		return EVAL_PAGE;
	}
}
