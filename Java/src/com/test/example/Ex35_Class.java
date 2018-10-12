package com.test.example;
import java.util.Calendar;
import java.util.Date;

public class Ex35_Class {
	
	public static void main(String[] args) {
		
		//클래스명 규칙
		//1. 실제 파일명과 클래스명은 동일해야 한다.
		//2. 클래스명은 대문자로 시작해야 한다.
		// - 파스칼 표기법을 사용
		// - 필수(X) -> 권장(O) -> 필수(O)
		//3. 자바 파일(*.java) 1개 당 클래스 1개 선언
		// - 필수(X) -> 권장(O)
		// - 소스 관리가 쉬워진다.(목적에 맞는 코드를 물리적 분리)
		// - 클래스 검색이 쉽다.
		// - 1개의 *.java 파일에 여러개의 클래스를 선언하는 경우
		//		a. 모든 클래스 중에 public 키워드를 가지는 클래스는 유일
		// 	b. public 클래스가 파일명이 된다.
		
		
		//Alt + Shift + Y : 자동 줄바꿈
		//테스트입니다.테스트입니다.테스트입니다.테스트입니다.테스트입니다.테스트입니다.테스트입니다.테스트입니다.테스트입니다.테스트입니다.테스트입니다.테스트입니다.테스트입니다.테스트입니다.테스트입니다.테스트입니다.테스트입니다.테스트입니다.
		
		Cup c1 = new Cup();
		c1.name = "머그컵";
		System.out.println(c1.name);
		c1.color = "빨강";
		c1.type = "1";
		c1.check();
		
		
		//컵이 다량으로 필요
		// x 100개 -> 배열
		Cup[] list = new Cup[100];
		
		for (int i=0; i<list.length; i++) {
			
			list[i] = new Cup();
			list[i].name = "종이컵";
			list[i].color = "흰색";
			list[i].type = "3";
			
		}
		
		list[0].check();
		
		//list[0].type = "2";
		//list[0].check();
		
		
		//Cup c2;
		
		//c2.type = "2";
		//c2.check();
		
		
		ccc();
		
		bbb();
		
		ccc();
		
		ccc();
		
		
		//Ctrl + Shift + O
		//Random rnd = new Random();
		
		Calendar c3 = Calendar.getInstance();
		
		Date d3 = new Date();
		
	}//main

	private static void bbb() {
		int a;
		int b;
		int c;
	}

	private static void ccc() {
		// TODO Auto-generated method stub
		
	}


	
	
	
}//Ex35
















