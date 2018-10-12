class Ex19_Method {
	public static void main(String[] args)	{

		//Ex19_Method.java

		//요구사항] 2개의 int값을 넘기면 -> 서로 교환해서 출력 메소드
		//요구사항] 2개의 String값을 넘기면 -> 서로 교환해서 출력 메소드
		int a = 10;
		int b = 20;

		swap(a, b);

		swap("홍길동", "아무개");

	}//main

	public static void swap(int a, int b) {

		//원본
		System.out.printf("a : %d, b : %d\n", a, b);

		//교환
		int temp;

		temp = a;
		a = b;
		b = temp;

		//확인
		System.out.printf("a : %d, b : %d\n", a, b);

	}

	public static void swap(String a, String b) {

		//원본
		System.out.printf("a : %s, b : %s\n", a, b);

		//교환
		String temp;

		temp = a;
		a = b;
		b = temp;

		//확인
		System.out.printf("a : %s, b : %s\n", a, b);

	}

}
