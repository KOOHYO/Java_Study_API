package com.iu.lang.string;

public class StringStudy {

	public void studyCarAt() {
		//문자열 = 문자배열
		char [] ch = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
		String str = "Welcome to Hel";
		
		System.out.println(ch[0]);
		char c = str.charAt(0);
		System.out.println(c);
		c = str.charAt(0);
		System.out.println(c);
		
		System.out.println(str.length());//참조변수명.매서드명
		
		System.out.println("=======================");
		//str 문자열을 하나씩 꺼내서 출력
		for(int i=0; i<str.length(); i++) {
			c = str.charAt(i);
			System.out.println(c);
		}
		
	}
	
}
