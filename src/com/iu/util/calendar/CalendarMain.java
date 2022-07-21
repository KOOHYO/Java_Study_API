package com.iu.util.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain {

	public static void main(String[] args) {
		//Calendar ca = new GregorianCalendar();다형성
		//현재 년 월 일 시 분 초 밀리세컨즈(밀리세컨즈:1000->1초)
		Calendar ca = Calendar.getInstance();//위와 같은것이다
		System.out.println(ca);
		ca.set(Calendar.YEAR, 2002);
		ca.set(Calendar.MONTH, 11);//컴퓨터는 1번째 숫자가 무조건 0
		ca.set(Calendar.DATE, 25);
		
		int y = ca.get(Calendar.YEAR);//대문자 : 상수 , 뉘어져있다 앞에 static이 있음
		int m = ca.get(Calendar.MONTH);
		int d = ca.get(Calendar.DAY_OF_MONTH);
		int h = ca.get(Calendar.HOUR_OF_DAY);
		int min = ca.get(Calendar.MINUTE);
		int sec = ca.get(Calendar.SECOND);
		
		long milis = ca.getTimeInMillis();//중복되지않는것을 만들때 쓰임 Random같은 경우
		
		
		System.out.println(y);
		System.out.println(m+1);
		System.out.println(d);
		System.out.println(h);
		System.out.println(min);
		System.out.println(sec);
		System.out.println(milis);
	}

}
