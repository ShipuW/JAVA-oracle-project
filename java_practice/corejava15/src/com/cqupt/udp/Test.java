package com.cqupt.udp;

import java.net.InetAddress;

public class Test {
	public static void main(String[] args) throws Exception {
		InetAddress [] ips = InetAddress.getAllByName("www.taobao.com");
		for (InetAddress inetAddress : ips) {
			System.out.println(inetAddress);
		}
		
	}
}
