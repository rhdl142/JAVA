import java.io.*;
import java.util.Random;

class Ex25_for {

	public static void main(String[] args) throws Exception {

		//Ex25_for.java
		/*

		for 문

		for (초기식; 조건식; 증감식) {
			실행 코드;
		}

		*/

		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();

		//m7();
		//m8();
		//m9();
		//m10();
		m11();
		
	}//main

	public static void m11() {
		
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				
				//if (i == 5) {
				//if (j == 5) {
				//if (i == 5 || j == 5) {
				if (i >= 5 || j <= 5) {
					break;
				}

				System.out.printf("i : %d, j : %d\n", i, j);
			}
		}	



		for (int i=0; i<10; i++) {
			for (int j=(10 - i); j>0; j--) {
				System.out.printf("i : %d, j : %d\n", i, j);
			}
		}	
		
	}	
	
	public static void m10() {
		
		//구구단
		// - 2단 ~ 9단
		
		for (int j=2; j<=9; j++) {
			System.out.println("==========");
			System.out.printf("    %d단\n", j);  
			System.out.println("==========");
			for (int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %2d\n", j, i, j*i);
			}
			System.out.println();
		}

	}

	public static void m9() {
		
		//제어문간의 중첩
		// - 종류에 상관없이, 깊이에 상관없이 가능하다.

		//for안의 for

		//2중 for문
		for (int i=0; i<10; i++) {
			//System.out.println("i for 실행==========");
			for (int j=0; j<10; j++) {
				//System.out.println("j for 실행");
				//루프 변수의 변화(***********************)
				System.out.printf("i : %d, j : %d\n", i, j);
			}			
		}


		//3중 for문
		for (int i=0; i<10; i++) { //시
			
			for (int j=0; j<60; j++) { //분
				
				for (int k=0; k<60; k++) { //초
					System.out.printf("i : %d, j : %d, k : %d\n", i, j, k);
				}

			}
		
		}


	}

	public static void m8() {
		
		//반복 횟수

		for (int i=0; i<10; i++) {
			
			System.out.println(i);
			//실행 블럭안에서 루프 변수를 수정하면 반복 횟수에 영향을 미친다.(주의)
			// -> 비권장
			//i--;
			
		}

		//for (int i=0; i<10; i--) {
		//	System.out.println(i);
		//}

		//무한 루프 - 의도적으로 생성
		//for (;;) {
		//	System.out.println("안녕");
		//}

		//for (int i=1;;i++) {
		//	System.out.println(i);
		//}

		for (int i=1;; i++) {
			System.out.println(i);

			//게임을 종료하겠습니까?
			if (i == 10) {
				break;
			}

		}


	}

	public static void m7() {
	
		//for + break, continue
		
		//break 문
		// - 자기 자신이 포함된 제어문을 탈출
		// - 단, if문은 제외

		//continue 문
		// - 하던일을 멈추고 반복문의 시작으로 이동해라
		// - 단, if문은 제외

		//for (int i=1; i<=10; i++) {
		for (int i=0; i<10; i++) {
			
			//break;
			//continue;

			if (i == 5) {
				//break;
				continue;
			}

			System.out.println(i);

		}


		//요구사항] 학교. 담임 선생님 -> (번호순)학생 상담
		// 1 ~ 30번
		for (int i=1; i<=30; i++) {
			
			//15번 학생까지만 상담
			//if (i > 15) {
			//	break;
			//}

			//10번 결석
			if (i == 10 || i == 15) {
				continue;
			}

			System.out.printf("%d번 학생 상담중..\n", i);

		}


	}


	public static void m6() {
	
		//요구사항] 임의의 숫자 10개를 발생시켜 그합을 출력
		//임의의 숫자 : (의사)난수
		// -> 난수 생성기(기능)

		//0(포함) ~ 1(미포함) 사이 소수

		//1 ~ 10사이의 난수
		for (int i=0; i<10; i++) {
			//System.out.println((int)(Math.random() * 10) + 1);
			System.out.println((int)(Math.random() * 5) + 3);
		}


		Random rnd = new Random();

		System.out.println(rnd.nextInt()); //임의의 int 값
		System.out.println(rnd.nextInt(10)); // 0(포함) ~ 10(미포함)

		int sum = 0;

		for (int i=0; i<10; i++) {
			//sum += rnd.nextInt(100) + 1; //1 ~ 100
			//System.out.println(rnd.nextInt(100) + 1);
			int temp = rnd.nextInt(100) + 1;
			sum += temp;
			System.out.println(temp);
		}		

		System.out.println(sum);

	}


	public static void m5() throws Exception  {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		//요구사항] 사용자가 10개의 입력 -> 총합 출력

		//누적 변수
		int sum = 0;

		for (int i=0; i<10; i++) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());
			sum += num;//누적
		}

		System.out.println(sum);

	}

	public static void m4() {
		
		//반복문 -> 누적
		//요구사항] 1 ~ 10까지의 총합?
		
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10

		//누적값을 저장하기 위한 누적 변수 생성
		//누적 변수는 반드시 초기화를 해야 한다.
		int sum = 0;

		for (int i=1; i<=10; i++) {
			sum = sum + i;
			//sum += i;
		}

		System.out.println(sum);



		//지역 변수의 초기화
		// - 제어문에 의해서 분기가 생기기 때문에 분기 중 일부가 지역 변수를 초기화하지 못하는 경우가 발생할 수 있다. -> 에러 발생
		// - 미리 예측이 힘들기 때문에 아예 미리 초기화를 하고 사용을 한다.
		// - 초기값
		//		a. 정수 : 0
		//		b. 실수 : 0.0
		//		c. 문자 : \0 -> 맘대로
		//		d. 문자열 : ""
		//		e. 논리 : false
		int n = 0;

		if (sum > 0) {
			n = 100;
		}

		System.out.println(n);

	
	}

	public static void m3() {
		
		//구구단. 5단.
		int dan = 5;

		//5 x 1 = 5
		//5 x 2 = 10
		//..
		//5 x 9 = 45

		for (int i=1; i<=9; i++) {
			
			System.out.printf("%d x %d = %2d\n", dan, i, dan * i);

		}
		
	}

	public static void m2() {

		//반복 -> 루프(Loop)
		//int i : 루프 변수
		
		//반복문을 사용하는 이유
		//1. 실행 코드를 반복하기 위해
		//2. 루프 변수의 값을 사용하기 위해(***)

		//요구사항] 1 ~ 10까지 출력
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println();


		for (int i=5; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println();



		for (int i=-3; i<=3; i++) {
			System.out.println(i);
		}
		System.out.println();



		for (int i=1; i<=10; i=i+2) {
			System.out.println(i);
		}
		System.out.println();


		for (int i=2; i<=10; i=i+2) {
			System.out.println(i);
		}
		System.out.println();


		for (int i=7; i<=60; i=i+7) {
			System.out.println(i);
		}
		System.out.println();



		for (int i=10; i>0; i--) {
			System.out.println(i);
		}
		System.out.println();



	}

	public static void m1() {
		
		//int i=0; 초기식(정수형 변수 생성 + 초기화)
		//i<10; 조건식(비교,논리 연산자 or 논리형 변수)
		//i++; 증감식

		for (int j=0; j<10; j++) {
			System.out.println("안녕하세요.");
		}

		//System.out.println(i);

		int i = 0;

		for (i=0; i<10; i++) {
			System.out.println("반갑습니다.");
		}

		System.out.println(i);

	}

}
