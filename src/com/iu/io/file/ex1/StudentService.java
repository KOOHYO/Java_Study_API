package com.iu.io.file.ex1;

import java.util.ArrayList;

public class StudentService implements Service {

	private StudentDAO studentDAO;
	
	public StudentService() {
		this.studentDAO = new StudentDAO();
		
	}
	
	   //StudentDAO에서 getList를 호출하고 총점과 평균을 각각
	   //계산해서 대입하고 그 List를 리턴
	   public ArrayList<StudentDTO> getlist() throws Exception{
	     ArrayList<StudentDTO> ar = studentDAO.getList();
	     for(StudentDTO studentDTO : ar) {
	    	 studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
	    	 studentDTO.setAvg(studentDTO.getTotal()/3.0);
	     }
	      
	      return ar;
	   }
	   
	   //StudentDAO의 setList를 호출하고 
	   //그 결과를 리턴
	   public int setList(ArrayList<StudentDTO> ar) throws Exception{
		  
		  return studentDAO.setList(ar); 
	   }
	   
	   //찾을려고 하는 학생의 번호를 입력 받아서
	   //찾은 학생을 리턴
	   public StudentDTO getStudent(ArrayList<StudentDTO> ar) throws Exception{
	      
		   return 
	   }
	   
	   //삭제하려는 학생의 번호를 입력 받아서
	   //일치하는 학생을 삭제
	   //삭제가 성공하면 1을 리턴, 실패 0을 리턴
	   public int setStudentDelete(ArrayList<StudentDTO> ar) throws Exception{
	      
	   }
	   
	   //이름 번호 국어 영어 수학 정보를 입력받아서
	   //학생 한명을 추가
	   public void setStudentAdd(ArrayList<StudentDTO> ar) throws Exception{
	      
	   }
	   
	}
