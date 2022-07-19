package com.iu.lang.wrapper;

public class WrapperMain1 {

	public static void main(String[] args) {
		
		System.out.println(Integer.BYTES);//스태틱변수명은 글씨가 기울어짐 이틀릭체
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		String num = "10";
		
		Integer integer = new Integer(num);//Integer에 줄 그어져있는것은 쓰지말것을 권장합니다라는 뜻
		int n = integer.intValue();
		
		n = 50;
		integer = new Integer(n);
		
		integer = n;//참조변수 integer에 정수 n을 넣을 수 없는데 auto-boxing:정수값 인트를 레퍼런스 타입으로 감싼다
		n = integer;//auto-unboxing : 자동으로 벗긴다
		
		long l = 10L;
		Long ll = l;//integer변수에 auto-boxing은 안됀다
		
		integer = (int)l;//형변환을 하면 가능하다 auto-boxing 
		//integer = (int)ll; 같은 프리미티브 타입만 형변환 가능
		
		String num1 = "ten";//여기에 ten
		String num2 = "3.12";
		String num3 = "60";
		
		int n1 = Integer.parseInt(num1);
		double n2 = Double.parseDouble(num2);
		long n3 = Long.parseLong(num3);
		
		System.out.println(n1*2);
		System.out.println(n2*2);
		System.out.println(n3*2);
		
		
		
		System.out.println(n+2);
		
	}
}
