package com.test.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Ex86_Collection {
	
	public static void main(String[] args) {
		
		//Ex86_Collection.java
		
		//컬렉션
		//m1();
		
		//순수 배열
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m7_1();
		//순수 배열
		
		//컬렉션
		//m8();
		m9();
		
		
	}

	private static void m9() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for (int i=0; i<10; i++) {
			list.add(rnd.nextInt(30) + 1); //1 ~ 30사이의 난수
		}
		
		System.out.println(list);
		
		
		//1. 직접 정렬
//		for (int i=0; i<list.size()-1; i++) {
//			for (int j=0; j<list.size()-1-i; j++) {
//				
//				//정렬 기준 -> 비교 조건문 -> swap
//				if (list.get(j) < list.get(j+1)) {
//					
//					Integer temp = list.get(j);			//temp = list[j];
//					list.set(j, list.get(j+1));				//list[j] = list[j+1];
//					list.set(j+1, temp);						//list[j+1] = temp;
//					
//				}
//			}
//		}
//		System.out.println(list);
		
		
		
		
		//JDK에서 제공하는 정렬 기능
		//2. 
		//오름차순 정렬(O)
		//Collections.sort(list);
		
		//내림차순 정렬(X)
		//Collections.reverse(list);
		
		//System.out.println(list);
		
		
		//3. ****** 가장 많이 연습할 것
		// - Comparator
		// - Comparable
		// - 사용자 정의 정렬
		
		//Comparator<Integer> c
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer a, Integer b) {
				
//				if (a > b) {
//					return -1;
//				} else if (a < b) {
//					return 1;
//				} else {
//					return 0;
//				}
				
				return b - a;
				
			}
			
		});
		System.out.println(list);
		
		
	}

	private static void m7_1() {
		
		//요구사항] 학생이 10명이 있다. 성적순(총점)으로 정렬(100 ~ 0)
		Student[] list = new Student[10];
		
		//10명은 모든 데이터 난수 발생 대입
		String[] c = { "가", "나", "다", "라", "마", "바", "사", "아", "자", "차", "카", "타", "파", "하" };
		Random rnd = new Random();
		
		for (int i=0; i<10; i++) {
			//이름 난수 + 국영수 난수
			list[i] = new Student(c[rnd.nextInt(c.length)] + c[rnd.nextInt(c.length)] + c[rnd.nextInt(c.length)], rnd.nextInt(60) + 40, rnd.nextInt(60) + 40, rnd.nextInt(60) + 40);
		}
		
		
		
		
		//배열 출력
		System.out.println("[원본]");
		for (Student s : list) {
			System.out.printf("%s - %d점\n", s.getName(), s.getTotal());
		}
		System.out.println();
		
		
		

		//성적순 정렬
		for (int i=0; i<list.length-1; i++) {	
			
			for (int j=0; j<list.length - 1 - i; j++) {
				
				if (list[j].getTotal() < list[j+1].getTotal()) {
					
					Student temp = list[j];					
					list[j] = list[j+1];
					list[j+1] = temp;
					
				}
				
			}
			
		}
		
		
		
		
		//배열 출력
		System.out.println("[결과]");
		for (Student s : list) {
			System.out.printf("%s - %d점\n", s.getName(), s.getTotal());
		}
		
		
		
	}

	private static void m8() {
		
		ArrayList<String> list1 = new ArrayList<String>();
		Vector<String> list2 = new Vector<String>();
		
		//업캐스팅
		List<String> list3 = new ArrayList<String>();
		List<String> list4 = new Vector<String>();
		
		
		//asList() 메소드
		// - 요소를 가지고 List를 생성
		// - 기존 순수 배열을 가지고 List를 생성
		List<Integer> list5 = Arrays.asList(10, 20, 30);
		System.out.println(list5);
		
		List<String> list6 = Arrays.asList("홍길동", "아무개", "테스트");
		System.out.println(list6);
		
		Integer[] nums = { 100, 200, 300 };
		List<Integer> list7 = Arrays.asList(nums);
		
		
	}

	private static void m7() {
		
		//배열을 직접 정렬
		// - 숫자 : 크기 비교
		// - 문자 : 코드값 비교
		// - 날짜 : 과거-미래 비교
		//1. 오름 차순 정렬
		//2. 내림 차순 정렬
		
		/*
		
		원본 			: { 5, 4, 3, 2, 1 }
		
		Step 1		: { 5, 4, 3, 2, 1 }
		Step 1		: { 4, 5, 3, 2, 1 }
		Step 1		: { 4, 3, 5, 2, 1 }
		Step 1		: { 4, 3, 2, 5, 1 }
		Step 1		: { 4, 3, 2, 1, 5 } //가장 큰 데이터가 마지막 방으로 이동
		
		
		Step 2		: { 4, 3, 2, 1, 5 }
		Step 2		: { 3, 4, 2, 1, 5 }
		Step 2		: { 3, 2, 4, 1, 5 }
		Step 2		: { 3, 2, 1, 4, 5 } //두번째 큰 데이터가 마지막에서 두번째 방으로 이동
		
		
		Step 3		: { 3, 2, 1, 4, 5 }
		Step 3		: { 2, 3, 1, 4, 5 }
		Step 3		: { 2, 1, 3, 4, 5 } //세번째 큰 데이터 완성
		
		
		Step 4		: { 2, 1, 3, 4, 5 }
		Step 4		: { 1, 2, 3, 4, 5 } //네번째 큰 데이터 완성
		
		
		Step 5		: { 1, 2, 3, 4, 5 }
		*/
		
		
		int[] nums = { 5, 3, 2, 4, 1 };
		
		for (int i=0; i<nums.length-1; i++) {
			
			System.out.println("Step : " + (i + 1));
			
			for (int j=0; j<nums.length - 1 - i; j++) {
				
				System.out.println("Sub : " + (j + 1));
				
				//우위 비교
				//if (nums[j] > nums[j+1]) { //오름차순
				if (nums[j] < nums[j+1]) { //내림차순
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp; //swap
				}
				
				System.out.println(Arrays.toString(nums));
				
			}
			
		}//i for
		
		System.out.println(Arrays.toString(nums));
		
	}

	private static void m6() {
		
		//순수 배열
		//정렬
		//1. 정렬 알고리즘 + 직접 구현
		// - 버블 정렬, 선택 정렬, 삽입 정렬 / 퀵 정렬, 힙 정렬, 머지(병합) 정렬, 기수 정렬
		//2. 집합 자료형(배열, 컬렉션) + 미리 구현(퀵 정렬)
		
		int[] nums1 = { 10, 50, 20, 70, 80, 90, 40, 30, 60 };
		
		System.out.println("원본 : " + Arrays.toString(nums1));
		
		//정렬 - 원본을 직접 정렬 -> 오름차순 정렬만 지원
		Arrays.sort(nums1);
		
		System.out.println("결과 : " + Arrays.toString(nums1));
		
		//정렬 대상
		//1. 숫자형(문자형) : 값의 비교 -> 우위 판별 -> 정렬 가능
		//2. 문자열 : 값의 비교 -> 문자당 코드값 비교 -> 우위 판별 -> 정렬 가능
		//3. 논리형 : 정렬 가능 -> 잘 안씀
		//4. 날짜시간형(Calendar, Date) : 과거 < 미래 -> 우위 판별 -> 정렬 가능
		//5. 모든 참조형 : 정렬 불가능 -> 가능 구현
		
		String[] names1 = { "홍길동", "아무개", "테스트", "하하하", "유재석", "강호동", "박명수", "정형돈", "이수근" };
		Arrays.sort(names1);
		System.out.println(Arrays.toString(names1));
		
		Boolean[] flags = { true, false, false, true, false, true };
		Arrays.sort(flags);
		System.out.println(Arrays.toString(flags));
		
		
		Calendar[] times = new Calendar[5];
		
		for (int i=0; i<times.length; i++) {
			times[i] = Calendar.getInstance(); //new Calendar();
		}
		
		times[0].add(Calendar.DATE, -5); //5일 전
		times[1].add(Calendar.DATE, 3); //1일 전
		times[2].add(Calendar.DATE, -3); //3일 후
		times[3].add(Calendar.DATE, 7); //5일 후
		times[4].add(Calendar.DATE, -2); //2일 전
		
		//System.out.println(Arrays.toString(times));
		for (Calendar c : times) {
			System.out.printf("%tF\n", c);
		}
		System.out.println();
		
		Arrays.sort(times);
		
		for (Calendar c : times) {
			System.out.printf("%tF\n", c);
		}
		System.out.println();
		
		
		
		
		
		Mic[] mic = new Mic[] { 
				new Mic("마이크A", 500, 30000, Calendar.getInstance()), 
				new Mic("마이크B", 600, 45000, Calendar.getInstance()), 
				new Mic("마이크C", 340, 25000, Calendar.getInstance()), 
				new Mic("마이크D", 640, 66000, Calendar.getInstance()), 
				new Mic("마이크E", 230, 42000, Calendar.getInstance())
		};
		
		mic[0].date.add(Calendar.MONTH, -1);
		mic[1].date.add(Calendar.MONTH, 3);
		mic[2].date.add(Calendar.MONTH, -2);
		mic[3].date.add(Calendar.MONTH, 5);
		mic[4].date.add(Calendar.MONTH, -7);
		
		//mic[0] = new Mic("마이크", 500, 30000);
		
		//Arrays.sort(mic);
		
		for (int i=0; i<mic.length-1; i++) {			
			for (int j=0; j<mic.length - 1 - i; j++) {
				
				//정렬를 위한 비교(가격 비교)
				//if (mic[j].price > mic[j+1].price) {
				//if (mic[j].weight < mic[j+1].weight) {	
				//if (mic[j].model < mic[j+1].model) {
				//if (mic[j].model.compareTo(mic[j+1].model) < 0) {
				if (mic[j].date.compareTo(mic[j+1].date) < 0) {
					//****** 주의!!!! 가격으로 비교를 했지만 교환은 Mic끼리
					//int temp = mic[j].price;
					//mic[j].price = mic[j+1].price;
					//mic[j+1].price = temp;
					
					Mic temp = mic[j];
					mic[j] = mic[j+1];
					mic[j+1] = temp;
					
				}//swap
				
				
			}
		}
		
		System.out.println(Arrays.toString(mic));
		
		//[Mic [model=마이크C, weight=340, price=25000], 
		//Mic [model=마이크A, weight=500, price=30000], 
		//Mic [model=마이크E, weight=230, price=42000], 
		//Mic [model=마이크B, weight=600, price=45000], 
		//Mic [model=마이크D, weight=640, price=66000]]

		
		//[Mic [model=마이크A, weight=500, price=25000], 
		//Mic [model=마이크B, weight=600, price=30000], 
		//Mic [model=마이크C, weight=340, price=42000], 
		//Mic [model=마이크D, weight=640, price=45000], 
		//Mic [model=마이크E, weight=230, price=66000]]

		
		
	}//m6

	private static void m5() {
		
		//순수 배열
		//비교
		
		int[] nums1 = { 100, 200, 300 };
		int[] nums2 = nums1; 						//얕은 복사
		int[] nums3 = nums1.clone(); 		//깊은 복사
		
		//얕은 비교
		System.out.println(nums1 == nums2);
		System.out.println(nums1 == nums3);
		System.out.println();
		
		//깊은 비교
		// - 참조 주소 비교(X) -> 각 배열의 요소의 값들을 비교
		System.out.println(Arrays.equals(nums1, nums2));
		System.out.println(Arrays.equals(nums1, nums3));
		System.out.println();
		
		
		//깊은 비교
		String[][] name1 = {{ "홍길동", "아무개", "테스트" }, { "하하하", "호호호", "후후후" }};
		String[][] name2 = {{ "홍길동", "아무개", "테스트" }, { "하하하", "호호호", "후후후" }};
		
		System.out.println(name1 == name2); 									//얕은 비교
		System.out.println(Arrays.equals(name1, name2));				//깊은 비교(1차원 배열 비교)
		System.out.println(Arrays.deepEquals(name1, name2));	//더 깊은 비교(차원수에 상관없이, 2차원 배열 이상);
		
	}

	private static void m4() {
		
		//순수 배열
		//배열 복사
		
		int[] origin = { 100, 200, 300, 400, 500 };
		int[] copy1 = origin; //얕은 복사
		
		copy1[0] = 100000;
		
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy1));
		System.out.println();
		
		//깊은 복사 > 동일 크기의 배열 생성 > 각 방을 1:1로 복사
		//1. 객체 메소드
		//2. 정적 메소드
		int[] copy2 = origin.clone(); //깊은 복사 메소드
		
		copy2[0] = 200000;
		
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy2));
		System.out.println();
		
		
		
		//Arrays.copyOf() -> clone() 메소드의 버전업
		//Arrays.copyOf() : 처음 ~ 원하는 길이
		//Arrays.copyOfRange() : 원하는 위치 ~ 원하는 위치
		int[] copy3 = Arrays.copyOf(origin, origin.length);//원본과 동일하게 깊은 복사
		System.out.println(Arrays.toString(copy3));
		
		int[] copy4 = Arrays.copyOf(origin, 10);//원본보다 긴 길이로 복사
		System.out.println(Arrays.toString(copy4));
		
		int[] copy5 = Arrays.copyOf(origin, 3);//원본보다 짧은 길이로 복사
		System.out.println(Arrays.toString(copy5));
		
		int[] copy6 = Arrays.copyOfRange(origin, 2, 4); //세밀하게 부분 지정 복사
		System.out.println(Arrays.toString(copy6));
		
	}

	private static void m3() {
		
		//순수 배열
		
		//배열 채우기 - 주로 초기화 역할
		int[] nums = new int[10];
		
		//모든 방에 숫자 100으로 채워라
		//Arrays.fill(nums, 100);
		Arrays.fill(nums, 2, 7, 200);

		System.out.println(Arrays.toString(nums));	
		
		
		
		String[] names = new String[10];
		
		Arrays.fill(names, "익명");
		
		System.out.println(Arrays.toString(names));
		
	}

	private static void m2() {
		
		//순수 배열 > 컬렉션
		//Array 클래스 : 개발자가 생성하는 모든 배열의 부모 클래스가 된다.
		int[] nums = { 100, 200, 300, 400, 500 };
		String[] names = { "홍길동", "테스트", "아무개", "하하하", "호호호" };
		
		//객체 멤버 : nums.XXX : clone(), length
		//정적 멤버 : Array.XXX : 주로 변환 기능. 네트워크 작업.
		//유틸 멤버 : Arrays.XXX : 배열 관련 여러가지 제공(컬렉션 처럼)
		
		//덤프 기능
		System.out.println(nums);
		System.out.println(names);
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(names));		
		
		int[][] nums2 = { { 100, 200, 300 }, { 400, 500, 600} };
		//System.out.println(Arrays.toString(nums2));
		for (int i=0; i<nums2.length; i++) {
			System.out.println(Arrays.toString(nums2[i]));
		}
		
	}

	private static void m1() {
		
		//List 계열
		//1. Vector
		//2. ArrayList
		// - 동일한 컬렉션. 쓰레드 작업 시 동기화 지원 유무
		
		ArrayList<Integer> nums1 = new ArrayList<Integer>();		
		Vector<Integer> nums2 = new Vector<Integer>();
	
		nums1.add(100);
		nums1.add(200);
		nums1.add(300);
		
		nums2.add(400);
		nums2.add(500);
		nums2.add(600);
		
		System.out.println(nums1.get(0));
		System.out.println(nums2.get(0));
		
		//모든 컬렉션들은 toString() 오버라이딩이 되어있다.
		System.out.println(nums1.toString());
		System.out.println(nums2);	
		
	}

}


class Mic {
	
	public String model;
	public int weight;
	public int price;
	public Calendar date; //제조날짜
	
	//이클립스로 생성자 만들기
	public Mic(String model, int weight, int price, Calendar date) {
		this.model = model;
		this.weight = weight;
		this.price = price;
		this.date = date;
	}

	@Override
	public String toString() {
		//return "Mic [model=" + model + ", weight=" + weight + ", price=" + price + "]";
		return String.format("model : %s, date : %tF", model, date);
	}
	
	
}


class Student {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	

	//생성자
	//Getter,Setter
	//toString
	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
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


	@Override
	public String toString() {
		return "\nname=" + name + "\nkor=" + kor + "\neng=" + eng + "\nmath=" + math + "\ntotal=" + getTotal();
	}
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	
}







