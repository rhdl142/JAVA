package com.test.pre;
/*1. Bugles 객체의 정보
    - 가격, 용량, 생산일자, 유통기한
2. 모든 멤버 변수의 접근 지정자는 private으로 한다.
3. 멤버 접근을 위한 Setter와 Getter를 정의한다.
    - 용량 : 쓰기 전용, 300g, 500g, 850g
    - 가격 : 읽기 전용, 850원(300g), 1200원(500g), 1950원(850g)
    - 생산일자 : 쓰기 전용(Calendar)
    - 유통기한 : 읽기 전용, 양의 정수, 7일(300g), 10일(500g), 15일(850g)
4. Bugles 객체 메소드
    - String eat() : 과자 먹기 메소드*/

import java.util.Calendar;

public class Homework_30_79 {
	
	public static void main(String[] args) {
		
		
		Bugles snack = new Bugles();
		snack.setSize(500);
		snack.setCreationTime("2018-07-15");
		System.out.println("가격 : " + snack.getPrice() + "원");
		System.out.println("유통 기한이 " + snack.getExpiration() + "일 남았습니다.");
		snack.eat();

		Bugles snack2 = new Bugles();
		snack2.setSize(300);
		snack2.setCreationTime("2018-07-01");
		System.out.println("가격 : " + snack2.getPrice() + "원");
		System.out.println("유통 기한이 " + snack2.getExpiration() + "일 남았습니다.");
		snack2.eat();

		
		
	}

}

class Bugles {
	
	private int size;
	private String CreationTime;
	private int price;
	private int Expiration;
	
	public void eat() {
		
		if(Expiration > 0) {
			System.out.println("과자를 맛있게 먹습니다.");
		} else {
			System.out.println("유통기한이 지나 먹을 수 없습니다.");
		}
		
	}
	
	/*public int getSize() {
		return size;
	}*/
	public void setSize(int size) {
		this.size = size;
	}

	/*public Calendar getCreationTime() {
		return CreationTime;
	}*/
	public void setCreationTime(String creationTime) {
		
		this.CreationTime = creationTime;
	}
	
	public int getPrice() {
		switch(this.size) {
		case 300 :
			price = 850;
			break;
		case 500 :
			price = 1200;
			break;
		case 850 :
			price = 1950;
			break;
		}
		return price;
	}
	/*public void setPrice(int price) {
		this.price = price;
	}*/
	public int getExpiration() {
		
		Calendar cal = Calendar.getInstance();
	    Calendar now = Calendar.getInstance();
	      
	      int add = 0;
	      
	      if(this.size == 300) {
	         add = 7;
	      } else if(this.size == 500) {
	         add = 10;
	      } else if(this.size == 850) {
	         add = 15;
	      }
	      
	      this.CreationTime= (this.CreationTime+"").replace("-", "");
	      
	      int year = Integer.parseInt((this.CreationTime).substring(0, 4));
	      int month = Integer.parseInt((this.CreationTime).substring(4, 6));
	      int day = Integer.parseInt((this.CreationTime).substring(6, 8));
	      
	      //생산
	      cal.set(Calendar.YEAR, year);
	      cal.set(Calendar.MONTH, month);
	      cal.set(Calendar.DATE, day);
	      
	      cal.add(Calendar.DATE, add);
	      
	      //현재 날짜
	      now.set(Calendar.YEAR,now.get(Calendar.YEAR));
	      now.set(Calendar.MONTH,now.get(Calendar.MONTH)+1);
	      now.set(Calendar.DATE,now.get(Calendar.DATE));
	      
	      long diffSec = (cal.getTimeInMillis() - now.getTimeInMillis()) / 1000;
	      long diffDay = diffSec/(60*60*24);
	      this.Expiration = (int)diffDay;

	      return Expiration;
	   }
	/*public void setExpiration(int expiration) {
		Expiration = expiration;
	}*/
	
}