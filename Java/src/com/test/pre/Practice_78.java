package com.test.pre;


public class Practice_78 {
	public static void main(String[] args) {
		
		//Practice_78.java
		
		//B4 노란색 25 - 홍길동
		Note note = new Note();
		note.setSize("B4");
		note.setColor("노란색");
		note.setPage(25);
		note.setOwner("홍길동");
		note.info();
		
		//A4 검정색 100 - X
		Note note2 = new Note();
		note2.setSize("A4");
		note2.setColor("검정색");
		note2.setPage(100);
		note2.info();
	}
}
