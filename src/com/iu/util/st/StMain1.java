package com.iu.util.st;

import java.util.StringTokenizer;//다른패키지에 있어 임포트로 호출

public class StMain1 {

	public static void main(String[] args) {
		String str = "samsung-500-lg-600-google-900-kakao-700";
		
		StringTokenizer st = new StringTokenizer(str,"-");//기본생성자가 없어 에러가 뜨는것이니 문서확인! 둘다 스트링타입!!
		System.out.println(st.countTokens());//분리한(토큰) 갯수를 호출
		
		while(st.hasMoreTokens()) {
			//parsing
			String token = st.nextToken();
			System.out.println(token);
			token = st.nextToken();
			System.out.println(token);
			System.out.println("=================");
			
		}

	}

}
