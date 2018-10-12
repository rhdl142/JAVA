package com.test.etc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex99_Lambda {
	
	public static void main(String[] args) {
		
		//Ex99_Lambda.java
		
		//표준 API 함수적 인터페이스
		// - JDK 1.8
		// - java.util.function
		// - 함수적 인터페이스 집합 패키지. 오로지 람다식만을 지원하기 위해 만들어진 인터페이스 모음
		// - 람다식 타겟 타입 = 표준 API 함수적 인터페이스 + 사용자 정의 함수적 인터페이스
		
		//표준 API 함수적 인터페이스 종류
		// - 추상 메소드 딱 1개
		//1. Consumer	: 매개변수 O, 반환값 X -> 추상 메소드 제공
		//2. Supplier		: 매개변수 X, 반환값 O
		//3. Function		: 매개변수 O, 반환값 O, 주로 매개변수를 반환값 타입으로 변환 후 반환 역할
		//4. Operator		: 매개변수 O, 반환값 O, 주로 매개변수를 연산 후 결과값 반환 역할
		//5. Predicate		: 매개변수 O, 반환값 O, 주로 매개변수를 조사 후 논리값 반환 역할
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		
		
		m6();
		
	}

	private static void m6() {
		
		//p.703
		//인터페이스를 합치는 작업
		// - 여러 함수형 인터페이스를 하나의 인터페이스로 합치는 작업
		
		//1. andThen() : 그리고, 그런 다음
		// - A.andThen(B)
		// - A 실행 -> B 실행
		
		//2. compose() : 구성하다
		// - A.compose(B)
		// - B 실행 -> A 실행
		
		Consumer<Mouse> c1 = m -> System.out.println(m.getName());
		Consumer<Mouse> c2 = m -> System.out.println(m.getPrice());
		
		Mouse m1 = new Mouse("광마우스", 30000);
		
		//요구사항] m1의 이름과 가격을 출력하시오.
		c1.accept(m1);
		c2.accept(m1);
		
		//c3 호출 -> c1 호출 + c2 호출
		//c3에게 m1 전달 -> c3가 받은 m1을 c1에 넘기면서 c1을 호출 + 또 다시 c3가 받은 m1을 c2에 또 넘기면서 m2
		Consumer<Mouse> c3 = c1.andThen(c2);
		c3.accept(m1);
		
		Consumer<Mouse> c4 = c2.andThen(c1);
		c4.accept(m1);
		System.out.println();
		
		Student student = new Student("아무개", 100, 95, 90);
		
		Consumer<Student> s1 = s -> System.out.println("국어 : " + s.getKor());
		Consumer<Student> s2 = s -> System.out.println("영어 : " + s.getEng());
		Consumer<Student> s3 = s -> System.out.println("수학 : " + s.getMath());
		Consumer<Student> s4 = s -> System.out.println("이름 : " + s.getName());
		
		//이름 + 국어
		Consumer<Student> nameKor = s4.andThen(s1);
		nameKor.accept(student);
		System.out.println();
		
		//이름 + 수학
		Consumer<Student> nameMath = s4.andThen(s3);
		nameMath.accept(student);
		System.out.println();
		
		//이름 + 국어 + 영어 + 수학
		Consumer<Student> all = s4.andThen(s1).andThen(s2).andThen(s3);
		all.accept(student);
		System.out.println();
		
		
		
		//Function
		Function<Student, Integer> f1 = s -> (s.getKor() + s.getEng() + s.getMath()); //총점 반환
		Function<Integer, String> f2 = n -> (n >= 240) ? "합격" : "불합격"; //점수 -> 합격 유무 반환
		
		int total = f1.apply(student);
		String result = f2.apply(total);
		System.out.println(result);
		
		Function<Student, String> f3 = f1.andThen(f2);
		System.out.println(f3.apply(student));
		
		Function<Student, String> f4 = f2.compose(f1);
		System.out.println(f4.apply(student));
		
		
		//c1.andThen(c2) 	//O
		//f1.andThen(f2) 	//O
		//c1.andThen(f1) 	//O
		//f1.andThen(c1)	//O
		
		//f1.compose(f2)	//O
		//c1.compose(c2)	//X - c2(Consumer) : 반환값이 없기 때문에;;;
		//c1.compose(s1) 	//O - s1(Supplier) : 반환값이 있기 때문에
		//c1.compose(f1)	//O
		//f1.compose(c1)	//X
		//f1.compose(s1)	//O
		//s1.compose(f1)	//X
		
		
		
		
		//Predicate에만 있는 기능
		//- 자바의 논리 연산자와 같은 역할
		//1. and()
		//2. or()
		//3. negate()
		//4. isEquals()
		System.out.println();
		
		Predicate<Integer> p1 = n -> n % 2 == 0; //2의 배수
		Predicate<Integer> p2 = n -> n % 5 == 0; //5의 배수
		
		int num = 10;
		
		if (p1.test(num)) {
			System.out.println("2의 배수");
		}
		
		if (p2.test(num)) {
			System.out.println("5의 배수");
		}
		
		//2와 5의 공배수
		if (p1.test(num) && p2.test(num)) {
			System.out.println("2와 5의 공배수");
		}
		
		
		Predicate<Integer> p3 = p1.and(p2); // && 연산
		
		if (p3.test(num)) {
			System.out.println("2와 5의 공배수");
		}
		
		
	}
	
	

	private static void m5() {
		
		//Predicate
		// - 매개변수와 반환값이 있는 메소드를 제공한다.
		// - testXXX()
		// - 매개값을 사용해 조사(조건) 후 논리값을 반환한다.
		// - Function 서브셋
		
		Predicate<Integer> p1 =  n -> n > 0;
		System.out.println(p1.test(10));
		
		Predicate<String> p2 = s -> s.length() > 10;
		if (p2.test("홍길동입니다.")) {
			System.out.println("긴 문장");
		} else {
			System.out.println("짧은 문장");
		}
		
		Predicate<Student> p3 = s -> (s.getKor() + s.getEng() + s.getMath()) >= 240;
		if (p3.test(new Student("홍길동", 100, 90, 80))) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		
		BiPredicate<String, String> p4 = (s1, s2) -> s1.length() > s2.length();
		System.out.println(p4.test("홍길동", "홍민"));
		
		
		
	}

	private static void m4() {
		
		//Operator
		// - 매개변수와 반환값이 있는 메소드를 제공한다.
		// - applyXXX()
		// - Function의 하위 호환 인터페이스(서브셋)
		// - 주로 매개값을 연산(***)을 통해 결과값을 만들어내고 그 값을 반환
		// - Function과 큰 차이는 Operator는 매개값과 반환값의 타입 동일하다.(연산자들의 특징)
		
		BinaryOperator<Integer> b1 = (n1, n2) -> n1 + n2;
		System.out.println(b1.apply(10, 20));
		
		BinaryOperator<String> b2 = (firstName, lastName) -> lastName + firstName;
		System.out.println(b2.apply("길동", "홍"));
		
	}

	private static void m3() {
		
		//함수형 인터페이스
		// - 람다식을 저장하는 용도(내부적으로는 람다식으로 만들어진 메소드를 소유한 익명 객체를 생성 + 저장)
		
		//1. 값 -> Consumer -> (소비)
		//		- void accept(값)
		
		//2. () -> Supplier -> 값 반환
		//		- 값 get()
		
		//3. 값 -> Function -> 값 반환
		//		- 값 apply(값)
		
		//Function
		// - 매개변수와 반환값이 있는 메소를 제공한다.
		// - applyXXX() 메소드를 제공하는 함수형 인터페이스
		// - 매개값을 반환값으로 매핑(변환)하는 역할
		
		Function<String, Integer> f1 = (txt) -> txt.length();
		System.out.println(f1.apply("홍길동입니다."));
		
		
		Function<Integer,String> f2 = num -> num > 0 ? "양수" : "음수";
		System.out.println(f2.apply(10));
		
		
		Function<Mouse,Integer> f3 = m -> (int)(m.getPrice() * 1.1);
		System.out.println(f3.apply(new Mouse("마우스", 20000)));
		
		
		Function<Student,Integer> f4 = s -> s.getKor() + s.getEng() + s.getMath();
		System.out.println(f4.apply(new Student("홍길동", 100, 90, 80)));
		
		
	}

	private static void m2() {
		
		//p.692
		//Supplier
		// - getXXX() 메소드를 제공하는 함수형 인터페이스
		// - 데이터를 공급하는 역할
		
		Supplier<Integer> s1 = () -> 100;
		System.out.println(s1.get());
		
		Supplier<String> s2 = () -> "문자열";
		System.out.println(s2.get());
		
		
		
		Supplier<User> s3 = () -> new User("아무개", 20);
		User u = s3.get();
		System.out.println(u);
		
		
		// public List<User> get() { return 배열; }
		Supplier<List<User>> s4 = () -> {
			
			List<User> list = new ArrayList<User>();
			
			list.add(new User("아무개", 20));
			list.add(new User("홍길동", 22));
			list.add(new User("테스트", 23));
			
			return list;
		};
		
		System.out.println();
		for (User user : s4.get()) {
			System.out.println(user);
		}
		System.out.println();
		
		
		Supplier<Map<String,User>> s5 = () -> {
			Map<String,User> map = new HashMap<String,User>();
			map.put("반장", new User("홍길동", 20));
			map.put("부반장", new User("아무개", 21));
			map.put("체육부장", new User("호호호", 22));
			return map;
		};
		
		Map<String,User> map = s5.get();
		
		System.out.println();
		System.out.println(map.get("반장"));
		System.out.println(map.get("부반장"));
		System.out.println(map.get("체육부장"));
		System.out.println();
		
		
		
		Supplier<List<Map<String,User>>> s6 = () -> {
			
			List<Map<String,User>> list = new ArrayList<Map<String,User>>();
			
			Map<String,User> map1 = new HashMap<String,User>();
			
			map1.put("아빠", new User("홍길동", 30));
			map1.put("엄마", new User("호호호", 30));
			
			list.add(map1);
			
			
			Map<String,User> map2 = new HashMap<String,User>();
			
			map2.put("아빠", new User("아무개", 35));
			map2.put("엄마", new User("헤헤헤", 32));
			map2.put("아이", new User("아아아", 8));
			
			list.add(map2);
			
			return list;
		};
		
		
		List<Map<String,User>> list = s6.get();
		
		for (Map<String,User> m : list) { //1집안
			
			//각 세대별 루프(m)
			Set<String> keys = m.keySet();
			
			Iterator<String> iter = keys.iterator();
			
			while (iter.hasNext()) { //1사람
				String key = iter.next();
				System.out.println(key + " : " + m.get(key).getName());
			}
			
			System.out.println();
		}
		
		List<Map<String,List<Map<String,User>>>> mlist;
		
		
		
	}

	private static void m1() {
		
		//p.690
		//Consumer
		// - accept() 메소드를 제공하는 함수형 인터페이스
		// - 매개변수를 받아서 소비하는 일을 구현하는 역할
		// - 다양한 오버로딩 지원
		
		MyConsumer c1 = (txt) -> { System.out.println("결과 : " + txt); };
		c1.accept("홍길동");
		
		
		Consumer<String> c2 = txt -> System.out.println("결과 : " + txt);
		c2.accept("아무개");
		
		
		//Consumer 인터페이스 -> 추상메소드 -> 인자값 1개 -> 소비 메소드 구현부 ? 전달된 매개변수를 어떤 식으로 사용하는지는 제한 없음.(구현하는 사람 마음대로~)
		Consumer<Integer> c3 = count -> {
			for (int i=0; i<count; i++) {
				System.out.println(i);
			}
		};
		c3.accept(10);
		
		
		
		//이해?
		//public void accept(MyNumber num) {}
		Consumer<MyNumber> c4 = num -> System.out.println(num.getNum());
		
		c4.accept(new MyNumber() {
			
			@Override
			public int getNum() {
			
				return 100;
			}
			
		});
		
		c4.accept(() -> 200);
		
		
		
		
		
		BiConsumer<String, Integer> bc = (name, age)	 -> {
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("결과 : " + ((age >= 19) ? "어른" : "아이"));
		};
		
		bc.accept("홍길동", 25);
		
		
		
		
		IntConsumer ic = num -> System.out.println(Math.pow(num, 2));
		Consumer<Integer> ic2 = num -> System.out.println(Math.pow(num, 2));
		
		ic.accept(10);
		ic2.accept(5);
		
		
		
		DoubleConsumer dc = radius -> System.out.println(radius * 2 * 3.14);
		dc.accept(20);
		
		
		
		ObjIntConsumer<User> oic = (user, num) -> {
			user.setAge(user.getAge() + num);
			System.out.printf("%d년 뒤 %s의 나이는 %d세입니다.\n"
											, num, user.getName(), user.getAge());
		};
		
		oic.accept(new User("홍길동", 20), 5);
		
		
		
		
		
	}//main

}

@FunctionalInterface
interface MyConsumer {
	void accept(String txt);
}


interface MyNumber {
	int getNum();
}

class Mouse implements Comparable {
	
	private String name;
	private int price;
	
	public Mouse() {}
	public Mouse(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return this.name + " : " + this.price;
	}
	@Override
	public int compareTo(Object m) {
		
		if (m instanceof Mouse) {
		
			Mouse m2 = (Mouse)m;
			
			if (this.name.equals(m2.name) && this.price == m2.price) {
				return 1;
			} else {
				return -1;
			}
			
		} else {
			return -1;
		}

	}
	
}


class Student {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {}
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	@Override
	public String toString() {
		
		return this.name + (this.kor + this.eng + this.math);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	
}



















