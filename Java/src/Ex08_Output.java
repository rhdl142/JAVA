class Ex08_Output {
	public static void main(String[] args)	{
		
		//Ex08_Output.java
		
		//형식 문자 추가 기능
		//1. %숫자s
		// - 숫자만큼의 문자수 너비로 확보 + 출력(고정 너비 출력)
		// - 양수(우측 정렬), 음수(좌측 정렬)
		// - %s, %d, %f, (%c, %b)
		
		//2. %.숫자f
		// - 실수형만 사용 가능
		// - 소수이하 몇자리까지 출력?

		//3. %,d
		// - 숫자형(%d, %f)만 사용 가능
		// - 자릿수 표현(천단위 표기)

		String txt = "abc";

		System.out.printf("[%s]\n", txt);
		System.out.printf("[%10s]\n", txt);
		System.out.printf("[%-10s]\n", txt);

		System.out.printf("가격 : %5d원\n", 1000);
		System.out.printf("가격 : %5d원\n", 500);
		System.out.printf("가격 : %5d원\n", 12000);
		System.out.printf("가격 : %5d원\n", 100);
		System.out.printf("가격 : %5d원\n", 550);
		System.out.printf("가격 : %5d원\n", 10000000);

		double m = 1234.567890123456;

		System.out.println("실수 : " + m);
		System.out.printf("실수 : %.15f\n", m);

		m = 10;

		System.out.println("실수 : " + m);
		System.out.printf("실수 : %.0f\n", m);

		//int price = 10,000,000;

		System.out.printf("가격 : %d원\n", 10000000);
		System.out.printf("가격 : %,d원\n", 10000000);

		//위의 3가지를 모두 합쳐서..
		double price1 = 12.5;
		double price2 = 1200;
		double price3 = 520.3;

		System.out.printf("price : $%,7.1f\n", price1);
		System.out.printf("price : $%,7.1f\n", price2);
		System.out.printf("price : $%,7.1f\n", price3);


	}
}








