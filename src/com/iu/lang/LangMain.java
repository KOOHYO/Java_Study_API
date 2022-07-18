package com.iu.lang;



public class LangMain {

	public static void main(String[] args) {
		Object object = new Object();
		String string = object.toString();
		Member member = new Member();
		System.out.println(string);
		string = member.toString();
		System.out.println(string);
		MemberClient memberClient = new MemberClient();
		Car car = new Car();
		Car car2 = new Car();
		object = member;
		
		boolean check = car.equals(car2);// car == car2
		System.out.println(car);
		System.out.println(car.toString());//car == car.toString 증명
		System.out.println(check);
	
	}

}
