package com.test.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex93_Collection {

	public static void main(String[] args) {
		
		//Ex93_Collection.java
		
		//List > ArrayList, LinkedList
		//Set > HashSet, TreeSet
		
		//TreeSet
		// - Set : 중복값X, 순서X(정렬 X)
		// - 자료 구조 특성 때문 -> 자동 정렬(데이터를 관리하는 형태 자체가 이미 정렬이 완성된 형태로 관리가 된다.)
		// - 트리 구조(이진 검색 트리 구조)
		// - 정렬 -> 검색, 범위 검색 용이(*******) : TreeSet을 선택하는 이유(목적, 용도)
		
		//m1();
		//m2();
		m3();
		
	}

	private static void m3() {
		
		//객체(참조형) TreeSet
		TreeSet<User> set  = new TreeSet<User>(new Comparator<User>() {

			@Override
			public int compare(User a, User b) {
				
				//return a.getPoint() - b.getPoint();
				return a.getName().compareTo(b.getName());
			}
			
		});
		
		set.add(new User("홍길동", 100));
		set.add(new User("아무개", 55));
		set.add(new User("하하하", 37));
		set.add(new User("호호호", 98));
		set.add(new User("테스트", 42));
		
		System.out.println(set);
		
		
		
		
		TreeSet<Unit> uset = new TreeSet<Unit>();
		
		uset.add(new Unit("A", 100));
		uset.add(new Unit("D", 130));
		uset.add(new Unit("B", 120));
		uset.add(new Unit("E", 50));
		uset.add(new Unit("C", 210));
		
		System.out.println(uset);
		
		
	}

	private static void m2() {
		
		Random rnd = new Random();
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		//for (int i=0; i<30; i++) {
		while (set.size() < 30) {
			set.add(rnd.nextInt(30) + 1);
		}
		
		System.out.println(set);
		
		System.out.println(set.subSet(5, 10));
		System.out.println(set.headSet(10));
		System.out.println(set.tailSet(10));
		
		
		
		TreeSet<String> items = new TreeSet<String>();
		
		items.add("필통");
		items.add("스마트폰");
		items.add("텀블러");
		items.add("티슈");
		items.add("우산");
		items.add("마우스");
		items.add("키보드");
		items.add("커피");
		items.add("가위");
		items.add("테이프");
		items.add("연습장");
		
		System.out.println(items.subSet("마", "차"));
		System.out.println(items.headSet("자"));
		System.out.println(items.tailSet("자"));
		
		//집합 선택?
		// 1. 중복값 허용X(*******) -> Set
		// 2. 자동 정렬 + 범위(요소) 검색(****** : 검색 속도가 아주 빠르다.) 
		
		
	}

	private static void m1() {
		
		Set<Integer> set = new TreeSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(50);
		set.add(40);
		set.add(30);
		
		System.out.println(set.size());
		
		System.out.println(set);
		
		Iterator<Integer> iter = set.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}


class User {
	
	private String name;
	private int point;
	
	public User(String name, int point) {
		this.name = name;
		this.point = point;
	}
	
	@Override
	public String toString() {

		return String.format("%s(%d)", this.name, this.point);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
}


class Unit implements Comparable<Unit> {
	
	private String name;
	private int point;
	
	public Unit(String name, int point) {
		this.name = name;
		this.point = point;
	}
	
	@Override
	public String toString() {

		return String.format("%s(%d)", this.name, this.point);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public int compareTo(Unit a) {
		
		return this.point - a.point;
		//return this.name.compareTo(a.name);
	}
	
}


















