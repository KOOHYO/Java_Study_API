package com.iu.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class IOMain1 {

	public static void main(String[] args) {
		//키보드로부터 글자를 입력받는 순서 작성
		InputStream is = System.in;//byte를 처리하는곳 키보드로 받는다
		InputStreamReader ir = new InputStreamReader(is);//한글자로 바꾼다
		BufferedReader br = new BufferedReader(ir);//키보드랑 연결이 되었다! 버퍼에 저장!
		System.out.println("키보드에서 입력 후 엔터");
		String msg ="";
		try {
			msg = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(msg);
		

	}

}
