package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class WeatherMain {

	public static void main(String[] args) {
		//1. 클래스의 역할과 메서드의 역할, 변수의 역할
		//WeatherMain		: 프로그램 실행, Test
		//WeatherService	: Data 가공
		//WeatherContrlloer : 관리
		//WeatherView		: Data 출력
		//CityDTO			: 객체 정보
		WeatherController wController = new WeatherController();
		wController.start();

	}

}
