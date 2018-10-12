package com.test.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class Ex91_Collection {

	public static void main(String[] args) {
		
		//Ex91_Collection.java
		
		//enum, Enumeration : 열거형
		
		//Enumeration, Iterator, ListIterator : 탐색기(반복자)
		// - 컬렉션내의 요소를 접근하기 위한 인터페이스(도구)
		// - Enumeration -> Iterator(***) -> ListIterator
		
		//m1();
		//m2();
		m3();
		
	}

	private static void m3() {
		
		//Iterator -> ListIterator
		// - Iterator : 단방향 -> 전진 커서
		// - ListIterator : 양방향 -> 전진 + 후진 커서
		
		//잘 사용하게 안하는 이유
		//1. 속도 느림
		//2. List 계열만 지원(Set 계열은 지원 안함 - 방번호 없어서)
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("빨강");		list.add("주황");		list.add("노랑");		list.add("초록");
		list.add("파랑");		list.add("남색");		list.add("보라");
		
		Iterator<String> iter = list.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		
		
		ListIterator<String> liter = list.listIterator();
		
		while (liter.hasNext()) {
			System.out.println(liter.next());
		}
		System.out.println();
		
		while (liter.hasPrevious()) {
			System.out.println(liter.previous());
		}
		
	}

	private static void m2() {
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("one", "하나");
		map.put("two", "둘");
		map.put("three", "셋");
		map.put("four", "넷");
		map.put("five", "다섯");
		
		//HashMap -> 루프
		// - Map 계열 : 순서가 없는 집합 -> Loop 불가능
		
		//Collection > List - Set
		Set<String> keys = map.keySet(); //키의 집합
	
		
		Iterator<String> iter = keys.iterator();
		
		while (iter.hasNext()) { //*******
			//System.out.println(iter.next());
			String key = iter.next();
			System.out.printf("map.get(\"%s\") = %s\n", key, map.get(key));
		}
		
		Collection<String> values = map.values(); //값의 집합
		
		Iterator<String> iter2 = values.iterator();
		
		while (iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		
		
		
		Box box = new Box();
		
		Iterator<String> iter3 = box.iterator();
		
		while (iter3.hasNext()) {
			System.out.println(iter3.next());
		}
		
		
		Box box2 = new Box();
		
		for (String b : box2) {
			System.out.println(b);
		}
		
		
		
//		Student s = new Student("홍기동", 100, 100, 100);
//		
//		for (String n : s) {
//			System.out.println(n);
//		}
		
		
		
	}//m2

	private static void m1() {
		
		//Iterator
		// - 컬렉션 프레임워크에서 저장된 요소를 읽어오는 방법을 표준화하기 위한 역할(인터페이스)
		// - Collection의 하위 컬렉션들이 소유 -> Iterator 타입의 객체를 반환하는 메소드를 이미 구현(iterator())
		// - List, Set 계열에 구현(Map은 없음)
		// - 주로 읽기 전용으로 사용한다.
		
		//Iterator 주요 멤버
		//1. boolean hasNext()
		//2. T next()
		//3. remove()
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("사과");
		list.add("바나나");
		list.add("포도");
		list.add("파인애플");
		list.add("복숭아");

		
		//탐색
		//1. 일반 for(i)
		//2. 향상된 for()
		//3. Iterator
		
		//기본 성질 : 
		Iterator<String> iter = list.iterator();

		//System.out.println(iter);
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		
//		System.out.println(list.size());
//		
		System.out.println(iter.next());
		System.out.println();
		
		//커서의 위치를 다시 처음으로 되돌려야 하는 상황
		// -> iterator를 다시 만들기
		iter = list.iterator();
		
		//꼭 기억
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
		
		
		
	}//m1
}




class Box implements Iterable<String> {
	
	private int index = 0;
	
	private String a = "상자A";
	private String b = "상자B";
	private String c = "상자C";
	
	//private String[] list = { "상자A", "상자B", "상자C" };
	
	
	@Override
	public Iterator<String> iterator() {
		
		//iterator 구현
		
		Iterator<String> iter = new Iterator<String>() {//익명 객체 구현

			@Override
			public boolean hasNext() {
				
				if (index < 0 || index > 2) {
					return false;
				} else {
					return true;
				}
				
			}

			@Override
			public String next() {
				
				String temp = "";
				
				if (index == 0) temp = a;
				else if (index == 1) temp = b;
				else if (index == 2) temp = c;
				
				index++;
				
				return temp;
			} 
			
		};
		
		return iter;
	}
	
	
}
































