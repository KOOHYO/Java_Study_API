package com.iu.lang.string;

public class StringStudy3 {
	
	
	
	public void studySplit3() {
		String info = "서울,대전-대구,부산-제주,광주-강릉";
		//전처리
		info=info.replace(',', '-');
		System.out.println(info);
		String [] cities = info.split("-");
		for(String city:cities) {
			
			System.out.println(city);
		}

		
	}
	
	public void studySplit2() {
		String info = "1997 12 24";
		String [] infos = info.split(" ");
		
		for(String year: infos) {
			System.out.println(year);
		}
		
	}
	
	public void studySplit() {
		
		//객체생성 방법 2가지
		String str = "iu,suji,choa,hani";
		//String str2 = new String("");
		
		String [] names = str.split(",");//배열을 분리하는 메서드
		
		//for -> for(초기식; 조건식; 증감식){}
		//향상된 for문 for(배열에 모은데이터타입 변수명: 배열참조변수명){}
		
//		for(int i=0; i<names.length; i++) {문자열의 length는 메서드이다 i값을 알 수 있으면 몇번 도는지 알 수 있다.
//			String name = names[i];
//		}
		
		for(String name: names) {//몇번 도는지 알 수 없다. 인덱스번호가 필요 없으면 사용하는것이 편하다.
			System.out.println(name);
		}
		
	}
	
}
