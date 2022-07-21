package com.iu.util.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();//
		
		Calendar birth = Calendar.getInstance();//1998
		birth.set(Calendar.YEAR, 1998);
		birth.set(Calendar.MONTH, 8);
		birth.set(Calendar.DATE, 23);
		
		long n = now.getTimeInMillis();
		long b = birth.getTimeInMillis();
		System.out.println(b);
		
		long result = n-b;
		System.out.println(result/(1000*60*60*24)/365);
		
		Date date = now.getTime();
		System.out.println(date);
		
//		future.set(Calendar.MINUTE, 15);
//		
//		long n = now.getTimeInMillis();
//		long f = future.getTimeInMillis();
//		
//		long result = f-n;
//		System.out.println(result);//60.016
//		System.out.println(result/(1000*60));

	}

}
