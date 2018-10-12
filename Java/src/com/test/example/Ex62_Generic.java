package com.test.example;

public class Ex62_Generic {

	public static void main(String[] args) {
		
		//Ex62_Generic.java
		
		m1(); //비제네릭
		m2(); //제네릭		
		
	}

	private static void m1() {
		
		Integer[] list1 = { 10, 20, 30, 40, 50 };
		
//		NormalClass nc = new NormalClass();
//		
//		System.out.println(nc.first(list1));
//		System.out.println(nc.last(list1));
		
		//추가 요구
		String[] list2 = { "홍길동", "하하하", "아무개", "호호호" };
		
//		System.out.println(nc.first(list2));
//		System.out.println(nc.last(list2));
		
		
		
		//NormalClass nc2 = new NormalClass();
		
		//System.out.println(nc2.first(list1));
		//System.out.println(nc2.last(list1));
		
		
		//NormalClass nc = new NormalClass();
		
		//System.out.println(NormalClass.first(list1));
		//System.out.println(NormalClass.last(list1));
		
		
		
		GenericClass<Integer> gc1 = new GenericClass<Integer>();
		System.out.println(gc1.first(list1));
		
		GenericClass<String> gc2 = new GenericClass<String>();
		System.out.println(gc2.first(list2));
		
		
		
		
	}

	private static void m2() {
		
	}
	
}

//일반 클래스 버전
class NormalClass {
	
	//private NormalClass() { }
	
	//1. int[]
	//2. String[]
	//3. byte[], short[], Random[], Student[]
	
	//첫번째 요소 반환
	public int first(int[] list) {
		
		return list[0];
	}
	
	//마지막 요소 반환
	public int last(int[] list) {
		
		return list[list.length - 1];
	}
	
	//메소드 오버로링
	public String first(String[] list) {
		
		return list[0];
	}
	
	public String last(String[] list) {
		
		return list[list.length - 1];
	}
	
}

//제네릭 클래스 버전
class GenericClass<T> {
	
//	public Object first(Object[] list) {
//		
//		return list[0];
//	}
	
	public T first(T[] list) {
		
		return list[0];
	}
	
	public T last(T[] list) {
		
		return list[list.length - 1];
	}
	
}
















