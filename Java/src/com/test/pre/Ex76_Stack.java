package com.test.pre;

public class Ex76_Stack{
	
	public static void main(String[] args) {
		
		// Ex75_Queue
		
		// 구현할 것
		// 1.void push(String value)
		// 2.int size()
		// 3.String pop()
		// 4.String peek()
		// 5.clear()
		// 6. 배열이 길이를 가변으로 구현 (큐객체 생성직후는 배열이 없음 -> 첫 add 호출시 4칸 짜리 생성)
		// 7. void trimToSize()
		
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

class MyStack{
	private int index;
	private String[] list;
	private static final int FIRST_STACK_SIZE;
	
	public MyStack() {
		index = -1;
		list = null;
	}
	
	static {
		FIRST_STACK_SIZE = 4;
	}
	
	// 처음 삽입이 아닌경우
			// 스택배열이 꽉차지 않은 경우
					// - 그냥 삽입하면 된다.
			// 스택배열이 꽉 찬 경우
					// - 배열의 크기를 2배로 만든 후 삽입한다.
	// 처음 삽입인 경우
		// - 크기가 4인 배열을 선언한 후, 삽입한다.
	
	public void push(String value){
		if(list != null) { 													// 처음 삽입이 아닌경우
			if(list.length != (this.index+1)) { // 스택배열 이 꽉차지 않은 경우
				this.index++;
				list[this.index] = value;
			} else {							// 스택배열 이 꽉 찬 경우
				String[] temp = new String[list.length*2];	// 2배 크기의 임시 배열
				for(int i=0;i<list.length;i++) { 
					temp[i] = list[i];	// 깊은 복사
				}
				
				list = temp;	// 앞서 복사한 temp 배열의 참조주소 값을 list 주소값에 복사
								// 기존의 참조를 끊고 temp 에 저장된 참조주소 참조  
								// 즉, (기존배열 크기) x 2 의 배열을 참조 
				
				//////////////////////// 배열크기 증가 완료///////////////////////////////////
				
				this.index++;	// 삽입할 공간이 확보되어서 index 증가
				list[this.index] = value;
			}
		} else {			  												// 처음 삽입인 경우
			list = new String[FIRST_STACK_SIZE];
			this.index++;	// index가 0이 됨
			list[this.index] = value;
			
		}
	}
	
	public String pop() {	// LIFO: Last Input First Out
		
		int pop_Index = this.index;	// pop 할 인덱스를 미리 저장한다. (마지막 인덱스)
		
		this.index--;				
		return list[pop_Index];
	}
	
	public int size() {
		return this.index+1;
	}
	
	public String peek() {
		return list[this.index];
	}
	
	public void clear() {
		index=-1;
		list = new String[list.length];
	}
	
	public void trimToSize() { // 값이 있는 인덱스까지만 배열의 크기 줄이기
		// 복사값을 저장할 배열
		String[] temp =  new String[this.index+1]; 
		
		for(int i=0;i<temp.length;i++) { 
			temp[i] = list[i];	// 깊은 복사
		}
		
		// 기존의 참조를 끊고 temp 에 저장된 참조주소 참조
		list = temp; 
	}
	
}
