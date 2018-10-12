package com.test.example;

public class Ex34_Class {
	

	public static void main(String[] args) {
		
		/*
		
		Ex34_Class.java
		
		클래스, Class
		
		1. 객체 지향 프로그래밍
			- Object Oriented Programming
		2. 절차 지향 프로그래밍
			- Procedural Oriented Programming
			
		
		3. 객체, Object
			- 데이터 + 행동
			- 변수 + 메소드
			
			- 독자성, Identity
			- 상태, State
			- 행동, Behavior
			- 캡슐화, Encapsulation
			- 정보 은닉화
			- 인터페이스..
		
		4. 클래스, Class
			- 객체를 생성하는 설계도
			
		5. 인스턴스, Instance
			- 객체 == 인스턴스
			- 클래스를 통해 만들어진 메모리상의 객체
		
		
		틀 -> 객체 -> 사용
		
		자바에서 클래스 만들기
		
		class 클래스명 {
			//클래스 멤버
			1. 멤버 변수 선언
			2. 멤버 메소드 선언
		}
		
		*/
		
		//요구사항] 지도 > 우리집의 위치 표시(저장)
		
		//case1.
		//우리집
		int x = 100;
		int y = 200;
				
		//마트
		int x2 = 150;
		int y2 = 220;
		
		//case2.
		//int[] p = { 300, 400 };
		int[] a1 = { 100, 200};
		
		int[] a2 = {150, 220};
		
		
		//case3.
		//2. 클래스를 가지고 객체(인스턴스) 생성하기. 붕어빵틀로 붕어빵 만들기
		
		Point p1 = new Point();
		
		//3. 객체 사용(내부의 멤버 변수 사용 or 멤버 메소드 사용)
		// . : 멤버 접근 연산자
		p1.x = 100;
		p1.y = 200;
		
		System.out.println(p1.x + " : " + p1.y);
		
		Point p2 = new Point();
		
		p2.x = 200;
		p2.y = 250;
		
		
		
		//모니터
		Size monitor = new Size();
		monitor.name = "LED 모니터";
		monitor.width = 1024;
		monitor.height = 768;
		
		Size keyboard = new Size();
		keyboard.width = 10.5;
		keyboard.height = 5.7;
		keyboard.name = "기계식 키보드";
		
		
		Student2 hong = new Student2();
		hong.name = "홍길동";
		hong.age = 20;
		hong.gender = "남자";
		hong.height = 180;
		hong.weight = 70;
		hong.address = "서울시 강남구 역삼동";
		
		
		//2.
		//MyMath m1 = new MyMath();
		MyMath.sum(10, 20);
		MyMath.divide(20, 5);
		
		
		//3.
		SmartPhone sp = new SmartPhone();
		
		sp.model = "iphone x";
		sp.owner = "홍길동";
		sp.tel = "010-1234-5678";
		
		sp.call();
		sp.info();
		
		SmartPhone sp2 = new SmartPhone();
		
		sp2.model = "블랙베리";
		sp2.owner = "아무개";
		sp2.tel = "010-5555-3456";
		
		sp2.call();
		sp2.info();
		
		
		
	}//main
	
} //Ex34


//1. 클래스 선언
class Test {
	
	//2. 멤버 구성
	int a;
	
	public void test() {
		
	}
	
}


//클래스 만드는 이유?
//1. 데이터의 집합 = 변수의 집합
//2. 행동의 집합 = 메소드의 집합
//3. 데이터 + 행동의 집합 = 변수 + 메소드의 집합

//1.
//좌표값을 저장하기 위한 클래스
class Point {
	
	public int x;
	public int y;
	
}

class Size {
	
	public double width;
	public double height;
	public String name;
	
}


class Student2 {
	
	public String name;
	public int age;
	public String gender;
	public String address;
	public int height;
	public int weight;
	
}


//2.
class MyMath {
	
	//멤버 메소드
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void divide(int a, int b) {
		System.out.println(a / b);
	}

}


//3.
class SmartPhone {
	
	//멤버 변수
	public String model;
	public String owner;
	public String tel;
	
	//멤버 메소드
	public void call() {
		//System.out.println("전화 걸기");
		System.out.println(owner + "의 전화로 전화 걸기");
	}
	
	public void info() {
		//System.out.println("정보 확인");
		System.out.println("정보 확인 : 현재 기기의 번호 : " + tel);
	}
	
}












