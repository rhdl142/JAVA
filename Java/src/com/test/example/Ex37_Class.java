package com.test.example;
import java.util.Calendar;
import java.util.Random;

import com.test.example.Book;
import com.test.example.Box;
import com.test.example.Bugles;

public class Ex37_Class {
	
	public static void main(String[] args) {
		
		//Ex37_Class.java
		
		//test77();
		
		//test78();
		
		//test79();
		
		ex37();
		
		//test80();
		
		//test81();
		
	}

	private static void test81() {
		
		Refrigerator r = new Refrigerator();
		
		Random rnd = new Random();
		String[] name = { "김치", "깍두기", "참치", "단무지", "열무김치", "멸치볶음", "오징어", "고추장", "된장", "시금치", "콩나물", "햄" };
		String[] date = { "2018-07-28", "2018-07-29", "2018-07-30", "2018-07-31", "2018-08-01", "2018-08-02", "2018-08-03", "2018-08-04", "2018-08-05", "2018-08-06", "2018-08-07", "2018-08-08" };
		
		for (int i=0; i<110; i++) {
			RItem item = new RItem();
			item.setName(name[rnd.nextInt(name.length)]);
			item.setExpiration(date[rnd.nextInt(date.length)]);
			r.add(item);
		}
		
		
		
		RItem getItem = r.get("김치");
		System.out.printf("'%s'의 유통기한 : %s\n", getItem.getName(), getItem.getExpiration());
		
		System.out.printf("냉장고 안의 총 아이템 갯수 : %d개\n", r.count());
		
		r.listItem();
		
		
	}

	private static void test80() {

		Box box = new Box();
		box.cook();
		box.check();
		box.list();
		
		
	}

	private static void ex37() {
		//Ex37_Class.java
		
		//케이스
		// - Case.java
		// - 물품을 담는다.
		// - 물품을 여러개 담을 수 있다.(최대 10개까지)
		// - 물품의 목록 확인할 수 있다.(목록)
		// - 특정 물품이 있는지 확인할 수 있다.(검색)
		// - 물품의 모든 무게의 합이 15kg 넘을 수 없다.
		
		//물품
		// - Item.java
		// - 물품명
		// - 무게
		// - 물품을 케이스에 담은 날짜
		
		Item item1 = new Item();
		
		item1.setName("아령");
		item1.setWeight(10);
		item1.setRegdate(Calendar.getInstance()); //현재 시각
		
		Case box = new Case();
		box.add(item1);
		box.list();
		
		
		item1 = new Item();
		
		item1.setName("리모콘");
		item1.setWeight(1);
		item1.setRegdate(Calendar.getInstance());
		
		box.add(item1);
		
		for (int i=0; i<9; i++) {
			item1 = new Item();
			
			item1.setName("핸드폰" + i);
			item1.setWeight(1);
			item1.setRegdate(Calendar.getInstance());
			
			box.add(item1);
		}
		
		box.list();
		
		
		
		if (box.isItem("아령"))	{
			System.out.println("아령 O");
		} else {
			System.out.println("아령 X");
		}
		
		if (box.isItem("컵"))	{
			System.out.println("컵 O");
		} else {
			System.out.println("컵 X");
		}
	}

	private static void test79() {
		Bugles snack = new Bugles();
		snack.setSize(500);
		snack.setCreationTime("2018-07-15");
		System.out.println("가격 : " + snack.getPrice() + "원");
		System.out.println("유통 기한이 " + snack.getExpiration() + "일 남았습니다.");
		snack.eat();
		System.out.println();
		
		
		
		
		
		Bugles snack2 = new Bugles();
		snack2.setSize(300);
		snack2.setCreationTime("2018-07-01");
		System.out.println("가격 : " + snack2.getPrice() + "원");
		System.out.println("유통 기한이 " + snack2.getExpiration() + "일 남았습니다.");
		snack2.eat();
	}

	private static void test78() {
		Note note = new Note();
		note.setSize("B4");
		note.setColor("노란색");
		note.setPage(25);
		note.setOwner("홍길동");
		note.info();
		System.out.println();
		
		Note note2 = new Note();
		note2.setSize("A4");
		note2.setColor("검정색");
		note2.setPage(100);
		note2.info();
		System.out.println();
		System.out.println();
		System.out.println();
	}

	private static void test77() {
		Book book1 = new Book();
		
		book1.setTitle("자바의 정석");
		book1.setPrice(30000);
		book1.setAuthor("홍길동");
		book1.setPublisher("한빛미디어");
		book1.setIsbn("AAA0001");
		
		System.out.println(book1.getTitle());
		System.out.println(book1.getPrice());
		System.out.println(book1.getAuthor());
		System.out.println(book1.getPubDate());
		System.out.println(book1.getIsbn());
		System.out.println(book1.getPage());
		
		System.out.println(book1.info());
		System.out.println();
		
		
		
		Book book2 = new Book();
		
		book2.setTitle("자바 기초@!");
		book2.setPrice(10000000);
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
}




//class Temp {
//	
//	
//	public static void main() {
//		
//		int n = 10;
//		
//		
//		int[] ns = new int[5];
//		int n1;
//		int n2;
//		int n3;
//		
//		
//		Item item = new Item();
//		
//		Item[] list = new Item[5];
//		Item item1;
//		Item item2;
//		Item item3;
//		
//		Item item = new Item();
//		aaa(item)
//		
//		public void aaa(Item itam)
//		for (int i=0; i<.i.) {
//			list[i] = new Item();
//			
//			list[i] = itam;
//		}
//		
//		
//		public void aaa(int itam)
//		for (int i=0; i<.i.) {
//			list[i] = 10;
//			
//			list[i] = itam;
//			
//			
//		}
//		
//		
//	}
//	
//}







