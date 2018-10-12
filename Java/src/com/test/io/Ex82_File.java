package com.test.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex82_File {
	
	//모든 메소드에서 사용하는 공용 자원
	private static Scanner scan;
	private static final String DATA;
	private static UI ui;
	
	static {
		scan = new Scanner(System.in);
		DATA = "dat\\student.dat";
		ui = new UI();
	}
	

	public static void main(String[] args) {
		
		//Ex82_File.java
		//파일 입출력
		// - 학생 관리
		// - 순수 파일 입출력 기반으로
		
		//정보
		// - 학생 정보 > Student.java > 데이터 집합 단위
		//		a. 이름
		//		b. 나이
		//		c. 주소
		//		d. 학년
		
		//기능
		// - 추가하기
		// - 목록보기
		// - 삭제하기
		// - 검색하기
		
		boolean loop = true;
		
		while (loop) {
			
			ui.menu();
			
			int sel = scan.nextInt();
			scan.nextLine();
			
			switch (sel) {
				case 1:
					add(); break;
				case 2:
					list(); break;
				case 3:
					delete(); break;
				case 4:
					search(); break;
				default:
					loop = false; break;
			}
			
		}
		
		System.out.println("프로그램 종료");
		
	}


	private static void add() {
		
		//학생 정보 입력 > student.dat 기록
		
		ui.title(UI.ADD);
		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		
		System.out.print("나이 : ");
		String age = scan.nextLine();
		
		System.out.print("주소 : ");
		String address = scan.nextLine();
		
		System.out.print("학년 : ");
		String grade = scan.nextLine();
		
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(DATA, true));
			
			//파일 포맷
			// 1명 = 1줄
			// 홍길동,13,서울시,1
			// 이름,나이,주소,학년
			
			writer.write(String.format("%s,%s,%s,%s", name, age, address, grade));
			writer.newLine();
			
			writer.close();
			
			ui.complete(UI.ADD);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}


	private static void list() {
		
		//학생 목록 보기
		ui.title(UI.LIST);
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(DATA));
			
			System.out.println("[이름]\t[나이]\t[학년]\t[주소]");
			
			String line = "";//1줄 > 1명의 학생정보
			
			while ((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				System.out.printf("%s\t%6s\t%6s\t%s\n"
											, temp[0], temp[1], temp[3], temp[2]);
				
			}
			
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ui.complete(UI.LIST);
		
	}


	private static void delete() {
		
		//학생 정보 삭제하기
		ui.title(UI.DELETE);
		
		//*** 스트림(모든 텍스트 입출력)은 수정 or 삭제 작업이라는 존재하지 않는다. 
		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		
		try {
			
			String temp = ""; //**** 중요(삭제하려는 학생 정보를 제외한 나머지 학생 정보를 누적)
			
			BufferedReader reader = new BufferedReader(new FileReader(DATA));
			
			String line = "";
			
			while ((line = reader.readLine()) != null) {
				
				//line -> 홍길동,14,서울시 강남구 역삼동,1
				//name -> 홍길동
				if (!line.startsWith(name)) {
					temp += line + "\r\n";
				}
				
			}
			
			//System.out.println(temp);
			
			reader.close();
			
			//** 이어쓰기(X) -> 덮어쓰기(O)
			BufferedWriter writer = new BufferedWriter(new FileWriter(DATA));
			
			writer.write(temp); //삭제할 회원을 뺀 나머지 회원들 정보 덮어쓰기
			
			writer.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		ui.complete(UI.DELETE);
		
	}


	private static void search() {
		
		//목록보기 *=* 검색하기
		
		//학생 검색하기
		ui.title(UI.SEARCH);
		
		try {
			
			System.out.print("이름 : ");
			String name = scan.nextLine();
			
			
			BufferedReader reader = new BufferedReader(new FileReader(DATA));
			
			System.out.println("[이름]\t[나이]\t[학년]\t[주소]");
			
			String line = "";//1줄 > 1명의 학생정보
			
			while ((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				if (temp[0].indexOf(name) == -1) {
					continue;
				}
				
				System.out.printf("%s\t%6s\t%6s\t%s\n"
											, temp[0], temp[1], temp[3], temp[2]);
				
			}
			
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ui.complete(UI.SEARCH);
		
		
		
	}
	
}










