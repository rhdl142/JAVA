class Ex20_Method {
	public static void main(String[] args)	{

		//Ex20_Method.java

		//재귀 메소드, Recursive Method
		// - 메소드가 자기 자신을 호출하는 구조의 메소드
		// - 파일/폴더(디렉토리) 구조를 제어할 때 사용
		// - 트리 구조 자료형을 탐색할 때..

		//m1();

		//팩토리얼
		//4! = 4 x 3 x 2 x 1
		//4! = 24

		int n = 4;
		int result = factorial(n);
		
		System.out.printf("%d! = %d\n", n, result);

	}//main
	
	public static int factorial(int n) {

		int temp = (n == 1) ? 1 : n * factorial(n - 1);

		return temp;
	}

	public static void m1() {
		//업무
		System.out.println("업무 진행 중..");

		m1();//재귀 호출
	}
}







