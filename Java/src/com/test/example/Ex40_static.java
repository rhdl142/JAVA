package com.test.example;

public class Ex40_static {

	public static void main(String[] args) {
		
		//Ex40_static.java
		
		//업무] 마우스 공장 > 마우스 생산 > 몇개를 생산?
		//m1();
		//m2();
		m3();
		
	}//main

	private static void m3() {
		
		Mouse m1 = new Mouse();
		Mouse.setTcount(Mouse.getTcount() + 1);

		Mouse m2 = new Mouse();
		Mouse.setTcount(Mouse.getTcount() + 1);

		Mouse m3 = new Mouse();
		Mouse.setTcount(Mouse.getTcount() + 1);

		//count가 정말 마우스 개수가 맞냐?
		System.out.println("마우스 생산 개수 : " + Mouse.getTcount());
	}

	private static void m2() {
		
		Mouse m1 = new Mouse();
		//m1.count = m1.count + 1;
		m1.setCount(m1.getCount() + 1);
		
		Mouse m2 = new Mouse();
		//m1.setCount(m1.getCount() + 1);
		m2.setCount(m2.getCount() + 1);
		
		Mouse m3 = new Mouse();
		//m1.setCount(m1.getCount() + 1);
		m3.setCount(m3.getCount() + 1);
		
		//count가 정말 마우스 개수가 맞냐?
		System.out.println("마우스 생산 개수 : " + m1.getCount());
		
	}

	private static void m1() {
		
		int count = 0; //마우스 개수 누적 변수
		
		Mouse m1 = new Mouse();
		count++;
		
		Mouse m2 = new Mouse();
		count++;
		
		Mouse m3 = new Mouse();
		count++;
		
		//count가 정말 마우스 개수가 맞냐?
		System.out.println("마우스 생산 개수 : " + count);
		
	}

	
}

//마우스 클래스
class Mouse {
	
	private String model;
	private int price;
	private int count; //마우스 개수(소속) : 실패
	private static int tcount; //마우스 개수
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public static int getTcount() {
		return tcount;
	}
	public static void setTcount(int tcount) {
		Mouse.tcount = tcount;
	}
	
	
	
}












