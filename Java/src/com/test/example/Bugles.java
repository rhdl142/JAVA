package com.test.example;
import java.util.Calendar;

public class Bugles {

	private int price;
	private int size;
	private Calendar creationTime;
	private int expiration;
	
	
	public int getPrice() {
		return price;
	}
	
	public void setSize(int size) {
		
		if (size != 300 && size != 500 && size != 850) {
			System.out.println("용량이 잘못되었습니다.");
			return;
		}
		
		this.size = size;
		
		if (size == 300) {
			this.price = 850;
			this.expiration = 7;
		} else if (size == 500) {
			this.price = 1200;
			this.expiration = 10;
		} else if (size == 850) {
			this.price = 1950;
			this.expiration = 15;
		}
	}


	public void setCreationTime(String date) {
		
		//2018-07-10
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, Integer.parseInt(date.substring(0, 4)));
		c.set(Calendar.MONTH, Integer.parseInt(date.substring(5, 7)) - 1);
		c.set(Calendar.DATE, Integer.parseInt(date.substring(8)));
		
		this.creationTime = c;
		
	}
	
	public int getExpiration() {
		
		Calendar now = Calendar.getInstance();
		
		long gap = now.getTime().getTime() - this.creationTime.getTime().getTime();
		
		int gapDate = (int)(gap / 1000 / 60 / 60 / 24);
		
		return expiration - gapDate;
	}


	public void eat() {
		
		if (getExpiration() > 0) {
			System.out.println("과자를 맛있게 먹습니다.");
		} else {
			System.out.println("유통기한이 지나 먹을 수 없습니다.");
		}
	}
	
	
}
