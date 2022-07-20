package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {

	Scanner sc;
	WeatherService wService;
	WeatherView wView;
	
	public WeatherController() {
		sc = new Scanner(System.in);
		wService = new WeatherService();
		wView = new WeatherView();
	}
	
	public void start() {
		ArrayList<CityDTO> cityDTOs = new ArrayList<>();
		
		boolean check = true;
		while(check) {
			System.out.println("1. 날씨정보 초기화");
			System.out.println("2. 전국날씨 출 력");
			System.out.println("3. 지역날씨 검 색");
			System.out.println("4. 지역정보 추 가");
			System.out.println("5. 지역정보 삭 제");
			System.out.println("6. 종        료");
			int num = sc.nextInt();
			if(num==1) {
				System.out.println("1. 날씨정보 초기화");
				wService.init(cityDTOs);
			}else if(num==2) {
				System.out.println("2. 전국날씨 출 력");
				wView.view(cityDTOs);
			}else if(num==3) {
				System.out.println("3. 지역날씨 검 색");
			}else if(num==4) {
				System.out.println("4. 지역정보 추 가");
				wService.add(cityDTOs);
			}else if(num==5) {
				System.out.println("5. 지역정보 삭 제");
			}else if(num==6){
				System.out.println("6. 종        료");
				break;
			}else {
				System.out.println("※잘못입력하셨습니다※");
			}
		}
	}
	
}
