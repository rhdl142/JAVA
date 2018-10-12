package com.test.collection;

public class Ex84_Anonymous {

	public static void main(String[] args) {
		
		//Ex84_Anonymous.java
		
		//익명 객체, Anonymous Object
		// - 익명 클래스, Anonymous Class
		// - 클래스 정의하지 않고 객체를 만드는 방법 > 1회용 클래스 사용 > 재사용이 불가능한 클래스(객체를 1번만 만드는 용도로 사용하는 클래스)
		// - 이벤트 객체, 스레드 객체, 람다식, 스트림(다른 종류) 등에서 사용
		
		//익명 객체 만드는 방법 + 사용하는 예
		// - 부모 타입을 사용해서 자식 익명 객체를 만든다.
		//1. 부모 클래스를 상속한 익명 객체를 만드는 방법(더 어려움)
		//2. 인터페이스를 구현해서 익명 객체를 만드는 방법(더 쉬움)
		
		
		//1.
		CCC c = new CCC();
		c.check();
		
		
		//2.
		//인터페이스 변수 = new 자식클래스();
		DDD d1 = new EEE(); //프로젝트 통틀어 new EEE()가 이곳이 유일하다!!!!
		d1.check();
		
		//EEE e = new EEE();
		
		//new 부모클래스 { //자식 익명 객체 구현부 };
		//new 인터페이스 { //자식 익명 객체 구현부 ];
		DDD d2 = new DDD() {
			@Override
			public void check() {
				System.out.println("인터페이스를 구현한 익명 자식 X 클래스의 객체입니다.");
			}
		};
		d2.check();
		
		
		
		FFF f = new GGG(); //만드는 횟수가 자주 반복되지 않을 때..
		
		HHH h = new HHH();
		h.test(f);
		
		h.test(new FFF() {
			@Override
			public String getData() {
				return "익명 객체";
			}
		});
		
		
		//list.sort(new Comparator<Integer>() {});
		
		h.test(new FFF() {
			@Override
			public String getData() {
				return "다른 업무";
			}
		});
		
		
		
		
		
	}
	
}

//1. 부모 클래스를 상속한 익명 객체를 만드는 방법
class AAA { //부모 클래스
	
	public int a = 10;
	public void check() {
		System.out.println("a : " + this.a);
	}
	
}

//class BBB extends AAA { //자식 클래스
//	public int b = 20;
//	@Override
//	public void check() {
//		System.out.println("b : " + this.b);
//	}
//}


class CCC { //제 3자 클래스
	
	public AAA a1; //부모 클래스 인스턴스
	public AAA a2; //자식 클래스 인스턴스(업캐스팅)
	public AAA a3; //자식 클래스 인스턴스(업캐스팅)
	
	public CCC() {
		//생성자 초기화
		this.a1 = new AAA();
		
		//BBB 클래스의 객체가 전체 프로젝트를 통틀어 유일하게 딱 이곳 1번만 인스턴스화. 다른 소스에서는 절대로 new BBB(); 라는 코드를 발견할 수 없는 경우.
		//this.a2 = new BBB(); 
		//this.a4 = new BBB();
		//this.a5 = new BBB();
		
		//BBB 클래스로 만들었던 객체를 BBB 클래스없이 익명 객체로 만드는 방법
		// -> 배열의 초기화 리스트같은 역할  int[] nums = new int[] { 10, 20, 30 };
		this.a3 = new AAA() {
			//익명의 객체의 본문(Body)
			public int b = 40;
			@Override
			public void check() {
				System.out.println("b : " + this.b);
			}
		};
//		this.a4 = new AAA() {
//			//익명의 객체의 본문(Body)
//			public int b = 40;
//			@Override
//			public void check() {
//				System.out.println("b : " + this.b);
//			}
//		};
		
		
	}
	
	public void check() {
		this.a1.check();
		//this.a2.check();
		this.a3.check();
	}
	
}

//2. 인터페이스를 구현해서 익명 객체를 만드는 방법
interface DDD {
	void check();
}

class EEE implements DDD {
	@Override
	public void check() {
		System.out.println("인터페이스를 구현한 실명 자식 EEE 클래스의 객체입니다.");
	}
}



interface FFF {
	String getData();
}

class GGG implements FFF {
	@Override
	public String getData() {
		return "실명 클래스";
	}
}


class HHH {
	public void test(FFF f) {
		System.out.println("결과 : " + f.getData());
	}
}



















