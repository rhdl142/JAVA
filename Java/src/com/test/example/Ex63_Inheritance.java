package com.test.example;

public class Ex63_Inheritance {

	public static void main(String[] args) {
		
		//Ex63_Inheritance.java
		
		//1. 상속에서 메소드 오버라이딩을 하면 외부에선 자식의 메소드만 호출이 가능하다.
		// -> 외부에서 부모의 메소드를 호출하고 싶으면 어떻게?
		// -> 외부에서는 부모의 메소드를 직접 호출 불가능 -> 간접 호출 가능(자식 클래스를 통해서..)
		
		//2. 메소드 오버라이딩? 변수 오버라이딩?
		
		MyChild c = new MyChild();
		
		//c.a = 10;
		//c.aaa();
		
		//c.aaa();
		//c.a = 10;
		
		c.a = 10;
		c.aaa(); //자식의 aaa()
		c.ccc(); //부모의 aaa()
		
	}
	
}

class MyParent {
	
	public int a = 100;
	private int b = 200; //v
	
	public void aaa() {
		System.out.println("aaa");
	}
	
	private void bbb() { //v
		System.out.println("bbb");
	}
	
}

class MyChild extends MyParent {
	//변수 오버라이드(X) + 구현 하지 않는 코드
	//public int a;
	//메소드 오버라이드
	public void aaa() {
		System.out.println("AAA");
	}
	
	public int c = 30;
	private int d = 40;
	
	public void check() {
		
		System.out.println(this.c);
		System.out.println(this.d);
		System.out.println(this.a);
		//System.out.println(this.b);
		
	}
	
	public void ccc() {
		//외부에서 ccc() 호출하면 부모의 aaa() 호출하기 위한 도구(위임)
		//aaa();
		//this.aaa(); //this : 나 자신(현재 객체)
		super.aaa(); //super : 부모 객체, super 키워드는 주로 자식 클래스에서 부모의 멤버를 접근할 때 사용(메소드 오버라이드에 의해서 감춰진 메소드를 접근할 때)
	}
	
	@Override
	public String toString() {
		
		//return super.toString();
		return "테스트";
	}
	
}



















