package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.iu.lang.string.ex1.WorkerDTO;

public class WeatherService {

	private StringBuffer sb;
	private Scanner sc;
	
	//결합도가 강하다(놉다) : 자체에서 객체 생성
	//결합도가 느슨하다(낮다): 매개변수를 통해서 만들어진 객체를 주입
	//					: 생성자의 매개변수, 
	public WeatherService() {
		sc = new Scanner(System.in);
		sb = new StringBuffer();//sb.eqs안됀다
		sb.append("Seoul,30.2,70,맑음,");
		sb.append("Daegu-38.9-90-흐림-");
		sb.append("Jeju,12.1,10,눈,");
		sb.append("Busan-0.5,85,태풍");
		
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
			cDto.setName(st.nextToken());
			cDto.setGion(Double.parseDouble(st.nextToken()));
			cDto.setHum(Integer.parseInt(st.nextToken()));
			cDto.setStatus(st.nextToken());
			cityDTOs.add(cDto);
		}

		//cityDTO = newInfo;

		
		
		
	}
	
	public boolean add(ArrayList<CityDTO> cityDTOs) {
		CityDTO cDto = new CityDTO();
		System.out.println("지역을 입력해 주세요");
		cDto.setName(sc.next());
		System.out.println("지역의 기온을 입력해 주세요");
		cDto.setGion(sc.nextDouble());
		System.out.println("지역의 습도를 입력해 주세요");
		cDto.setHum(sc.nextInt());
		System.out.println("지역의 상태를 입력해 주세요");
		cDto.setStatus(sc.next());
		return cityDTOs.add(cDto);
		
	}
	
	public boolean remove(ArrayList<CityDTO> cityDTOs) {
		CityDTO cDto = new CityDTO();
		System.out.println("삭제 하려는 도시명을 입력해주세요");
		String check = sc.next().toLowerCase();
		boolean flag = false;
		for(int i=0; i<cityDTOs.size(); i++) {//equals메서드 쓰기 여긴 전통 for를 쓰는것이 편하다
			if(check.equals(cityDTOs.get(i).getName().toLowerCase())) {
				cityDTOs.remove(i);
				flag = true;
				break;//반복문 종료 break;
			}
		}
		return flag;
	}
	
	public CityDTO find(ArrayList<CityDTO> cityDTOs) {
		CityDTO cDto = null;//찾았으면 null이 리턴되지 않는다. 못찾았으면 null이 리턴된다
		System.out.println("찾으려는 도시명을 입력해주세요");
		String name = sc.next();
		//향상된 for문을 쓰는것이 편하다!
		for(CityDTO cDto2 : cityDTOs) {
			if(name.equals(cDto2.getName())) {
				cDto = cDto2;
				break;
			}
		}
		
		return cDto;//에러가 없어진 상태에서 중간에 코드를 쳐야한다!
	}
	
}
