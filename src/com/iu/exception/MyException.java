package com.iu.exception;

public class MyException extends Exception{
	
	//오버라이딩 할것은 없다.
	public MyException() {
		super("몰라요 산수 포기");
		// TODO Auto-generated constructor stub
	}
	
	private MyException(String message) {
		super(message);
		// TODO Auto-generated method stub

	}
	
}
