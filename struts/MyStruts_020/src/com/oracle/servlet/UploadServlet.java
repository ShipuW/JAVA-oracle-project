package com.oracle.servlet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;



public class UploadServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		DiskFileItemFactory factory = new DiskFileItemFactory();
		String path = req.getRealPath("/upload");
		factory.setRepository(new File(path));
		factory.setSizeThreshold(1024*1024);
		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setHeaderEncoding("utf-8");
		try {
			List<FileItem> list = (List<FileItem>)upload.parseRequest(req);
			for (FileItem fileItem : list) {
				if(fileItem.isFormField()){
					String name=fileItem.getFieldName();
					System.out.println(name);
					String value = fileItem.getString();
					System.out.println(value);
					req.setAttribute(name, value);
				}else{
					String name = fileItem.getFieldName();
					String value = fileItem.getName();
					int start = value.lastIndexOf("\\");
					String fileName = value.substring(start+1);
					req.setAttribute(name, fileName);
					uploadFile(path,fileItem,fileName);
					
				}
			}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.getRequestDispatcher("fileResult.jsp").forward(req, resp);
	}
	private void uploadFile(String path,FileItem item,String fileName) throws FileNotFoundException,IOException{
		OutputStream os = new FileOutputStream(new File(path,fileName));
		InputStream is = item.getInputStream();
		byte[] buffer = new byte[500];
		int length = 0;
		while((length = is.read(buffer) )!= -1){
			os.write(buffer, 0, length);
		}
		is.close();
		os.close();
	}
}
