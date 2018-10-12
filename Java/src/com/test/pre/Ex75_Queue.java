package com.test.pre;

public class Ex75_Queue {
   public static void main(String[] args) {
      
      
      //구현할 것
      //1. void add(String value)
      //2. int size()
      //3. String poll()
      //4. String peek()
      //5. clear()
      //6. 배열의 길이를 가변으로 구현(큐객체 생성 직후는 배열이 없음 -> 첫 add()호출 시 4칸 짜리 생성
      //7. void trimToSize()
      
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
   
   System.out.println();
   
   //개수
   System.out.println(queue.size());

   System.out.println();
   
   //확인
   System.out.println(queue.peek());
   System.out.println(queue.peek());
   System.out.println(queue.size());
   
   //크기 조절
   queue.trimToSize();
   
   System.out.println();
   
   queue.clear();
   System.out.println(queue.size());
   }
}

class MyQueue {
   
   private int index;
   private String[] list;
   private String[] listCopy; //백업배열
   private int queueSize; //변화되는 방의 갯수
   
   public MyQueue() { //초기화
      this.index = -1;
      this.queueSize = 0;
   }
   
   public void add(String value) {
      index++;
      
      if (index == 0) {
         queueSize = 4;
         
         this.list = new String[queueSize];
         
         this.list[index] = value;
         
      }else if(index == queueSize) {
         this.listCopy = new String[queueSize];
         
         for (int i=0; i<index; i++) {
            this.listCopy[i] = this.list[i];
         }
         
         queueSize = queueSize * 2;
         this.list = new String[queueSize];
         
         for (int i=0; i<index; i++) {
            this.list[i] = this.listCopy[i];
         }
         
      }
      
      if (index != 0) {
         this.list[index] = value;
      }
      
      
      
      
   }

   public String poll() {
      
      String result;
      result = list[0];
      index--;
      
      for (int i = 0; i <= index; i++) {
         list[i] = list[i + 1];
      }

      return result;
   }
   
   public int size() {
      return this.index + 1;
   }
   
   public String peek() {
      return this.list[index - 1];
      
   }
   
   public void trimToSize() {
      if (index < queueSize) {
         queueSize = index;
      }
   }
   
   public void clear() {
      this.index = -1;
      this.queueSize = 0;
   }
   
}

