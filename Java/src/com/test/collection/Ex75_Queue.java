package com.test.collection;

public class Ex75_Queue {

	public static void main(String[] args) {
		
		//Ex75_Queue.java
		
		//구현할 것
		//1. void add(String value)
		//2. int size()
		//3. String poll()
		//4. String peek()
		//5. clear()
		//6. 배열이 길이를 가변으로 구현(큐객체 생성 직후는 배열이 없음 -> 첫 add() 호출 시 4칸 짜리 생성)
		//7. void trimToSize()
		
		
		//배열 생성
		MyQueue queue = new MyQueue();

		//추가
		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		queue.add("주황");
		queue.add("검정");

		//읽기
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

		//개수
		System.out.println(queue.size());

		//확인
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.size());

		//크기 조절
		queue.trimToSize();

		//초기화
		queue.clear();
		System.out.println(queue.size());
		
		
		
	}
	
}

class MyQueue {
	
	private int index;
	private String[] list;
	
	public MyQueue() {
		this.index = -1;
	}
	
	public MyQueue(int initialCapacity) {
		this.index = -1;
		this.list = new String[initialCapacity];
	}
	
	public void add(String value) {
		this.index++;
		
		check();
		
		this.list[this.index] = value;
	}

	private void check() {
		
		if (this.index == 0) {
			this.list = new String[4];
		}
		
		if (index == this.list.length) {
			String[] temp = new String[this.list.length * 2];
			for (int i=0; i<this.list.length; i++) {
				temp[i] = this.list[i];
			}
			this.list = temp;
		}
		
	}
	
	public String poll() {
		
		String temp = this.list[0];
		
		for (int i=0; i<=this.index; i++) {
			this.list[i] = this.list[i+1];
		}
		
		this.index--;
		
		return temp;
	}
	
	public int size() {
		
		return this.index + 1;
	}
	
	public String peek() {
		
		if (this.index >= 0) {
			return this.list[0];
		} else {
			return null;
		}
	}
	
	public void clear() {
		this.index = -1;
	}
	
	public void trimToSize() {
		
		String[] temp = new String[this.index + 1];
		for (int i=0; i<temp.length; i++) {
			temp[i] = this.list[i];
		}
		this.list = temp;
	}
	
}











