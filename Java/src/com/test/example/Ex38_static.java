package com.test.example;

public class Ex38_static {
	
	//public static int a;

	public static void main(String[] args) {
		
		//Ex38_static.java
		
		//static 키워드
		// - 클래스 멤버에 붙이는 키워드
		//1. 멤버 변수
		//2. 멤버 메소드
		
		//static int a;
		
		
		//멤버 변수
		//static 변수, 정적 변수, 공용 변수, (클래스 변수)
		// <-> 객체 변수
		
		
		
		
		//학생 객체 생성
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setAge(15);
		//s1.setSchool("역삼 중학교");
		Student.setSchool("역삼중학교");
		
		
		Student s2 = new Student();
		s2.setName("아무개");
		s2.setAge(15);
		s2.setSchool("역삼 중학교");
		
		Student s3 = new Student();
		s3.setName("하하하");
		s3.setAge(16);
		s3.setSchool("역삼 중학교");
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getSchool());
		


		//StaticTest
		StaticTest t1 = new StaticTest();
		
		System.out.println(t1.a);
		t1.ccc();
		
		//System.out.println(t1.b); //사용 금지
		//t1.ddd(); //사용 금지
		
		System.out.println(StaticTest.b);
		StaticTest.ddd();
		
		부산향우회.향우회관위치 = "부산시 서구";
		부산향우회.향우회를소개합니다();
		
		
		부산향우회 홍 = new 부산향우회();
		홍.이름 = "홍길동";
		홍.나이 = 20;
		홍.주소 = "서울시 강남구";
		//홍.향우회관위치 = "부산시 동구";
		홍.안녕하세요();
		//홍.향우회를소개합니다();
		
		
		부산향우회 아 = new 부산향우회();
		아.이름 = "아무개";
		아.나이 = 22;
		아.주소 = "서울시 동대문구";
		//아.향우회관위치 = "부산시 남구";
		아.안녕하세요();
		//아.향우회를소개합니다();
		
		
		
	} //main
	
} //Ex38


//부산 향우회 소속인 사람들 객체를 만들기 위한 클래스
class 부산향우회 {
	
	public String 이름;
	public int 나이;
	public String 주소;
	public static String 향우회관위치;
	
	public void 안녕하세요() {
		System.out.println("안녕하세요. 저는 " + this.이름 + "입니다.");
	}
	
	public static void 향우회를소개합니다() {
		System.out.println("우리 향우회는 부산에 위치한 어쩌구 저쩌구~");
	}
	
}


//학생 클래스
// - 역삼 중학교(***)

class Student {
	
	private String name;
	private int age;
	//private String school;
	private static String school;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;	
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//오답
//	public String getSchool() {
//		return school;
//	}
//	public void setSchool(String school) {
//		this.school = school;
//	}
	
	//정답
	public static String getSchool() {
		return school;
	}
	public static void setSchool(String school) {
		Student.school = school;
	}
	
	
}

class StaticTest {
	
	public int a = 10;					//객체 변수
	public static int b = 20;			//정적 변수
	
	public void ccc() {					//객체 메소드
		System.out.println("객체 메소드");
		System.out.println(this.a);
		//System.out.println(this.b);
		System.out.println(StaticTest.b);
	}
	
	public static void ddd() {		//정적 메소드
		System.out.println("정적 메소드");
		//System.out.println(a);
		//System.out.println(this.b);
		System.out.println(StaticTest.b);
	}	
	
}






















