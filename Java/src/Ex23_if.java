import java.io.*;//* : all

class Ex23_if {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		//m1(reader);
		//m2(reader);
		//m3(reader);
		//m4(reader);
		m5();

	}

	public static void m5() {

		//조건문 사용 시 주의점(권장)

		int age = 15; //사용자 나이 입력


		if (age >= 19 && age < 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}


		if (age < 19 || age >= 60) {
			System.out.println("불합격");
		} else {
			System.out.println("합격");
		}


		//조건식
		// - 자바에서는 조건식이 반드시 boolean값을 가져야 한다.

		//boolean 대신하는 다른 자료형
		// - 정수 : 0(false), 1(true).. 0이 아닌 모든 숫자(true)
		// - 실수 : 0.0(false), 그 이외 숫자(true)
		// - 문자 : \0(false), 그 이외 문자(true)
		// - 문자열 : ""(false), 그 외의 문자열(true)
		int num = 0;

		if (num==0) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}

	}

	public static void m1(BufferedReader reader) throws Exception {
		
		System.out.print("숫자 : ");
		
		int num = Integer.parseInt(reader.readLine());
		
		if (num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

	}
	
	public static void m2(BufferedReader reader) throws Exception {
		
		//요구사항] 나이 입력 -> 원하는 나이대?
		System.out.print("나이 : ");
		int age = Integer.parseInt(reader.readLine());

		if (age >=19 && age < 60) {
			System.out.println("통과");
		} else {
			System.out.println("거절");
		}

		if (age >=19 && age < 60) {
			System.out.println("통과");
		} else {
			if (age < 19) {
				System.out.println("거절 - 어려서");
			} else {
				System.out.println("거절 - 많아서");
			}
		}

		if (age >=19 && age < 60) {
			System.out.println("통과");
		} else if (age < 19) {
			System.out.println("거절 - 어려서");
		} else if (age >= 60) {
			System.out.println("거절 - 많아서");
		}

	}

	public static void m3(BufferedReader reader) throws Exception {
		
		//문자 1개 입력 -> 영소문자?
		System.out.print("문자 : ");
		String input = reader.readLine(); //"ABC"
		
		char c = input.charAt(0);

		//System.out.println((int)input);
		//System.out.println((int)c);

		//if (c >= 'a' && c <= 'z') {
		//if (c >= 'A' && c <= 'Z') {
		//if (c >= '0' && c <= '9') {
		//if (c >= '가' && c <= '힣') {
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || (c >= '가' && c <= '힣')) {
			System.out.println("소문자 O");
		} else {
			System.out.println("소문자 X");
		}

	}

	public static void m4(BufferedReader reader) throws Exception {

	}
}
