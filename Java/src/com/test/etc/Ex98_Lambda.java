package com.test.etc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Ex98_Lambda {
	
	public static void main(String[] args) {
		
		//Ex98_Lambda.java
		
		//람다식, Lambda Expressions
		// - 병렬 처리, 이벤트 처리, 스트림 처리 등.. 사용
		// - JDK 1.8 지원
		// - 함수형 프로그래밍 방식(<-> 객체 지향 프로그램)
		// - 형태는 매개변수를 가지는 코드 블럭(= 메소드)
		// - 인터페이스 + 익명 객체 + 람다식 을 같이 사용한다.
		// - 생김새는 메소드를 선언하는 것과 유사 > 실제로는 이름없는 클래스와 이름없는 메소드를 만드는 코드
		// - **** 람다식을 사용하는 이유는 1회용 익명 메소드가 필요하기 때문 > 하지만 자바는 독립적인 메소드만을 생성하지 못하기 때문에 익명 객체를 이용해서 만든다.
		
		
		
		//람다식 기본 형태
		// - (자료형 매개변수) -> { 실행코드; }
		// 	a. 매개변수 : 메소드 매개변수
		//		b. -> : Arrow, 코드블럭을 실행(호출)
		//		c. {} : 메소드 구현부
		
		
		//1. (int num) -> { System.out.println(num); }
		//2. (int num) -> System.out.println(num);
		//3. (num) -> System.out.println(num);
		//4. num -> System.out.println(num);
		
		//5. () -> System.out.println();
		//6. (x,y) -> System.out.println();
		
		//7. () -> { return value; }
		//8. () -> value;
		
		//9. (x,y) -> x + y;
		
		
		
		//람다식 실제 사용
		// - 인터페이스 변수 = 람다식;
		// - 람다식과 인터페이스는 밀접한 관계(람다식 시그너처 == 인터페이스 추상 메소드의 시그너처)
		
		//람다식에서 사용되는 인터페이스
		//1. 반드시 추상 메소드가 유일해야 한다.(*****)
		//2. 람다식을 담는 인터페이스를 주로 '람다식의 타켓 타입(Target Type)'이라고 한다.
		//3. 람다식을 담는 인터페이스를 주로 '함수적(형) 인터페이스, Functional Interface'이라고 한다.
		//4. 자바는 개발자에 사용하기 위한 함수적 인터페이스 여럿 제공합니다.
		
		
		
		
		//(int a) -> { System.out.println(); }
		
		
		//익명 객체
		MyInterface my1 = new MyInterface() {
			@Override
			public void test() {
				System.out.println("테스트입니다.");
			}			
		};
		
		my1.test();
		
		
		//익명 객체
		MyType my2 = new MyType() {
			@Override
			public void hello() {
				System.out.println("안녕하세요. 홍길동입니다.");
			}
		};
		my2.hello();
		
		
		//익명 메소드 -> 람다식을 사용해서 익명 메소드 생성 -> 
		MyType my3 = () -> { System.out.println("안녕하세요. 아무개입니다."); }; //단일 라인
		my3.hello();
		
		
		MyType my4 = () -> {
			System.out.println("반갑습니다.");
			System.out.println("홍길동입니다.");
			System.out.println("잘 부탁드립니다.");
		};
		my4.hello();
		
		
		//실행 블럭에 문장이 1줄이면 {} 생략 가능
		MyType my5 = () -> System.out.println("안녕하세요.");
		my5.hello();
		System.out.println();
		
		
		
		
		
		YourType you1 = (String msg) -> System.out.println(msg);
		you1.talk("뭐하세요?");
		
		YourType you2 = msg -> System.out.println(msg);
		you2.talk("문자열");
		
		YourType you3 = msg -> {
			System.out.println(msg);
			System.out.println(msg);
			System.out.println(msg);
		};
		you3.talk("저기요?");
		System.out.println();
		
		
		
		
		HisType he1 = () -> {  
			System.out.println("음식을 주문합니다.");
			return "짜장면";
		};
		System.out.println(he1.getFood());
		
		
		HisType he2 = () -> "짬뽕";
		System.out.println(he2.getFood());
		
		
		
		
		
	
		HerType her1 = (int weight, int height) -> {
			double bmi = (double)weight / ((double)height / 100 * (double)height / 100);
			return Math.round(bmi);
		};
		System.out.println(her1.getBMI(60, 170));
		
		
		HerType her2 = (weight, height) -> Math.round((double)weight / ((double)height / 100 * (double)height / 100));
		System.out.println(her2.getBMI(70, 180));
		
		
		HerType her3 = (weight, height) -> getBMI(weight, height);
		System.out.println(her3.getBMI(50, 160));
		
		
		
		
		//정렬
		List<User> list = new ArrayList<User>();
		
		list.add(new User("홍길동", 20));
		list.add(new User("아무개", 25));
		list.add(new User("테스트", 22));
		list.add(new User("하하하", 28));
		list.add(new User("호호호", 24));
		
		System.out.println(list);
		
		//1. Collections.sort(list);
		//2. list.sort();
		
		//Collections.sort(list);
		list.sort(new Comparator<User>() { //Custom Comparator
			@Override 
			public int compare(User o1, User o2) {
				
				return o1.getAge() - o2.getAge(); //정렬 기준
			}
		});
		
		System.out.println(list);
		
		
		list.sort((o1, o2) -> o2.getAge() - o1.getAge());
		System.out.println(list);
		
		
		
		
		
		
		TreeSet<User> set = new TreeSet<User>((o1, o2) -> o1.getName().compareTo(o2.getName()));
		
		set.add(new User("홍길동", 20));
		set.add(new User("아무개", 25));
		set.add(new User("테스트", 22));
		set.add(new User("하하하", 28));
		set.add(new User("호호호", 24));
		
		System.out.println(set);
		
		
		
		
		
		TestType t1 = new TestType() {

			@Override
			public void aaa() {
				System.out.println("a");
			}

			@Override
			public void bbb() {
				System.out.println("b");
			}
			
		};
		t1.aaa();
		t1.bbb();
		
		
//		TestType t2 = () -> System.out.println("c");
//		
//		t2.aaa();
//		t2.bbb();
		
		
	}//main
	
	
	public static double getBMI(int weight, int height) {
		double bmi = (double)weight / ((double)height / 100 * (double)height / 100);
		return Math.round(bmi);
	};

}


interface MyInterface {
	void test();
}


//매개변수 X, 반환값 X
interface MyType {
	void hello();
}


//매개변수 O, 반환값 X
interface YourType {
	void talk(String msg);
}


//매개변수 X, 반환값 O
interface HisType {
	String getFood();
}


//매개변수 O, 반환값 O
interface HerType {
	double getBMI(int weight, int height);
}



class User {
	
	private String name;
	private int age;
	
	public User() {};
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {

		return String.format("%s(%s)", this.name, this.age);
	}
	
}



//@FunctionalInterface
interface TestType {
	void aaa();
	void bbb();
}





















