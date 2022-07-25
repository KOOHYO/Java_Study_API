package com.iu.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO implements Service{
	//DTO : Data Transfer Object 
	//DAO : Data Access Object  읽어오거나 쓸려고 한다.
	// file data에 접근
	
	//2. setList
	public int setList(ArrayList<StudentDTO> ar) {
		int result=1;
		//예외처리는 내부에서 처리하고(여기서만)
		//List로 받은 데이터들을 studentData에다가 작성
		//기존의 내용은 삭제 (덮어 씌우는것)
		//작성 형식은 기존 내용의 형식과 동일하게
		//1을 리턴 : 정상적인 성공
		//0을 리턴 : 예외가 발생 했을 경우
		File file = new File("C:\\Study", "studentData.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write("\r\n");
			for(StudentDTO studentDTO : ar) {
				StringBuffer stringBuffer = new StringBuffer();
				stringBuffer.append(studentDTO.getName());
				stringBuffer.append(",");
				stringBuffer.append(studentDTO.getNum());
				stringBuffer.append(",");
				stringBuffer.append(studentDTO.getKor());
				stringBuffer.append(",");
				stringBuffer.append(studentDTO.getEng());
				stringBuffer.append(",");
				stringBuffer.append(studentDTO.getMath());
				stringBuffer.append("\r\n");
				fw.write(stringBuffer.toString());
				
			}
			
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = 0;
		}
		
		return result;
	}
	
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
