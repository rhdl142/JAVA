class Ex06_Escape {
	public static void main(String[] args)	{
		
		//Ex06_Escape.java

		//Escape Sequence, 특수문자, 제어문자..
		// - 특정한 행동을 하도록 미리 약속되어 있는 문자(char)

		//1. \n
		// - new line
		// - 개행 문자
		// - 행을 바꿔라(= 엔터)

		String txt1 = "안녕하세요. \n\n\n홍길동님";
		System.out.println(txt1);

		//2. \r
		// - carriage return
		// - 키보드(Enter)
		// - 현재 캐럿(커서)의 위치를 현재 라인의 맨 처음로 이동해라
		// - \r\n : 현재 엔터값
		String txt2 = "하나둘셋넷\r\n다섯여섯";
		System.out.println(txt2);

		//3. \b
		// - backspace(<-)
		String txt3 = "0123456789\b";
		System.out.println(txt3);

		//4. \t
		// - tab
		// - 탭문자 ?
		String txt4 = "홍길동\t님 안녕하세요";
		System.out.println(txt4);

		//5. \", \', \\
		// - ", ', \ : 이미 역할이 있는 문자들..

		//고객 요구 사항]
		// - 화면에 < "안녕하세요." 라고 말했다. > 출력해 주세요
		String txt5 = "\"안녕하세요.\" 라고 말했다.";
		System.out.println(txt5);

		//현재 수업하고 있는 폴더의 위치를 출력하시오.
		// - C:\Class\Java
		System.out.println("C:\\Class\\Java");



		//-----------------------------------

		//숫자형 데이터를 조작할 때 주의할 점(*****)
		// - 데이터를 산술 연산을 할 게 아니면 반드시 문자열 취급

		//주민등록번호 앞자리 : 931205

		int jumin1 = 931205;
		System.out.println(jumin1);


		//자바의 정수 리터럴 표현법 + 기수법
		//1. 10진수 -> 10
		//2.   8진수 -> 12 //리터럴 0으로 시작
		//3. 16진수 -> 10 //리럴 0x 시작
		

		jumin1 = 010512; //-> 4426
		System.out.println(jumin1);

		String jumin2 = "010512";
		System.out.println(jumin2);

	}
}
