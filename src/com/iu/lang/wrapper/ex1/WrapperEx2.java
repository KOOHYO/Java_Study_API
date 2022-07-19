package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx2 {

	//jumincheck
	//주민번호 입력
	//	9	7	1	1	2	4	-	1	2	3	4	5	6	7(체크용번호)
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
//		Scanner scanner = new Scanner(System.in);
//		String num = scanner.next();
		String num = "971124-1234567";
		this.jumintotal(num);
		
	}
	
	public void jumintotal(String num) {
		int jumintotal = 0;
		String age = num.substring(0, 6);//971124
		String gender = num.substring(7, 13);//123456
		//for()
		
	}
	
}
