package com.test.collection;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex92_Collection {
	
	public static void main(String[] args) {
		
		//Ex92_Collection.java
		
		//Set 계열
		// - 순서가 없는 배열
		// - 첨자가 없음
		// - 중복값을 가질 수 없다.
		
		//HashSet
		// - Set 인터페이스 구현한 컬렉션
		// - 순서X, 중복값X
		
		//m1();
		//m2();
		//m3();
		m4();
		
	}
	
	private static void m4() {
		
		//데이터 집합 2개
		Set<String> setA = new HashSet<String>();
		Set<String> setB = new HashSet<String>();
		
		//결과 집합
		Set<String> setHab = new HashSet<String>(); //합집합
		Set<String> setGyo = new HashSet<String>(); //교집합
		Set<String> setCha = new HashSet<String>(); //차집합
		
		setA.add("사과");
		setA.add("오렌지");
		setA.add("파인애플");
		setA.add("바나나");
		setA.add("아보카도");

		setB.add("자두");
		setB.add("파인애플");
		setB.add("토마토");
		setB.add("귤");
		setB.add("바나나");
		
		System.out.println("A = " + setA);
		System.out.println("B = " + setB);
		
		
		//교집합
		Iterator<String> iter = setA.iterator();
		
		while (iter.hasNext()) {
			String item = iter.next();
			if (setB.contains(item)) {
				setGyo.add(item);
			}
		}
		
		System.out.println("A ∩ B = " + setGyo);
		
		
		//차집합
		iter = setA.iterator();
		
		while (iter.hasNext()) {
			String item = iter.next();
			
			if (!setB.contains(item)) {
				setCha.add(item);
			}
		}
		
		System.out.println("A - B = " + setCha);
		
		
		//합집합
		
		//중복값 허용하는 합집합 -> Set(X), List(O)
		List<String> listHab = new ArrayList<String>();		
		
		iter = setA.iterator();
		
		while (iter.hasNext()) {
			String item = iter.next();
			setHab.add(item);
			listHab.add(item);
		}
		
		iter = setB.iterator();
		
		while (iter.hasNext()) {
			String item = iter.next();
			setHab.add(item);
			listHab.add(item);
		}
		
		System.out.println("A ∪ B = " + setHab);
		System.out.println("A ∪ B = " + listHab);
		
		
	}

	private static void m3() {
		
		Set<String> set = new HashSet<String>();
		
		//단일값
		set.add("사과");
		set.add("바나나");
		set.add("복숭아");
		set.add("사과");
		
		System.out.println(set);
		
		//다중값, 복합값(객체)
		Set<Person> pset = new HashSet<Person>();
		
		pset.add(new Person("홍길동", 20));
		pset.add(new Person("홍길동", 20)); //hashCode() + equals() -> Override
		
		System.out.println(pset);
		
		//객체 & 단일값 -> 날짜시간
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		System.out.println(c1.getTime().getTime());
		System.out.println(c2.getTime().getTime());
		
		Date d1 = new Date(1533686981374L);
		Date d2 = new Date(1533686981374L);
		
		System.out.println(d1.getTime());
		System.out.println(d2.getTime());
		
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		
		System.out.printf("%tF %tT\n", d1, d1);
		
		Set<Date> dset = new HashSet<Date>();
		
		dset.add(d1);
		dset.add(d2);
		
		System.out.println(dset);
		
		System.out.println(d1.equals(d2));
		System.out.println(d1 == d2); //절대로 참조타입은 == 사용하면 안된다.(***)
		
		
		
		//과일을 이름순서대로 정렬해주세요. -> Set은 순서개념 없음. -> Set을 List로 변화
		System.out.println(set);
		
		//Collections.sort(set);
		//set.sort()
		
		//Set(HashSet) -> List(ArrayList)
		List<String> list = new ArrayList<String>(set);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}

	private static void m2() {
		
		//단일값 집합(숫자,문자,문자열..)
		Set<String> set1 = new HashSet<String>();
		
		set1.add("홍길동");
		set1.add("아무개");
		set1.add("홍길동"); //X
		
		System.out.println(set1);
		
		
		//복합값 집합(클래스(객체) 집합)
		//Person[] set2 = new Person[10];
		Set<Person> set2 = new HashSet<Person>();
		
		set2.add(new Person("홍길동", 20));
		set2.add(new Person("아무개", 25));
		set2.add(new Person("홍길동", 20));
		
//		Person p1 = new Person("홍길동", 20);
//		Person p2 = new Person("아무개", 25);
//		
//		set2.add(p1);
//		set2.add(p2);
//		set2.add(p1);
		
		System.out.println(set2);
		
		
		
		
		Person a = new Person("홍길동", 20);
		Person b = new Person("홍길동", 20);
		
		System.out.println(a.equals(b));
		
		System.out.println(a);//70dea4e
		System.out.println(b);//5c647e05
		
	}

	private static void m1() {
		
		//HashSet<String> set = new HashSet<String>();
		Set<String> set = new HashSet<String>();
		
		//요소 추가
		System.out.println(set.add("하나"));
		set.add("둘");
		set.add("셋");
		set.add("넷");
		set.add("다섯");
		
		System.out.println(set.add("하나")); //중복값
		
		//요소 개수
		System.out.println(set.size());
		
		//모든 요소 출력 - Set은 순서가 중요하지 않은 집합(***)
		System.out.println(set);
		
		
		
		
		//로또 번호 추출
		//1. ArrayList
		//2. HashSet
		
		Random rnd = new Random();
		
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		
		for (int i=0; i<6; i++) {
			
			int num = rnd.nextInt(45) + 1;
			
			boolean flag = false;
			
			for (int j=0; j<i; j++) {
				if (num == nums1.get(j)) {
					flag = true;
					break;
				}
			}//for j
			
			if (flag) i--;
			else nums1.add(num);
			
		}//for i
		
		System.out.println(nums1);
		
		
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		//6회 반복
		while (set2.size() < 6) {
			int num = rnd.nextInt(45) + 1;
			set2.add(num);
		}
		
		System.out.println(set2);
		
	}

}



class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		
		return String.format("%s(%s)", this.name, this.age);
	}
	
	
	//참조 변수의 비교는 주소값 비교 -> 해시코드의 비교 -> 사용자 재정의 -> 개발자가 의도하는 비교를 할 수 있도록
	//1. hashCode() 재정의
	//2. equals() 재정의
	
	@Override
	public int hashCode() {
		
		//p1 -> "홍길동" + 20 -> "홍길동20" -> 메모리 주소(100)
		//p2 -> "아무개" + 25 -> "아무개25" -> 메모리 주소(200)
		//p3 -> "홍길동" + 20 -> "홍길동20" -> 메모리 주소(100)
		
		return (this.name + this.age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//p1.equals(p2)
		//p1.equals(scan)
		if (obj instanceof Person) {
			
			Person p = (Person)obj;
			
			return this.hashCode() == p.hashCode();
			//return this.name.equals(p.name) && this.age == p.age;
		}
		
		return false;
	}
	
	
	
	
}//Person



















