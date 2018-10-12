package com.test.example;

import java.util.Calendar;

import com.test.util.MyUtil;

public class Ex50_Override {
	
	public static void main(String[] args) {
		
		//Ex50_Override.java
		
		Calendar c1 = Calendar.getInstance(); //new Calendar();
		System.out.println(c1);
		System.out.println(c1.toString());
		
		//com.test.example.MyTime@232204a1
		//com.test.example.MyTime : 자료형
		//232204a1 : 해시코드(HashCode) - 객체 임시 주민등록번호, 객체의 메모리의 주소번지
		MyTime t1 = new MyTime(2, 30);
		System.out.println(t1);
		System.out.println(t1.toString());
		
		
		MyUtil util = new MyUtil();
		//util.
		System.out.println(util);
		
		MyUtil util2 = new MyUtil();
		System.out.println(util2);
		
		final double pi = 6.14;
		
		//FinalTest2.PI
		
		
		
		
		
		
		
		//int NUM = 10;
		
		//NUM = 10;
	}

}

class MyTime {
	private int hour;
	private int min;
	
	public MyTime(int hour, int min) {
		this.hour = hour;
		this.min = min;
	}
	
	//어노테이션(Annotation)
	// - 프로그래밍 기능이 있는 주석
	@Override
	public String toString() {
		
		//해당 객체의 데이터를 문자열로 반환하는 역할
		return String.format("%d:%d", this.hour, this.min);
	}
	
}












