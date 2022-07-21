package com.iu.util.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();//키는 보통 스트링으로 많이함 reference타입 Object타입만 모을 수 있다.
		//put() 데이터를 집어넣는 메서드
		map.put("n1", 10);//여기서 Integer로 auto boxing된다
		map.put("n2", 20);
		map.put("Third", 270);
		
		System.out.println(map.size());//갯수가 있는지
		System.out.println(map.isEmpty());//비어있는지 물어보는것(boolean)
		
		//get() 꺼내는 메서드
		int num = map.get("n2");
		System.out.println(num);
		
		//map안에 데이터를 전부 다 꺼내는 방법
		//1. key들을 알아내기
		boolean check = map.containsKey("n2");
		System.out.println(check);
		
		Set<String> set = map.keySet();
		
		//2. map안에 데이터를 꺼내는 방법
		Iterator<String> it = set.iterator();//보라색 I는 인터페이스, 초록색C는 클래스 (A가 붙어있으면 엡스트랙(추상) 클래스)
		while(it.hasNext()) {//hasmoreTokenze와 같음 다음데이터가 있습니까?(boolean)
			String key = it.next();
			System.out.println(key);
			System.out.println(map.get(key));
			
		}
		

	}

}
