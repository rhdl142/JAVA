package com.test.example;

public class Ex48_Abstract {
	
	public static void main(String[] args) {
		
		//Ex48_Abstract.java
		
		Circle c1 = new Circle();
		c1.draw();
		c1.erase();
		c1.info();
		
		Rectangle r1 = new Rectangle();
		r1.draw();
		r1.erase();
		r1.info();
		
		Triangle t1 = new Triangle();
		t1.draw();
		t1.erase();
		t1.info();
		
		
	}//main

}

//그림판 > 도형 그리기
//클래스?

//일반 클래스 선언
// - 객체화를 할 가능성이 확실하면..
//1. 원
//2. 사각형
//3. 삼각형

//부모 클래스 선언
// - 객체화?
//1. 도형 > 추상? vs 일반?
//		- 판단 기준(추상 메소드의 존재 유무)
//			a. 도형으로부터 파생된 클래스들이 공통적인 사용법을 가져야 하느냐?
//			b. 공통적인 사용법이 구현부까지도 공통인지? 아니면 시그너쳐만 공통인지?

abstract class Shape {
	
	//일반 멤버
	private String name;
	private int width;
	private int height;
	
	public void info() {
		System.out.printf("현재 도형 : %s, 너비 : %dcm, 높이 : %dcm\n"
										, this.name, this.width, this.height);
	}
	
	//추상 멤버
	public abstract void draw();
	public abstract void erase();
	
}

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("원을 그립니다.");
	}
	
	@Override
	public void erase() {
		System.out.println("원을 지웁니다.");
	}
	
}


class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("사각형을 그립니다.");
	}

	@Override
	public void erase() {
		System.out.println("사각형을 지웁니다.");
	}
	
}

class Triangle extends Shape {

	@Override
	public void draw() {
		System.out.println("삼각형을 그립니다.");
	}

	@Override
	public void erase() {
		System.out.println("삼각형을 지웁니다.");
	}
	
}



















