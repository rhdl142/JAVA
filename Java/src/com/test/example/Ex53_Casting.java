package com.test.example;

public class Ex53_Casting {

	public static void main(String[] args) {
		
		//Ex53_Casting.java
		// - 상속, 참조형 형변환, 배열, 제어문, 추상클래스(추상메소드) 등...
		
		//상황]
		//1. 대리점 운영
		//2. 전자 제품 > 프린터 판매
		//3. LG300 x 5대, HP400 x 3대
		
		//운영 방침] *****
		//1. 한달 1번 > 모든 제품이 정상 동작중인지 점검 > 출력 기능
		
		//상황 변경]
		//1. 프린터 재고 증가 -> LG300(100대), HP400(50대)
		//2. 브랜드 증가 -> Dell500, BenQ600, Epson700... 10종 도입
		//3. 점검 요소 증가 -> 각 프린터의 고유 기능도 같이 점검
		
		//m1(); //X
		//m2(); //****
		m3(); //**** 
	}

	private static void m3() {
		
		//더욱 향상된 방법
		// - 배열, 참조형 형변환(업캐스팅 > 다운캐스팅)
		
		//업캐스팅을 하는 이유
		// - 비슷한 형태의 클래스 객체들을 한곳에 모아서 관리하자
		// - 단, 같은 부모로부터 파생된 클래스들에 한해서(형제뻘..)
		
		//다운캐스팅을 하는 이유
		
		
//		LG300 lg = new LG300();
//		Printer p; //추상 클래스
//		
//		//부모 = 자식
//		//업캐스팅(100% 안전)
//		p = lg;
//		
//		HP400 hp = new HP400();
//		Printer p2;
//		
//		p2 = hp;
//		
//		Printer[] ps = new Printer[2];
//		ps[0] = new LG300();
//		ps[1] = new HP400();
		
		
		Printer[] ps = new Printer[8];
		
		for (int i=0; i<ps.length; i++) {
			if (i < 5) {
				ps[i] = new LG300();
			} else {
				ps[i] = new HP400();
			}
		}
		
		//점검 시간(***)
		for (int i=0; i<ps.length; i++) {
			//프린터 출력 기능 점검
			ps[i].print();
			
			//서로 다른 클래스를 한곳 모아놓으면..
			//1. 공통 기능을 사용하기에는 편하다.
			//2. 각자 가지고 있는 고유 기능을 사용하기에는 불편하다.
			//ps[i].call();
			//ps[i].selfTest();
			//LG300 lg = (LG300)ps[i];
			//lg.call();
			
			//현재 객체가 특정 클래스 타입으로 형변환이 가능한지 알아보는 연산자
			//System.out.println(ps[i] instanceof LG300);
			
			
			//다운캐스팅을 하는 이유
			// - 업캐스팅을 통한 하나의 집합에 여러 타입 객체를 관리하는 건 편하다. > 각자의 고유 기능에 접근하기엔 불가능 > 그 때만 잠시 다운 캐스팅 > 고유 기능 사용
			if (ps[i] instanceof LG300) {
				LG300 lg = (LG300)ps[i];
				lg.call();
			} else if (ps[i] instanceof HP400) {
				HP400 hp = (HP400)ps[i];
				hp.selfTest();
			}
			
		}
		
	}

	private static void m2() {

		//조금 향상된 방법
		// - 배열 사용
		LG300[] lgs = new LG300[5];
		
		for (int i=0; i<lgs.length; i++) {
			lgs[i] = new LG300();
		}
		
		HP400[] hps = new HP400[3];
		
		for (int i=0; i<hps.length; i++) {
			hps[i] = new HP400();
		}
		
		
		//점검 시간
		for (int i=0; i<lgs.length; i++) {
			lgs[i].print();
			lgs[i].call();
		}
		
		for (int i=0; i<hps.length; i++) {
			hps[i].print();
			hps[i].selfTest();
		}
		
	}

	private static void m1() {
		
		//가장 원시적인 방법
		LG300 lg1 = new LG300();
		LG300 lg2 = new LG300();
		LG300 lg3 = new LG300();
		LG300 lg4 = new LG300();
		LG300 lg5 = new LG300();
		
		HP400 hp1 = new HP400();
		HP400 hp2 = new HP400();
		HP400 hp3 = new HP400();
		
		//한달 1회 점검
		lg1.print();
		lg2.print();
		lg3.print();
		lg4.print();
		lg5.print();
		
		hp1.print();
		hp2.print();
		hp3.print();
		
	}
	
}


//회사나 모델에 상관없이 모든 프린터기기가 가져할 공통 사항을 정의한 클래스
abstract class Printer {
	
	//구현 멤버
	// - 회사나 모델에 상관없이 모든 프린터기기가 가져할 공통 구현 기능(변수 or 메소드)
	public String model;
	public int price;
	public int ink;
	
	public void info() {
		System.out.printf("모델명 : %s, 잉크량 : %ml, 가격 : %,d원\n"
										, this.model, this.ink, this.price);
	}
	
	//추상 멤버
	// - 회사나 모델에 상관없이 모든 프린터기기가 가져할 공통적인 제품 사용법(행동)
	// - 구현은 제품마다 각각 알아서 구현
	public abstract void print();
	
}

//진짜 제품을 만들기 위한 일반 클래스 구현
class LG300 extends Printer {

	//모든 프린터기기가 가지고 있는 공통 기능 + 독자적인 구현
	@Override
	public void print() {
		//출력 + LG만의 독자적인 기술
		System.out.println("LG200으로 잉크젯을 사용해서 출력합니다.");
	}
	
	//LG300만이 가지는 특화된 기능
	public void call() {
		System.out.println("상담원과 연결중입니다.");
	}
	
}


class HP400 extends Printer {

	//모든 프린터기기가 가지고 있는 공통 기능 + 독자적인 구현
	@Override
	public void print() {
		//출력 + HP만의 독자적인 기술
		System.out.println("HP400으로 레이저 출력합니다.");
	}
	
	//HP400 특화 기능
	public void selfTest() {
		System.out.println("자가진단을 시작합니다.");
	}
	
}
























