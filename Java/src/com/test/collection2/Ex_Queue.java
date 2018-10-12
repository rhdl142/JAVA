package com.test.collection2;

public class Ex_Queue {
	
	public static void main(String[] args) {
		
		//Ex_Queue.java
		
		MyQueue queue = new MyQueue();
		
		queue.add("하나");
		queue.add("둘");
		queue.add("셋");
		
		System.out.println(queue.size());
		
		System.out.println(queue.poll());
		System.out.println(queue.size());
		
		while (queue.size() > 0) {
			System.out.println(queue.poll());
		}
		
		for (int i=0; i<100; i++) {
			queue.add("항목" + i);
			System.out.println(queue.length());
		}
		System.out.println(queue.size());
		
		
		queue.clear();
		System.out.println(queue.size());
		
		queue.add("하나");
		queue.add("하나");
		queue.add("하나");
		System.out.println(queue.size());
		System.out.println(queue.length());
		
		queue.trimToSize();
		System.out.println(queue.length());
		
	}

}


class MyQueue {
	
	private int index;
	private String[] list;
	
	public MyQueue() {
		this.index = -1;
		//this.list = new String[4]	;
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
		
		if (this.list == null) {
			this.list = new String[4];
		} else {
			
			if (this.index == this.list.length) {
				
				String[] temp = new String[this.list.length * 2];
				
				for (int i=0; i<this.list.length; i++) {
					temp[i] = this.list[i];//깊은 복사
				}
				
				this.list = temp;
				
			}
			
		}
		
	}
	
	
	
	public String poll() {
		
		String temp = this.list[0];
		
		for (int i=0; i<this.index; i++) {
			this.list[i] = this.list[i+1];
		}
		
		this.index--;
		
		return temp;
	}
	
	public int size() {
		
		return this.index + 1;
	}
	
	public int length() {
		
		return this.list.length;
	}
	
	public void clear() {
		this.index = -1;
	}
	
	public void trimToSize() {
		
		String[] temp = new String[this.size()];
		
		for (int i=0; i<temp.length; i++) {
			temp[i] = this.list[i];
		}
		
		this.list = temp;		
	}
	
}














