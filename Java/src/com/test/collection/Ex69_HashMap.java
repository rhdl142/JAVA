package com.test.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Ex69_HashMap {
	
	public static void main(String[] args) {
		
		//Ex69_HashMap.java
		
		//m1(); //*****
		//m2(); //*****
		m3(); //****
		
	}

	private static void m3() {
		
		//해시맵을 자주 사용하는 경우?
		
		//상황] 회원 가입 > 사용자로부터 데이터 입력 > 데이터베이스 추가
		
		//사용자 입력
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//입력 정보 저장
		String name = "";
		String age = "";
		String address = "";
		String tel = "";
		String email = "";
		
		try {
			
			System.out.print("이름 : ");
			name = reader.readLine();
			
			System.out.print("나이 : ");
			age = reader.readLine();
			
			System.out.print("주소 : ");
			address = reader.readLine();
			
			System.out.print("전화 : ");
			tel = reader.readLine();
			
			System.out.print("메일 : ");
			email = reader.readLine();
			
			
			//입력 완료 > 처리 담당자 호출
			Register register = new Register();
			
			
			//계층 -> (데이터) -> 계층
			//a. 있는 그대로 전달
			// - 개수 오류, 순서 오류, 타입 오류
			// - 인자가 적을 때 사용(1~2개)
			
			//b. 클래스
			// - 데이터 전달 객체
			// -  인자가 1 ~ 여러개
			// - 해당 데이터 집합이 여러곳에서 반복해서 사용될 때
			// - 초기 비용 발생(클래스 선언)
			
			//c. HashMap
			// - 데이터 전달 객체
			// -  인자가 1 ~ 여러개
			// - 초기 비용 없음(클래스 선언X -> 원하는 key로 put)
			// - 1회용 용도 사용
			// - 반복해서 사용하는 경우 key 관리를 신경써서 해야 한다.(***)
			
			
			
			
			//register.add(name, age, address, tel, email)
			//register.add(m) //****
			
			
			//add()
			//a.
			if (register.add(name, age, address, tel, email)) {
				System.out.println("완료");
			} else {
				System.out.println("실패");
			}
			
			
			//b.
			Member2 m = new Member2();
			
			m.setName(name);
			m.setAge(age);
			m.setAddress(address);
			m.setTel(tel);
			m.setEmail(email);
			
			if (register.add(m)) {
				System.out.println("완료");
			} else {
				System.out.println("실패");
			}
			
			
			//c. 5개의 데이터 -> 하나로 합치기
			//String[] data = new String[5];
			//data[0] = name;
			//data[1] = age;
			//ArrayList<String> data;
			
			HashMap<String,String> map = new HashMap<String,String>();
			
			map.put("name", name);
			map.put("age", age);
			map.put("address", address);
			map.put("tel", tel);
			map.put("email", email);
			
 			
			if (register.add(map)) {
				System.out.println("완료");
			} else {
				System.out.println("실패");
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void m2() {
		
		//8~10여종 컬렉션
		//1. ArrayList
		//	 - 요소 접근 -> 첨자(index) 사용
		// - 방번호 존재, 요소의 순서가 존재
		// - 첨자 : 정수 사용(0부터 시작. Zero-based Index)
		// - 스칼라 배열, Scalar Array
		// - 방들을 일괄 접근하기가 용이(***) -> for문의 루프변수를 통해서 제어
		// - 요소간의 구분이 쉽지 않다.(3번째 방?, 27번째 방?)
		
		//2. HashMap
		// - 요소 접근 -> 키(key) 사용
		// - 키 : 숫자, 문자, 문자열(*** 이것만 사용) 등..
		// - 방번호 X, 요소의 순서도 없음
		// - 연관 배열, 사전 구조, Dictionary
		// - Key, Value
		// - 일괄 접근이 불리(거의 사용 안함) -> for문과 잘 연동 안함 -> 요소 하나 하나를 직접 접근
		// - 요소간의 구분이 아주 쉽다.(사용자가 정의한 식별자를 사용 > 의미있게 짓는 것이 가능)
		// - 키가 반드시 유일해야 한다.(중복된 키를 가질 수 있다.). 값은 중복이 가능하다.
		
		
		//HashMap map = new HashMap();
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		//요소 쓰기(C)
		map.put("국어", 100);
		map.put("영어",90);
		map.put("수학", 80);
		
		//요소 읽기(R)
		System.out.println(map.get("영어"));
		
		
		//맵의 키를 숫자로 사용하지 말라는게 아니라, 그 키의 해당하는 숫자를 0부터 시작해서 1씩 증가하는 패턴으로 관리할 자신이 없으면 아예 시도하지 말것(루프 용도) -> 루프가 목적이면 아예 ArrayList를 선택
		HashMap<Integer,String> map2 = new HashMap<Integer,String>();
		
		map2.put(1, "하나");
		map2.put(2, "둘");
		map2.put(3, "셋");
		
		System.out.println(map2.get(2));
		
		
		HashMap<Boolean,String> map3 = new HashMap<Boolean,String>();
		
		map3.put(true, "참");
		map3.put(false, "거짓");
		
		System.out.println(map3.get(true));
		
		
		
		HashMap<String,Boolean> map4 = new HashMap<String,Boolean>();
		
		map4.put("홍길동", true);
		map4.put("아무개", false);
		map4.put("하하하", false);
		map4.put("호호호", true);
		
		if (map4.get("하하하")) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		
		
		
		//성적
		HashMap<String,Double> score = new HashMap<String,Double>();
		
		score.put("국어", 100.0);
		score.put("영어", 85.5);
		score.put("수학", 73.2);
		score.put("사회", 60.0);
		score.put("국사", 90.5);
		
		//
		System.out.println(score.size());
		
		//접근
		System.out.println(score.get("영어"));
		System.out.println(score.get("국어"));
		
		//수정
		score.put("국어", 95.0);
		System.out.println(score.get("국어"));
		
		
		//삭제
		score.remove("국사");
		System.out.println(score.size());
		
		//스칼라배열은 없는 방번호를 접근하면 예외발생, 연관배열은 null을 반환
		System.out.println(score.get("국사")); 
		
		
		//검색
		//문자열, 배열, ArrayList -> indexOf, contains
		//맵 -> contains
		
		System.out.println(score.containsKey("국어"));
		System.out.println(score.containsKey("국사"));
		
		System.out.println(score.containsValue(100.0));
		System.out.println(score.containsValue(95.0));
		
		//초기화
		score.clear();
		System.out.println(score.size());
		
		
	}

	private static void m1() {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(100);
		list1.add(200);
		list1.add(300);
		
		for (int i=0; i<list1.size(); i++) {
			System.out.printf("%d\t", list1.get(i));
		}
		System.out.println();
		
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("하나");
		list2.add("둘");
		list2.add("셋");
		list2.add("둘");
		
		for (String s : list2) {
			System.out.printf("%s\t", s);
		}
		System.out.println();
		
		list2.set(0, "one"); //수정
		
		//list2.remove(2); //삭제(*** 더 많이 사용)
		list2.remove("둘"); //삭제(처음 만나는 요소만 삭제)
		
		//언어, 기술, 자료구조 등.. 배울 때
		// -> CRUD(Create, Read, Update, Delete) + S(Search)
		
		if (list2.indexOf("셋") > -1) {
			System.out.println("있음");
		} else {
			System.out.println("없음");
		}
		
		
		
	}

}


class Register {
	
	//정보를 받아서 DB 입력
	public boolean add(String name, String age, String address, String tel, String email) {
		
		//DB 입력 완료..
		//확인 차 출력
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("address : " + address);
		System.out.println("tel : " + tel);
		System.out.println("email : " + email);
		
		return true;
	}
	
	
	
	public boolean add(HashMap<String, String> map) {
		
		//DB 입력 완료..
		//확인 차 출력
		System.out.println("name : " + map.get("name"));
		System.out.println("age : " + map.get("age"));
		System.out.println("address : " + map.get("address"));
		System.out.println("tel : " + map.get("tel"));
		System.out.println("email : " + map.get("email"));
		
		return true;
	}



	public boolean add(Member2 m) {
		
		//DB 입력 완료..
		//확인 차 출력
		System.out.println("name : " + m.getName());
		System.out.println("age : " + m.getAge());
		System.out.println("address : " + m.getAddress());
		System.out.println("tel : " + m.getTel());
		System.out.println("email : " + m.getEmail());
		
		return true;
	}
	
}


//name, age, address, tel, email
//다량의 데이터를 한곳에 저장할 수 있는 자료형 선언
//계층간의 데이터를 전달하기 위한 상자 역할 : DTO(Data Transfer Object), VO(Value Object)
class Member2 {
	
	private String name;
	private String age;
	private String address;
	private String tel;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}





























