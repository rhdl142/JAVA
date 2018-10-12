package com.test.example;

public class Ex47_Abstract {

	public static void main(String[] args) {
		
		//Ex47_Abstract.java
		
		//추상 클래스, Abstract Class
		//추상 메소드, Abstract Method
		
		//추상 클래스
		// - 클래스 일종 > 상속 관계의 구성원 역할(부모 or 자식 클래스 역할) > 반드시 상속 관계를 맺어야 사용 가능
		// - 객체의 원형(베이스)을 만드는 역할
		// - 객체의 행동(사용법)을 표준화하는 역할
		// - 클래스를 설계하는 개발자(X), 클래스를 사용하는 개발자(O)의 편의를 위한 기술
		
		LG100 lg = new LG100();
		lg.on();
		lg.off();
		lg.model = "";
		lg.price = 0;
		lg.color = "";
		lg.info();
		
		Dell200 dell = new Dell200();
		dell.powerOn();
		dell.powerOff();
		dell.model = "";
		dell.price = 0;
		dell.size = 0;
		dell.info();
		
		
		//추상 클래스가 물려준 일반 멤버
		lg.info();
		dell.info();
		
		//추상 클래스가 물려준 추상 멤버
		lg.test();
		dell.test();
		
		
		LG100 lg2 = new LG100();
		
//		Monitor m = new Monitor();
//		m.model = "";
//		m.price = 0;
//		m.info();
//		m.test();
		
		//추상 클래스는 객체를 못 만들지만 참조 변수는 만들 수 있다.
		Monitor m;
	}
	
}


//추상 클래스
// 1. 일반 구현 멤버
//		- 자식 클래스에게 상속해주기 위해서 구현
//		- 모든 자식 클래스들이 가져야 하는 공통 기능
// 2. 추상 멤버
abstract class Monitor {
	
	//1. 일반 구현 멤버(변수, 메소드)
	public String model;
	public int price;
	
	public void info( ) {
		System.out.println(this.model + ", " + this.price);
	}
	
	//2. 추상 멤버
	// -> 추상 메소드(구현부를 가지지 않는 메소드)
	public abstract void test();
	
}



//모니터 클래스
//LG100 모니터
class LG100 extends Monitor {
	
	//멤버 구현
	//public String model;
	//public int price;
	public String color;
	
	//전원 켜기
	public void on() {
		System.out.println("전원 켜기");
	}
	
	//전원 끄기
	public void off() {
		System.out.println("전원 끄기");
	}
	
	//추상 메소드를 구현했다.
	public void test() {
		System.out.println("test");
	}
	
}



//Dell200
class Dell200 extends Monitor {
	
	//멤버 구현
	//public String model;
	//public int price;
	public int size;
	
	//전원 켜기
	public void powerOn() {
		System.out.println("모니터 켜기");
	}
	
	//전원 끄기
	public void powerOff() {
		System.out.println("모니터 끄기");
	}
	
	
	public void test() {
		System.out.println("테스트");
		System.out.println("하하하");
	}
	
}




















