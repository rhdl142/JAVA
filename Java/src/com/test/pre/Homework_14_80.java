package com.test.pre;
/*
 * 요구사항] Box 클래스와 Macaron 클래스를 설계하시오.
조 건
1. Box 객체의 정보
    - 1Box에는 10개의 마카롱을 담을 수 있다.(멤버 변수 = Macaron 배열)
2. Box 객체의 사용
    - Box 객체를 생성시 Box에 마카롱 객체를 10개 담는다.(무작위)
    - 품질 검사에 통과하지 못하는 마카롱을 구분한다.
3. Macaron 객체의 정보
    - 생산 크기(5cm ~ 15cm) -> 판매 유효 크기(8cm ~ 14cm)
    - 생산 색상(red, blue, yellow, white, pink, purple, green, black) -> 판매 유효 색상(black을 제외한 모든 색상)
    - 생산 샌드 두께(1mm ~ 20mm) -> 판매 유효 두께(3mm ~ 18mm)
 */
import java.util.Random;

public class Homework_14_80 {
   public static void main(String[] args) {
         Box box1 = new Box();
         box1.cook();
         box1.check();
         box1.list();     
   }
}

class Box {
   private Macaron[] list = new Macaron[10];   //마카롱 list
   
   Random rnd = new Random();                 //랜덤함수
   
   String[] color = {"red", "blue", "yellow", "white", "pink", "purple", "green", "black"}; //색깔정의
    
   public void cook() {                   //cook 메소드 랜덤값 생성해서 list에 넣어주기
      for(int i=0;i<10;i++) {
         list[i] = new Macaron();          //이거는 결국 위에 선언한 Macarong[] list = new Macarong[10]; 
                                           //이 줄에서 10개의 list 배열 변수에다가 new Macaron()을 넣어준것이다.
         list[i].setSize(rnd.nextInt(11)+5);
         list[i].setColor(color[rnd.nextInt(8)]);
         list[i].setThick(rnd.nextInt(20)+1);
      }
      System.out.println("마카롱을 10개 만들었습니다.");
   }
   
   
   public void check() {               //check 메소드 8<=길이<=14, 색깔 != 블랙, 3<=두께<=18 조건 맞는거 확인
       int hap = 0; 
      
      for(int i =0;i<10;i++) {
         if((list[i].getSize()>=8 && list[i].getSize()<=14)&&(!(list[i].getColor()).equals("black"))
               &&(list[i].getThick()>=3 && list[i].getThick()<=18) ) { 
        	 hap++;
         } 
      }
      
      System.out.println("[박스 체크 결과]");
      System.out.printf("QC 합격 : %d개\n",hap);
      System.out.printf("QC 불합격 : %d개\n",(10-hap));
   }
    
   public void list() {                    //list 메소드 cook메소드에서 담은 list의 값을 출력
      System.out.println("[마카롱 목록]");
      
      for(int i=0;i<10;i++) {
         if((list[i].getSize()>=8 && list[i].getSize()<=14)&&(list[i].getColor()!="black") 
               &&(list[i].getThick()>=3 && list[i].getThick()<=18) ) {                      //합격 조건
            System.out.printf("%d번 마카롱 : %dcm(%s,%dmm) : 합격\n",
                  i+1,list[i].getSize(),list[i].getColor(),list[i].getThick());
            
         }else {                                                                          //불합격 조건
            System.out.printf("%d번 마카롱 : %dcm(%s,%dmm) : 불합격\n",
                  i+1,list[i].getSize(),list[i].getColor(),list[i].getThick());
         }
         
      }
      
   }
}

class Macaron {
   private int size;         //크기
   private String color;     //색상
   private int thick;        //두께
   
   public int getSize() {
	   return size;
   }
   public void setSize(int size) {
	   this.size = size;
   }
   public String getColor() {
	   return color;
   }
   public void setColor(String color) {
	   this.color = color;
   }
   public int getThick() {
	   return thick;
   }
   public void setThick(int thick) {
	   this.thick = thick;
   }
}