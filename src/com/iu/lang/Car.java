package com.iu.lang;

public class Car {
	
	@Override
	public boolean equals(Object obj) {
		Car car = (Car)obj;
		return true;
	}
	
	@Override
	public String toString() {
		return "car 에서 오버라이딩 함";
	}
}
