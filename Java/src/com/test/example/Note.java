package com.test.example;

public class Note {
	
	private String size;
	private String color;
	private int page;
	private String owner;
	private int price;
	
	public void setSize(String size) {
		
		if (!size.equals("A3") && !size.equals("A4") && !size.equals("A5") && !size.equals("B3") && !size.equals("B4") && !size.equals("B5")) {
			System.out.println("크기가 잘못되었습니다.");
			return;
		}
		
		this.size = size;
		calPrice();
	}

	public void setColor(String color) {
		
		if (!color.equals("검정색") && !color.equals("흰색") && !color.equals("노란색") && !color.equals("파란색")) {
			System.out.println("표지 색상이 잘못되었습니다.");
			return;
		}
		
		this.color = color;
		calPrice();
	}

	public void setPage(int page) {
		
		if (page < 10 && owner.length() > 200) {
			System.out.println("페이지수가 잘못되었습니다.");
			return;
		}
		
		this.page = page;
		calPrice();
	}

	public void setOwner(String owner) {
		
		if (owner.length() < 2 && owner.length() > 5) {
			System.out.println("소유자 이름이 잘못되었습니다.");
			return;
		}
		this.owner = owner;
	}
	
	
	private void calPrice() {

		if (this.size == null || this.color == null) {
			return;
		}
		
		this.price = 500;

		switch (this.size) {
			case "A3":
				this.price += 400;
				break;
			case "A4":
				this.price += 200;
				break;
			case "B3":
				this.price += 500;
				break;
			case "B4":
				this.price += 300;
				break;
			case "B5":
				this.price += 100;
				break;
		}
		
		switch (this.color) {
			case "검정색":
				this.price += 100;
				break;
			case "노란색":
			case "파란색":
				this.price += 200;
				break;
		}
		
		if (this.page >= 10 && this.page <= 200) {
			this.price += (this.page - 10) * 10;
		}
	
	}
	
	
	private String getThickness() {
		if (this.page <= 50) {
			return "얇은";
		} else if (this.page <= 100) {
			return "보통";
		} else {
			return "두꺼운";
		}
	}
	
	public void info() {

		String txt = "";
		
		txt += "■■■ 노트 정보 ■■■\r\n";
		
		if (this.owner != null) {
			txt += "소유자 : " + this.owner + "\r\n";
			txt += "특성 : " + this.color + " " + getThickness() + " " + this.size + " 노트\r\n";
			txt += "가격 : " + this.price + "원\r\n";
		} else {
			txt += "주인 없는 노트\r\n";
		}
		
		txt += "■■■■■■■■■■■";
		
		System.out.println(txt);		
	}
	
	

}
