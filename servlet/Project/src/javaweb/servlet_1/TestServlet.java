package javaweb.servlet_1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	//初始化方法
	public void init() throws ServletException {
		super.init();
	}
    //处理HTTP Get请求
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
	}
	//处理HTTP Post请求
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
	}
	//处理HTTP Put请求
	protected void doDelete(HttpServletRequest req,
			HttpServletResponse resp)
			throws ServletException, IOException {
	}
	//处理HTTP Delete请求
	protected void doPut(HttpServletRequest req, 
			HttpServletResponse resp)
			throws ServletException, IOException {
	}
	//销毁方法
	public void destroy(){
		super.destroy();
	}
	

}
