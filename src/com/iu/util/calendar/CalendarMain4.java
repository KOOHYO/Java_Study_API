package com.iu.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMain4 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getTime());
		
		//ca.roll(Calendar.MINUTE, 20); //amount 양을 얘기한다
		ca.add(Calendar.MINUTE, 20);
		System.out.println(ca.getTime());
		
		System.out.println("=========================");
		ca = Calendar.getInstance();
		String pattern = "yyyy년 MM월 dd일 E";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		String time = sd.format(ca.getTime());//데이터를 패턴에 맞는 문자열로 변환!
		System.out.println(time);

	}

}
