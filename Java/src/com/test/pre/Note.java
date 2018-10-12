package com.test.pre;


public class Note {
	
	//Note.java
	
	private String size;
	private String color;
	private int page;
	private String owner="";
	private int price=500;
	
	//노트정보 출력
	public void info() {
		System.out.println("■ ■ ■ 노트 정보 ■ ■ ■");
		
		if(!this.owner.equals("")) {
			System.out.printf("소유자 : %s\n",this.owner);
			System.out.printf("특성 : %s %s %s노트\n",this.color,feature(),this.size);
			System.out.printf("가격 : %,d원\n",notePrice());
		} else {
			System.out.println("주인 없는 노트");
		}
		
		System.out.println("■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■");
	}
	
	//노트의 특성
	private String feature() {
		if(this.page>=10 && this.page<=50) {
			return "얇은";
		} else if(this.page>=51 && this.page<=100) {
			return "보통의";
		} else if(this.page>=101 && this.page<=200) {
			return "두꺼운";
		} else {
			return "";
		}
	}
	
	//크기(쓰기전용)
	public void setSize(String size) {
			this.size = size;
	}
	
	//표지색상(쓰기전용)
	public void setColor(String color) {
		this.color = color;
	}
	
	//페이지수(쓰기전용)
	public void setPage(int page) {
		this.page = page;
	}
	
	//소유자이름(쓰기전용)
	public void setOwner(String owner) {
		if(owner.length()>=2 && owner.length()<=5) {
			for(int i=0;i<owner.length();i++) {
				if(owner.charAt(i)>='가' && owner.charAt(i)<='힣') {
					this.owner = owner;
				} else {
					return;
				}
			}
			this.owner = owner;
		}
	}
	
	//가격 계산
	private int notePrice() {
		switch(this.size) {
			case "B3": 
				this.price +=100;
			case "A3": 
				this.price +=100;
			case "B4": 
				this.price +=100;
			case "A4": 
				this.price +=100;
			case "B5": 
				this.price +=100;
				break;
			default:
				break;
		}
		switch(this.color) {
			case "노란색":
			case "파란색":
				this.price+=200;
				break;
			case "검정색":
				this.price+=100;
				break;
			default:
				break;
		}
		this.price += (this.page-10)*10;
		return this.price;
	}
	
	
	
	
}









































