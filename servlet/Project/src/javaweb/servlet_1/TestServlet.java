package javaweb.servlet_1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	//��ʼ������
	public void init() throws ServletException {
		super.init();
	}
    //����HTTP Get����
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
	}
	//����HTTP Post����
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
	}
	//����HTTP Put����
	protected void doDelete(HttpServletRequest req,
			HttpServletResponse resp)
			throws ServletException, IOException {
	}
	//����HTTP Delete����
	protected void doPut(HttpServletRequest req, 
			HttpServletResponse resp)
			throws ServletException, IOException {
	}
	//���ٷ���
	public void destroy(){
		super.destroy();
	}
	

}
