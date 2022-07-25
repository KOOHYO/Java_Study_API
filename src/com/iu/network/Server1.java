package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {

	public void receive() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		ServerSocket serverSocket = new ServerSocket(8282);//에러가뜸 포트 충돌이 생길 수 있다
		//서버 오픈하고 Client의 접속을 기다림
		System.out.println("Client 접속 기다리는 중");
		//Socket : 상대방과 1:1 통신
		
		Socket socket = serverSocket.accept();
		System.out.println("Client 접속 완료");
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter sw = null;
		BufferedWriter bw = null;
		
			
		boolean check = true;
			
		while(check) {
				
			//0,1을 문자로 문자에서 문자열로 받아들이는 작업
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
				
			String message = br.readLine();
			if(message.toLowerCase().equals("Q")) {
				break;
			}
			
			System.out.println("Client : "+message);
			
			System.out.println("Client 에게 보낼 메세지 입력");
			String message2 = sc.next();
			
			os = socket.getOutputStream();
			sw = new OutputStreamWriter(os);
			bw = new BufferedWriter(sw);
			
			
			bw.write(message2+"\r\n");//\r은 리턴, \n은 엔터치고 밑으로 내려오세요
			bw.flush();
			
			if(message.toLowerCase().equals("Q")) {
				break;
			}
			
		}
		
		br.close();
		ir.close();
		is.close();
		
		bw.close();
		sw.close();
		os.close();
		
		socket.close();
		serverSocket.close();
	}
	
}
