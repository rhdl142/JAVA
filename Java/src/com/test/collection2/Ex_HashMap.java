package com.test.collection2;

public class Ex_HashMap {

	public static void main(String[] args) {
		
		//Ex_HashMap.java
		MyHashMap map = new MyHashMap();
		
		map.put("국어", "합격");
		map.put("영어", "합격");
		map.put("수학", "불합격");
		
		System.out.println(map.size());
		
		System.out.println(map.get("국어"));
		System.out.println(map.get("영어"));
		System.out.println(map.get("수학"));
		
		map.put("영어", "불합격");
		
		System.out.println(map.size());
		System.out.println(map.get("영어"));
		
		map.remove("영어");
		
		System.out.println(map.size());
		System.out.println(map.get("영어"));
		
		System.out.println(map.containKey("국어"));
		System.out.println(map.containsValue("합격"));
		
		map.clear();
		
		System.out.println(map.size());
		
		map.put("국사", "합격");
		map.put("사회", "불합격");
		

		System.out.println(map.size());
		System.out.println(map.get("국사"));
		System.out.println(map.get("사회"));
		
		
		
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
		
		for (int i=index; i<this.index; i++) {
			this.keys[i] = this.keys[i+1];
			this.values[i] = this.values[i+1];
		}
		
		this.index--;
		
	}
	
	
	public boolean containKey(String key) {
		
//		for (int i=0; i<=this.index; i++) {
//			if (this.keys[i].equals(key)) {
//				return true;
//			}
//		}
//		return false;
		
//		if (getIndex(key) > -1) {
//			return true;
//		} else {
//			return false;
//		}
		
		return getIndex(key) > -1 ? true : false;
		
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
		//this.keys = new String[100];
		//this.values = new String[100];
		
	}
	
	
}
















