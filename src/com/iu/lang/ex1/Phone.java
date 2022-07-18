package com.iu.lang.ex1;

public class Phone {

	private int Price;
	private int Size;
	
	@Override
	public boolean equals(Object obj) {//obj타입의 p2가 들어왔다
		
		Phone phone = (Phone)obj;//그래서 여기서 다형성(타입변환)을 해야한다
		phone.getPrice();
		boolean check = false;
		
		if(this.getPrice() == phone.getPrice() && this.getSize() == phone.getSize()) {//this == p1
			check=true;
		}
		
		return check;
	}
	
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		Size = size;
	}
	
}
