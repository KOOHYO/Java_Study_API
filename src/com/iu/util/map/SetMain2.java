package com.iu.util.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetMain2 {

	public static void main(String[] args) {
		//Random
		//1	- 45 까지 중복되지 않는 숫자 6개 Set에 담아서 출력
		Random random = new Random();
		HashSet<Integer> integers = new HashSet<>();
		while(integers.size()<6) {
			int num =random.nextInt(45)+1;//0이상 45 에 +1씩 해야한다
			integers.add(num);
		}

		
		System.out.println(integers.size());
		System.out.println("==========================");
		
		Iterator<Integer> iterator = integers.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
