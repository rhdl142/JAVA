import java.io.*;

class Ex24_switch {

	public static void main(String[] args) throws Exception {

		//Ex24_switch.java
		/*
		
		switch문

		switch (조건) {
			case 값:
				실행코드;
				break;
			[case 값:
				실행코드;
				break;] x n
			[default:
				실행코드;
				break;]
		}
		
		*/

		int n = 2;

		//조건 -> 데이터
		switch (n) {
			case 1:
				System.out.println("하나");
				break;
			case 2:
				System.out.println("둘");
				break;
			case 3:
				System.out.println("셋");
				break;
		}
		

		String color = "white";

		switch (color) {
			case "red": //case 값: <- Label
				System.out.println("빨강");
				break;
			case "yellow":
				System.out.println("노랑");
				break;
			case "blue":
				System.out.println("파랑");
				break;
			default:
				System.out.println("알 수 없는 색상");
				break;
		}


		//switch문의 조건은 정수값만 사용 가능
		/*
		boolean flag = true;

		switch (flag) {
			case true:
				System.out.println("참");
				break;
			case false:
				System.out.println("거짓");
				break;
		}
		*/

	
		//자동 판매기
		//음료 선택 -> 가격 표시

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("=======================");
		System.out.println("        자판기");
		System.out.println("=======================");
		System.out.println("1. 콜라");
        System.out.println("2. 사이다");
        System.out.println("3. 비타500");
		System.out.println("=======================");
		System.out.print("음료 선택(번호) : ");

		String num = reader.readLine();

		switch (num) {
			case "1":
			case "2":
				System.out.println("700원입니다.");
				break;
			case "3":
				System.out.println("500원입니다.");
				break;
		}
		

		//쇼핑몰 + 옵션 선택
		//1. 카메라 + 메모리 + 삼각대
		//2. 카메라 + 메모리
		//3. 카메라

		int option = 1;

		switch (option) {
			case 1:
				//System.out.println("카메라");
				//System.out.println("메모리");
				System.out.println("삼각대");
				//break;
			case 2:
				//System.out.println("카메라");
				System.out.println("메모리");
				//break;
			case 3:
				System.out.println("카메라");
				break;
		}


        


	}

}
