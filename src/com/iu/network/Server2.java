package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class Server2 {
	
	private ArrayList<String> lunch;
	private ArrayList<String> dinner;
	
	public Server2() {
		lunch = new ArrayList<>();
		dinner = new ArrayList<>();
		
		lunch.add("짜장면");
		lunch.add("라면");
		lunch.add("햄버거");
		lunch.add("피자");
		lunch.add("오늘은 다이어트 안먹어");
		
		dinner.add("삼겹살");
		dinner.add("치킨");
		dinner.add("샐러드");
		dinner.add("볶음밥");
		dinner.add("물");
		
	}

	//getFood
	//server에서 메세지를 기다림
	//1 : 점심 메뉴 중 랜덤하게 하나를 골라서 client로 전송
	//2 : 저녁 메뉴 중 랜덤하게 하나를 골라서 client로 전송
	//3 : 프로그램이 종료
	//그외 나머지 : 잘못 입력된 번호입니다를 client로 전송
	
	public void getFood () throws Exception {
		ServerSocket serverSocket = new ServerSocket(8282);
		System.out.println("Client 접속 기다리는중..");
		Socket socket = serverSocket.accept();
		System.out.println("Client 접속 완료!!");
		
//		System.out.println(lunch.get(0)); 런치메뉴가 나오는지 확인
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		boolean check = true;
		while(check) {
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(br);
			String message = br.readLine();//int든 뭐든 다 String으로 받아야한다
			
			System.out.println("Client : "+message);
			
			int select = Integer.parseInt(message);
			
			Random random = new Random(Calendar.getInstance().getTimeInMillis());//랜덤에서 loog타입 시드를 쓴다
			if(select==1) {
				int index = random.nextInt(lunch.size());
				message = lunch.get(index);
//			System.out.println(lunch.get(0));
				
			}else if (select==2) {
				int index = random.nextInt(dinner.size());
				message = dinner.get(index);
//			System.out.println(dinner.get(0));
			}else if (select==3) {
				break;
			}else {
				System.out.println("번호를 잘못 입력하셨습니다");
			}
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			bw.write(message+"\r\n");
			bw.flush();
			
		}
		
		br.close();
		ir.close();
		is.close();
		
		bw.close();
		ow.close();
		os.close();
		
		socket.close();
		serverSocket.close();
		
	}
	
}
