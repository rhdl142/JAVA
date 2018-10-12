package com.test.pre;
import java.util.Calendar;

public class Item {
	// 물품
	// -Item.java
	// -물품명
	// -무게
	// -물품을 케이스에 담은 날짜
	
	
	/*private String name;
	private int weight;
	private Calendar regdata;
	
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
	public Calendar getRegdata() {
		return regdata;
	}
	public void setRegdata(Calendar regdata) {
		this.regdata = regdata;
	}*/
	
	
	private String name; //아이템 이름 변수 선언
	private String Expiration; //아이템 유통기한 변수 선언
	
	
	public String getName() { 
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpiration() {
		//객체의 유통기한 반환 
		return Expiration;
	} 
	public void setExpiration(String expiration) {
		//받아온 유통기한을 객체의 유통기한 변수에 저장 
		this.Expiration = expiration; 
	}

	


}




















