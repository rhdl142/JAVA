package com.test.example;

public class Ex59_enum {

	public static void main(String[] args) {
		
		//Ex59_enum.java
		
		//열거형, Enumeration
		// - 클래스의 일종(= 자료형)
		// - 열거값을 가지는 자료형(제시된 값들 중에서 선택하는 자료형)
		
		//상황] 의류 쇼핑몰 > 고객 > 옷 선택 + 색상
		//색상 : red, yellow, blue
		//색상 입력 -> 주관식 -> 유효성
		//String color = "red";
		//System.out.println(color);
		
		//색상 입력 -> 객관식 -> 
		//1. red, 2. yellow, 3. blue
		String color = "4";
		System.out.println(color);
		
		//열거형 사용	
		Color c = Color.red; //열거형 리터럴
		Color c4 = Color.blue;
		
		//Color.blue = ?;
		//10 = 3;
		
		System.out.println(c);
		
		if (c == Color.yellow) {
			
		}
		
		
		Color2 c2 = Color2.YELLOW;
		
		if (c2 == Color2.BLUE) {
			
		}
		
		int c3 = Color3.BLUE;
		
		if (c3 == Color3.RED) {
			
		}
		
	}
	
}

//열거형 선언
enum Color {
	//멤버
	red,
	blue,
	yellow
}


enum Color2 { RED, BLUE, YELLOW }

class Color3 {
	public static final int RED = 1;
	public static final int BLUE = 2;
	public static final int YELLOW = 3;
}



enum 성별 {
	남자,
	여자
}


enum 불리언 {
	true2,
	false2
}

enum 직급 {
	부장,
	과장,
	대리,
	사원
}





















