package com.test.example;

public class Ex52_Casting {

	public static void main(String[] args) {
		
		//오늘 수업
		//1. 상속
		//2. 추상 클래스(메소드)
		//3. 메소드 오버라이드
		//4. final 키워드
		//5. 형변환 - 가장 중요
		
		//Ex52_Casting.java
		
		//형변환, Type Cast
		// - 값형 형변환 <-> 참조형 형변환
		
		//1. 값형 형변환
		// - 숫자형끼리 가능
		// - 큰형 -> 작은형 : 명시적
		// - 작은형 -> 큰형 : 암시적
		// - 개발자 편의성 or 코드 유연성
		
		//2. 참조형 형변환
		// - 클래스끼리 가능
		// - 상속 관계에 있는 클래스끼리만 가능(******)
		// - 부모클래스 = 자식클래스; //업캐스팅(Up Casting) - 100% 구현
		// - 자식클래스 = 부모클래스; //다운캐스팅(Down Casting) - 상황에 따라
		
		CastParent p1;
		CastChild c1;
		
		c1 = new CastChild(); //자식(원본)
		
		//암시적 형변환
		//부모클래스 = 자식클래스
		//100% 안전
		p1 = c1;
		p1 = (CastParent)c1;
		
		//복사의 성공 유무 : 멤버 확인
		System.out.println(p1.a);
		System.out.println(p1.b);
		
		
		
		
		CastParent p2;
		CastChild c2;
		
		p2 = new CastParent();//부모(원본)
		
		//명시적 형변환
		//자식클래스 = 부모클래스
		//c2 = p2;
		//100% 불가능
		//c2 = (CastChild)p2;
		
		//확인
		//System.out.println(c2.a);
		//System.out.println(c2.b);
		//System.out.println(c2.c);
		//System.out.println(c2.d);
		
		
		
		CastParent p3;
		CastChild c3;
		
		c3 = new CastChild();
		
		p3 = c3; //안전
		
		CastChild c4;
		
		//자식클래스 = 부모클래스
		//명시적 형변환
		c4 = (CastChild)p3;
		
		System.out.println(c4.a);
		System.out.println(c4.b);
		System.out.println(c4.c);
		System.out.println(c4.d);
		
		
		
		
	}
	
}


class CastParent {
	public int a;
	public int b;
}

class CastChild extends CastParent {
	public int c;
	public int d;
}














