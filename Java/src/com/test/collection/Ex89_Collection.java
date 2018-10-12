package com.test.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex89_Collection {
	
	public static void main(String[] args) {
		
		//Ex89_Collection.java
		
		//Queue 예제
		// - 선입선출
		// - 메세지큐, Message Queue
		
		//음식점에서 음식 주문 
		//주방장 <-> (주문목록) <-> 손님
		
		Scanner scan = new Scanner(System.in);
		
		Chef chef = new Chef();
		
		//주문
		chef.input("짜장면");
		chef.input("짬뽕");
		chef.input("탕수육");
		
		//조리할 수 있는 상황
		chef.ouput();
		chef.ouput();
		chef.ouput();
		
		//담배~
		
		chef.input("깐풍기");
		chef.input("깐쇼새우");
		chef.input("양장피");
		
		//들어왔음.
		chef.check();
		
		chef.ouput();
		
		
		
	}

}

class Chef {
	
	public Queue<String> list; //주문 목록(Queue : 먼저 주문한 음식을 먼저 조리해야 해서..)
	
	public Chef() {
		this.list = new LinkedList<String>();
	}
	
	//주문하기
	public void input(String food) {
		
		list.add(food); //주문 목록에 음식 추가
		
	}
	
	//조리하기 + 서빙
	public void ouput() {
		
		//조리하기
		String food = list.poll(); //지금 만들어야 할 음식 확인
		food = "완성 : " + food;
		
		//서빙
		System.out.println(food + " 완성되었습니다.");
		
	}
	
	public void check() {
		
		System.out.println("앞으로 만들어야할 음식 : " + list);
	}
	
}



















