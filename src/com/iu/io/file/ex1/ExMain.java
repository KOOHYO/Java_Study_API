package com.iu.io.file.ex1;

import java.util.ArrayList;

public class ExMain {

	public static void main(String[] args) {
		StudentDAO sDao = new StudentDAO();
		StudentService service = new StudentService();
		ArrayList<StudentDTO> ar = null;
		try {
			ar = service.getlist();
			for(StudentDTO studentDTO : ar) {
				System.out.println(studentDTO.getName());
				System.out.println(studentDTO.getNum());
				System.out.println(studentDTO.getKor());
				System.out.println(studentDTO.getEng());
				System.out.println(studentDTO.getMath());
				System.out.println(studentDTO.getTotal());
				System.out.println(studentDTO.getAvg());
				System.out.println("===================");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setName("Add");
		studentDTO.setNum(6);
		studentDTO.setKor(50);
		studentDTO.setEng(50);
		studentDTO.setMath(50);
		ar.add(studentDTO);
		
		int result = service.getlist();
		System.out.println(ar);

	}

}
