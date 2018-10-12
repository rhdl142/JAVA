package com.test.collection;

import java.util.ArrayList;

public class Ex73_Collection {

	public static void main(String[] args) {
		
		//Ex73_Collection.java
		
		//모든 컬렉션은 길이가 가변이다.
		
		ArrayList<String> list = new ArrayList<String>(1000);
		
		//첫 add때 배열 생성 -> 4칸짜리 배열 생성
//		list.add("하나");
//		list.add("둘");
//		list.add("셋");
//		list.add("넷");
//		
//		list.add("다섯");
		
		
//		for (int i=0; i<210000000; i++) {
//			list.add("데이터");
//		}
//		
//		System.out.println(list.size());
		
		
		
		for (int i=0; i<1000; i++) {
			list.add("데이터");
		}
		
		list.add("추가");
		
		list.trimToSize();
		
		list.add("추가");
		
		
		
		
		
		
	}
	
}











