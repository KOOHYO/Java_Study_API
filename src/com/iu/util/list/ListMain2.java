package com.iu.util.list;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		//
		ListView listView = new ListView();
		ArrayList<String> ar = new ArrayList<>();//E가 변수이기 때문에 앞에 String을 넣으면 뒤에는 안써도된다.
		ar.add("first");
		//ar.add(2);//Integer라는 클래스로 auto boxing 다형성때문에(모든 데이터는 Object타입이다)
		//ar.add('c');//Character 클래스로 auto boxing 되어 들어감
		//ar.add(2.123);//Double auto boxing 되어 들어감
		ar.add(null);//배열도 이렇게 가능 오브젝트타입을 모으면 됨!
		
		//listView.view(ar);
		
		// get	-> 특정 index의 요소를 반환
		String n1 = ar.get(0);//넣을때 Object타입으로 되어 들어가고 나올때도 Object타입으로 나오기 때문에 꺼낼때 String을 써야한다
		//int n2 = (Integer) ar.get(1);//primitive타입 끼리는 형 변환! reference타입끼리는 다형성이다. auto unboxing이 되어 들어감
		//char n3 = (Character) ar.get(2);
		//double n4 = (Double) ar.get(3);
		
		//Generic  -> <> 안에 타입을 넣는다 다형성때문에
		System.out.println(ar.get(0) instanceof String);//다른사람의 List에 들어가있는 0번 인덱스에 데이터타입이 무엇인지 모를때 씀
		
		System.out.println(n1);
		//System.out.println(n2);
		//System.out.println(n3);
		//System.out.println(n4);
		
	}

}
