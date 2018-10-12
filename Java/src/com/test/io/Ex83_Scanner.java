package com.test.io;

import java.util.Scanner;

public class Ex83_Scanner {
	
	public static void main(String[] args) {
		
		//Ex83_Scanner.java
		
		//BufferedReader
		// - 범용 입력기
		// - 콘솔 입력 & 파일 입력 & 등..
		
		//Scanner
		// - 콘솔 입력기
		// - 편함
		
		Scanner scan = new Scanner(System.in);
		
		//문자열 입력
		//String name = scan.nextLine(); //라인 입력, 문장 입력 > \r\n를 만날때까지 읽어라
		//String[] temp = name.split(" ");
		//System.out.println(temp[0]);
		
		//숫자 입력
		//int num = scan.nextInt();
		//System.out.println(num);
		
		//name = scan.next(); //토큰(token - 공백문자로 구분되어지는 요소) 입력 > 공백 문자(스페이스, 탭, 엔터)를 만날때까지 읽어라
		//System.out.println(name);
		
		
		System.out.print("문자열 : ");
		String txt = scan.nextLine();
		System.out.println(txt);
		
		
		//스캐너로 숫자를 입력받은 직후 문자열을 입력받으면 나타나는 현상
		// nextInt()가 입력받은 버퍼에서 숫자만 빼간다.(\r\n 버리지 않음)
		System.out.print("숫자 : ");
		int num = scan.nextInt();
		System.out.println(num);
		
		//남은 엔터 버리기
		//scan.nextLine();
		scan.skip("\r\n");
				
		System.out.print("문자열 : ");
		txt = scan.nextLine();
		System.out.println(txt);
		
		System.out.print("숫자 : ");
		num = scan.nextInt();
		System.out.println(num);
		
		
		
	}

}











