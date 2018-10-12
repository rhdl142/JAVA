class Ex05_Variable {
	public static void main(String[] args)	{
		
		//int 6hour;
		//int $value;

		//Ex05_Variable.java

		//자료형
		// - 변수 생성 -> 값 대입 -> 호출


		// = 연산자
		// - LValue = RValue
		// - LValue의 자료형과 RValue 자료형은 반드시 일치해야 한다.

		//byte
		byte b1; //변수
		b1 = 10;  //10 : 정수형 상수(= 정수형 리터럴, Literal)
		//b1 = 1000;
		System.out.println(b1);

		//short
		short s1;
		s1 = 1000;
		s1 = -32768;
		System.out.println(s1);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);

		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);

		//Util Class, Wrapper Class
		//byte -> Byte
		//short -> Short
		//int -> Integer
		//long -> Long
		//float -> Float
		//double -> Double
		//char -> X
		//boolean -> Boolean

		//int
		int n1 = 100;
		System.out.println(n1);

		//long
		long l1 = 100;
		System.out.println(l1);


		b1 = 10;
		s1 = 10;
		n1 = 10;
		l1 = 10;

		l1 = 2200000000L; //Long
		System.out.println(l1);

		
		int n2 = 10;
		int n3;
		
		n3 = n2;



		//실수형
		float f1;
		f1 = 3.14F;
		f1 = 1.23456789012345567890123456789F;
		System.out.println(f1);

		double d1;
		d1 = 1.2345D;
		d1 = 1.23456789012345567890123456789D;
		System.out.println(d1);


		//char
		char c1;
		c1 = '김'; //문자형 상수, 문자형 리터럴
		c1 = 'A';
		c1 = '0';
		//c1 = 'AB';
		System.out.println(c1);


		//boolean
		boolean flag;
		flag = true;
		flag = false;
		System.out.println(flag);


		//String
		// - 문자열
		// - char 집합

		char name1 = '홍';
		char name2 = '길';
		char name3 = '동';

		String name;
		name = "홍길동";

		System.out.println(name);


		//byte, short, int, long -> int
		//float, double -> double
		//char -> char
		//boolean -> boolean
		//String -> String

		//char var3 = '';
		//System.out.println(var3);

		String var3 = ""; //빈문자열, Empty String
		System.out.println(var3);

		
		//예제
		//1. 주변의 데이터 찾기
		//2. 적당한 자료형 선택
		//3. 변수 생성
		//		- 변수명 반드시 의미있게!!!!!!!!
		//		- 해당 타입의 상수 표현
		//4. 출력
		//		- 문장 출력

		byte studentCount;

		studentCount = 30;

		System.out.println("우리반 학생은 " + studentCount + "명입니다.");

		//예제
		// - 각 자료형 별(9개) x 10개 이상

		//DataType.java



	}
}
