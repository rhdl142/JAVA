package com.test.example;

public class Ex57 {
	
	public static void main(String[] args) {
		
		//Ex57.java
		
		//상속
		// - 상속의 구성원이 될 수 있는 요소
		// - 일반클래스, 추상클래스, 인터페이스
		
		//1. 일반클래스 -> 일반클래스 //O
		//2. 일반클래스 -> 추상클래스 //O
		//3. 일반클래스 -> 인터페이스 //O
		//4. 추상클래스 -> 일반클래스 //O -> 쓰지말것;
		//5. 인터페이스 -> 일반클래스 //X -> 이유?
		//6. 추상클래스 -> 인터페이스 //O
		//7. 추상클래스 -> 추상클래스 //O
		//8. 인터페이스 -> 추상클래스 //X
		//9. 인터페이스 -> 인터페이스 //O
		//10. 일반클래스 -> 일반클래스 -> 추상클래스 -> 추상클래스 -> 인터페이스 -> 인터페이스 //패턴
		
		//CCCC c = new CCCC();
		//System.out.println(c.a);
	}
}

class AAAA {
	public int a;
}

//abstract class BBBB extends AAAA {
abstract class BBBB implements DDDD {
	public int b;
	public abstract void bbb();
	@Override
	public void ddd() {
		// TODO Auto-generated method stub
		
	}
}

//class CCCC extends BBBB {
class CCCC extends BBBB {
	//@Override
	public void bbb() {
	}
}

//interface DDDD extends AAAA {
interface DDDD {
	void ddd();
}








