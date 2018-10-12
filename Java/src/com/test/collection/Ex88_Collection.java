package com.test.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex88_Collection {

	public static void main(String[] args) {
		
		//Ex88_Collection.java
		
		//List 계열
		//LinkedList
		// - Queue의 구현 클래스로 사용하기도 한다.
		// - ArrayList와 사용법이 유사하다. > 사용 목적도 유사하다.
		
		//LinkedList의 종류
		//1. 기본 LinkedList
		//2. Double LinkedList
		//3. Double Circular LinkedList
		
		//ArrayList vs LinkedList
		// - 둘 다 같은 목적으로 사용한다.
		// - 길이가 가변인 스칼라 배열 용도로 사용한다.
		
		//ArrayList
		// - 장점 : 모든 컬렉션 중 요소에 대한 접근 속도가 가장 빠르다.(방 찾는 속도가 가장 빠르다. == 순수 배열급)
		// - 단점 : 요소의 추가/삭제 작업 시 비용 발생이 심하다.(느리다.)
		
		//LinkedList
		// - 장점 : 요소의 추가/삭제 작업 시 비용 발생이 저렴하다.(빠르다.)
		// - 단점 : 모든 컬렉션 중 요소에 대한 접근 속도가 느리다.
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		LinkedList<Integer> lList = new LinkedList<Integer>();
		
		aList.add(100);
		aList.add(200);
		aList.add(300);
		
		lList.add(1000);
		lList.add(2000);
		lList.add(3000);
		
		System.out.println(aList.size());
		System.out.println(lList.size());
		
		System.out.println(aList.get(0));
		System.out.println(lList.get(0));
		
		aList.add(1, 400);
		lList.add(1, 4000);
		
		System.out.println();		
		for (int n : aList) { System.out.println(n); }
		
		System.out.println();
		for (int n : lList) { System.out.println(n); }
		
		aList.remove(0);
		lList.remove(0);
		
		//aList.remove(200);
		//lList.remove(2000);
		aList.remove(new Integer(200));
		lList.remove(new Integer(2000));

		System.out.println();
		System.out.println(aList);
		System.out.println(lList);
		System.out.println();
		
		
		//1. 순차적으로 데이터 추가하기, Append
		System.out.println("순차적으로 데이터 추가하기");
		
		long begin = 0, end = 0;
		
		begin = System.currentTimeMillis();
		
		//작업
		for (int i=0; i<1000000; i++) {
			aList.add(i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("작업 소요 시간 : %,dms\n", end - begin);
		
		
		
		
		
		
		begin = System.currentTimeMillis();
		
		//작업
		for (int i=0; i<1000000; i++) {
			lList.add(i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("작업 소요 시간 : %,dms\n", end - begin);
		
		
		
		
		
		
		System.out.println("중간에 데이터 추가하기 + Shift 발생");
		
		
		begin = System.currentTimeMillis();
		
		//작업
		for (int i=0; i<10000; i++) {
			aList.add(100, i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("작업 소요 시간 : %,dms\n", end - begin);
		
		
		
		
		begin = System.currentTimeMillis();
		
		//작업
		for (int i=0; i<10000; i++) {
			lList.add(100, i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("작업 소요 시간 : %,dms\n", end - begin);
		
		
		
		
		
		
		System.out.println("중간에 데이터 삭제하기");
		
		begin = System.currentTimeMillis();
		
		//작업
		for (int i=0; i<10000; i++) {
			aList.remove(0);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("작업 소요 시간 : %,dms\n", end - begin);
		
		
		
		begin = System.currentTimeMillis();
		
		//작업
		for (int i=0; i<10000; i++) {
			lList.remove(0);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("작업 소요 시간 : %,dms\n", end - begin);
		
		
		
		
		
		System.out.println("순차적으로 데이터 삭제하기(끝 -> 처음) + Shift 없음");
		
		begin = System.currentTimeMillis();
		
		//작업
		for (int i=aList.size()-1; i>=0; i--) {
			aList.remove(i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("작업 소요 시간 : %,dms\n", end - begin);
		
		
		
		
		
		begin = System.currentTimeMillis();
		
		//작업
		for (int i=lList.size()-1; i>=0; i--) {
			lList.remove(i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("작업 소요 시간 : %,dms\n", end - begin);
		
		
		
		for (int i=0; i<100000; i++) {
			aList.add(i);
			lList.add(i);
		}
		
		
		System.out.println("순차적으로 데이터 읽기 : 배열 순차 탐색");
		
		begin = System.currentTimeMillis();
		
		//작업
		for (int i=0; i<100000; i++) {
			aList.get(i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("작업 소요 시간 : %,dms\n", end - begin);
		
		
		
		begin = System.currentTimeMillis();
		
		//작업
		for (int i=0; i<100000; i++) {
			lList.get(i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("작업 소요 시간 : %,dms\n", end - begin);
		
	}

	
}































