package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {

	public void send() throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.32", 8282);//에러뜸 예외가 발생할 수 있다
		System.out.println("Server 접속 완료");//이게 안나오는건 실패했다는 얘기
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader sr = null;
		BufferedReader br = null;
		
		//-----------------------------------------------------------------------
		
		boolean check = true;
		
		while(check) {
			
			System.out.println("서버로 보낼 메세지 입력");
			String message = sc.next();
			
			
			//문자를 보낼준비 문자열을 문자로 쪼개는 작업
			os = socket.getOutputStream();//0,1
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			//전송
			bw.write(message+"\r\n");//\r은 리턴, \n은 엔터치고 밑으로 내려오세요
			bw.flush();
			
			if(message.toLowerCase().equals("Q")) {
				//자원해제 연결된 역순으로 해제
				break;
			}
			
			//------------------------------------------------------------
			
			is = socket.getInputStream();
			sr = new InputStreamReader(is);
			br = new BufferedReader(sr);
			
			String message2 = br.readLine();
			
			if(message2.toLowerCase().equals("Q")) {
				check=false;
				break;
			}
			
			System.out.println("Server : "+message2);
			
		}
		br.close();
		sr.close();
		is.close();
		
		bw.close();
		ow.close();
		os.close();
		
		socket.close();
		
	}
	
}
