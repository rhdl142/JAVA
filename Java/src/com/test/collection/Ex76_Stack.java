package com.test.collection;

public class Ex76_Stack{

	public static void main(String[] args) {
		
		//Ex76_Stack.java
		
		//구현할 것
		//1. void push(String value)
		//2. int size()
		//3. String pop()
		//4. String peek()
		//5. clear()
		//6. 배열이 길이를 가변으로 구현(큐객체 생성 직후는 배열이 없음 -> 첫 add() 호출 시 4칸 짜리 생성)
		//7. void trimToSize()
		
		//배열 생성
		MyStack stack = new MyStack();

		//추가
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		stack.push("주황");
		stack.push("검정");

		//읽기
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		//개수
		System.out.println(stack.size());

		//확인
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.size());

		//크기 조절
		stack.trimToSize();

		//초기화
		stack.clear();
		System.out.println(stack.size());
	}
	
}

class MyStack {
	
	private int index;
	private String[] list;
	
	public MyStack() {
		this.index = -1;
	}
	
	public MyStack(int initialCapacity) {
		this.index = -1;
		this.list = new String[initialCapacity];
	}
	
	public void push(String value) {
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
	
	public String pop() {
		
		String temp = this.list[this.index];
		
		this.index--;
		
		return temp;
	}
	
	public int size() {
		
		return this.index + 1;
	}
	
	public String peek() {
		
		if (this.index >= 0) {
			return this.list[this.index];
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











