package com.test.aaa;

public class Red {
	
	//1. private
	// - 본인 이외에는 접근 불가능
	// - 완벽 차단. 상속과도 관련 없음.(자식한테도 접근 불가)
	
	//2. public
	// - 무조건 공개
	// - 다른 패키지에 있는 클래스도 접근 가능
	
	//3. default
	// - 같은 패키지내 : public 처럼 동작
	// - 다른 패키지내 : private 처럼 동작
	// - 같은 동네 사람만 접근 가능
	
	//4. protected
	// - 같은 패키지내 : public 처럼 동작
	// - 다른 패키지내 : 남이면(private), 자식(상속, public)
	// - 같은 동네 사람들이 접근 가능 + 다른 동네에 살아도 내자식이면 가능
	
	
	private String a = "private";
	public String b = "public";
	String c = "default";
	protected String d = "protected";
	
	public void check() {
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		System.out.println(this.d);
	}
	
}
