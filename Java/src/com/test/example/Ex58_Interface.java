package com.test.example;

public class Ex58_Interface {

	public static void main(String[] args) {
		
		//Ex58_Interface.java
		
		//다중 상속
		// - 자바는 (일반,추상)클래스 상속은 다중 상속을 허용 안한다. 
		// - 인터페이스에 한해서는 다중 상속을 허용한다.(**********)
		
	}
	
}

//인터페이스
interface 사람 {
	void 숨쉰다();
}

interface 남자 extends 사람 {
	void 군대간다();
}

interface 여자 extends 사람 {
	void 화장한다();
}

interface 부장 extends 사람, 직원 {
	void 결재한다();
}

interface 직원 extends 사람 {
	void 일한다();
}

interface 엄마 extends 여자 {
	void 밥한다();
}

interface 아빠 extends 남자 {
	void 빨래한다();
}


class 홍길동 implements 남자, 직원, 아빠 {

	@Override
	public void 숨쉰다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 빨래한다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 일한다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 군대간다() {
		// TODO Auto-generated method stub
		
	}
	
}


















