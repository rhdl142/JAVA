package com.test.example;

public class Ex60_Generic {

	public static void main(String[] args) {
		
		//Ex60_Generic.java
		
		//제네릭, Generic
		// 1. 제네릭 클래스(v)
		// 2. 제네릭 메소드
		
		//etc();
		
		WrapperInt n1 = new WrapperInt(100);
		System.out.println(n1.getData());
		System.out.println(n1.getData() * 2);
		System.out.println(n1.toString());
		System.out.println();
		
		WrapperObject n2 = new WrapperObject(200);
		System.out.println(n2.getData());
		System.out.println((int)n2.getData() * 2); //***
		System.out.println();
		
		Wrapper<Integer> n3 = new Wrapper<Integer>(300);
		System.out.println(n3.getData());
		System.out.println(n3.getData() * 2); //***
		System.out.println();
		
		
		
		
		
		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1.getData());
		System.out.println(b1.getData() ? "참" : "거짓");
		System.out.println(b1.toString());
		System.out.println();
		
		WrapperObject b2 = new WrapperObject(false);
		System.out.println(b2.getData());
		System.out.println((boolean)b2.getData() ? "진짜" : "가짜");
		System.out.println();
		
		Wrapper<Boolean> b3 = new Wrapper<Boolean>(true);
		System.out.println(b3.getData());
		System.out.println(b3.getData() ? "T" : "F");
		System.out.println();
		
		
		
		
		
		
		
		WrapperString s1 = new WrapperString("문자열");
		System.out.println(s1.getData());
		System.out.println(s1.getData().length());
		System.out.println(s1.toString());
		System.out.println();
		
		WrapperObject s2 = new WrapperObject("홍길동입니다.");
		System.out.println(s2.getData());
		System.out.println(   ((String)s2.getData()).length()   );

		Wrapper<String> s3 = new Wrapper<String>("아무개~");
		System.out.println(s3.getData());
		System.out.println(s3.getData().length());
		
		
		//제네릭을 배우는 이유?
		// 1. 제네릭 클래스를 만들기 위해서.. 모범적인 답
		// 2. 제네릭 메소드를 만들기 위해서.. 모범적인 답
		// 3. JDK 제공되는 제네릭 클래스를 사용하기 위해서..
		//		-> 컬렉션(Object) > 제네릭 컬렉션
		
	}

	private static void etc() {
		
		
		System.out.println(10 + 20);
		System.out.println(10 + "20");
		System.out.println("10" + 20);
		
		System.out.println(10 + 20 + 30);		//60
		System.out.println(10 + 20 + "30");	//3030
		System.out.println(10 + "20" + 30);	//102030
		System.out.println("10" + 20 + 30); 	//1050
		
		
		int kor = 100, eng = 90, math = 80;
		
		System.out.println("총점 : " + (kor + eng + math));

	}
	
}


//요구사항]
// - int -> Integer
//1. int 값 1개를 중심으로 그 값을 조작(제어)하는 클래스를 설계하시오.
//2. boolean 값 1개를 중심으로 그 값을 조작(제어)하는 클래스를 설계하시오.
//3. String 값 1개를 중심으로 그 값을 조작(제어)하는 클래스를 설계하시오.
//4. 모든 값형 -> 8개 클래스 설계
//5. 모든 참조형 -> 

class WrapperInt {
	
	private int data; //<- 가장 중심이 되는 요소
	
	public WrapperInt(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		
		//숫자 -> 문자열
		//return String.valueOf(this.data);
		return this.data + "";
	}
	
	
}


class WrapperBoolean {
	
	private boolean data; //<- 가장 중심이 되는 요소
	
	public WrapperBoolean(boolean data) {
		this.data = data;
	}

	public boolean getData() {
		return data;
	}

	public void setData(boolean data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		
		//숫자 -> 문자열
		//return String.valueOf(this.data);
		return this.data + "";
	}
	
	
}



class WrapperString {
	
	private String data; //<- 가장 중심이 되는 요소
	
	public WrapperString(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		
		//숫자 -> 문자열
		//return String.valueOf(this.data);
		return this.data + "";
	}
	
	
}




class WrapperObject {
	
	private Object data; //<- 가장 중심이 되는 요소
	
	public WrapperObject(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		
		//숫자 -> 문자열
		//return String.valueOf(this.data);
		return this.data + "";
	}
	
	
}


//제네릭 Wrapper
class Wrapper<T> {
	
	private T data;
	
	public Wrapper(T data) {
		this.setData(data);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		
		return this.data + "";
	}
	
}






















