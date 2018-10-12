package com.test.example;

public class Ex42_Constructor {
	
	public static void main(String[] args) {
		
		//Ex42_Constructor.java
		//생성자, Constructor
		// - 특수한 목적을 가지는 메소드
		// - 객체를 초기화하는 역할(*****************)
		// - 접근 지정자 : public(객체 생성 용도), private(객체 생성 금지)
		// - 반환값이 없다.(void (X)) -> 아예 표기를 안한다.
		// - 인자값은 가질 수 있다.
		// - 마음대로 호출 불가 > 호출할 수 있는 유일한 경우 > new + 생성자() : 객체 생성시 딱 1번
		
		//Keyboard();
		
		//객체 생성
		//자료형 변수명 = new연산자 생성자;
		//new : 연산자, 객체 생성 연산자
		//생성자 : 객체를 초기화
		Keyboard k1 = new Keyboard();
		
		//상태 설정
		k1.setModel("K810");
		k1.setPrice(100000);
		
		System.out.println(k1.getModel());
		System.out.println(k1.getPrice());
		
		
		//**
		Keyboard k2 = new Keyboard();
		
		System.out.println(k2.getModel());
		System.out.println(k2.getPrice());
		
		
		for (int i=0; i<10; i++) {
			
			//객체를 생성 후 내가 원하는 상태의 초기화를 하는 방법
			//1. setter 사용
			//		- setter 역할 때문에
			//		- 초기화 + 치환(수정)
			//2. 생성자 사용(********** 결론)
			//		- 초기화 목적(****)
			//3. 멤버 변수 초기화
			//		- 관습때문에
			
			//요구사항] 객체의 상태가 동일한 객체를 여러개 만들어 주세요. > 해당 클래스로 객체를 만들면 모두 상태가 똑같게 해주세요.
			//요구사항] 키보드의 모델이 모두 K800, 가격 50,000원
			Keyboard k = new Keyboard("A100");
			
			Keyboard kk = new Keyboard(30000);
			
			Keyboard kkk = new Keyboard("B200", 200000);
			
			//k.setModel("K800");
			//k.setPrice(50000);
			
			System.out.println(k.getModel());
			System.out.println(k.getPrice());
			
			
			
			
			//키보드 100개
			// - "A100", 30000
			// setter("A100")
			// setter(30000)
			
			//+ 100개
			// - "B100", 30000
			// setter("B100")
			// setter(30000)
			
			//+ 100개
			// - 모델 맘대로.. 20000
			// setter(20000)
			
			
			
			
			//키보드 100개
			// - new Key("A100", 30000);
		
			
			//+ 100개
			// - new Key("B100", 30000);
			
			
			//+ 100개
			// - 모델 맘대로.. 20000
			// setter(20000)
			// - new Key(null, 20000);
			// - new Key(20000);
			
		}
		
		
		
		
		//가방 생성
		Bag b1 = new Bag(); //기본적으로 생산되는 가방
		System.out.println(b1.info());
		
		Bag b2 = new Bag("검정색");
		System.out.println(b2.info());
		
		Bag b3 = new Bag("흰색", "비즈니스백");
		System.out.println(b3.info());
		
		
			
	} //main

} //Ex42



class Bag {
	
	//1. 멤버 변수
	private String color;
	private String type;
	
	//2. 생성자
	public Bag() {
		//this.color = "갈색";
		//this.type = "백팩";
		//Bag("갈색", "백팩");
		
		//생성자끼리에 한해서 아래 표현을 허용한다.
		this("갈색", "백팩");
	}
	
	public Bag(String color) {
		//this.color = color;
		//this.type = "백팩";
		this(color, "백팩");
	}
	
//	public Bag(String type) {
//		
//	}
	
	public Bag(String color, String type) {
		this.color = color;
		this.type = type;
	}
	
	public String info() {
		
		//return this.color + " : " + this.type;
		
		//printf와 동일 : 형식문자 지원
		return String.format("%s : %s", this.color, this.type);
	}
	
}



class Keyboard {
	
	//멤버 변수 초기화를 하는 값은 절대 상수만 사용한다.
	private String model;// = "K700";
	private int price;// = Price.getKeyboard();
	
	//기본 생성자
	// - 개발자가 생성자를 구현 안하면 자동으로 생성
	// - 개발자가 생성자를 1개 이상이라도 구현하면 아래의 기본 생성자는 자동으로 생성되지 않음.
	public Keyboard() {
		this.model = null;
		this.price = 0;
	}
	
	public Keyboard(String model) {
		this.model = model;
		this.price = 0;
	}
	
	public Keyboard(int price) {
		this.model = null;
		this.price = price;
	}
	
	public Keyboard(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
//	public Keyboard() {
//		this.model = "K800";
//		this.price = 50000;
//	}
	
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
	
}


//시세가를 알려주는 클래스
class Price {
	
	public static int getKeyboard() {
		//여러 상황을 종합해서 현재 키보드 가격을 반환
		return 50000;
	}
	
}






















