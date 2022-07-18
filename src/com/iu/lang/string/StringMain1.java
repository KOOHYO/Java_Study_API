package com.iu.lang.string;

public class StringMain1 {

	public static void main(String[] args) {
		
		String str1 = "iu";
		String str2 = "iu";
		String str3 = new String("iu");//Heap영역의 객체를 만든것이기때문에 str1, str2와 비교하면 다르다
		
		System.out.println(str1 == str2);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("=================");
		System.out.println(str1.equals(str2));//
		System.out.println(str1.equals(str3));
		
		StringStudy ss = new StringStudy();
		ss.studyCarAt();
		
		System.out.println("=================");
		StringStudy2 ss2 = new StringStudy2();
		ss2.studyIndexof();
		System.out.println("=================");
		ss2.studyIndexOfEx1();
		System.out.println("=================");
		ss2.studySubString();
		System.out.println("=================");
		ss2.ex2();

	}

}
