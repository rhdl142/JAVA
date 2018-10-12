package com.test.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Ex70_Collection {
	
	//메소드간의 공용자원들
	private static BufferedReader reader;
	private static ArrayList<Member> list;
	
	//정적 생성자
	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
		list = new ArrayList<Member>();
	}
	

	public static void main(String[] args) {
		
		//Ex70_Collection.java
		
		//회원 정보 관리 프로그램 > 프로젝트 적용(가이드)
		
		//1. 회원 정보
		// - 이름
		// - 나이
		// - 주소
		// - 연락처
		
		//2. 기능
		// - 회원 정보 추가
		// - 회원 정보 보기
		// - 회원 정보 삭제
		// - 회원 정보 검색
		// - 회원 정보 수정(X)
		
		//3. 초기 고려 사항
		// - 회원 정보 1명 관리 -> 어떤 형태로? -> 클래스(O) vs HashMap(X)
		// - 회원들 관리 -> 회원 정보의 집합 -> 배열(X) vs ArrayList(O) vs HashMap(X)
		
		
		//4. 프로그램 골격(흐름) : (메뉴 출력 -> 항목 선택 -> 기능 실행) x 무한 반복
		
		//Member[] list = new Member[100];
		//ArrayList<Member> list = new ArrayList<Member>();
				
		dummy();
		
		System.out.println("프로그램을 시작합니다.");
		
		boolean loop = true;
		
		while (loop) {
			
			//메뉴 출력 -> 항목 선택 -> 기능 실행
			System.out.println("=========================");
			System.out.println("회원 정보 관리");
			System.out.println("1. 회원 추가");
			System.out.println("2. 회원 보기");
			System.out.println("3. 회원 검색");
			System.out.println("4. 회원 삭제");
			
			//주소, 전화 : 키워드 부분 검색
			//나이 : 세대별 검색
			// - 입력 : 20 -> 20 ~ 29
			//           : 30 -> 30 ~ 39
			System.out.println("5. 회원 검색(주소)");
			System.out.println("6. 회원 검색(전화)");
			System.out.println("7. 회원 검색(나이)");
			
			System.out.println("0. 종료");
			System.out.println("=========================");
			
			//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("선택(번호) : ");
			
			try {
				
				String sel = reader.readLine();
				
				if (sel.equals("1")) {
					//회원 추가
					add();
				} else if (sel.equals("2")) {
					//회원 보기
					view();
				} else if (sel.equals("3")) {
					//회원 검색
					search();
				} else if (sel.equals("4")) {
					//회원 삭제
					remove();
				} else if (sel.equals("5")) {
					//회원 검색(주소)
					search2();
				} else if (sel.equals("6")) {
					//회원 검색(전화)
					search3();
				} else if (sel.equals("7")) {
					//회원 검색(나이)
					search4();
				} else {
					//종료
					loop = false;
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}//menu while
		
		
		System.out.println("프로그램을 종료합니다.");
		
		
	}//main

	private static void search2() {
		
		//검색 > 회원 전체 목록 보기 + 조건
		System.out.println("[회원 검색]");
		
		System.out.print("검색어(주소) : ");
		String word = "";
		
		try {
			word = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("[이름]\t[나이]\t[전화]\t\t[주소]");
		
		for (Member m : list) {
			
			if (m.getAddress().indexOf(word) > -1) {
				System.out.printf("%s\t%5s\t%s\t%s\n"
											, m.getName()
											, m.getAge()
											, m.getTel()
											, m.getAddress());
				
			}
			
		}
		
		System.out.println("출력 완료");
		pause();
		
	}

	private static void search3() {
		
		//검색 > 회원 전체 목록 보기 + 조건
		System.out.println("[회원 검색]");
		
		System.out.print("검색어(전화) : ");
		String word = "";
		
		try {
			word = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("[이름]\t[나이]\t[전화]\t\t[주소]");
		
		for (Member m : list) {
			
			//010-3947-0234
			//4702
			//if (m.getTel().indexOf(word) > -1) {
			if (m.getTel().replace("-", "").indexOf(word) > -1) {
				System.out.printf("%s\t%5s\t%s\t%s\n"
											, m.getName()
											, m.getAge()
											, m.getTel()
											, m.getAddress());
				
			}
			
		}
		
		System.out.println("출력 완료");
		pause();
		
	}

	private static void search4() {
		
		//검색 > 회원 전체 목록 보기 + 조건
		System.out.println("[회원 검색]");
		
		System.out.print("검색어(나이) : ");
		String word = "";
		
		try {
			word = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("[이름]\t[나이]\t[전화]\t\t[주소]");
		
		for (Member m : list) {
			
			//회원나이 / 10 == 입력나이 / 10
			if (Integer.parseInt(m.getAge()) / 10 == Integer.parseInt(word) / 10) {
				
				System.out.printf("%s\t%5s\t%s\t%s\n"
											, m.getName()
											, m.getAge()
											, m.getTel()
											, m.getAddress());
				
			}
			
		}
		
		System.out.println("출력 완료");
		pause();
		
	}

	private static void dummy() {
	
		//테스트용 데이터
		String[] name1 = { "김", "이", "박", "최", "정" };
		String[] name2 = { "가", "나", "다", "라", "마", "사", "아", "자", "차", "카" };
		String[] address1 = { "서울시", "인천시", "부산시" };
		String[] address2 = { "강동구", "강남구", "강서구", "강북구" };
		
		Random rnd = new Random();
		
		for (int i=0; i<10; i++) {
			
			String name = name1[rnd.nextInt(name1.length)]
									+ name2[rnd.nextInt(name2.length)]
									+ name2[rnd.nextInt(name2.length)];
			String age = rnd.nextInt(40) + 20 + "";
			String address = address1[rnd.nextInt(address1.length)]
										+ " " + address2[rnd.nextInt(address2.length)];
			String tel = "010-" + (rnd.nextInt(9000) + 1000) + "-" + (rnd.nextInt(9000) + 1000);
			
			Member m = new Member();
			
			m.setName(name);
			m.setAge(age);
			m.setAddress(address);
			m.setTel(tel);
			
			list.add(m);//목록에 추가
			
		}
		
		
		
	}

	private static void add() {
		
		//회원 정보 추가
		String name = "";
		String age = "";
		String address = "";
		String tel = "";
		
		System.out.println("[회원 정보 추가]");
		
		try {
			
			System.out.print("이름 : ");
			name = reader.readLine();
			
			System.out.print("나이 : ");
			age = reader.readLine();
			
			System.out.print("주소 : ");
			address = reader.readLine();
			
			System.out.print("전화 : ");
			tel = reader.readLine();
			
			//회원 1명분 > Member 객체화 > ArrayList 추가
			Member m = new Member();
			
			m.setName(name);
			m.setAge(age);
			m.setAddress(address);
			m.setTel(tel);
			
			list.add(m);//목록 추가
			
			System.out.println("추가 완료.");
			
			//잠시 멈춤
			pause();
		
		} catch (Exception e) {
			System.out.println("입력 오류");
		}
		
	}

	private static void pause() {
		
		System.out.println("계속하시려면 엔터를 입력하세요.");
		try {
			reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void view() {
		
		//회원 (전체 목록) 보기
		System.out.println("[회원 정보]");
		
		//테이블 형태 출력
		System.out.println("[이름]\t[나이]\t[전화]\t\t[주소]");
		
		//전체 목록 > ArrayList > loop > Member 객체 > getter() 출력
		for (Member m : list) {
			System.out.printf("%s\t%5s\t%s\t%s\n"
										, m.getName()
										, m.getAge()
										, m.getTel()
										, m.getAddress());
		}
		
		System.out.println("출력 완료");
		pause();
		
	}

	private static void search() {
		
		//검색 > 회원 전체 목록 보기 + 조건
		System.out.println("[회원 검색]");
		
		System.out.print("검색어(이름) : ");
		String word = "";
		
		try {
			word = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//테이블 형태 출력
		System.out.println("[이름]\t[나이]\t[전화]\t\t[주소]");
		
		//전체 목록 > ArrayList > loop > Member 객체 > getter() 출력
		for (Member m : list) {
			
			//if (m.getName().indexOf(word) > -1) {
			if (m.getName().equals(word)) {
				System.out.printf("%s\t%5s\t%s\t%s\n"
											, m.getName()
											, m.getAge()
											, m.getTel()
											, m.getAddress());
				
			}
			
		}
		
		System.out.println("출력 완료");
		pause();
		
	}

	private static void remove() {
		
		//회원 삭제 <-> 회원 추가
		//정보 입력 > Member 객체 > ArrayList 추가
		
		System.out.println("[회원 삭제]");
		
		//목록 출력 선행
		System.out.println("[이름]\t[나이]\t[전화]\t\t[주소]");
		for (Member m : list) {
			
			System.out.printf("%s\t%5s\t%s\t%s\n"
										, m.getName()
										, m.getAge()
										, m.getTel()
										, m.getAddress());
			
			
		}
		
		System.out.print("삭제할 회원(이름) : ");
		
		String name = "";
		
		try {
			name = reader.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//목록에서 회원 객체 삭제
		//list.remove(index)
		//list.remove(m)
		
		for (int i=0; i<list.size(); i++) {
			
			Member m = list.get(i);
			
			if (name.equals(m.getName())) {
				
				//list.remove(i); //***
				list.remove(m);
				break;
				
			}
			
		}//for
		
		System.out.println("삭제 완료.");
		pause();
		
	}
	
}//Ex70


//회원 관리 프로그램 데이터 기본 단위 > 회원 정보 > Member Class
//보통 DTO(VO)라고 불리는 역할을 하는 클래스는 생성자 오버로딩을 잘 안한다.
class Member {
	
	private String name;
	private String age;
	private String address;
	private String tel;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	//개발용 -> 회원 정보가 잘 들어있는지 확인?  getter() x 4번 호출 -> toString() 오버라이딩
	
	@Override
	public String toString() {
		
		return String.format("name : %s, age : %s, address : %s, tel : %s"
											, this.name
											, this.age
											, this.address
											, this.tel);
	}
	
	
	
}































