package com.iu.util.calendar;

import java.util.Calendar;

public class CalendarMain4 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getTime());
		
		//ca.roll(Calendar.MINUTE, 20); //amount 양을 얘기한다
		ca.add(Calendar.MINUTE, 20);
		System.out.println(ca.getTime());

	}

}
