package com.iu.network;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {

	public void send() throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.31", 8282);//에러뜸 예외가 발생할 수 있다
		System.out.println("Server 접속 완료");//이게 안나오는건 실패했다는 얘기
		
		System.out.println("서버로 보낼 메세지 입력");
		String message = sc.next();
		
		//문자를 보낼준비 문자열을 문자로 쪼개는 작업
		OutputStream os = socket.getOutputStream();//0,1
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		//전송
		bw.write(message+"\r\n");//\r은 리턴, \n은 엔터치고 밑으로 내려오세요
		bw.flush();
		
		//자원해제 연결된 역순으로 해제
		bw.close();
		ow.close();
		os.close();
		socket.close();
		
	}
	
}
