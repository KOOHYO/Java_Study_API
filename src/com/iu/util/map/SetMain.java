package com.iu.util.map;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain {

	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<>();
		
		hashSet.add(10);
		hashSet.add(1);
		hashSet.add(10);
		
		System.out.println(hashSet.size());
		
		//Set에 있는 데이터를 꺼내는 방법
		Iterator<Integer> iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
