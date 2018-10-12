package com.test.example;

public class Ex49_Override {
	
	public static void main(String[] args) {
		
		//Ex49_Override.java
		
		//메소드 오버라이드, Method Override
		//	 - 메소드 재정의
		// - 상속에서 발생
		// - 메소드 오버로딩 vs 메소드 오버라이드
		
		OverrideParent p = new OverrideParent();
		p.hello();
		
		OverrideChild c = new OverrideChild();
		c.hello();
		c.hi();
		
		
		
	}

}

class OverrideParent {
	//멤버들..
	
	public void hello() {
		System.out.println("안녕하세요~");
	}
}

class OverrideChild extends OverrideParent {
	
	public void hi() {
		System.out.println("Hi~");
	}
	
	//메소드 오버라이드
	// - 상속된 부모의 메소드를 감추고 자신이 다시 한번 정의하는 작업
	public void hello() {
		System.out.println("Hi~");
	}
	
}























