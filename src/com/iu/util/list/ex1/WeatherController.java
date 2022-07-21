package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {

	private Scanner sc;//여기 안에서만 사용하기위해 private으로 선언
	private WeatherService wService;
	private WeatherView wView;
	
	//결합도가 강하다(놉다) : 자체에서 객체 생성
	//결합도가 느슨하다(낮다): 매개변수를 통해서 만들어진 객체를 주입
	//					: 생성자의 매개변수, 
	public WeatherController() {
		sc = new Scanner(System.in);
		wService = new WeatherService();
		wView = new WeatherView();
	}
	
	public void start() {
		ArrayList<CityDTO> cityDTOs = new ArrayList<>();
		
		boolean check = true;
		while(check) {
			System.out.println("==============");
			System.out.println("1. 날씨정보 초기화");
			System.out.println("2. 전국날씨 출 력");
			System.out.println("3. 지역날씨 검 색");
			System.out.println("4. 지역정보 추 가");
			System.out.println("5. 지역정보 삭 제");
			System.out.println("6. 종        료");
			System.out.println("==============");
			int num = sc.nextInt();
			if(num == 1) {
				System.out.println("날씨정보를 초기화 하겠습니다");
				wService.init(cityDTOs);
			}else if(num == 2) {
				System.out.println("전국날씨를 출력 하겠습니다");
				wView.view(cityDTOs);
			}else if(num == 3) {
				System.out.println("지역날씨를 검색 하겠습니다");
				CityDTO cDto = wService.find(cityDTOs);
				if(cDto != null) {
					wView.view(cDto);
				}else {
					wView.view("일치하는 지역이 없습니다");
				}
			}else if(num == 4) {
				System.out.println("지역정보를 추가 하겠습니다");
				boolean flag = wService.add(cityDTOs);
				String message = "추가를 실패하였습니다";
				if(flag) {
					message = "추가를 성공하였습니다";
				}
				wView.view(message);
			}else if(num == 5) {
				System.out.println("지역정보를 삭제 하겠습니다");
				boolean flag = wService.remove(cityDTOs);
				String message = "삭제를 실패하였습니다";
				if(flag) {
					message = "삭제를 성공하였습니다";
				}
				wView.view(message);
			}else if(num == 6){
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				System.out.println("※잘못입력하셨습니다※");
			}
		}
	}
	
}
