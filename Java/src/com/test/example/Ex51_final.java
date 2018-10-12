package com.test.example;

import java.util.Calendar;

public class Ex51_final {

	public static void main(String[] args) {
		
		//Ex51_final.java
		
		//final 키워드
		// - 변화를 줄 수 없다.(수정 못함)
		// 1. 변수에 적용
		//		- 멤버 변수
		//		- 지역 변수
		// 2. 메소드에 적용
		// 3. 클래스에 적용
		
		
		//final 변수
		// - 값을 한번 할당하면 다시는 변경할 수 없는 변수
		// - 상수에 가까운 변수
		int a = 10; //일반 변수
		final int b = 20; //final 변수. 권장
		final int c; //비권장
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a * 2);
		System.out.println(b * 2);
		
		a = 30;
		//b = 40;
		c = 50;
		
		
		final double PI = 3.14;
		
		//pi = 3.456;
		
		
		FinalTest t1 = new FinalTest();
		System.out.println(t1.num);
		//t1.num = 200;
		
		System.out.println(FinalTest2.num);
		//FinalTest2.num = 300;
		
		System.out.println(t1.PI); //X
		System.out.println(FinalTest2.PI); //O
		
		
		//캘린더 상수
		System.out.println(Calendar.YEAR);
	
	
	}
	
}

class FinalTest {
	public final int num = 100;
	public final double PI = 3.14; 
	
//	pubilc FinalTest(double pi) {
//		this.PI = pi;
//	}
}

class FinalTest2 {
	public final static int num = 200;
	
	//클래스의 public final static 변수를 상수(모두 대문자로 표기)라고 부른다.
	public final static double PI = 3.14; //권장
}

//final 클래스
// - 더 이상 상속할 수없는 마지막 세대 클래스
// - 특정 클래스를 설계하는 시점에는 미래에 생겨날 자식 클래스를 예측하기가 아주 힘들다.
// - 특정 클래스의 멤버들을 나중에 자식클래스가 물려받을 때 일어날 수 있는 경우의 수를 예측하기 힘들다.
final class FinalParent {
	
	//final 메소드
	// - 자식 클래스들이 재정의를 못하는 막는 역할
	// - 메소드 오버라이드 금지!!!
	// - 이 메소드는 재정의하면 프로그램이 불안전해지기 때문에.. (안정성)
	public final void aaa() {
		System.out.println("aaa");
	}
	
}

//class FinalChild extends FinalParent {
	
//	@Override
//	public void aaa() {
//		System.out.println("AAA");
//	}
	
//}


















