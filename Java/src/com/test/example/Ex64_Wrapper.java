package com.test.example;

public class Ex64_Wrapper {

	public static void main(String[] args) {
		
		//Ex64_Wrapper.java
		
		//int -> Integer
		//byte -> Byte
		// x 7개
		
		//같은 취급
		int n1 = 10;										//값형
		Integer n2 = new Integer(20); 		//참조형
		
		System.out.println(n1 + 20);
		System.out.println(n2 + 20);
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//두 값의 우위 비교
		// - 1(크다), -1(작다), 0(같다)
		System.out.println(Integer.compare(10, 5)); 	//1
		System.out.println(Integer.compare(5, 10));	//-1
		System.out.println(Integer.compare(10, 10)); //0
		
		System.out.println(Integer.max(10, 5));	//10
		System.out.println(Integer.min(10, 5));	//5
		
		System.out.println(Integer.SIZE); //32bit
		
		System.out.println(Integer.compare(-10, 5));
		System.out.println(Integer.compareUnsigned(-10, 5));
		
		//String.valueOf(10)
		System.out.println(Integer.toString(10));
		System.out.println(Integer.toBinaryString(10)); 	//십진수 -> 이진수 표현 //1010
		System.out.println(Integer.toHexString(10));  		//십진수 -> 16진수 표현 //a
		System.out.println(Integer.toOctalString(10)); 		//십진수 -> 8진수 표현 //12
		//System.out.println(Integer.toUnsignedString(-10));
		
		
		
		
		char c1 = 'A';
		char c2 = 'E';
		
		System.out.println(c1 > c2);
		
		
		String s1 = "abc";
		String s2 = "aBc";
		
		//System.out.println(s1 > s2);
		System.out.println(MyString.compare(s1, s2));
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		
		
		
			
	}
	
}

class MyString {
	
	public static int compare(String s1, String s2) {
		
		//s1 = "홍길동";
		//s2 = "홍길동입니다.";
		
		int result = 0;
		int count = (s1.length() > s2.length()) ? s2.length() : s1.length();
		
		for (int i=0; i<count; i++) {
			
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			
			if (c1 > c2) {
				result = 1;
				break; 
			} else if (c1 < c2) {
				result = -1;
				break;
			}
			
		}
		
		if (result == 0) {
			if (s1.length() > s2.length()) {
				result = 1;
			} else if (s1.length() < s2.length()) {
				result = -1;
			}
		}
		
		
		return result;
		
	}
	
}











