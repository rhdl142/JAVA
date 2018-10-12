package com.test.example;

public class Ex36_Access {
	
	public static void main(String[] args) {
		
		//Ex36_Access.java
		
		//접근 지정자(제어자), Access Modifier
		// - public, private / protected, default ..
		
		//1. public
		
		//2. private
		
		//[접근 지정자 사용시 가이드]
		//1. 멤버 변수는 무조건 private으로 지정한다.
		//2. 1은 public 메소드를 통해서 접근.
		//		a. 쓰기 -> Setter
		// 	b. 읽기 -> Getter
		//		c. 명명법
		//			Setter -> setXXX -> set멤버변수명
		//			Getter -> getXXX -> get멤버변수명
		//		d. Getter(O), Setter(X) : 읽기 전용 멤버
		//		e. Getter(X), Setter(O) : 쓰기 전용 멤버
		//		f. 가상 멤버
		
		//3. 메소드도 무조건 private으로 지정한다.
		//		a. 외부용 : public
		//		b. 내부용 : private
		
		//참조형
		// t1 : 참조 변수, 객체 변수 -> 객체
		AccessTest t1 = new AccessTest();
		
		System.out.println(t1.a);
		//System.out.println(t1.b);
		
		t1.aaa();
		//t1.bbb();
		
		t1.ccc();
		
		
		Employee e1 = new Employee();
		
		//e1.name = "홍길동";
		//e1.age = 2500000;
		//e1.department = "총무부";
		
		//System.out.println(e1.name);
		//System.out.println(e1.age);
		//System.out.println(e1.department);
		
		//e1.bbb("아무개");
		//System.out.println(e1.aaa());
		
		//private : 캡슐화, 정보은닉화
		//public Method -> Getter/Setter -> 인터페이스 역할
		e1.setName("아무개");
		System.out.println(e1.getName());
		
		e1.setAge(20);
		System.out.println(e1.getAge());
		
		e1.setDepartment("총무부");
		System.out.println(e1.getDepartment());	
		
		
		
		
		Computer c1 = new Computer();
		
		c1.setMainboard("MB 1000");
		c1.setCpu("i7 8세대");
		c1.setRam(32);
		c1.setGraphic("1080");
		//c1.setPower(600);
		c1.setLevel(2);
		
		c1.checkInfo();
		//System.out.println(c1.result());
		
		System.out.println(c1.getPower());
		//System.out.println(c1.getCpu());
		System.out.println(c1.getLevel());
		
		
		Baby baby = new Baby();
		baby.setYear(2016);
		System.out.println(baby.getAge());
		
	}//main

}


class Baby {
	
	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
		
	public int getAge() {
		return 2018 - year;
	}

	
	
	
}


//컴퓨터 클래스
class Computer {
	
	private String cpu;
	private int ram;
	private String mainboard;
	private int power = 500;
	private String graphic;
	
	//객체 사용자에게 제공
	public void checkInfo() {
		System.out.printf("본체 사양 : %s, %d, %s, %d, %s, %s\n"
										, this.cpu
										, this.ram
										, this.mainboard
										, this.power
										, this.graphic
										, this.result());
	}
	
	//내부용
	private String result() {
		
		if (this.ram >= 16) { return "그래픽용"; }
		else if (this.ram >= 8) { return "게임용"; }
		else return "사무용";
	}

	
	
	//Setter/Getter
	/*public String getCpu() {
		return cpu;
	}*/

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getMainboard() {
		return mainboard;
	}

	public void setMainboard(String mainboard) {
		this.mainboard = mainboard;
	}

	public int getPower() {
		return power;
	}

	/*public void setPower(int power) {
		this.power = power;
	}*/

	public String getGraphic() {
		return graphic;
	}

	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}
	
	
	public int getLevel() {
		return 3; //컴퓨터의 등급
	}
	
	public void setLevel(int level) {
		
	}
	
	
	
}//Computer


//사원 클래스
class Employee {
	
	private String name;
	private int age;
	private String department;
	
	//Getter
	public String getName() {
		return name;
	}
	
	//Setter
	public void setName(String txt) {
		if (txt.length() >= 2 && txt.length() <= 5) {
			name = txt;
		}
	}
	
	//age
	public int getAge() {
		
		return this.age;
		//return age;
	}
	
	public void setAge(int age) {
		//age = age;
		
		//this : 객체 연산자 -> 객체 자신을 뜻하는 표현(자신을 참조하는 주소값을 가지고 있는 예약어)
		
		this.age = age;
		
		//우리가 배운 변수의 종류
		// - 변수는 동일한 이름의 변수를 2개 이상 만들 수 없다.
		// - 단, 지역 변수와 멤버 변수는 동일할 수 있다.
		//1. 지역 변수
		//		a. 메소드 내에서
		//		b. 제어문 내에서
		//		c. 메소드 매개변수
		//2. 멤버 변수
		//		a. 클래스의 자식으로
	}
	
	
	public String getDepartment() {
		
		return this.department;
	}
	
	public void setDepartment(String deparment) {
		
		//사전 유효성 진행했다고 가정
		
		this.department = deparment;
	}

}



class AccessTest {

	//접근 지정자 : 클래스 멤버에게 적용
	public int a = 10;
	private int b = 20;
	
	public void aaa() {
		System.out.println("aaa");
	}
	
	private void bbb() {
		System.out.println("bbb");
	}
	
	public void ccc() {
		
		System.out.println(a);
		System.out.println(b);
		aaa();
		bbb();
		
	}
	
}

























