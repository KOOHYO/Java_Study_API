package com.iu.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class IOMain2 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);//컴퓨터와 키보드가 연결 됨
//		//DDOS
//		//Denial Of Service 서버의 자원이 유한한데 해커가 다른컴퓨터를 이용해 자원을 다른사람이 못쓰게끔 하는 것
//		
//		
//		sc.close();//scanner서비스를 끊어주는 역할 (이렇게 해야 이 자원을 다른사람이 이용 할 수 있음)
		InputStream is = System.in;//0과 1을 처리한다
		InputStreamReader ir = new InputStreamReader(is);//한 글자를 만든다
		BufferedReader br = new BufferedReader(ir);//문자열을 만든다 연결 됐다.
		
		System.out.println("입력");
		
		try {
			String message = br.readLine();
			System.out.println(message);
		} catch (Exception e) {
			e.printStackTrace();//어떤 에러가 발생하는지 출력, 개발이 끝나면 꼭 지우기 안그럼 위험!!
		}finally {
			//연결된 역순으로 자원 해제
			try {
				br.close();//끊는걸 꼭 해야한다! 안그러면 시스템 느려지고 인터넷이 안됌!
				ir.close();
				is.close();
			}catch(Exception e) {
				
			}
			
		}
		

	}

}
