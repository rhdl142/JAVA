class Ex09_Input {
	public static void main(String[] args) throws Exception {

		//Ex09_Input.java

		//콘솔 입력
		// - 사전 작업
		//		1. main메소드 옆에 throws Exception 기재

		//1. System.in.read() 메소드
		// - 바이트 단위의 입력 도구(1byte 단위)

		//2. BufferedReader 클래스
		// - 문자 단위의 입력 도구(2byte 단위)

		//3. Scanner 클래스
		// - 문자 단위의 입력 도구(2byte 단위)

		//요구사항] 사용자에게 문자를 1개 입력받아서 화면에 그대로 출력하시오.

		//사용자로부터 문자 입력
		int data = System.in.read(); //입력 대기, 잠시 멈춤, 블럭 걸렸다..

		System.out.println(data);
		System.out.println((char)data);
		//System.out.printf("%c\n", data);

		data = System.in.read();
		System.out.println(data);
		
		data = System.in.read();
		System.out.println(data);

		data = System.in.read();
		System.out.println(data);

		data = System.in.read();
		System.out.println(data);

		System.out.println("끝");
		


	}
}

















