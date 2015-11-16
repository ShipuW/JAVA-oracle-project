package com.cqupt.qq.client.proces;

import java.net.Socket;

import com.cqupt.qq.bean.Response;

public interface ClientProcessI {
	void process(Socket sk,Response rep);

}
