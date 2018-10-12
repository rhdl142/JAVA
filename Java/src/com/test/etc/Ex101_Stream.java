package com.test.etc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex101_Stream {
	
	public static void main(String[] args) {
		
		//Ex101_Stream.java
	
		//Member m = new Member();
		//m.city = City.서울;
		
		//m.city = 1; //서울
		//m.city = Member.서울; //1
		
		//m.city = Member.City.서울;
		
		//City city = City.서울; //모든 클래스에서 사용 가능한 공통 열거형
		//Member.City mcity = Member.City.서울; //주로 Member 클래스가 사용하는 열거형
		
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
		
		
		Sample s = new Sample();
		//s.name
		//s.getName(age)
		
		
	}//main

	private static void m5() {
		
		List<Member> list = Member.getMembers();
		
		//map()
		// - Mapping(연결, 변환)
		// - 스트림을 단일 요소로 매핑(변환) 후 또 다른 스트림으로 반환
		
		list.stream().map(m -> m.getName()).forEach(name -> System.out.println(name));
		System.out.println();
		
		//요구사항] 남자 회원들의 이름을 출력하시오.
		//               filter() vs map()
		
		//1. filter -> 원래 타입의 배열을  -> 타입은 유지한 채 축소(요소의 갯수 축소)
		Stream<Member> r1 = list.stream().filter(m -> m.getGender() == Member.Gender.남자);
		r1.forEach(m -> System.out.println(m.getName()));
		
		//2. map -> 원래 타입의 배열을 -> 다른 타입의 배열로 변환(축소 - 자료형 자체가 축소)
		Stream<String> r2 = list.stream().filter(m -> m.getGender() == Member.Gender.남자).map(m -> m.getName());
		r2.forEach(name -> System.out.println(name));
		System.out.println();
		
		
		
		list
			.stream()
			.filter(m -> m.getAge() > 25)
			//.filter(m -> m.getGender() == Member.Gender.남자)
			.map(m -> m.getGender() == Member.Gender.남자 ? "아빠" : "엄마")
			.distinct()
			.forEach(s -> System.out.println(s));
		System.out.println();
		
		
		
		
	}

	private static void m4() {
		
		//컬렉션 vs 스트림
		// - 컬렉션 : 영구 보존 집합 -> for
		// - 스트림 : 1회용 집합 -> forEach() + 람다식 사용(수많은 스트림 기능 제공)
		
		List<Member> list = Member.getMembers();
		
		//collect()
		// - 스트림에서 컬렉션으로 변환
		
		
		//컬렉션 -> (변환) -> 스트림
		Stream<Member> stream = list.stream();
		
		//스트림 -> (변환) -> 컬렉션
		List<Member> list2 = stream.collect(Collectors.toList());
		
		
		
		
		//회원 전체 목록(11명)
		list = Member.getMembers();
		
		
		//남자회원들만 있는 ArrayList
		List<Member> maleList = list.stream().filter(m -> m.getGender() == Member.Gender.남자).collect(Collectors.toList());
		
		
		//기존 집합 -> 부분 집합
		//list.subList(3, 7);
		//여자회원들만 있는 ArrayList
		List<Member> femaleList = new ArrayList<Member>();
		
		for (Member m : list) {
			if (m.getGender() == Member.Gender.여자) {
				femaleList.add(m);
			}
		}
		
		System.out.println(maleList);
		System.out.println(femaleList);
		
		
		//Stream -> ArrayList
		//Stream -> LinkedList
		List<Member> seoulList = list.stream()
														.filter(m -> m.getCity() == Member.City.서울)
														.collect(Collectors.toCollection(LinkedList::new));
		System.out.println(seoulList);
		
		//Stream -> HashSet
		Set<Member> jejuSet = list.stream()
														.filter(m -> m.getCity() == Member.City.제주)
														.collect(Collectors.toSet());
		
		//Stream -> TreeSet
		Set<Member> inchonSet = list.stream()
														.filter(m -> m.getCity() == Member.City.인천)
														.collect(Collectors.toCollection(TreeSet::new));
		
		//Stream -> Map
		//다음에..
		
		
	}//m4

	private static void m3() {
		
		List<Member> list = Member.getMembers();
		
		//allMatch() : 모든 요소가 조건을 만족하는지?
		//anyMatch() : 일부 요소가 하나라도 만족하는지?
		//nonMatch() : 모든 요소가 조건을 불만족하는지?
		
		boolean result = list.stream().allMatch(m -> m.getCity() == Member.City.서울);
		
		if (result) {
			System.out.println("모든 회원이 서울에 거주합니다.");
		} else {
			System.out.println("일부 회원이 서울 이외에 거주합니다.");
		}
		
		result = list.stream().allMatch(m -> m.getName().length() == 3);
		
		if (result) {
			System.out.println("모든 회원의 이름이 3자입니다.");
		} else {
			System.out.println("이름이 3자가 아닌 회원이 있습니다.");
		}
		
		
		
		result = list.stream().anyMatch(m -> m.getCity() == Member.City.제주);
		
		if (result) {
			System.out.println("제주에 거주하는 회원이 있습니다.");
		} else {
			System.out.println("제주에는 회원이 없습니다.");
		}
		
		
		
		
		result = list.stream().noneMatch(m -> m.getAge() > 40);
		
		if (result) {
			System.out.println("모든 회원이 40세 미만입니다.");
		} else {
			System.out.println("회원 중 40세 이상인 회원이 있습니다.");
		}
		
		
		//모든 남자는 서울에 거주합니까?
		result = list.stream().filter(m -> m.getGender() == Member.Gender.남자).allMatch(m -> m.getCity() == Member.City.서울);
		System.out.println(result);
		
		
	}//m3

	private static void m2() {
		
		List<Member> list = Member.getMembers();
		
		//기본 스트림
		list.stream().forEach(m -> System.out.println(m));
		System.out.println();
		
		//정렬
		//익명 객체로 구현
		list.stream().sorted(new Comparator<Member>() {
			@Override
			public int compare(Member m1, Member m2) {
				
				return m1.getAge() - m2.getAge();
			}
		}).forEach(m -> System.out.println(m));
		System.out.println();
		
		
		
		//람다식 구현
		//list.stream().sorted((Member m1, Member m2) -> {return m1.getAge() - m2.getAge();}).forEach(m -> System.out.println(m));
		list
			.stream()
			.sorted((m1, m2) -> m1.getGender().compareTo(m2.getGender()))
			.forEach(m -> System.out.println(m));
		System.out.println();
		
		//필터 
		list
			.stream()
			//.filter(m -> m.getAge() > 25)
			.filter(m -> m.city == Member.City.서울)
			.filter(m -> m.gender == Member.Gender.여자)
			.forEach(m -> System.out.println(m));
		System.out.println();
		
		
		//중복값
		// - 단일값(숫자,문자,논리,문자열) : 중복값 배제
		// - 복합값(객체) : 주소값 비교 -> 상태값이 같아도 객체를 따로 만들면 다른 객체 인식 -> 같은 객체로 인식 -> hashCode() & equals() 오버라이딩(같은 객체로 강제 인식)
		list.stream().distinct().forEach(m -> System.out.println(m));
		System.out.println();
		
	}

	private static void m1() {
		
		List<String> names = Member.getNames();
		
		//기본 스트림
		names.stream().forEach(name -> System.out.println(name));
		System.out.println();
		
		//정렬
		names.stream().sorted().forEach(name -> System.out.println(name));
		System.out.println();
		
		//필터
		names
				.stream()
				.filter(name -> name.startsWith("박") || name.startsWith("이"))
				.forEach(name -> System.out.println(name));
		System.out.println();
		
		//중복값
		names.stream().distinct().forEach(name -> System.out.println(name));
		System.out.println();
		
		
		
		
	}//m1

}


