package com.test.pre;

public class Ex71_ArrayList {

	public static void main(String[] args) {

		// 배열 생성
		MyArrayList list = new MyArrayList();

		// 추가
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");

		// 읽기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println();

		// 개수
		System.out.println(list.size());
		System.out.println();
		// 탐색 + 읽기
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		// 수정
		list.set(0, "우하하");
		System.out.println(list.get(0));
		System.out.println();
		// 삭제
		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		// 삽입
		list.add(1, "호호호");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		// 검색
		if (list.indexOf("홍길동") > -1) {
			System.out.println("홍길동 있음");
		} else {
			System.out.println("홍길동 없음");
		}
		System.out.println();
		// 초기화
		list.clear();
		System.out.println(list.size());
		System.out.println();
		
		list.add("하하하");
		System.out.println(list.size());
		
		// ArraryList<String> list = new Arrary<String>();
		// list.add("홍길동");
		// System.out.println(list.get[0]);

		// 문자열 ArraryList
		// MyArraryList = new MyArraryList();
		// list.add("홍길동");
	}

}

// 클래스를 설계
class MyArrayList {

	private int index; // ***
	private String[] list; // ***

	// public MyArrayList()메소드에는 100개의 문자열 방을 만들수 있는케이스같은걸 생성
	// 인덱스의 방번호는 0번부터 시작하기 때문에 -1을 해주어 0번부터 할수 있도록 선언
	public MyArrayList() {
		this.index = -1;
		this.list = new String[100];
	}

	// 인덱스 방을 늘리면서 데이터를 입력 추가 한다.
	// 100개의 케이스만 만들었기 때문에 리스트 배열에 인덱스(방번호)를추가하는데 그 값에는 value라는 변수를 추가.

	// list.add("데이터");
	public void add(String value) {

		this.index++;

		// 배열의 index방에 value 추가
		this.list[this.index] = value;
	}

	// list에 있는 인덱스 값을 불러오기위해서 list의 인덱스값을 반환받는다.

	// list.get(0)
	public String get(int index) {

		return this.list[index];
	}

	// 사이즈메소드에는 인덱스값의 개수를 불러오는데 인덱스의 시작은 0번이므로 +1릃 해주어 0번부터 셀수 있도록

	public int size() {

		return this.index + 1;
	}

	// 인덱스(방번호)에 내가 원하는 값을 넣겠다.
	// list.set(1, "홍길동");
	public void set(int index, String value) {

		this.list[index] = value;
	}

//	public String set(int index, String value) {
//		
//		String old = this.list[index];
//		this.list[index] = value;
//		
//		return old;
//	}

	// index --는 방을 뒤에서 한칸씩 지우기위해서 사용하는것
	// 방이 리스트의문자 -1보다 적을경우 방 1개씩 더해지는데 이때 리스트의 방주소가 +1로 들어오면 뒷방이 없어진다.

	// list.remove(1);
	public void remove(int index) {

		this.index--;

		for (int i = index; i < this.list.length - 1; i++) {
			this.list[i] = this.list[i + 1];
		}

		// this.list[this.list.length-1] = "";
	}

//삽입 this는 방을 끝에 만들어주고 배열의 길이 -1 이 방번호를 하나씩 줄이면서 원하는 자리에 도착할시 원했던 자료를 입력
	
	
	//list.add(2, "F");
	public void add(int index, String value) {
		
		this.index++;
		
		for (int i = this.list.length - 1; i > index; i--) {
			list[i] = list[i - 1];
		}
		list[index] = value;
	}
	
	
	
	
	

	// 시작점부터 사용자가 요구하는 방을 찾는것
	public int indexOf(String value) {
		
		for (int i = 0; i <= this.index; i++) {
			if (value.equals(this.list[i])) {
				return i;
			}
		}
		
		return -1;
	}

	// 마지막에서 사용자가 요구하는 방을 찾는것
	public int lastIndexOf(String value) {
		for (int i = this.index; i >= 0; i--) {
			if (value.equals(this.list[i])) {
				return i;
			}
		}
		return -1;
	}

	public void clear() {
		this.index = -1;
		
//		list = null;
		
		list = new String[100];
		
//		for (모든 방) {
//			list[i] = null;
//		}
		
	}
}










