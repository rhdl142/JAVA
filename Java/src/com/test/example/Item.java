package com.test.example;
import java.util.Calendar;

public class Item {
	//물품
	// - Item.java
	// - 물품명
	// - 무게
	// - 물품을 케이스에 담은 날짜
	private String name;
	private int weight;
	private Calendar regdate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Calendar getRegdate() {
		return regdate;
	}
	public void setRegdate(Calendar regdate) {
		this.regdate = regdate;
	}
	
	

}










