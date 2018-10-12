import java.io.IOException;

class Ex15_Method {

	//main 메소드
	// - 특별한 메소드
	// - main() 호출~
	// - 프로그램이 시작되자 마자 가장 처음으로 자동으로 호출되는 메소드(JRE,VM 이 호출)
	// - 프로그램 시작점(Start Point) ~ 프로그램 종착점(End Point)
	// - main : 예약어


	public static void main(String[] args)	{
		
		//Ex15_Method.java

		//메소드, Method
		// - 코드의 집합
		// - 특정 행동을 목적으로 하는 코드들의 집합
		// - 행동(Behavior)
		// - 반복(**)되는 코드의 집합 -> 코드 재사용

		//메소드 만들어야 하는 경우
		//1. 같은 성격의 코드가 모여 있는 경우 > 코드 가독성
		//2. 같은 성격의 코드가 2번 이상 호출되는 경우 > 메소드 재사용(코드 재사용)

		//요구사항] "안녕하세요." x 5번 출력
		//유지보수, 수정사항] "반갑습니다."
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");

		

		//요구사항] "안녕하세요." x 5번 출력
		//유지보수, 수정사항] "반갑습니다."

		//메소드 선언하기 + 메소드 호출하기
		hello();
		hello();
		hello();
		hello();
		hello();

		
		m1();
		m2();

		m3("하하하");
		m3("호호호");

		//m3();
		//m3(100);
		

		m5(10, 20);
		//m5();
		//m5(10);
		//m5(10, 20, 30); //실인자

		int a = 100;
		m6(a);
		m6(100);

		byte b = 10;
		m6(b); // int = byte

		long c = 20;
		m6((int)c); // int = long


		System.out.println(m7());

		int result = m7();
		System.out.println(result);


		int age = 25;

		String result2 = checkAge(age);
		System.out.println(result2);



		System.out.println(100);
		System.out.printf("숫자 : %d", 100);

		try {
			int num = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		
	}//main

	//메소드 선언하기
	public static void hello() { //메소드 헤더, 메소드 형식
		//메소드 바디, 코드 집합 -> 명령어 집합 -> 구현부
		System.out.println("안녕하세요~");
	}

	//메소드 선언하기
	//접근지정자 정적키워드 반환자료형 메소드명(인자 리스트) {
	//		구현코드;
	//}
	public static void hi() {
		
	}

	//인자가 없는 메소드 선언
	public static void m1() {
		System.out.println("홍길동님 안녕하세요.");
	}

	public static void m2() {
		System.out.println("아무개님 안녕하세요.");
	}

	//메소드 인자
	// - Parameter, Argument, 매개변수, 인자
	// - 매개변수는 (선언 할 때의 자료형과 갯수) == (호출 할 때의 자료형과 갯수)
	// - 인자를 활용해서 행동의 범위를 넓힌다.
	// - 메소드 헤더 == 메소드 시그너처(Signature)

	public static void m3(String name) {
		//String name = "하하하";
		System.out.println(name + "님 안녕하세요.");
	}

	//m4(100);
	public static void m4(int n) {
	
	}

	public static void m5(int a, int b) { //가인자
		System.out.println(a + b);
	}

	public static void m6(int num) {
		System.out.println(num);
	}

	//반환 자료형
	// - 메소드를 호출한 뒤에 돌려받는 값. 결과값
	// - return문
	// - void : return을 사용 안한다는 키워드
	// - null : 실제 공간의 값을 나타내는 자료형 상수 중 하나
	public static int m7() {
		
		//return 10;
		//return "홍길동";
		//return (int)10.0;

		//return 10, 20;
		return 10;

	}

	//나이를 전달하면 '성년' or '미성년' 이라는 단어를 반환하는 메소드
	public static String checkAge(int age) {

		String result = (age >= 19) ? "성년" : "미성년";

		return result;

	}



}//Ex14_Class
