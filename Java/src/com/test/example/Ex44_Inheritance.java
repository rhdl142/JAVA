package com.test.example;

public class Ex44_Inheritance {

	public static void main(String[] args) {
		
		//Ex44_Inheritance.java
		/*
		
		상속, Inheritance
		- 클래스와 클래스간에 발생
		- 부모 클래스가 가지고 있는 모든 멤버(변수, 메소드)를 자식 클래스에 물려줌
		- 왜?(****)
			1. 코드 재사용
		
		상속 관계에 있는 클래스
		- 부모 클래스 <-> 자식 클래스
		- 슈퍼 클래스 <-> 서브 클래스
		- 기본 클래스 <-> 확장(파생) 클래스
		
		*/
		
		Parent p1 = new Parent();
		p1.a = 10;
		p1.aaa();

		
		Child c1 = new Child();
		c1.a = 20;
		c1.aaa();
		c1.b = 30;
		c1.bbb();
		
		
		DDD d = new DDD();
		d.a = 10;
		d.b = 20;
		d.c = 30;
		d.d = 40;
		
	}//main
	
}

//부모 클래스
class Parent {

	public int a;
	public void aaa() {
		System.out.println("aaa");
	}
	
}

//자식 클래스
class Child extends Parent {
	
	public int b;
	public void bbb() {
		System.out.println("bbb");
	}
	
}


class AAA {
	public int a;
}

class BBB extends AAA {
	public int b;
}

class CCC extends BBB {
	public int c;
}

class EEE extends BBB {
	public int e;
}

class DDD extends CCC {
	public int d;
}

class FFF extends EEE {
	public int fff;
}








































