package com.test.etc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex96_RegularExpression {
	
	private static String wholeText;
	
	static {
		wholeText = "안녕하세요. 저는 홍길동입니다. 나이는 20살입니다. 연락처는 010-9876-9813입니다. 연락이 안되면 010-7382-9382로 다시 연락주세요.";
	}

	public static void main(String[] args) {
		
		//Ex95_RegularExpression.java
		//m1();
		//m2();
		
		//*****
		m3();
		//m4();
		//m5();
		
	}
	
	
	private static void m5() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String input = scan.nextLine();
		
		//아이디 : 유효 규칙(조건)
		
		//String regex = "^[A-Za-z_]\w{3,11}$";
		String regex = "^[A-Za-z_][A-Za-z0-9_]{3,11}$";
		
		if (Pattern.matches(regex, input)) {
			System.out.println("올바른 아이디");
		} else {
			System.out.println("올바르지 않은 아이디");
		}
		
	}
	
	
	private static void m4() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String input = scan.nextLine();
		
		//이름 : 유효 규칙(조건)
		//1. 한글로만
		//2. 길이 : 2자 ~ 4자이내
		
		String regex = "^[가-힣]{2,4}$";
		
		if (Pattern.matches(regex, input)) {
			System.out.println("올바른 이름");
		} else {
			System.out.println("올바르지 않은 이름");
		}
		
	}


	private static void m3() {
		
		//프로젝트 > 유효성 검사
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		String input = scan.nextLine();
		
		//20 -> 스무살
		
		// "^abc"
		// "abc$"
		String regex = "^[0-9]{1,2}$";
		
		if (Pattern.compile(regex).matcher(input).find()) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		if (Pattern.matches(regex, input)) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
	}



	private static void m2() {
		
		//네이버 시작 페이지 > URL 추출
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("dat\\naver.html"));
			
			String line = "";
			//String txt = "";
			StringBuilder sb = new StringBuilder();
			
			while ((line = reader.readLine()) != null) {
				//txt += line;
				sb.append(line);
			}
			
			
			Pattern p = Pattern.compile("(http|ftp|https):\\/\\/[\\w\\-_]+(\\.[\\w\\-_]+)+([\\w\\-\\.,@?^=%&amp;:/~\\+#]*[\\w\\-\\@?^=%&amp;/~\\+#])?");
			
			Matcher m = p.matcher(sb.toString());
			
			while (m.find()) {
				
				System.out.println(m.group());
				
			}
			
			
		} catch (Exception e) {
			System.out.println("Ex96_RegularExpression.m2() : " + e.toString());
		}

		
		
	}



	private static void m1() {
		
		//전화번호가 있는지?
		//txt.indexOf("010-2938-9393") > -1
		
		//정규식 객체
		Pattern p = Pattern.compile("\\d{3}-\\d{4}-\\d{4}");
		
		//검사 결과
		//CharSequence > String
		Matcher m = p.matcher(wholeText);
		
//		if (m.find()) { //iter.hasNext()
//			System.out.println("전화번호를 찾았습니다.");
//			System.out.println(m.group()); //iter.next()
//		} else {
//			System.out.println("전화번호가 없습니다.");
//		}
//		
//		if (m.find()) {
//			System.out.println("전화번호를 찾았습니다.");
//			System.out.println(m.group());
//		} else {
//			System.out.println("전화번호가 없습니다.");
//		}
		
		
		while (m.find()) {
			System.out.println(m.group());
		}
		
		
	}
	
}












