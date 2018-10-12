//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.*; //wildcard

class Ex22_if {
	public static void main(String[] args) throws Exception {

		//Ex22_if.java

		/*
		
		제어문
		- 프로그램 코드의 실행 순서 제어하는 역할

		1. 조건문
			a. if 문
			b. switch 문(switch case 문)
		2. 반복문
			a. for
			b. while
			c. do while
			d. for(Enhanced for, 향상된 for -> forEach)
		3. 분기문
			a. break
			b. continue
			c. goto(X)

		

		if문
		- 조건을 제시한 후 결과에 따라 실행할 코드를 선택 제어
		- 조건은 반드시 boolean값을 가진다.
		- A ? B : C

		
		if (조건식) {
			실행문;
		} //if block

		
		if (조건식) {
			실행문;
		} else {
			실행문;
		}

		//중첩 if문
		if (조건식) {
			실행문;
			실행문;
			if (조건식) {
			} else {
			}
			실행문;
		} else {
			실행문;
			if (조건식) {
			}
		}


		if (조건식) {
			실행문;
		} else if (조건식) {
			실행문;
		} else if (조건식) {
			실행문;
		} else {
			실행문;
		}




		if (조건식) {
			실행문;
		} else if (조건식) {
			실행문;
		} else if (조건식) {
			실행문;
		}


		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("숫자 : ");
		int num = Integer.parseInt(reader.readLine());
		
		/*
		if (num > 0) {
			System.out.println("양수");
		}
		*/
		
		/*
		if (num > 0) {
			System.out.println("양수");
		} else {
			System.out.println("음수");
		}
		*/
		
		/*
		if (num > 0) {
			System.out.println("양수");
		} else {
			if (num < 0) {
				System.out.println("음수");
			} else {
				System.out.println("0");
			}
		}
		*/

		if (num > 0) {
			System.out.println("양수");
		} else if (num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}

		System.out.println("프로그램 종료");
	}
}