//특정 상태값을 열거형(선택값)으로 만들고 싶은 경우..
//1. 독립적인 enum 선언(***)
// - 사용 범위 넓음

//2. 상수 선언(public static final 변수)
// - 살짝 헷갈림

//3. 종속된 enum 선언(***)
// - 사용 범위 좁음
// - 가독성 높음
// - 유지보수성 높음

//enum City {
//	서울, 대전, 부산, 제주
//}

class Member {
	
	private String name;
	private int age;
	//public City city;
	
//	public int city;
//	public static final int 서울 = 1;
//	public static final int 강원 = 2;
//	public static final int 광주 = 3;
	
	
	public City city;
	public Gender gender;
	
	public enum City {
		서울, 부천, 인천, 제주
	}
	
	public enum Gender {
		남자, 여자
	}
	
	//Ctrl + Shift + C
	public Member(String name, int age, City city, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.gender = gender;
	}

	//Ctrl + Shift + I
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

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", city=" + city + ", gender=" + gender + "]";
	}
	
	
	
	
	//테스트용 Member 데이터 생성
	public static List<String> getNames() {
		
		List<Member> mlist = getMembers();
		List<String> list = new ArrayList<String>();
		
		for (Member m : mlist) {
			list.add(m.getName());
		}
		
		return list;		
		//return mlist.stream().map(m -> m.getName()).collect(Collectors.toList());
		
		
		//return mlist.stream().map(m -> m.getName()).collect(Collectors.toList()));
		
	}
	
	public static List<Member> getMembers() {
		
		List<Member> list = new ArrayList<Member>();
		
		list.add(new Member("홍길동", 22, City.서울, Gender.남자));
		list.add(new Member("호호호", 23, City.서울, Gender.여자));
		list.add(new Member("테스트", 24, City.서울, Gender.남자));
		list.add(new Member("유재석", 25, City.서울, Gender.남자));
		list.add(new Member("박명수", 26, City.부천, Gender.남자));
		list.add(new Member("박나래", 27, City.부천, Gender.여자));
		list.add(new Member("장도연", 28, City.부천, Gender.여자));
		list.add(new Member("강호동", 29, City.인천, Gender.남자));
		list.add(new Member("정형돈", 30, City.인천, Gender.남자));
		list.add(new Member("이효리", 31, City.제주, Gender.여자));
		list.add(new Member("홍길동", 26, City.제주, Gender.남자));//동명이인
	
		return list;
	}
	
	
}































