class Ex04_Variable {
	public static void main(String[] args)	{
	
		//Ex04_Variable.java

		//변수, Variable
		// - 자료형을 사용해서 얻어내는 메모리의 공간
		// - 값(데이터)를 저장하는 용도(입출력)

		//1. 변수 선언하기
		// - 자료형 변수명;
		byte kor;

		//2. 변수 초기화
		// - 변수 = 값;
		// - = : 대입(할당) 연산자
		// - LValue = RValue : RValue를 LValue에 넣는다.
		kor = 100;

		//3. 변수 사용(출력)
		System.out.println(kor);
		//System.out.println(1000);

		//4. 변수 치환
		kor = 90;

		System.out.println(kor);
		//System.out.println(1000);

		
		//byte kor; //변수 선언하기
		//int kor;

		//Ex04_Variable.java:31: error: variable kor is already defined in method main(String[])
        //        int kor; //변수 선언하기
        //            ^


		//변수 만드는 방법
		//수학 점수
		byte math;
		//영어 점수
		byte eng;
		byte aaa; //수학 점수
		byte bbb; //영어 점수

		byte m1, m2, m3; //국어, 영어, 수학

		byte n1;
		n1 = 100;

		//byte n2 = 200;

		byte k1 = 10,		//aaa
			k2 = 20,			//bbb
			k3 = 30,			//ddd
			k4,					//ee
			k5,					//ff
			k6 = 60;			//gg

		//kor <> Kor
		int Kor; //쓰면 안된다.(****)
		int kOr;
		int koR;
		int KOr;
		//..


		
		//자바는 null값의 변수를 사용할 수 없다.
		byte jumsu; //null

		//jumsu = 300;



		//System.out.println(jumsu);

		byte out;
		byte println;


		//개인적..
		//에러 메시지 노트


		//변수명 명명법
		//1. 영문자 + 숫자 조합
		//2. 특수문자 '_'
		//3. 숫자로 시작 X
		//4. 예약어 사용 불가
		//byte byte;

		//변수명 명명법 패턴
		//1. 헝가리언 표기법
		// - 자료형을 식별자에 넣는 방법
		// 사용) 인터페이스명
		//		interface IEmployee {}
		int inum;
		int int_num;
		int i_num;
		int iNum;

		//2. 파스칼 표기법
		// - 식별자가 한 단어 혹은 여러 단어로 조합
		// - 모든 단어를 공백없이 연결(_ 사용X)
		// - 각단어의 첫문자만 대문자 표기, 나머지 문자는 소문자 표기
		// 사용) 클래스명

		byte korscore;
		byte KorScore; //파스칼 표기법

		//3. 카멜 표기법
		// - 식별자가 한 단어 혹은 여러 단어로 조합
		// - 모든 단어를 공백없이 연결(_ 사용X)
		// - 각단어의 첫문자만 대문자 표기, 나머지 문자는 소문자 표기
		// - 첫단어의 첫문자는 소문자 표기
		// 사용) 메소드명, 변수명

		byte engscore;
		byte EngScore;
		byte engScore;


		//4. 스네이크 표기법
		byte eng_score;












	}
}
