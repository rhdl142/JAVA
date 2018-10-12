class Ex27_while {
	public static void main(String[] args)	{

		//Ex27_while.java
		/*
		
		while문 + do while문
		- for문 유사
		- 조건에 따라 반복할 지를 제어하는 반복문(조건문 : boolean)

		while (조건문) {
			실행 코드;
		}

		*/

		//숫자 1 ~ 10까지 출력
		for (int i=1; i<=10; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();


		int n = 1;
		while (n <= 10) {
			System.out.print(n + "\t");
			n++;
		}
		System.out.println();


		//누적값이 1000을 넘으면 중단
		int sum = 0;

		for (int i=1; sum<1000; i++) {
			sum += i;
			//if (sum >= 1000) {
			//	break;
			//}
		}
		System.out.println(sum);

		sum = 0;
		n = 1;

		while (sum < 1000) {
			sum += n;
			n++;
			//if (sum >= 1000) {
			//	break;
			//}
		}
		System.out.println(sum);


		/*
		
		do while문

		while (조건문) 
		{
			실행코드;
		}

		do 
		{
			실행코드;
		}
		while (조건문);
		
		*/

		n = 100;

		do {
			System.out.println(n);
			n++;
		} while (n <= 10);


	}
}
