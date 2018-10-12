package com.test.example;

import java.util.Calendar;
import java.util.Random;

public class Ex54_Casting {

	public static void main(String[] args) {
		
		//Ex54_Casting.java
		
		AA a = new AA();
		AA b = new BB(); //업캐스팅. 부모 = 자식
		AA c = new CC(); //업캐스팅. 할아버지 = 손자
		AA d = new DD(); //업캐스팅. 할아버지 = 손자
		
		//참조변수 = 객체
		Object o1 = new Object();
		Object o2 = new AA();
		Object o3 = new BB();
		Object o4 = new CC();
		Object o5 = new DD();
		Object o6 = new Random();
		Object o7 = Calendar.getInstance();
		Object o8 = new StringBuilder("홍길동");
		Object o9 = "문자열";
		Object o10 = new int[3];
		
		//참조변수 = 값
		// - 내부적으로 박싱(Boxing)/언박싱(UnBoxing)이 발생한다.
		// - 박싱 : 값형의 데이터를 참조형 변수에 넣을 때 각각의 Wrapper Class 객체화 되는 현상. 업캐스팅
		// - 언박싱 : 박싱된 Wrapper 객체를 값형으로서 사용하고 싶을 때 원형으로 다운 캐스팅하는 작업
		// - 박싱/언박싱 : 고비용 + 사용빈도 높음(편함) > 제네릭(Generic)
		Object o11 = 10;
		Object o12 = 'c';
		Object o13 = true;
		Object o14 = 3.14;
		
		
		//System.out.println(o11 + 20);
		System.out.println((int)o11 + 20); //정석X
		System.out.println((Integer)o11 + 20); //정석O
		
		Integer n = (Integer)o11;
		System.out.println(n + 30);
		
	}
	
}

class AA {
	
}

class BB extends AA {
	
}

class CC extends BB {
	
}

class DD extends BB {
	
}











