package com.test.collection;

public class Ex72_HashMap {

	public static void main(String[] args) {
		
		//Ex72_HashMap.java
		
		//배열 생성
		MyHashMap map = new MyHashMap();

		//추가
		map.put("국어", "합격");
		map.put("영어", "불합격");
		map.put("수학", "보류");

		//읽기
		System.out.println(map.get("국어"));
		System.out.println(map.get("영어"));
		System.out.println(map.get("수학"));

		//개수
		System.out.println(map.size());

		//수정
		map.put("영어", "합격");
		System.out.println(map.get("영어"));

		//삭제
		map.remove("영어");
		System.out.println(map.get("영어"));

		//검색(key)
		if (map.containKey("국어")) {
		    System.out.println("국어 점수 있음");
		} else {
		    System.out.println("국어 점수 없음");
		}

		//검색(value)
		if (map.containsValue("합격")) {
		    System.out.println("합격 과목 있음");
		} else {
		    System.out.println("합격 과목 없음");
		}

		//초기화
		map.clear();
		System.out.println(map.size());
		
	}
	
}

class MyHashMap {
	
	private int index;
	private String[] keys;
	private String[] values;
	
	public MyHashMap() {
		
		this.index = -1;
		this.keys = new String[100];
		this.values = new String[100];
		
	}
	
	private int getIndex(String key) {
		
		for (int i=0; i<=this.index; i++) {
			if (this.keys[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}
	
	
	public void put(String key, String value) {
		
		
		if (getIndex(key) == -1) {
			this.index++;
			
			this.keys[this.index] = key;
			this.values[this.index] = value;
		} else {
			this.values[getIndex(key)] = value;
		}
		
	}
	
	public String get(String key) {
		
		if (getIndex(key) > -1) {
			return this.values[getIndex(key)];
		} else {
			return null;
		}
	}
	
	public int size() {
		
		return this.index + 1;
	}
	
	public void remove(String key) {
		
		int index = getIndex(key);
		
		for (int i=index; i<=this.index; i++) {
			this.keys[i] = this.keys[i+1];
			this.values[i] = this.values[i+1];
		}
		
		this.index--;
		
	}
	
	public boolean containKey(String key) {
		
		for (int i=0; i<=this.index; i++) {
			if (this.keys[i].equals(key)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean containsValue(String value) {
		
		for (int i=0; i<=this.index; i++) {
			if (this.values[i].equals(value)) {
				return true;
			}
		}
		return false;
	}
	
	public void clear() {
		
		this.index = -1;
		this.keys = new String[100];
		this.values = new String[100];
	}
	
	
}















