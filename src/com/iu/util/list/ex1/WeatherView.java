package com.iu.util.list.ex1;

import java.util.ArrayList;

public class WeatherView {
	
	//오버로딩
	public void view(ArrayList<CityDTO> cityDTOs) {
		for(int i=0; i<cityDTOs.size(); i++) {
			System.out.println("지역은 : "+cityDTOs.get(i).getName());
			System.out.println("기온은 : "+cityDTOs.get(i).getGion());
			System.out.println("습도는 : "+cityDTOs.get(i).getHum());
			System.out.println("상태는 : "+cityDTOs.get(i).getStatus());
		}
	
	}
	
	public void view(CityDTO cDto) {
		System.out.println("지역은 : "+cDto.getName());
		System.out.println("기온은 : "+cDto.getGion());
		System.out.println("습도는 : "+cDto.getHum());
		System.out.println("상태는 : "+cDto.getStatus());
	}
	
	public void view(String message) {
		
	}
	
}
