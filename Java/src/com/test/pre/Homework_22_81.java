package com.test.pre;

public class Homework_22_81 {
	public static void main(String[] args) {
		
		//Refrigerator 클래스로 냉장고 객체 r 생성
		Refrigerator r = new Refrigerator();
		
		//Item 클래스로 item1 객체 생성
		Item item1 = new Item();
		//item1 객체의 이름과 유통기한 지정
		item1.setName("김치"); 
		item1.setExpiration("2018-08-30");
		//냉장고 객체 r에 item1을 넣기
		r.add(item1);
//-----------------------------------------------------		
		Item item2 = new Item();
		item2.setName("깍두기");
		item2.setExpiration("2018-08-15");
		r.add(item2);
//-----------------------------------------------------		
		
//-----------------------------------------------------
		//냉장고 r객체에서 깍두기 이름을 가진 객체의 주소를
		//가져와서 item4와 공유
		Item item4 = r.get("김치");
		
		System.out.printf("%s의 유통기한 : %s\n", item4.getName(), item4.getExpiration());

		System.out.printf("냉장고 안의 총 아이템 갯수 : %d개\n", r.count());

		r.listItem();
	}

}
