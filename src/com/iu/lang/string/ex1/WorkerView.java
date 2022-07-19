package com.iu.lang.string.ex1;

public class WorkerView {

	//View메서드
	//WorkerDTO들을 받아서 정보를 출력하는것
	public void View(WorkerDTO [] workerdtos) {
		for(WorkerDTO workerDTOs : workerdtos) {
			System.out.println("이름 : "+workerDTOs.getName());
			System.out.println("부서 : "+workerDTOs.getDepartment());
			System.out.println("직급 : "+workerDTOs.getJob());
			System.out.println("전화번호 : "+workerDTOs.getPhone());
		}
	}
}
