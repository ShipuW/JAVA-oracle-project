package com.cqupt.url;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Download1 {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://d.hiphotos.baidu.com/album/w%3D2048/sign=bacc1ec4b151f819f125044aee8c48ed/908fa0ec08fa513da549f4313c6d55fbb3fbd97a.jpg");
		URLConnection uc = url.openConnection();
		InputStream is = uc.getInputStream();
		BufferedInputStream bis = new BufferedInputStream(is);
		File file = new File("c:/1.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(file));
/*		FileInputStream fis = new FileInputStream("C:/1.txt");
		FileOutputStream fos = new FileOutputStream("c:/2.txt");
		BufferedOutputStream bs = new BufferedOutputStream(fos);
		byte[]a=new byte[10];
		fis.read(a);
		fos.write(a, 0, 4);
		fos.close();
*/		
		byte[] b = new byte[100];
		int len = 0;
		while((len = bis.read(b))!=-1){
			bos.write(b,0,len);
		}
		bos.close();
		bis.close();
		
			
			
	}

}
