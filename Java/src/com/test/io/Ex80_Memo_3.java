package com.test.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Ex80_Memo_3 {
	
	private static final String PATH;
	private static BufferedReader input; //콘솔 입력용
	
	static {
		PATH = "dat\\memo3.dat";
		input = new BufferedReader(new InputStreamReader(System.in));
	}

	public static void main(String[] args) {
		
		//Ex80_Memo.java
		// - 데이터 : 이름, 메모 내용, 날짜
		//1. 메모 쓰기
		//2. 메모 읽기
		
		/*
		
		이름 : 홍길동
		메모 내용 : 메모입니다.. 하하하하.. 
		
		[이름]		[날짜]				[메모 내용]
		홍길동		2018-08-01		메모입니다.. 하하하하..
		
		
		추가]
		1. 메모 내용을 다중 라인으로 입력 가능
		2. 최신 메모를 먼저 출력(***)
		
		
		*/
		
		boolean loop = true;
		
		while (loop) {

			System.out.println("=================");
			System.out.println("     메모장");
			System.out.println("=================");
			System.out.println("1. 메모 쓰기");
			System.out.println("2. 메모 읽기");
			System.out.println("3. 종료");
			System.out.println("=================");
			System.out.print("메뉴 선택 : ");
			String sel = "";
			
			try {
				sel = input.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if (sel.equals("1")) {
				write();
			} else if (sel.equals("2")) {
				read();
			} else {
				loop = false;
			}
			
		}//while
		
		System.out.println("메모장 종료.");
		
	}//main

	private static void write() {
		
		System.out.println("\n[메모 쓰기]\n");
		
		try {
			
			System.out.print("이름 : ");
			String name = input.readLine();
			
			System.out.print("메모 내용 : ");
			String memo = input.readLine();
			
			String date = String.format("%tT", Calendar.getInstance());
			
			
			
			
			
			
			
			BufferedReader reader = new BufferedReader(new FileReader(PATH));
			
			String line = "";
			String txt = "";
			
			while ((line = reader.readLine()) != null) {
				txt += line + "\r\n";
			}
			
			
			
			
			
			
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(PATH));
			
			writer.write(String.format("%s,%s,%s", name, date, memo));
			writer.newLine();
			writer.write(txt);
			
			writer.close();
			
			System.out.println("메모가 작성되었습니다.");
			pause();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void pause() {
		
		try {
			System.out.println("\n계속하시려면 엔터를 눌러주세요.");
			input.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void read() {
		
		System.out.println("\n[메모 읽기]\n");
		
		try {
			
			System.out.println("[이름]\t[날짜]\t\t[메모내용]");
			
			BufferedReader reader = new BufferedReader(new FileReader(PATH));
			
			String line = "";
			
			while ((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				System.out.printf("%s\t%s\t%s\n", temp[0], temp[1], temp[2]);
			}
			
			reader.close();
			
			pause();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
















