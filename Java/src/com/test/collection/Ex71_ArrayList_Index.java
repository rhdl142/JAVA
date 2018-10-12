package com.test.collection;

import java.util.ArrayList;

public class Ex71_ArrayList_Index {
	
	public static void main(String[] args) {
		
		//Ex71_ArrayList.java
		//ArrayList<String> list = new ArrayList<String>();
		//list.add("홍길동");
		//System.out.println(list.get(0));
		
		//문자열 ArrayList
		//MyArrayListIndex list = new MyArrayListIndex();
		//list.add("홍길동");
		//System.out.println(list.get(0));
		
		
		//배열 생성
		MyArrayListIndex list = new MyArrayListIndex();

		//추가
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");

		//읽기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println();

		//개수
		System.out.println(list.size());
		System.out.println();

		//탐색 + 읽기
		for (int i=0; i<list.size(); i++) {
		    System.out.println(list.get(i));
		}
		System.out.println();

		//수정
		list.set(0, "우하하");
		for (int i=0; i<list.size(); i++) {
		    System.out.println(list.get(i));
		}
		System.out.println();

		//삭제
		list.remove(1);
		for (int i=0; i<list.size(); i++) {
		    System.out.println(list.get(i));
		}
		System.out.println();

		//삽입
		list.add(1, "호호호");
		for (int i=0; i<list.size(); i++) {
		    System.out.println(list.get(i));
		}
		System.out.println();
		
		//검색
		if (list.indexOf("홍길동") > -1) {
		    System.out.println("홍길동 있음");
		} else {
		    System.out.println("홍길동 없음");
		}
		System.out.println();
		
		//초기화
		list.clear();
		System.out.println(list.size());
		System.out.println();
		
	}

}


//클래스를 설계하시오.
// - index 체크 버전
class MyArrayListIndex {
	
	private int index;
	private String[] list;
	
	public MyArrayListIndex() {
		this.index = -1;
		this.list = new String[100];
	}
	
	public void add(String value) {
		
		this.index++;
		
		checkIndex();
		
		this.list[this.index] = value;		
	}

	private void checkIndex() {
		
		if (this.index < 0) {
			this.index = 0;
			throw new ArrayIndexOutOfBoundsException();
		}	else if (this.index > 100) {
			this.index = 99;
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public String get(int index) {
		
		return this.list[index];
	}
	
	public int size() {
		
		return this.index + 1;
	}
	
	public void set(int index, String value) {
		
		this.list[index] = value;		
	}
	
	public void add(int index, String value) {
		
		this.index++;
		
		checkIndex();
		
		for (int i=this.list.length-2; i>=index; i--) {
			this.list[i+1] = this.list[i];
		}
		
		this.list[index] = value;
		
	}
	
	public void remove(int index) {
		
		this.index--;

		checkIndex();
		
		for (int i=index; i<this.list.length-1; i++) {
			this.list[i] = this.list[i+1];
		}
		
	}
	
	
	public int indexOf(String value) {
		
		for (int i=0; i<this.list.length; i++) {
			if (value.equals(this.list[i])) {
				return i;
			}
		}
		
		return -1;		
	}
	
	public int lastIndexOf(String value) {
		
		for (int i=this.list.length-1; i>=0; i--) {
			if (value.equals(this.list[i])) {
				return i;
			}
		}
		
		return -1;		
	}
	
	public void clear() {
		
		this.index = -1;
		
		for (int i=0; i<this.list.length; i++) {
			this.list[i] = null;
		}
		
		//or
		//this.list = new String[100];		
	}
	
	
}














