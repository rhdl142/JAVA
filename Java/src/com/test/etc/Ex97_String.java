package com.test.etc;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex97_String {
	
	public static void main(String[] args) {
		
		//Ex97_String.java
		
		//문자열 분리
		//- 구분자(Splitter, Delimiter)
		
		//1. String.split() 객체 메소드
		// - 정규 표현식 사용		
		
		//2. StringTokenizer 클래스
		// - 문자 사용
		
		//m1();
		//m2();
		//m3();
		//m4();
		
		m5();
		
	}

	private static void m5() {
		
		//수학 기능
		// - Math 클래스
		
		//1. 절대값
		int n1 = 10;
		int n2 = -10;
		
		System.out.println(Math.abs(n1));
		System.out.println(Math.abs(n2));
		System.out.println();
		
		
		//2. 무조건 올림 : 반올림이 불가능한 상태도 무조건 반올림
		double d1 = 3.9;
		double d2 = 3.1;
		
		System.out.println(Math.ceil(d1));
		System.out.println(Math.ceil(d2));
		System.out.println();
		
		
		//3. 무조건 내림 : 반올림이 가능한 상태도 무조건 소수이하를 버림
		System.out.println(Math.floor(d1));
		System.out.println(Math.floor(d2));
		System.out.println((int)d1);
		System.out.println();
		
		
		//4. 반올림
		System.out.println(Math.round(d1));
		System.out.println(Math.round(d2));
		System.out.println();
		
		
		//5. N 제곱, 제곱근(square root)
		System.out.println(Math.pow(2, 32));
		System.out.println(Math.sqrt(4));
		System.out.println();
		
		
		
		System.out.println(10 + 10);
		System.out.println(2000000000 + 2000000000);
		System.out.println(2000000000 + 2000000000L);
		
		
		//산술 연산시 오버플로우 발생 가능성이 있으면 -> 현재 : 묵인, 지금 : 예외발생
		System.out.println(Math.addExact(10, 10));
		System.out.println(Math.addExact(2000000000, 2000000000));
		System.out.println(Math.addExact(-2000000000, -2000000000));
		
		//Math.addExact(x, y)
		//Math.subtractExact(x, y)
		//Math.multiplyExact(x, y)
		
		
	}

	private static void m4() {
		
		//split() 살펴보기
		
		//주의점
		String txt = "홍길동|아무개|하하하|호호호";
		
		//자바의 split()은 구분자에 '|'가 오면 구분자로 인식하지 않고 연산자 or 인식한다. -> 동작 이상 
		//String[] temp = txt.split("|");
		//String[] temp = txt.split("\\|");
		String[] temp = txt.split("[|]");
		
		//System.out.println(Arrays.toString(temp));
		for (String name : temp) {
			System.out.println(name);
		}
		
		System.out.println();
		
		
		
		
		
		//split()은 앞의 빈 구분자, 중간의 빈 구분자는 인식 O + 끝의 빈 구분자 인식 X
		txt = ",홍길동,아무개,,하하하,호호호,";
		
		temp = txt.split(",");
		
		for (String name : temp) {
			System.out.println("이름 : " + name);
		}
		System.out.println();
		
		
		StringTokenizer st = new StringTokenizer(txt, ",");
		
		while (st.hasMoreTokens()) {
			System.out.println("이름 : " + st.nextToken());
		}
		System.out.println();
		
		
		
		//정규식 사용
		txt = "홍길동,아무개--호호호^-^하하하";
		
		temp = txt.split("[,-^]{1,3}");
		
		for (String name : temp) {
			System.out.println("이름 : " + name);
		}
		System.out.println();
		
		
		
		
		txt = "하나,둘,셋,넷,다섯,여섯,일곱";
		
		temp = txt.split(",", 4);
		
		for (String num : temp) {
			System.out.println("숫자 : " + num);
		}
		System.out.println();
		
		
		
		
		txt = ",홍길동,아무개,,하하하,호호호,";
		
		temp = txt.split(",", -1);
		
		for (String name : temp) {
			System.out.println("이름 : " + name);
		}
		
		
	}

	private static void m3() {
		
		//"홍길동,20,서울시,남자"
		
		//split()
		// - 장점 : 정규 표현식 사용 가능(다양하게 쪼갤 수 있다.)
		// - 단점 : 속도가 느리다.(정규 표현식)
		
		//StringTokenizer
		// - 단점 : 정규 표현식 사용 불가능(단순한 문자로만 쪼갤 수 있다. -> 원패턴)
		// - 장점 : 속도가 빠르다.
		
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<1000000; i++) {
			sb.append("홍길동,");
		}
		
		
		long begin = 0, end = 0;
		
		//1. split
		begin = System.currentTimeMillis();
		
		String[] temp = sb.toString().split(",");
		
		for (String item : temp) {
			item.length();
		}
		
		end = System.currentTimeMillis();
		
		System.out.println(end - begin);
		
		
		
		//2. StringTokenizer
		begin = System.currentTimeMillis();
		
		StringTokenizer st = new StringTokenizer(sb.toString(), ",");
		
		while (st.hasMoreTokens()) {
			st.nextToken().length();
		}
		
		end = System.currentTimeMillis();
		
		System.out.println(end - begin);
		
	}

	private static void m2() {
		
		//split() vs StringTokenizer
		
		String[] txt = new String[4];
		txt[0] = "홍길동,20,서울시,남자";
		txt[1] = "아무개,25,부산시,남자";
		txt[2] = "호호호,23,,여자";
		txt[3] = "하하하,,인천시,남자";
		
		
		
		//1. split()
		// - 구분자와 구분자 사이에 아무 데이터가 없어도 하나의 요소로 인정(배열의 방을 만들어준다.)
		for (String line : txt) {
			//분리
			String[] temp = line.split(",");
			for (String item : temp) {
				System.out.print(item + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		//2. StringTokenizer
		// - 구분자와 구분자 사이에 아무 데이터가 없으면 요소로 인정 안함
		// - 토큰(token) : 공백이 없는 연속된 문자의 집합 -> 단어
		for (String line : txt) {
			
			//분리
			StringTokenizer st = new StringTokenizer(line, ",");
			
			while (st.hasMoreTokens()) {
				System.out.print(st.nextToken() + "\t");
			}
			System.out.println();
			
		}
		System.out.println();
	
		
	}

	private static void m1() {
		
		String txt = "홍길동,아무개,하하하,호호호,후후후";
		
		StringTokenizer st = new StringTokenizer(txt, ",");
		
		System.out.println(st.countTokens());
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println(st.countTokens());
		
		
		
		txt = "010-9876-2731";
		
		st = new StringTokenizer(txt, "-");
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
	}

}














