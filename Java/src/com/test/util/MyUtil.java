package com.test.util;

import java.util.Random;

//MyRandom의 개량 버전
public class MyUtil extends Random {
	
	private Random rnd;
	private String[] color;
	
	public MyUtil() {
		this.rnd = new Random();
		this.color = new String[] { "red", "yellow", "blue", "orange", "green" };
	}

	//2.
	public int nextSmallInt() {
		
		//Random rnd = new Random();
		
		return rnd.nextInt(10) + 1;
	}

	//3.
	public String nextColor() {
		
		//Random rnd = new Random();
		
		//String[] color = { "red", "yellow", "blue", "orange", "green" };
		return color[rnd.nextInt(color.length)];
	}
	
}









