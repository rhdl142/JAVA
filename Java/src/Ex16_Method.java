class Ex16_Method {

	//멤버 변수
	//int num;

	public static void main(String[] args)	{
		
		//지역 변수
		//int num2;

		//Ex16_Method.java
		//변수

		//1. 지역 변수
		// - Local Variable
		// - 우리가 여태 수업했던 모든 변수
		// - 메소드나 제어문의 내부에서 선언된 변수

		//2. 멤버 변수
		// - 전역 변수(자바 X)
		// - Member Variable


		//지역 변수의 생명주기, Life Cycle
		// - 변수가 언제 태어나고               ~        언제 죽는지
		// -                  (메모리 공간 할당)                   (메모리 공간 소멸)
		// - 변수 선언문이 실행될 때 태어나고, 변수 선언문이 포함된 블럭({})에서 제어가 벗어나가는 순간 소멸된다.
		

		int num = 20;
		m1();
		System.out.println(num);


		int age = 20;
		checkAge(age);

	}//main

	public static void m1() {
		
		int num = 10;
		System.out.println(num);

	}//m1

	public static void checkAge(int age) {

	}

}
