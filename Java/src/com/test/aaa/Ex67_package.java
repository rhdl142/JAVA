package com.test.aaa;

public class Ex67_package {

	public static void main(String[] args) {
		
		//접근 지정자
		//1. private
		//2. public
		//3. default
		//4. protected
		
		//1. 자기 자신이 접근하는 경우(같은 패키지 + 같은 클래스 내부)
		Red red = new Red();
		red.check();
		System.out.println();
		
		//2. 같은 패키지 + 다른 클래스에서 접근
		//red.a
		System.out.println(red.b); //public
		System.out.println(red.c ); //default
		System.out.println(red.d); //protected
		System.out.println();
		
		
		
	}
	
}












