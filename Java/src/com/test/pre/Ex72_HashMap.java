package com.test.pre;

public class Ex72_HashMap {
	public static void main(String[] args) {
		//배열 생성
		MyHashMap map = new MyHashMap();

		//추가
		map.put("국어", "합격");
		map.put("영어", "불합격");
		map.put("수학", "보류");

		//읽기
		System.out.println("★읽기★");
		System.out.println(map.get("국어"));
		System.out.println(map.get("영어"));
		System.out.println(map.get("수학"));
		System.out.println("자바를 넣었을 때 : "+map.get("자바")); // 없는 값 넣었을때
		System.out.println();
		
		//개수
		System.out.println("★개수★");
		System.out.println(map.size());
		System.out.println();
//
		//수정
		System.out.println("★수정★");
		map.put("영어", "합격");
		System.out.println(map.get("영어"));
		System.out.println();
		
//		//삭제
		System.out.println("★삭제★");
		map.remove("영어");
		System.out.println(map.get("영어"));
		System.out.println();

		//검색(key)
		System.out.println("★키 검색★");
		if (map.containKey("국어")) {
		    System.out.println("국어 점수 있음");
		} else {
		    System.out.println("국어 점수 없음");
		}
		System.out.println();
//
		//검색(value)
		System.out.println("★값 검색★");
		if (map.containValue("합격")) {
		    System.out.println("합격 과목 있음");
		} else {
		    System.out.println("합격 과목 없음");
		}
		System.out.println();
//
		//초기화
		System.out.println("★초기화★");
		map.clear();
		System.out.println(map.size());
	}
}

class MyHashMap {

	private int index;
	private String[] key;
	private String[] value;

	public MyHashMap() {
		this.index = -1;
		this.key = new String[100];
		this.value = new String[100];
	}

	private int getIndex(String key) {
		for (int i = 0; i <= this.index; i++) {
			if(this.key[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}
	
	public void put(String key, String value) {
		
		if(getIndex(key)>-1) { // 동일한 키값이 존재할 경우.
			this.value[getIndex(key)]=value;
			return; // 메소드 종료용...
		}
		//여기서 이미 있는 키값일때는 index를 증가시키지 않는다.
		this.index++;
		this.key[this.index] = key;
		this.value[this.index]= value;
	}
	
	public String get(String key) {
		if(this.getIndex(key)>-1) {
			return value[getIndex(key)];
		}
		return null;
	}
	public int size() {
		return this.index+1;
	}
	
	public void remove(String key) {
		int tempIndex=this.getIndex(key); // 해당 키값이 존재하는 인덱스를 저장.
		
		//해당 키값이 없으면 그대로 종료.
		if(tempIndex==-1) {
			return;
		}
		
		//있으면 이쪽으로 흘러서.
		for(int i=tempIndex; i<this.index;i++) {//제거작업. 위에서 아래로 덮어쓰기가 되어야 하므로
			this.key[i]=this.key[i+1];
			this.value[i]=this.value[i+1];
		}
		this.key[this.index]=null;
		this.value[this.index]=null;
		
		this.index--;
		
	}
	
	public boolean containKey(String key) {
		if(getIndex(key)>-1) { // 겟 인덱스를 통해서 key값 존재.
			return true;
		}
		return false;
	}
	
	public boolean containValue(String value) {
		
		for(int i =0; i<=this.index;i++) { // 처음부터 인덱스까지 돌아서 
			if(this.value[i].equals(value)) { // 같은 값이 존재한다면.
				return true;
			}
		}
		return false;
	}
	
	public void clear() {
		//클리어를 다른방식으로
		this.key=null;
		this.value=null;
		this.key = new String[100];
		this.value=new String[100];
		this.index=-1;
	}
	
	
	
	
	
	
	
	
	
	
}





