package com.test.example;
import java.util.Random;

public class Ex39_Type {

	public static void main(String[] args) {
		
		//Ex39_Type.java
		
		//값형 vs 참조형 사용
		
		//m1();
		
		int a = m2();
		System.out.println(a);
		
		Random rnd = m3();
		
		if (rnd != null) {
			System.out.println(rnd.nextInt(100));
		}
		
	}
	
	//참조형 반환값
	private static Random m3() {
		
		Random rnd = null;
		
		if (Math.random() > 0.5) {
			rnd = new Random();
		}
		
		return rnd;
	}
	
	//값형 반환값
	private static int m2() {
		
		int a = -1; //반환값 - 업무 실패했을 때 돌려주는 값
		
		//사용자 질문 > 입력 데이터 + 연산 > 결과값 반환
		if (Math.random() > 0.5) {
			//연산
			a = 100; //유효한 데이터
		}
		
		return a;		
	}
	

	private static void m1() {
		//지역 변수 생성 + 사용
		//1. 값형 지역 변수
		int a = 10;
		System.out.println(a);
		
		//모든 값형은 변수 생성 직후는 null상태이지만 +
		//모든 값형은 null을 명시적으로 대입할 수 없다.
		//int b = null;
		int b = 0;
		System.out.println(b); //지역 변수를 초기화를 반드시 해야 한다.
		
		//2. 참조형 지역 변수
		Random rnd = new Random();
		System.out.println(rnd.nextInt(100));
		
		Random rnd2 = null; //주소값 변수(참조 변수)만 생성 -> null 상태
		
		if (rnd.nextBoolean()) {
			rnd2 = new Random();
		}
		
		System.out.println(rnd2.nextInt(100)); //지역 변수 초기화 X
		
		
		//참조 지역 변수들은 주로 코딩상의 문제로 null 초기화를 자주한다.
		Random rnd3 = null; //null 초기화
		System.out.println(rnd3.nextInt(100)); //java.lang.NullPointerException
	}
	
}









