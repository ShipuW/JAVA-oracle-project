package com.oracle.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * 创建第一个标签
 * 
 * @author Mountainpeople
 * 
 */
public class MyTag extends TagSupport {
	// 重写父类的doEndTag()或都doStartTag()方法
	@Override
	public int doStartTag() throws JspException {
		try {
			// 向页面上输出符串
			this.pageContext.getOut().println("hello word");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return EVAL_BODY_INCLUDE;
	}

	@Override
	public int doEndTag() throws JspException {
		// 向页面上输出字符串
		try {
			this.pageContext.getOut().println("welcome");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 处理后面的页面
		return EVAL_PAGE;
	}
}
