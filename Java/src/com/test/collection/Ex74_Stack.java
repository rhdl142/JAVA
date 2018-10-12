package com.test.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex74_Stack {
	
	public static void main(String[] args) {
		
		//Ctrl + D : Line Delete
		
		//Ex74_Stack.java
		
		//Queue, 큐
		// - 선입선출
		// - FIFO(First Input First Output)
		
		//Stack, 스택
		// - 후입선출
		// - LIFO(Last Input First Output)
		
		
		
		
		int a = 10;
		m1();
		System.out.println(a);
		
		
		//ex_queue();
		ex_stack();
		
	}//main
	
	
	private static void ex_stack() {
		
		//       ================
		//  <->  노랑   파랑   빨강  =
		//       ================
		System.out.println();
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("빨강");
		stack.push("파랑");
		stack.push("노랑");

		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		
		//if (stack.size() > 0) {
		if (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		stack.push("하나");
		stack.push("둘");
		stack.push("셋");
		
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
		System.out.println(stack.contains("둘"));
		System.out.println(stack.isEmpty());
		
		stack.trimToSize();
		
		stack.clear();
		System.out.println(stack.size());
		
		
	}


	private static void ex_queue() {
		
		//     ===============
		//  ->  노랑   파랑   빨강   ->
		//     ===============
		
		Queue<String> queue = new LinkedList<String>();
		
		//1. 요소 추가
		queue.add("빨강");
		queue.add("파랑");
		queue.add("노랑");
		
		//2. 요소 개수
		System.out.println(queue.size());
		
		//3. 요소 접근
		String color = queue.poll();
		System.out.println(color);
		System.out.println(queue.size());
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.size());

		System.out.println(queue.poll());
		
		//
		queue.add("빨강");
		queue.add("주황");
		queue.add("노랑");
		queue.add("초록");
		queue.add("파랑");
		queue.add("남색");
		queue.add("보라");
		
		//4. 루프 탐색
		//a. 일반 for
		//b. 향상된 for
		//c. while
		
		
		//a.
//		System.out.println();
//		
//		int size = queue.size();
//		
//		for (int i=0; i<size; i++) {
//			System.out.println(queue.poll());
//		}
//		
//		System.out.println(queue.size());
		
		
		
		
		
//		ArrayList<String> list = new ArrayList<String>();
//		
//		list.add("데이터"); //x100회
//		
//		for (int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
////			if () {
////				list.remove(i);
////			}
//		}
		
		
		
		//b. 사용 안함(Queue 가치가 사라짐)
//		System.out.println();
//		
//		for (String c : queue) {
//			System.out.println(c);
//		}
//		
//		System.out.println(queue.size());
		

		
		//c.
//		while (true) {
//			System.out.println(queue.poll());
//			
//			if (queue.size() == 0) {
//				break;
//			}
//		}
		
		
		//*** 많이 사용
//		while (queue.size() > 0) {
//			System.out.println(queue.poll());
//		}
		
		//queue.clear();
		//queue.contains("빨강")
		//queue.isEmpty()
		
		//queue.remove("빨강") : 잘 사용 안함(Queue 성질 위배)
		
		System.out.println();
		System.out.println(queue.peek()); //poll()의 결과와 동일
		System.out.println(queue.size());
		

		System.out.println(queue.peek()); //poll()의 결과와 동일
		System.out.println(queue.size());
		

		System.out.println(queue.peek()); //poll()의 결과와 동일
		System.out.println(queue.size());
		
		
		
	}




	private static void m1() {
		int b = 20;
		m2();
		System.out.println(b);	
	}
	private static void m2() {
		int c = 30;
		System.out.println(c);
	}
	
	

}















