package com.test.example;

public class Ex55_Interface {

	public static void main(String[] args) {
		
		//Ex55_Interface.java
		
		//인터페이스, interface
		// - 자바의 구성요소
		// - 클래스의 일종(자료형 > 변수 생성 가능)
		// - 추상 클래스와 유사
		// - 추상 메소드의 집합
		// - 상속관계에서 부모 역할
		// - 구현 멤버는 가질 수 없다.
		
		//일반 클래스 = 변수 + 메소드
		//추상 클래스 = 변수 + 메소드 + 추상 메소드
		//인터페이스 = 추상 메소드
	
	}

	
}

/*

class 일반클래스  {
	//멤버
	- 변수
	- 메소드
}

class 추상클래스 {
	//구현 멤버
	- 변수
	- 메소드
	//추상 멤버
	- 추상메소드
}

interface 인터페이스 {
	//추상 멤버
	- 추상메소드
	//인터페이스는 구현부(구현멤버)를 가질 수 없다.
}

*/
//스피커 인터페이스 선언
interface Speaker {
	
	//구현된 멤버 불가능
	//public int a;
	//public void aaa() {
	//}
	
	//추상 메소드
	public abstract void aaa();
	abstract void bbb();
	void ccc();
	
}

//상속
// 일반클래스 > 일반클래스 : extends
// 일반클래스 > 추상클래스 : extends
// 일반클래스 > 인터페이스 : implements

class Boss1000 implements Speaker {

	@Override
	public void aaa() {
		// 오늘까지할일 해당 버그 잡기
		
		
	}

	@Override
	public void bbb() {
		
	}

	@Override
	public void ccc() {
		
	}
}



















