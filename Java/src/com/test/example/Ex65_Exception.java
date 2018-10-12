package com.test.example;

import java.util.Random;

public class Ex65_Exception {
	
	public static void main(String[] args) {
		
		//Ex65_Exception.java
		
		//예외, Exception
		// - 컴파일 발견X , 런타임 발견O
		// - 실행 중 발생하는 에러
		// - 개발자가 예측 O, 예측 X -> 예측을 하더라도 발생할 수 있는 에러
		// - 주로 발생하는 경우 : 프로그램 외부와의 소통을 하는 업무(파일입출력, DB입출력, 네트워트 작업..)
		
		//예외 처리, Exception Handling
		//1. 전통적인 방식
		//		- 제어문 사용(조건문)
		//2. 특화된 구문
		//		- try catch (finally) 문
		
		//m1();
		//m2();
		//m3();
		//m4();
		
		//본사();
		
		m5();
		
	}
	
	private static void m5() {
		
		//데이터베이스 접속
		System.out.println("하나");
		
		try {
			
			int num = 0;
			System.out.println(100 / 0);
			//에러 발생 > 중단 > 다른 페이지로 이동하기
			
			System.out.println("둘");
			
			
		} catch (Exception e) {
			
			System.out.println("셋");
			
			
		} finally {
			
			System.out.println("넷");
			//데이터베이스와의 연결 종료
			
		}
		
		System.out.println("다섯");
		
		
	}

	private static void 본사() {
		
		try {
			부산지사();
			광주지사();
			제주지사();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}



	private static void 부산지사() throws Exception { //예외 미루기 - 지역에 발생하는 각각의 에러들을 한곳에 모아서 총괄하기 위한 기술
		
		int n = 0;
		System.out.println(100 / n);
		
	}

	private static void 광주지사() throws Exception {
		
		Random rnd = null;
		System.out.println(rnd.nextInt(100));
		
	}

	private static void 제주지사() throws Exception {
		
		int[] nums = { 10, 20, 30 };
		System.out.println(nums[5]);
		
	}

	private static void m4() {
		
		//업무
		//숫자 입력 > (3의 배수) > 출력
		int num = 4;
		
		if (num % 3 == 0) {
			System.out.println("업무 진행");
		} else {
			System.out.println("예외 처리");
		}
		
		
		try {
			
			if (num % 3 != 0) {
				//개발자가 강제로 예외 발생 > 예외 던지기
				//throw new Exception("3배의 배수가 아닙니다.");
				throw new Exception("A001"); //예외 코드
			}
			
			System.out.println("업무 진행");
			
		} catch (Exception e) {
			System.out.println("예외 처리");
			System.out.println(e.getMessage());
			
			if (e.getMessage().equals("A001")) {
				System.out.println("홍대리에게 메일 발송");
			} else if (e.getMessage().equals("B001")) {
				System.out.println("김과장에 메일 발송");
			}
		}
		
		
		
	}

	private static void m3() {
		
		try {
			
			//업무1.
			int num = 10;
			System.out.printf("100 / %d = %d\n"
											, num, 100 / num);
			
			//업무2.
			int[] nums = { 10, 20, 30 };
			System.out.println(nums[0]);
			
			//업무3.
			Random rnd = null;//new Random();
			System.out.println(rnd.nextInt(100));
			
		} catch (ArithmeticException e) {
			
			System.out.println("숫자를 0으로 나누려고 했습니다.");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("배열의 첨자를 벗어났습니다..");
			
		} catch (NullPointerException e) {
			
			System.out.println("객체가 없습니다.");
			
		} catch (Exception e) {
			//System.out.println(e.toString());
			System.out.println("관리자에게 연락하세요.");
		}
		
		
	}

	private static void m2() {
		
		//배열 > index 처리 > 예외 발생
		int[] nums = { 10, 20, 30 };
		
		//java.lang.ArrayIndexOutOfBoundsException
		try {
			nums[3] = 40;
			System.out.println(nums[3]);
		} catch (Exception e) {
			System.out.println("배열 첨자 오류");
		}
		
		
		Random rnd = null;
		
		//java.lang.NullPointerException
		try {
			System.out.println(rnd.nextInt(100));
		} catch (Exception e) {
			System.out.println("랜덤 객체 없음");
		}
		
		
		
		Printer[] list = new Printer[2];
		
		list[0] = new LG300();
		list[1] = new HP400();
		
		//java.lang.ClassCastException
		try {
			((LG300)list[1]).call();
		} catch (Exception e) {
			System.out.println("형변환 실패");
		}
		
	}

	private static void m1() {
		
		//사용자로부터 숫자 1개를 입력 > 업무 진행
		int num = 0;
		
		//java.lang.ArithmeticException
		
		//예외 처리
		if (num != 0) { //(예외 조건)
			//업무 코드, 비즈니스 코드
			System.out.printf("100 / %d = %d\n"
										, num, 100 / num);
		} else {
			//예외 처리 코드
			System.out.println("0을 입력하면 안됩니다.");
		}
		
		
		
		
		if (num == 0) { 
			//예외 처리 코드
			System.out.println("0을 입력하면 안됩니다.");			
		} else {
			//업무 코드, 비즈니스 코드
			System.out.printf("100 / %d = %d\n"
										, num, 100 / num);
		}
		
		
		
		
		//try catch문
		try {
			
			//업무 코드, 비즈니스 코드
			System.out.printf("100 / %d = %d\n"
										, num, 100 / num);
			int result = 100 / num;
			//new Exception() : 실인자
			
			System.out.println("테스트입니다." + result);
			
		} catch (Exception e) { //가인자
			
			//예외 처리 코드
			System.out.println("0을 입력하면 안됩니다.");		
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e.getStackTrace());
			
			
		}
		
		
		
		
	}

}












