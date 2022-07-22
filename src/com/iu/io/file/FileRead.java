package com.iu.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public void read() throws Exception {
		//FileRead fr = new FileRead();
		//파일의 내용 읽어 오기
		//1. 어느 폴더의 어느 파일이냐
		File file = new File("C:\\Study", "test.txt");
		//2. 파읽과 연결 준비
		FileReader fr = new FileReader(file);//파일이 없을 수도 있다는 예외메세지가뜬다
		//fr.read(); : 한글자씩 읽어서 가치가 없다. 영어는 가능 한글은 2바이트라 깨짐 
		//3. 파일의 내용 읽기 위한 보조 스트림 연결
		BufferedReader br = new BufferedReader(fr);//문자열을 읽어오는 클래스
		//4. 내용 읽기
		boolean check = true;//무한 반복 돌리려고 선언
		while(check) {
			String name = br.readLine();//엔터키를 만날때까지 읽어온다.
			if(name==null) {
				break;//첫번째에 엔터키를 누르고 그 뒤에 문자열을 쓰면 null은 아니다
			}
			System.out.println(name);
		}
		
	}
	
}
