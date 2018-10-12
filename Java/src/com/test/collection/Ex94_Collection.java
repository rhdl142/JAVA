package com.test.collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.Properties;
import java.util.TreeMap;

public class Ex94_Collection {
	
	public static void main(String[] args) {
		
		//Ex94_Collection.java
		
		//List -> ArrayList(*), LinkedList, Stack
		//Set -> HashSet(*), TreeSet
		//Map -> HashMap(*), TreeMap
		
		//ArrayList
		//LinkedList
		//HashSet
		//TreeSet
		//HashMap
		//TreeMap
		
		
		//TreeMap
		// - 이진 트리
		// - 검색 용이
		// - key와 value로 데이터를 다루면서 (key의 범위)검색을 자주해야 하는 경우
		
		TreeMap<String,String> map = new TreeMap<String,String>();
		
		map.put("one", "하나");
		map.put("two", "둘");
		map.put("three", "셋");
		map.put("four", "넷");
		map.put("five", "다섯");
		
		System.out.println(map.size());		
		System.out.println(map.get("two"));		
		System.out.println(map.subMap("s", "v"));//key
		
		
		
		//Map : HashMap(***), TreeMap, Hashtable(HashMap Legacy), Properties(XML, JSON..)
		
		//Properties
		// - Hashtable 자식
		// - key와 value가 무조건 String 고정
		// - 제네릭 버전 없음.
		// - 주로 프로그램의 환경 설정값들을 관리하는 용도(*****)
		
		
		
		//프로그램 설정값
		// 1. 프로그램 (실행)종료 -> 2. 세팅값 물리 저장 -> 3. 프로그램 실행 -> 4. 세팅값 읽기 -> 5. 프로그램 적용
		
		Properties prop = new Properties();
		
		prop.setProperty("path", "C:\\Class\\Java"); //실행경로
		prop.setProperty("langauge", "ko");
		prop.setProperty("autosave", "30");
		prop.setProperty("fontFace", "나눔고딕코딩");
		
		System.out.println(prop);
		System.out.println(prop.getProperty("fontFace"));
		
		//탐색 : Enumeration > Iterator > ListIterator
		Enumeration e = prop.propertyNames();
		
		while (e.hasMoreElements()) {
			System.out.println(prop.getProperty((String)e.nextElement()));
		}

		
		//저장하기(외부 파일)
		try {
			
			//prop -> 파일 저장
			prop.store(new FileOutputStream("setting.ini"), "");
			
			
			System.out.println("설정 저장 완료");
			
		} catch (Exception e2) {
			System.out.println("Ex94_Collection.main() : " + e2.toString());
		}

		
		
		
		
		//이전 저장된 설정값들을 복구
		//prop -> setting.ini   //파일 쓰기
		//setting.ini -> prop2 //파일 읽기
		Properties prop2 = new Properties();
		
		try {
			
			prop2.load(new FileInputStream("setting.ini"));
			
			System.out.println(prop2);
			
		} catch (Exception e2) {
			System.out.println("Ex94_Collection.main() : " + e2.toString());
		}
		
		/*
		컬렉션
		1. Collection
			a. List(*)
				1. ArrayList
					- 순차적인 입출력
					- index 탐색(loop 돌릴때)
				2. LinkedList
					- 요소의 추가/삭제 빈번한 작업
				3. Queue
					- 선입선출
				4. Stack
					- 후입선출
			b. Set(*)
				1. HashSet
					- 중복값 X
				2. TreeSet
					- 정렬 + 부분 집합 추출
		
		2. Map(*)
			1. HasMap
				- 키, 값으로 구성 집합
			2. TreeMap
				- 정렬, 부분 집합 추출


		*/
	}

}















