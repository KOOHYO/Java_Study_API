package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx1 {
	
	//ex1
	//주민번호 입력 받기 : 앞 6자리 뒤 7자리 : 971224-1234567
	//1. 남자 여자 판단
	//2. 현재 나이 출력
	//3. 3-5월 사이는 : 봄
	//	 6-8월 사이는 : 여름
	//	 9-11월		: 가을
	//	 12월-2월 	: 겨울
	public void ex1() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("주민등록번호를 입력해주세요");//입력받기
		String num = scanner.next(); //문자열로 입력받음
		this.check1(num);
		this.season(num);
		this.age(num);
		
	}
	
	private void check1(String num) {
		char ch = num.charAt(7);
		if(ch=='1'||ch=='3') {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
	}
	
	private void season(String num) {
		String month = num.substring(2, 4);
		int season = Integer.parseInt(month);
		if(3<=season && season<=5) {
			System.out.println("봄");
		}else if(6<=season && season<=8) {
			System.out.println("여름");
		}else if(9<=season && season<=11) {
			System.out.println("가을");
		}else if(12==season || season==1 || season==2) {
			System.out.println("겨울");
		}else {
			System.out.println("잘못입력하셨습니다");
		}

	}
	
	private void age(String num) {
		char ch = num.charAt(7);
		String year =num.substring(0, 2);
		int year2 =Integer.parseInt(year);
		int age = 0;
		if(ch=='1'||ch=='2') {
			age=2022-(1901+year2);
		}else if (ch=='3'||ch=='4'){
			age=2022-(2001+year2);
		}else {
			System.out.println("잘못입력하셨습니다");
		}
		
		
		System.out.println(age);
	}
	
}
