package com.test.collection;

import java.util.ArrayList;

public class Ex68_ArrayList {

	public static void main(String[] args) {
		
		//Ex68_ArrayList.java
		
		//컬렉션, Collection
		// - 배열의 업그레이드 버전
		// - 길이 가변(늘이거나 줄이는게 가능)
		// - 배열을 사용 목적에 따라 사용법이나 구조를 특화시켜서 제공함.(= 자료 구조)
		
		//ArrayList 클래스
		// - 사용 빈도 높음
		// - 순수 배열과 구조가 가장 유사함
		// - 첨자(index)를 사용해서 요소(Element)를 관리
		
		//m1();
		//m2();
		m3(); //****
		
	}

	private static void m3() {
		
		ArrayList<String> list = new ArrayList<String>();
		
		//1. 요소 추가하기
		// - void add(T value)
		// - 배열의 맨 끝에 추가하기(append)
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");
		list.add("테스트");
		list.add("호호호");
		
		
		//2. 요소의 개수
		// - int size()
		System.out.println(list.size());
		
		
		//3. 요소 접근
		// - T get(int index)
		System.out.println(list.get(0)); // list[0] : 인덱서(indexer)
		System.out.println(list.get(1));
		//System.out.println(list.get(5));
		System.out.println(list.get(list.size() - 1));
		
		
		//4. 요소 수정
		//list[0] = "아무개";
		list.add("후후후"); //무조건 추가하기
		list.set(0, "헤헤헤"); //0번째방의 값을 "헤헤헤"로 수정하겠습니다.
		
		System.out.println(list.get(0));
		
		
		//5. 요소 삭제
		//list[0] = ""; //삭제 X
		// - 삭제된 요소부터 나머지 방까지는 1칸씩 좌로 쉬프트(index가 -1)
		System.out.println(list.size());
		
		list.remove(0); //0번방을 삭제(방 빼기)
		
		System.out.println(list.size());
		
		//현재 0번째 방은?
		System.out.println(list.get(0));
		
		
		//6. 요소 탐색
		// - 루프 탐색
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		for (String name : list) {
			System.out.println(name);
		}
		System.out.println();
		
		
		//7. 요소 추가
		// - 삽입, insert
		System.out.println("목표 : " + list.get(2));
		list.add(1, "추가");
		System.out.println("목표 : " + list.get(2));
		System.out.println("목표 : " + list.get(3));
		
		for (String name : list) {
			System.out.println(name);
		}
		System.out.println();
		
		//**** 주의!!
		// - 요소 삭제와 요소 추가(insert)는 다른 요소의 index를 변경시킨다.
		
		//8. 초기화
		// - 모든 방 삭제
		list.clear();
		System.out.println(list.size());
		
		//System.out.println(list.get(0));
		
		
		//9. 배열이 비었는지?
		System.out.println(list.size() == 0);
		System.out.println(list.isEmpty());
		
		
		//list.indexOf("홍길동");
		//list.lastIndexOf("홍길동");
		//list.contains("홍길동");
	
		
		
		
	}

	private static void m2() {
		
		//raw type : 옛날꺼.. 향우에 공지없이 사라질 수 있다..(다음 자바 버전에서..)
		ArrayList list1 = new ArrayList();
		list1.add(100);
		System.out.println((int)list1.get(0) * 2);
		
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(100);
		System.out.println(list2.get(0) * 2);
		
		
		
	}

	private static void m1() {
		
		//배열 생성
		// - 타입 명시(int)
		// - 길이 명시(3)
		int[] nums1 = new int[3];
		
		//초기화 or 요소 접근 -> index 사용
		nums1[0] = 100;
		nums1[1] = 200;
		nums1[2] = 300;
		
		//배열의 길이 or 탐색
		for (int i=0; i<nums1.length; i++) {
			System.out.println(nums1[i]);
		}
		
		
		//ArrayList 생성
		// - 타입 없음 : Object[]
		// - 길이 없음 : 길이 가변
		ArrayList nums2 = new ArrayList();
		
		//초기화
		// void add(Object o) : Append, (배열의 맨 끝에) 추가하기
		nums2.add(1000);
		nums2.add(2000);
		nums2.add(3000);
		
		for (int i=0; i<nums2.size(); i++) {
			// Object get(int index) : index방의 요소를 가져오기
			System.out.println(nums2.get(i));
		}
		
		
		
	}
	
}














