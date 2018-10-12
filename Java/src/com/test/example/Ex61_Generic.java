package com.test.example;

public class Ex61_Generic {

	public static void main(String[] args) {
		
		//Ex61_Generic.java
		
		
		//Tea t1 = new Tea(); //비권장
		//Tea<String> t1 = new Tea(); //비권장
		Tea<String> t2 = new Tea<>();
		Tea<String> t3 = new Tea<String>(); //권장
		
		//자바에서의 제네릭은 반드시 참조형만 사용 가능하다.
		Tea<Integer> t4 = new Tea<Integer>();
		
		
		Desk<String> d1 = new Desk<String>();
		d1.a = "책상";
		
		Desk<Integer> d2 = new Desk<Integer>();
		d2.a = 100;
		
		Power<Boolean> p1 = new Power<Boolean>();
		p1.test(true);
		//p1.get
		
		
		Snack<String,Integer> s1 = new Snack<String,Integer>();
		s1.a = "문자열";
		s1.b = 20;
		
		
	}
	
}

//int a = 10; //데이터를 담는 용도
//T = int; //타입을 담는 용도

//제네릭 클래스
// - T : 타입 변수
class Tea<T> {
	
	//멤버 구현 : 일반 클래스와 동일하다.
	public int a;
	public String b;
	public T c;
	
	public void aaa(String a) {
		
	}
}



class Desk<T> {
	
	public T a;
	public T b;
	public T c;
	
}

class Power<T> {
	
	public void test(T t) {
		
	}
	
	public T get() {
		
		return null;
	}
	
}

class Snack<T,U> {
	public T a;
	public U b;
}

















