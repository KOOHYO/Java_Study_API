package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.iu.lang.string.ex1.WorkerDTO;

public class WeatherService {

	private StringBuffer sb;
	private Scanner sc;
	
	public WeatherService() {
		sb = new StringBuffer();
		sb.append("Seoul,30.2,70,맑음,");
		sb.append("Daegu-38.9-90-흐림-");
		sb.append("Jeju,12.1,10,눈,");
		sb.append("Busan-0.5,85,태풍");
		sc = new Scanner(System.in);
		
	}
	
	public void init(ArrayList<CityDTO> cityDTOs) {
		String info = sb.toString();
		String newInfo = sb.toString().replace('-', ',');//'-'를 ','으로 바꿔주는 작업!
		
		//System.out.println(newInfo);
//		newInfo = sb.toString().replace(",", "");
//		for(int i=0; i<cityDTOs.size(); i++) {
//			CityDTO cDto = new CityDTO();
//			cDto = newInfo;
//			cityDTOs.add()
//			
//		}

		StringTokenizer st = new StringTokenizer(newInfo, ",");
		while(st.hasMoreTokens()) {
			CityDTO cDto = new CityDTO();
			System.out.println("지역을 입력해 주세요");
			cDto.setName(st.nextToken());
			System.out.println("지역의 기온을 입력해 주세요");
			cDto.setGion(Double.parseDouble(st.nextToken()));
			System.out.println("지역의 습도를 입력해 주세요");
			cDto.setHum(Integer.parseInt(st.nextToken()));
			System.out.println("지역의 상태를 입력해 주세요");
			cDto.setStatus(st.nextToken());
			cityDTOs.add(cDto);
		}

		//cityDTO = newInfo;

		
		
		
	}
	
	public void add(ArrayList<CityDTO> cityDTOs) {
		CityDTO cDto = new CityDTO();
		cDto.setName(sc.next());
		cDto.setGion(sc.nextDouble());
		cDto.setHum(sc.nextInt());
		cDto.setStatus(sc.next());
		cityDTOs.add(cDto);
		
	}
	
	public void remove(ArrayList<CityDTO> cityDTOs) {
		CityDTO cDto = new CityDTO();
		String check = sc.next();
		for(int i=0; i<cityDTOs.size(); i++) {
			check = cityDTOs.get(i).getName();
		}
		
	}
	
	public void find(ArrayList<CityDTO> cityDTOs) {
		
	}
	
}
