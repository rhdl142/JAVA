package com.test.example;

import java.util.Random;

import com.test.util.MyRandom;
import com.test.util.MyUtil;

public class Ex45_Inheritance {
	
	public static void main(String[] args) {
		
		//Ex45_Inheritance.java
		
		//상황] 담당 업무 > 난수 발생 잦음 > Random 객체 사용 빈도 높음
		//	 1. nextInt() : -21억 ~ 21억
		// 2. 1 ~ 10 사이의 난수
		// 3. 색상 난수 : red, yellow, blue, orange, green
		
		//m1();
		//m2();
		m3();
	}

	private static void m3() {
		
		MyUtil util = new MyUtil();
		
		//1.
		System.out.println(util.nextInt());
		System.out.println(util.nextInt());
		System.out.println(util.nextInt());

		//2.
		System.out.println(util.nextSmallInt());
		System.out.println(util.nextSmallInt());
		System.out.println(util.nextSmallInt());

		//3.
		System.out.println(util.nextColor());
		System.out.println(util.nextColor());
		System.out.println(util.nextColor());
	}

	private static void m2() {
		
		Random rnd = new Random();
		MyRandom mrnd = new MyRandom();
		
		//1.
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		System.out.println(mrnd.nextInt());
		System.out.println(mrnd.nextInt());
		System.out.println(mrnd.nextInt());
		
		//2.
		System.out.println(rnd.nextInt(10) + 1);
		System.out.println(mrnd.nextSmallInt());
		System.out.println(mrnd.nextSmallInt());
		System.out.println(mrnd.nextSmallInt());

		//3.
		System.out.println(mrnd.nextColor());
		System.out.println(mrnd.nextColor());
		System.out.println(mrnd.nextColor());
		
	}

	private static void m1() {
		
		//직접 구현
		Random rnd = new Random();
		
		//1.
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		
		//2.
		System.out.println(rnd.nextInt(10) + 1);
		System.out.println(rnd.nextInt(10) + 1);
		System.out.println(rnd.nextInt(10) + 1);
		
		//3.
		String[] color = { "red", "yellow", "blue", "orange", "green" };
		System.out.println(color[rnd.nextInt(color.length)]);
		System.out.println(color[rnd.nextInt(color.length)]);
		System.out.println(color[rnd.nextInt(color.length)]);
		
	}

}











