package com.iu.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

	public void receive() throws Exception {
		
		ServerSocket serverSocket = new ServerSocket(8282);//에러가뜸 포트 충돌이 생길 수 있다
		//서버 오픈하고 Client의 접속을 기다림
		System.out.println("Client 접속 기다리는 중");
		//Socket : 상대방과 1:1 통신
		
		Socket socket = serverSocket.accept();
		System.out.println("Client 접속 완료");
		
		//0,1을 문자로 문자에서 문자열로 받아들이는 작업
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		String message = br.readLine();
		System.out.println("Client : "+message);
		
		br.close();
		ir.close();
		is.close();
		socket.close();
		
	}
	
}
