package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx2 {

	//jumincheck
	//주민번호 입력
	//	9	7	1	1	2	4	-	1	2	3	4	5	6	7(체크용번호)
	//	0	1	2	3	4	5		0	1	2	3	4	5
	//*	2	3	4	5	6	7		8	9	2	3	4	5	
	//	18	21	4	5	12	20		8	18	6	12	20	30
	//	총합 : 192
	
	//	총합을 11로 나누어서 나머지를 구함
	//	192	/ 11로 나눈 몫17  나머지 5(나머지만구함)
	
	//	나머지를 11에서 뺀 결과를 체크용번호랑 같은지 비교
	//	11 - 5 = 6 , 11 - 0 =11
	
	//	만약에 위의 연산결과가 두자리라면
	//	연산결과를 다시 10으로 나눈 나머지와 체크용 번호를 비교
	//	11 / 10 --- 나머지 1(이것을 체크용번호랑 비교)
	//	맞으면 주민번호 틀리면 이상한 주민번호
	
	public void jumincheck() {
//		Scanner scanner = new Scanner(System.in);//멤버변수로 해도되고 지역변수로 해도된다. 다른메서드에서도 사용할꺼면 멤버변수로!
//		String num = scanner.next();
		String num = "971124-1234567";
		int count=2;
		int sum=0;//곱하기한 결과물을 더하려고하는 변수
		for(int i=0; i<num.length()-1; i++);{
			//1. substring()  : String
			//String age = num.substring(0, i+1);//1, 2
			//int n = Integer.parseInt(age);
			//2. charAt()	  : char
			//char ch = num.charAt(0);//1, 2, 3...
			//String num = String.valueOf(ch);
			//int n = Integer.parseInt(num);
			
			if(i==6) {
				continue;
			}
			
			int n = Integer.parseInt(String.valueOf(num.charAt(i)));//위에것을 합치면 변수는 적게 쓸 수 있다.
			
			sum = sum + n*count;
			count++;
//		내가 쓴 코드
//		int jumintotal = 0;
//		String age = num.substring(0, 6);//971124
//		String gender = num.substring(7, 13);//123456
//		char agec = age.charAt(0);
//		char genderc = gender.charAt(0);
//		for(int i=0; i<age.length(); i++) {
//			agec = age.charAt(i);
//			System.out.println(agec);
//		
//		
//		}
		}
		
		int check = sum%11; //나머지하는 연산자 %
		
		check = 11-check;
		
		if(9<check) {
			check = check%10;
		}
		
		//check용 번호
		int checkNum = Integer.parseInt(String.valueOf(num.charAt(num.length()-1)));
		
		if(check == checkNum) {
			System.out.println("정상 주민번호");
		}else {
			System.out.println("비정상 주민번호");
		}
		
	}
	
}
