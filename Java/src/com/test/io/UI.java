package com.test.io;

//학생 관리 프로그램의 출력 담당
public class UI {

	public static final int ADD = 1;
	public static final int LIST = 2;
	public static final int DELETE = 3;
	public static final int SEARCH = 4;
	
	public void menu() {
		System.out.println("================");
		System.out.println("   학생 정보 관리");
		System.out.println("================");
		System.out.println("1. 학생 추가");
		System.out.println("2. 목록 보기");
		System.out.println("3. 학생 삭제");
		System.out.println("4. 학생 검색");
		System.out.println("5. 종료");
		System.out.println("================");
		System.out.print("메뉴 선택(번호) : ");
	}
	
	public void title(int n) {
		if (n == UI.ADD) {
			System.out.println("\n[학생 정보 추가하기]\n");
		} else if (n == UI.LIST) {
			System.out.println("\n[학생 목록 보기]\n");
		} else if (n == UI.DELETE) {
			System.out.println("\n[학생 정보 삭제하기]\n");
		} else if (n == UI.SEARCH) {
			System.out.println("\n[학생 정보 검색하기]\n");
		}
	}

	public void complete(int n) {
		if (n == UI.ADD) {
			System.out.println("\n추가를 완료했습니다.\n");
		} else if (n == UI.LIST) {
			System.out.println("\n보기를 완료했습니다.\n");
		} else if (n == UI.DELETE) {
			System.out.println("\n삭제를 완료했습니다.\n");
		} else if (n == UI.SEARCH) {
			System.out.println("\n검색을 완료했습니다.\n");
		}
	}

}

















