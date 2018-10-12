class Ex18_Method {
	public static void main(String[] args)	{

		//Ex18_Method.java
		// - 메서드, 메소드

		//메소드 오버로딩, Method Overloading
		// - 같은 이름의 메소드를 여러개 선언하는 기술

		//메소드 오버로딩 조건 O
		//1. 인자의 갯수
		//2. 인자의 타입

		//메소드 오버로딩 조건 X
		//1. 인자의 이름
		//2. 반환값의 타입
		
		//메소드 호출(사용)
		//test(); //1.
		//test(10); //3.
		//test("홍길동");
		//test(10, 20);

		//test(10);
		//int result = test(10);

		//메소드 선언
		//1. public static void test() {} //O
		//2. public static void test() {} //X(1)
		//3. public static void test(int a) {} //O
		//4. public static void test(int b) {} //X(3)
		//5. public static void test(String a) {}; //O
		//6. public static void test(int a, int b) {}; //O
		//7. public static int test(int a) {} //X(3)
		
		//m1();

		//요구 사항] 두개의 데이터 전달 -> 더해서 출력하는 메소드
		// - int, int
		// - double, double
		// - String, String
		// - byte, byte
		// - short, short..
		// - int, float
		// - String, byte..

		sum(10, 20);
		//sum((int)3.5, (int)2.3);
		sum(3.5, 2.3);
		sum("홍", "길동");


		System.out.println(100);
		System.out.println(true);
		System.out.println("홍길동");

	}//main()

	public static void println(int a) {
	}

	public static void println(boolean a) {
	}

	public static void println(String a) {
	}

	public static void sum(int a, int b) {
		System.out.printf("%d + %d = %d\n", a, b, a + b);
	}

	public static void sum(double a, double b) {
		System.out.printf("%.1f + %.1f = %.1f\n", a, b, a + b);
	}

	public static void sum(String a, String b) {
		System.out.printf("%s + %s = %s\n", a, b, a + b);
	}
	
	/*
	public static void m1() {
		System.out.println("하나");
	}

	public static void m1() {
		System.out.println("둘");
		System.out.println("셋");
	}
	*/



}
