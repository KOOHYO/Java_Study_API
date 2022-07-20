package com.iu.util.list;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		// 1,2,3
		int [] nums = new int[3];
		nums[0] = 1;
		
		//1. List -> ArrayList(가장 많이 쓰임)
		ArrayList ar = new ArrayList();
		ar.add(1);//int타입이 자동으로 integer로 auto boxing 되어 들어감
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(0);
		ar.add(1, "abc");//1번 인덱스에 삽입
		
		ListView listView = new ListView();
		listView.view(ar);
		//remove - 특정 인덱스 번호의 요소를 삭제
		ar.remove(2);
		ar.remove("abc");
		listView.view(ar);
		
		//set	 - 특정 인덱스 번호의 요소를 수정
		ar.set(1, 'c');//char타입이 자동으로 auto boxing 되어 캐릭터로 들어감
		
		listView.view(ar);
		
		//clear  - 모든 요소를 삭제
		ar.clear();
		listView.view(ar);//여기서 size는 0칸이다 에러는 안뜨고 아예 없어진것도아니다
		
	}

}
