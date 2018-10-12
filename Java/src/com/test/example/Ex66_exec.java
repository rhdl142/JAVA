package com.test.example;

import java.io.IOException;

public class Ex66_exec {

	public static void main(String[] args) {
		
		//Ex66_exec.java
		
		//자바에서 외부 프로그램 호출하기
		// - 자바는 모든 외부 입출력은 try 처리를 무조건 하도록..
		// 	- 콘솔 입력
		//		- 외부 프로그램 실행
		//		- 파일/DB 입출력
		
		//메모장 실행
		//실행 파일의 경로가 환경변수(path)이 등록되어 있다고 가정
		try {
			
			//Process notepad = new ProcessBuilder("notepad.exe").start();
			//Process notepad = new ProcessBuilder("mspaint.exe").start();
			//Process notepad = new ProcessBuilder("explorer.exe").start();
			//Process notepad = new ProcessBuilder("iexplore.exe").start();
			//Process notepad = new ProcessBuilder("calc.exe").start();
			//Process notepad = new ProcessBuilder("wordpad.exe").start();
			
			//Process notepad = new ProcessBuilder("C:\\Program Files\\EditPlus\\editplus.exe").start();
			
			//Process notepad = new ProcessBuilder("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe").start();
			
			
			//C:\Class\Java\editplus\\Ex03_DataType.java
			//Process notepad = new ProcessBuilder("notepad.exe", "C:\\Class\\Java\\editplus\\Ex03_DataType.java").start();
			
			//Process notepad = new ProcessBuilder("C:\\Program Files\\EditPlus\\editplus.exe", "C:\\Class\\Java\\editplus\\Ex03_DataType.java").start();
			
			
			//Process notepad = new ProcessBuilder("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe", "http://naver.com").start();
			
			//Process notepad = new ProcessBuilder("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe", "https://youtu.be/l9o33uBi40U").start();
			
			Process notepad = new ProcessBuilder("javac.exe", "Hello.java").start();
			
			
			System.out.println("메모장 실행");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}













