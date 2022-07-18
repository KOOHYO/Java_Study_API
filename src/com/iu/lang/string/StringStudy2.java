package com.iu.lang.string;

import java.util.Scanner;

public class StringStudy2 {
	
	public void ex2() {
		//키보드로부터 파일명을 입력 받음, abc.txt, jpg.word
		//파일이 이미지파일인지 아닌지 구별
		//확장자가 jpg, png, gif, jpeg
		//이미지파일이면 이미지파일입니다 아니면 이미지파일이 아닙니다출력
		Scanner scanner = new Scanner(System.in);
		System.out.println("파일명을 쓰시오");
		String jpg = "jpg";
		String png = "png";
		String gif = "gif";
		String jpeg = "jpeg";
		String fileName = scanner.next();//파일명을 입력 받음
		int count = 0;//점을 찾을 인덱스 번호
		//.이후로 jpg, png, gif, jpeg가 오면 된다
		count = fileName.indexOf('.', 0);//.의 인덱스번호찾기
		System.out.println(count);
		String image = fileName.substring(count+1);//.기준으로 부터 뒷부분을 따로 출력
		System.out.println(image);
		
		if(image.equals(jpg) || image.equals(png) || image.equals(gif) || image.equals(jpeg)) {
			System.out.println("이미지 파일 입니다");
		}else {
			System.out.println("이미지 파일이 아닙니다");
		}
		
	}
	
	public void studyIndexOfEx1() {
		String names = "iu, suji, choa, hani";
		//1. names에는 몇개의 쉼표가 있는가??
		//2. 총 몇명입니까?
		int comma = 0;//쉼표의 갯수를 담을 변수
		int index = 0;//쉼표의 찾은 인덱스 번호
		boolean check = true;
		while(check) {				
				
			index = names.indexOf(',', index);
			
			if(index == -1) {
				break;
			}else {
				comma++;
				index++;
			}

		}
		System.out.println(", 의 갯수 : "+comma);
		System.out.println("몇명인가?"+(comma+1));
	}

	public void studyIndexof() {
		String str = "Hello Java";
		
		int index = str.indexOf(",");//ch => char
		System.out.println(index);
		
		String replace = str.replace('l', 'w');//기존에 들어간 데이터는 놔두고 새로운 객체를 만듬
		System.out.println(replace);
		System.out.println(str);
		
		str = "Google에 입사지원동기는...Google에 입사하면 노예가...";
		System.out.println(str);
		str = str.replace("Google", "Samsung");
		System.out.println(str);
		
		str = "hi";
		String str2 =" h i ";
		str2 = str2.replace(" ", "");//중간공백은 이렇게 한다
		str2 = str2.trim();//문자열 비교하기전에 공백을 없앤다
		System.out.println(str.equals(str2));
		
 	}
	
	public void studySubString() {
		//하나의 문자열을 분리 하는 작업(parsing)
		String member = "iu/1234";
		String pw = member.substring(3);//인덱스 3번부터 출력
		String id = member.substring(0, 2);//인덱스번호로 2번 미만인 글자를 리턴
		System.out.println(pw);
		System.out.println(id);
		
	}
	
}
