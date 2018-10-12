package com.test.collection;

import java.util.Stack;

public class Ex90_Collection {
	
	public static void main(String[] args) {
		
		//Stack
		// - 브라우저의 히스토리
		Browser b = new Browser();
		
		b.goUrl("구글");
		b.goUrl("네이버");
		b.goUrl("다음");
		
		b.history();
		
		
		b.goBack(); //뒤로가기 버튼 1회 클릭
		b.history();
		
		b.goBack(); //뒤로가기 버튼 1회 클릭
		b.history();
		
		//b.goBack(); //뒤로가기 버튼 1회 클릭
		//b.history();
		
		b.goForward(); //앞으로가기 버튼 1회 클릭
		b.history();
		
	}

}


class Browser {
	
	private Stack<String> back; //이전 방문 기록
	private Stack<String> forward; //다음 방문 기록
	
	public Browser() {
		this.back = new Stack<String>();
		this.forward = new Stack<String>();
	}
	
	//주소 입력하면 사이트 방문하기
	public void goUrl(String url) {
		System.out.println(url + " 접속함");
		back.push(url);
	}
	
	//방문 기록 확인하기
	public void history() {
		
		if (!back.isEmpty() && !forward.isEmpty()) {
			System.out.println("--------------------------------------");
			System.out.println("back : " + back);
			System.out.println("now : " + back.peek()); //현재 접속중인 사이트
			System.out.println("forward : " + forward);
			System.out.println("--------------------------------------");
		}
		
	}
	
	//뒤로 가기
	public void goBack() {
		//back -> (요소 1개) -> forward
		if (!back.isEmpty()) {
			forward.push(back.pop());//옮기기
		}
	}
	
	//앞으로 가기
	public void goForward() {
		//back <- (요소 1개) <- forward
		if (!forward.isEmpty()) {
			back.push(forward.pop());
		}
	}
	
}



























