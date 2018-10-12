package com.test.example;

public class Ex43_Constructor {
	
	public static void main(String[] args) {
		
		//Ex43_Constructor.java
		Cola c1 = new Cola();
		c1.check();
		
		Cola c2 = new Cola();
		c2.check();
		
		
		
		
		Time t1 = new Time(2, 30, 45);
		System.out.println(t1.info());
		
		Time t2 = new Time(2, 90, 45);
		System.out.println(t2.info());
		
		Time t3 = new Time(2, 90, 145);
		System.out.println(t3.info());
		
		Time t4 = new Time(0, 0, 10000);
		System.out.println(t4.info());
		
		Time t5 = new Time(0, 1000, 10000);
		System.out.println(t5.info());
			
	}//main
	
}//Ex43

//콜라
class Cola {
	
	private int price;
	private String type;
	private static String corp; //static : Cola 객체는 제조가가 모두 한곳이구나..
	
	//(객체) 생성자(= 객체 메소드)
	// - 객체 멤버들만 초기화
	public Cola() {
		this.price = 1000;
		this.type = "캔";
		//Cola.corp = "코카콜라";
	}
	
	//(정적) 생성자(= 정적 메소드), 정적 초기화 블럭
	// - 정적 멤버들만 초기화
	static {
		//this.
		Cola.corp = "코카콜라";
	}
	
	public void check() {
		System.out.println(this.price);
		System.out.println(this.type);
		System.out.println(Cola.corp);
	}

}















