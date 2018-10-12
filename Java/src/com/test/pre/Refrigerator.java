package com.test.pre;

public class Refrigerator {
	
	//Item클래스 타입으로 크기 100짜리 list배열 생성
	private Item list[] = new Item[100]; 
	
	//냉장고에 아이템 넣기
	public void add(Item item) {
		int i;
		//아이템 배열의 길이(냉장고 용량:100)만큼 루트를 돔
		for(i=0;i<list.length;i++) {
			//빈공간을 만났을때 루트를 나감
			if(this.list[i]==null) {
				break;
			}
		}
	
		//순차적으로 배열에 각 아이템 저장
		list[i] = item;
		//각 아이템에 대한 input 메세지
		System.out.println(item.getName()+"를 냉장고에 넣었습니다.");
		
		
	}
	
	//냉장고 속 아이템 꺼내오기
	public Item get(String name) {
		
		for(int i=0;i<list.length;i++) {//배열의 길이만큼 돌면서
			if(list[i].getName().equals(name)) { //받아온 이름과 배열안의 이름이 같은가
				return list[i]; //같으면 서로 이름이 같은 값을 반환
				
				
			} 
		}
		return null; //없으면 null
		
	}
	
	//아이템 목록 출력
	public void listItem() {
		System.out.println("[냉장고 아이템 목록]");
		for(Item item: this.list) {//배열의 길이만큼 루프돌면서
			if(item!=null) {//값이 null이 아닐때 
				System.out.printf("%s(%s)\n"           
						,item.getName()  //각 객체의 이름과
						,item.getExpiration()); //유통기한 출력
			}
	
		}
		
		
	}
	
	//냉장고 아이템 갯수
	public int count() {
		int j; //인덱스 j
		for(j=0;j<list.length;j++) {
			if(this.list[j]==null) { //배열에 값이 없을때까지 루프
				break;
			}
		}
		return j; //배열이 없는 곳의 인덱스 j = 항목의 갯수 
		
		
	}
}
