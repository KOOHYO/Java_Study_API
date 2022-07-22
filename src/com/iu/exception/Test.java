package com.iu.exception;

import java.util.Random;
import java.util.Scanner;

public class Test {
	
	public void t4() throws Exception{
		//유치원생 프로그램
		//0-99
		int num = 48;
		int num2 = 82;
		int num3 = num+num2;//유치원생은 모를 수 있다 에러
		int num4 = num - num2;//음수가뜬다 에러
		
		if(99<num3) {
			throw new Exception();//처리를 해야지 왜 안하고있어,트라이 캣치를 쓰든지, 던져버리든지
			//throw new Exception(); 기존의 Exception객체를 만들어도 된다/비번 틀렸다, 락걸려서 안됀다 등.. 에 쓰임
		}
		
		if(num4<0) {
			throw new Exception("그런 숫자 몰라요");
		}
		
		
	}
	
	public void t3() throws NullPointerException, ArithmeticException {
		String str = null;
		System.out.println(str.toString());
		
	}

	public void t2() {
		String [] str = {"10", "five", "3.14", "0"};
		Scanner sc = new Scanner(System.in);
		for(String s:str) {
			try {
				System.out.println("숫자를 입력하세요");
				int n = sc.nextInt();
				
				int num = Integer.parseInt(s);
				num = n/num;
				System.out.println(num);
			}catch(NumberFormatException e) {
				//예외처리
				System.out.println("예외처리");
			}catch(ArithmeticException e) {
				System.out.println("수학 오류 해결");
			}catch(Exception e) {
				e.printStackTrace();//스택에 에러를 추적하고 프린트를 해달라는 것
			}catch(Throwable e){
				
			}
		}
		
	}
	
	public void t1() {
		System.out.println("t1 메서드 실행");
		Random random = new Random();
		
		String str = null;
		if(random.nextInt(10)%2==0) {
			str="10";
		}
			
		int num = Integer.parseInt("10");//new NumberException(); Exception 객체 생성
		try {
			num = num/5;
			System.out.println(num);
		}catch(ArithmeticException e) {
			System.out.println("예외처리");
		}
		
		System.out.println(str.toString());
		System.out.println("t1 메서드 종료");
		
	}
	
}
