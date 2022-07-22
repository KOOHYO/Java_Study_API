package com.iu.io.file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		//하드디스크와 연결(파일을 가져오고 파일을 읽거나 하는 등)
		//File	: 파일이나 폴더의 정보를 담는 클래스
		//		: 실제 파일이나 폴더가 없을 수도 있음
		File file = new File("C:\\Study\\test.txt");//폴더명+파일명
		//parent : 폴더, Child : 파일명 또는 최종 폴더명
		file = new File("C:\\Study", "test.txt");//위 아래 똑같다
		
		//1. 폴더명 경로가 있는 File 객체를 만들고 이용
		File path = new File("C:\\Study");
		file = new File(path, "test.txt");
		
		System.out.println(file.exists());//존재합니까?
		System.out.println(file.isFile());//파일입니까?
		System.out.println(file.isDirectory());//폴더입니까?
		System.out.println(file.length());//파일의 크기를 보는것
		
		System.out.println("==========================");
		
		System.out.println(path.exists());//존재합니까?
		System.out.println(path.isFile());//파일입니까?
		System.out.println(path.isDirectory());//폴더입니까?

	}

}
