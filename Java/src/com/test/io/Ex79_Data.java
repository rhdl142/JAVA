package com.test.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Ex79_Data {

	public static void main(String[] args) {
		
		//Ex79_Data.java
		
		//텍스트 파일 입력 & 출력
		// - 3가지 방식의 입출력
		//m1();
		//m2();
		
		//m3();
		//m4();
		//m5();
		
		//m6();
		//m7();
		
		//m8();
		
		//m9();
		m10();
		
	}

	private static void m10() {
		
		//회원 정보 읽기
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("dat\\member.dat"));
			
			System.out.println("[이름]\t[나이]\t[전화]\t\t[주소]");
			
			String line = "";
			
			while ((line = reader.readLine()) != null) {
				
				//System.out.println(line);
				//홍길동,20,서울시 강남구 역삼동,010-9876-5432
				
				String[] temp = line.split(","); // , : 구분자
				
				//System.out.println(temp[2]);
				System.out.printf("%s\t%s\t%s\t%s\n", temp[0], temp[1], temp[3], temp[2]);
				
			}
			
			reader.close();			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	private static void m9() {
		
		//회원 정보
		// - 이름, 나이, 주소, 전화
		// - 파일 입출력
		
		//A. 데이터 파일 포맷
		// ex) 이름,나이,주소,전화
		
		//파일 절대 경로
		//File temp = new File("C:\\Class\File\\test.txt");
		
		//파일 상대 경로
		// test.txt -> .\test.txt
		// . : 현재 실행파일나 작업 공간이 있는 폴더
		//File temp = new File("test.txt");
		
		//C:\Class\Java\JavaTest\test.txt
		//C:\Class\Java\JavaTest\test.txt
		//System.out.println(temp.getAbsolutePath());
		
		
		//BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Class\\Java\\JavaTest\\data.txt"));
		
		//BufferedWriter writer = new BufferedWriter(new FileWriter(".\\dat\\data.txt"));
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			BufferedWriter writer 
					= new BufferedWriter(new FileWriter(".\\dat\\member.dat", true));
			//member.txt -> member.dat
			
			String name = ""
					, age = ""
					, address = ""
					, tel = "";
			
			System.out.print("이름 : ");
			name = reader.readLine();
			
			System.out.print("나이 : ");
			age = reader.readLine();
			
			System.out.print("주소 : ");
			address = reader.readLine();
			
			System.out.print("전화 : ");
			tel = reader.readLine();
			
			writer.write(String.format("%s,%s,%s,%s\n", name, age, address, tel));
			
			writer.close();
			
			System.out.println("작성 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m8() {
		
		String path = "C:\\Class\\Java\\editplus\\Ex29_Array.java";
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String line = null;
			int lineNumber = 1;
			
			while ((line = reader.readLine()) != null) {
				System.out.printf("%03d: %s\n", lineNumber, line);
				lineNumber++;
			}
			
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m7() {

		//읽기
		// - 문자 + 문자열 읽기
		// - 라인 단위 읽기 지원(***)
		
		try {
			
			//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Class\\File\\add.txt"));
			
//			String txt = reader.readLine();
//			System.out.println(txt);
//			
//			txt = reader.readLine();
//			System.out.println(txt);
//			
//			txt = reader.readLine();
//			System.out.println(txt);
			
			String txt = null;
			
			while ((txt = reader.readLine()) != null) {
				System.out.println(txt);
			}
			
			
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m6() {
		
		//쓰기
		// - 문자 + 문자열 쓰기
		// - FileWriter와 유사(거의 똑같음)
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Class\\File\\add.txt"));
			
			writer.write("하나");
			writer.write("one");
			writer.newLine(); //writer.writer("\r\n")
			writer.write("둘");
			writer.write("two");
			
			writer.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	private static void m5() {
		
		//FileOutputStream : 1byte 문자 쓰기
		//FileInputStream : 1byte 문자 읽기
		//FileWriter : 2byte 문자 쓰기 + 라인 단위 쓰기(String)
		//FileReader : 2byte 문자 읽기 + 라인 단위 읽기(X) + 문자 단위 읽기(O)
		
		//읽기
		// - 문자 단위 읽기	
		try {	
			FileReader reader = new FileReader("C:\\Class\\File\\test.txt");
			
			//int code = reader.read();
			//System.out.println(code);//65279 - 하
			
			int code = -1;
			
			while ((code = reader.read()) != -1) {
				System.out.print((char)code);
			}
			
			
			reader.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m4() {
		
		//메모장 쓰기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.println("[메모장 쓰기]");
			
			System.out.print("파일명 : ");
			String filename = reader.readLine();
			
			//m1.
			FileWriter writer = new FileWriter("C:\\Class\\File\\" + filename);
			
			while (true) {
				
				//텍스트 입력 > writer 쓰기
				String txt = reader.readLine();
				
				//종료 입력(exit)
				if (txt.equals("exit")) break;
				
				//쓰기 : 파일에 직접 쓰기(X)
				//쓰기 : 출력 버퍼에 쓰기(O)
				writer.write(txt + "\r\n");
				
			}
			
			//스트림 닫기
			writer.close();
			reader.close();
			
			System.out.println("메모장 종료");
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	private static void m3() {
		
		//쓰기
		// - 바이트 단위 쓰기 > 문자(2byte) 단위 쓰기
		// - 한글 가능
		
		try {
			
			//FileOutputStream : 스트림
			//FileWriter : 스트림
			FileWriter writer = new FileWriter("C:\\Class\\File\\test.txt");
			
			System.out.println();
			
			writer.write("hello");
			writer.write("\r\n");
			writer.write("안녕하세요");
			writer.write("\r\n");
			writer.write("하하하\r\n"); //문자열 입력
			writer.write(65); //문자 코드 입력(X)
			
			
			writer.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m2() {
		
		//읽기
		// - 바이트 단위 읽기(1byte 읽기 -> ASCII 코드)
		// - System.in.read() 유사
		
		try {
			
			//읽기 전용 스트림 생성
			FileInputStream stream = new FileInputStream("C:\\Class\\File\\data.txt");
			
//			int code = stream.read();
//			System.out.println((char)code);
//			
//			code = stream.read();
//			System.out.println((char)code);
//			
//			code = stream.read();
//			System.out.println((char)code);
//			
//			code = stream.read();
//			System.out.println(code);
			
			//모든 내용 읽기(***** 패턴 외우기)
			int code = -1;
			
			while ((code = stream.read()) != -1) {
				System.out.print((char)code);
			}
			
			//스트림 닫기
			stream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m1() {
		
		//쓰기
		//1. 바이트 단위 쓰기
		// - 1바이트 단위 > 문자 코드값 1바이트 > ASCII 코드 지원
		
		//파일에 데이터 저장하기
		//1. 스트림 객체 생성하기(열기)(쓰기 전용)
		//2. 스트림 객체를 사용해서 쓰기 작업 진행
		//3. 스트림 객체 닫기
		
		
		try {
			
			File file = new File("C:\\Class\\File\\data.txt");
			
			//쓰기 전용 스트림 객체 생성
			// -> 쓰기 스트림을 열 때 사용되는 모드(Mode)
			//		1. 생성 모드, Create Mode
			//			- 기본 모드
			//			- 파일이 없어도 직접 생성한다.(새로 만들기)
			//			- 파일이 있어도 무조건 덮어쓰기
			//		2. 추가 모드, Append Mode
			//			- 추가 선택
			//			- 이어 쓰기 모드
			//			- 기존 파일의 내용을 계속 이어서 쓰기 작업
			
			FileOutputStream stream = new FileOutputStream(file); //열기
			
			//쓰기 작업
			//stream.write(68); //A
			//stream.write(69); //B
			//stream.write(70); //C
			
			String str = "Hello Hong~";
			
			for (int i=0; i<str.length(); i++) {
				stream.write(str.charAt(i));
			}
			
			stream.write('\r');
			stream.write('\n');
			
			str = "Bye Hong~";
			
			for (int i=0; i<str.length(); i++) {
				stream.write(str.charAt(i));
			}
			
			//스트림 닫기
			stream.close();
			
			System.out.println("쓰기 완료");
			
			Process notepad = new ProcessBuilder("notepad.exe", file.getAbsolutePath()).start();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}









