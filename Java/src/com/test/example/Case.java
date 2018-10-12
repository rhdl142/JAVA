package com.test.example;

public class Case {
	//케이스
	// - Case.java
	// - 물품을 담는다.
	// - 물품을 여러개 담을 수 있다.(최대 10개까지)
	// - 물품의 목록 확인할 수 있다.(목록)
	// - 특정 물품이 있는지 확인할 수 있다.(검색)
	// - 물품의 모든 무게의 합이 5kg 넘을 수 없다.
	
	//private Item item;//폐기
	private Item[] list = new Item[10];

	
//	public void test() {
//		this.item = new Item();
//	}
	
	public void add(Item item) {
		//this.item = item;
		
		//방 10개
		//list[?] = item;
		
		
		
		int i = 0;
		
		//비어있는 방의 번호를 찾기
		for (i=0; i<list.length; i++) {
			//System.out.println(this.list[i]);
			if (this.list[i] == null) { //i번째 방이 비었습니까?
				break;
			}
		}//
		
		//i : 4 == 비어있는 방이 4번방..
		//list[i] = item;
		
		
		int sum = 0;//누적
		
		for (int j=0; j<i; j++) {
			
			//sum += thirs.list[j].getWeight();
			sum = sum + list[j].getWeight();
		}//
		
		sum += item.getWeight(); //현재 추가중인 Item의 무게
		
		
		
		
		
		
		
		if (sum <= 15) {
			if (i < 10) { //최대 갯수 제한
				list[i] = item;
				//System.out.println(list[i].getWeight());
			} else {
				System.out.println("상자가 꽉 찼습니다.");
			}
		} else {
			System.out.println("최대 중량을 초과했습니다.");
		}
		
	}
	
	public void list() {
		
//		System.out.printf("%s, %dkg, %tF\n"
//										, this.item.getName()
//										, this.item.getWeight()
//										, this.item.getRegdate());

		for (Item item : this.list) {
			if (item != null) {
				System.out.printf("%s, %dkg, %tF\n"
						, item.getName()
						, item.getWeight()
						, item.getRegdate());
			}
		}
	}
	
	//검색
	public boolean isItem(String name) {
		
		for (int i=0; i<this.list.length; i++) {
			
			if (this.list[i] != null) {
				if (this.list[i].getName().equals(name)) {
					return true;
				}
			}
			
		}
		
		return false;
		
	}
	
	
}









