package com.iu.lang.string.ex1;

import javax.print.attribute.standard.RequestingUserName;

public class WorkerSevice {

	//private String info;
	
	private StringBuffer sb;
	
	public WorkerSevice() {
//		"iu-인사과-과장-0101111";
//		", suji-IT-대리-0102222";
//		", choa-영업-부장-0103333";
//		", hani-마케팅-사원-0104444";
		sb = new StringBuffer();
		sb.append("iu-인사과-과장-0101111");
		sb.append(", suji-IT-대리-0102222");
		sb.append(", choa-영업-부장-0103333");
		sb.append(", hani-마케팅-사원-0104444");
		
	}
	
	public WorkerDTO [] init() {
		//info 파싱해서 WorkerDTO에 대입하고
		//WorkerDTO를 모은배열을 리턴
		String info = sb.toString();
		String newInfo = sb.toString().replace(',', '-');
		//newInfo = sb.toString().replace(" ", ""); 이것이 왜 안됄까?
		
		String [] infos = newInfo.split("-");
		
		WorkerDTO [] workerdtos = new WorkerDTO[infos.length/4];
		//i = 0, 1, 2, 3
		for(int i=0; i<infos.length; i++) {
			
			WorkerDTO workerdto = new WorkerDTO();
			workerdtos[i/4]=workerdto;
			workerdto.setName(infos[i].trim());			 //4, 8
			workerdto.setDepartment(infos[++i].trim());  //5, 9
			workerdto.setJob(infos[++i].trim());		 //6, 10
			workerdto.setPhone(infos[++i].trim());		 //7, 11
		}
		
		return workerdtos;
	}
	
}
