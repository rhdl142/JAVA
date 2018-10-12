package com.test.io;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class Ex77_File {
	
	private static int count = 0;
	private static int dcount = 0;
	private static long totalSize = 0;
	
	public static void main(String[] args) {
		
		//Ex77_File.java
		
		//파일 & 디렉토리
		//1. 액세스 & 조작 -> 윈도우 탐색기
		//2. 파일 데이터 입출력 -> 메모장
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		m11();
		
	}

	private static void m11() {
		
		//특정 폴더에 들어있는 파일의 총 개수?
		String path = "C:\\eclipse\\eclipse";
		File dir = new File(path);
		
		//누적 변수
		//int count = 0;
		
		//count = countFile(dir, count);
		
		countFile(dir);
		
		System.out.printf("총 파일 개수 : %,d개\n", count);
		System.out.printf("총 폴더 개수 : %,d개\n", dcount);
		System.out.printf("폴더 크기 : %,d개\n", totalSize);
		
	}
	
	private static void countFile(File dir) {
		
		//A. 자식 목록 가져오기
		File[] list = dir.listFiles();
		
		//B. 현재 폴더의 파일 개수 누적
		for (File file : list) {
			if (file.isFile()) {
				count++;
				totalSize += file.length();
				
				//file.delete();
			}
		}
		
		//C. 자식 폴더를 탐색
		for (File sub : list) {
			if (sub.isDirectory()) {
				//또 다시 자식 폴더를 대상으로 A + B + C 를 실행
				dcount++;
				
				countFile(sub);
				
			}
		}
		
		//dir.delete();
	}

	private static int countFile(File dir, int count) {
		
		//A. 자식 목록 가져오기
		File[] list = dir.listFiles();
		
		//B. 현재 폴더의 파일 개수 누적
		for (File file : list) {
			if (file.isFile()) {
				count++;
			}
		}
		
		//C. 자식 폴더를 탐색
		for (File sub : list) {
			if (sub.isDirectory()) {
				//또 다시 자식 폴더를 대상으로 A + B + C 를 실행
				
				count = countFile(sub, count);
				
			}
		}
		
		return count;
	}

	private static void m10() {
		
		//특정 폴더에 들어있는 파일의 총 개수?
		String path = "C:\\eclipse\\eclipse";
		File dir = new File(path);
		
		//누적 변수
		int count = 0;
		
		//자식 폴더 + 자식 파일
		File[] list = dir.listFiles(); 
		
		//자식 파일의 개수 세기
		for (File file : list) {
			if (file.isFile()) {
				count++;
			}
		}
		
		//자식폴더로 이동해서 자식 폴더의 파일 개수 세기
		for (File sub : list) {
			if (sub.isDirectory()) {
				
				//손자 목록
				File[] sublist = sub.listFiles();
				
				//손자 목록 중 파일들만 개수 세기
				for (File subfile : sublist) {
					if (subfile.isFile()) {
						count++;
					}
				}
				
				for (File subsub : sublist) {
					if (subsub.isDirectory()) {
						
						File[] subsublist = subsub.listFiles();
						
						for (File subsubfile : subsublist) {
							if (subsubfile.isFile()) {
								count++;
							}
						}
						
						//자식 목록 탐색.. 계속
						
						
					}
				}
				
			}
		}
		
		
		System.out.printf("총 파일 개수 : %d개\n", count);
		
	}

	private static void m9() {
		
		//폴더의 내용 보기
		// - 현재 폴더안에 들어있는 자식 폴더의 목록과 자식 파일의 목록를 가져오기
		
		String path = "C:\\eclipse\\eclipse";
		File dir = new File(path);
		
		if (dir.exists()) {
			
//			String[] list = dir.list();
//			
//			for (String name : list) {
//				System.out.println(name);
//				
//				File file = new File(path + "\\" + name);
//				System.out.println(file.length());
//			}
			
//			File[] list = dir.listFiles();
//			
//			for (File f : list) {
//				System.out.println(f.getName());
//				System.out.println(f.length());
//			}
			
			File[] list = dir.listFiles(); //***
			
			for (File file : list) {
				//System.out.println(file.isDirectory());
				if (file.isDirectory()) {
					System.out.printf("[%s]\n", file.getName());
				}
			}
			
			for (File file : list) {
				if (file.isFile()) {

					Date date = new Date(file.lastModified());
					
					System.out.println(file.getName()
							+ "\t" + file.length()
							//+ "\t" + file.lastModified()
							+ "\t" + String.format("%tF %tT", date, date)
							);
					
				}
			}
			
		}
		
		
		
	}

	private static void m8() {
		
		//폴더 삭제하기
		// - 빈폴더만 삭제가 가능하다.
		// - 내용물이 있는 폴더는 삭제 불가능하다.
		String path = "C:\\Class\\DDD";
		File dir = new File(path);
		
		if (dir.exists()) {
			
			System.out.println(dir.delete());						
		}
		
		
	}

	private static void m7() {
		
		//폴더명 바꾸기 & 이동하기
		//CCC -> DDD
		
		String path = "C:\\Class\\File\\DDD"; //원본
		File dir = new File(path);
		
		String path2 = "C:\\Class\\DDD"; //결과
		File dir2 = new File(path2);
		
		if (dir.exists()) {
			dir.renameTo(dir2);
		}
		
		System.out.println("완료");	
		
	}

	private static void m6() {
		
		//폴더 생성하기
		String path = "C:\\Class\\File\\CCC";//희망 경로
		
		File dir = new File(path);
		
		if (!dir.exists()) {
			dir.mkdir(); //Make Directory
			System.out.println("생성 완료");
		} else {
			System.out.println("같은 이름의 폴더가 이미 존재합니다.");
		}
		
		
		//요구사항] 회원 -> 회원별로 개인정보를 저장할 폴더 필요
		String[] member = { "홍길동", "아무개", "하하하", "호호호", "후후후" };
		
		for (String name : member) {
			
			//생성될 폴더의 가상 경로 만들기
			path = String.format("C:\\Class\\File\\[개인폴더]%s님", name);
			dir = new File(path);
			dir.mkdir();
			
			System.out.println(name + " 폴더 생성 완료");
			
		}
		
		
		
		//요구사항] 2018-01-01 ~ 2018-12-31 : 날짜별 365개 폴더 생성
		Calendar c = Calendar.getInstance();
		
		c.set(2018, 0, 1);
		
		//System.out.println(String.format("%tF", c));
		//c.add(Calendar.DATE, 1);
		//System.out.println(String.format("%tF", c));
		
		for (int i=0; i<365; i++) {
			
			System.out.println(String.format("%tF", c));
			
			path = "C:\\Class\\File\\" + String.format("%tF", c);
			dir = new File(path);
			dir.mkdir();
			
			c.add(Calendar.DATE, 1);
		}
		
	}

	private static void m5() {
		
		//파일명 바꾸기
		//test.txt -> hong.txt
		
		String path = "C:\\Class\\File\\BBB\\test.txt";
		File file = new File(path);
		
		if (file.exists()) {
			
			String path2 = "C:\\Class\\File\\AAA\\hong.txt";
			File file2 = new File(path2);
			
			file.renameTo(file2);
			
			System.out.println("이름 바꾸기 성공");
			
		}
		
	}

	private static void m4() {
		
		//파일 삭제
		String path = "C:\\Class\\File\\AAA\\test.txt";
		File file = new File(path);
		
		if (file.exists()) {
			if (file.delete()) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
		}
		
	}

	private static void m3() {
		
		//파일 조작
		// : 생성(X), 복사(X), 이동(O), 파일명수정(O), 삭제(O)
		
		//AAA(test.txt) -> BBB(test.txt) 이동하기
		//원본
		String path = "C:\\Class\\File\\AAA\\test.txt";
		File file = new File(path);
		
		if (file.exists()) {
			
			//이동 후에 존재할 파일 참조 객체
			String path2 = "C:\\Class\\File\\BBB\\test.txt";
			File file2 = new File(path2);
			
			//이동하기
			if (file.renameTo(file2)) {
				System.out.println("이동 완료.");
			} else {
				System.out.println("같은 파일이 존재합니다. 실패");
			}
		}
		
	}

	private static void m2() {
		
		//디렉토리 접근 -> 정보 가져오기
		
		String path = "C:\\Class\\File";
		
		File dir = new File(path);
		
		if (dir.exists()) {
			//디렉토리 정보 가져오기
			System.out.println(dir.getName());					//File, 폴더명***
			System.out.println(dir.isFile());							//false, 파일인지?***
			System.out.println(dir.isDirectory());				//true, 폴더인지?***
			System.out.println(dir.lastModified());				//1533087175764, 수정된 날짜
			System.out.println(dir.canRead());					//true
			System.out.println(dir.canWrite());					//true
			System.out.println(dir.isHidden());					//false
			System.out.println(dir.length());						//0, 폴더의 크기(바이트)***
			System.out.println(dir.getPath());						//C:\Class\dir\test.txt, 상대 경로***
			System.out.println(dir.getAbsolutePath());		//C:\Class\dir\test.txt, 절대 경로***
			System.out.println(dir.canExecute());				//true
			System.out.println(dir.getParent());					//C:\Class, 부모 폴더의 경로
			
		} else {
			System.out.println("폴더가 없습니다.");
		}
		
	}

	private static void m1() {
	
		//파일 접근 -> 파일의 정보 가져오기
		
		//파일 접근 -> 외부 리소스 접근 -> 참조 객체(대리인) 생성 -> 특정 클래스 인스턴스 -> 객체 조작 -> 외부 파일 조작
		
		//자바는 대소문자 + 경로명
		String path = "C:\\Class\\File\\test.txt";
		
		//파일 참조 객체
		File file = new File(path);
		
		//System.out.println(file.exists());
		
		if (file.exists()) {
			//업무 진행
			
			//파일의 정보 가져오기
			System.out.println(file.getName());					//test.txt, 파일명***
			System.out.println(file.isFile());							//true, 파일인지?***
			System.out.println(file.isDirectory());				//false, 폴더인지?***
			System.out.println(file.lastModified());			//1533086752792, 수정된 날짜
			System.out.println(file.canRead());					//true
			System.out.println(file.canWrite());					//true
			System.out.println(file.isHidden());					//false
			System.out.println(file.length());						//45, 파일의 크기(바이트)***
			System.out.println(file.getPath());					//C:\Class\File\test.txt, 상대 경로***
			System.out.println(file.getAbsolutePath());		//C:\Class\File\test.txt, 절대 경로***
			System.out.println(file.canExecute());				//true
			
		} else {
			//파일 없음
			System.out.println("파일이 없습니다.");
		}
		
	}
	

}












