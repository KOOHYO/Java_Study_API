package com.iu.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
	//DTO : Data Transfer Object 
	//DAO : Data Access Object  읽어오거나 쓸려고 한다.
	// file data에 접근
	
	//1. getList 메서드
	//   studentData 파일의 내용을 읽어서 작업 4명의 정보를 DTO에 담아야한다
	
	public ArrayList<StudentDTO> getList () throws Exception{
		ArrayList<StudentDTO> ar = new ArrayList<>();
		StudentDTO stDto = new StudentDTO();
		File file = new File("C:\\Study","studentData.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		boolean check = true;
//		String str = br.readLine();//" "
//		str = br.readLine();//str : iu,1,56,54,85
//		System.out.println(str);//확인하기! 첫부분이 엔터이니 여기서 전처리작업 스플릿이나 토크나이저 쓰기
		//첫줄 공백 제거
		String data = br.readLine();
		while(check) {
			data = br.readLine();
			if(data==null) {
				break;
			}
		}
	
		StringTokenizer st = new StringTokenizer(data, ",");
		while(st.hasMoreTokens()) {
			stDto.setName(st.nextToken().trim());
			stDto.setNum(Integer.parseInt(st.nextToken()));
			stDto.setKor(Integer.parseInt(st.nextToken()));
			stDto.setEng(Integer.parseInt(st.nextToken()));
			stDto.setMath(Integer.parseInt(st.nextToken()));
			ar.add(stDto);
			}
		return ar;
	}
	
}
