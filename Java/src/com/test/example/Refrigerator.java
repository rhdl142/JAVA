package com.test.example;

public class Refrigerator {

	private RItem[] list = new RItem[100];
	
	public void add(RItem item) {
		
		if (getIndex() < 100) {
			this.list[getIndex()] = item;
		} else {
			System.out.println("냉장고가 꽉 찼습니다.");
		}
		
	}
	
	private int getIndex() {
		
		int index = 0;
		
		for (;index<list.length; index++) {
			if (this.list[index] == null) {
				return index;
			}
		}
		
		return index;
		
	}
	
	
	public RItem get(String name) {
		
		for (int i=0; i<list.length; i++) {
			if (list[i].getName().equals(name)) {
				return this.list[i];
			}
		}
		
		return null;
		
	}
	
	
	public int count() {
		
		return getIndex();
		
	}
	
	
	public void listItem() {
		
		System.out.println("[냉장고 아이템 목록]");
		
		for (RItem item : this.list) {
			System.out.printf("%s(%s)\r\n", item.getName(), item.getExpiration());
		}
		
	}
	
}
