class Ex12_Casting {
	public static void main(String[] args)	{

		//Ex12_Casting.java

		//정수형끼리 형변환

		byte b1;
		short s1;
		int n1;
		long l1;

		//암시적 형변환
		b1 = 10; //원본

		s1 = b1;
		n1 = b1;
		l1 = b1;

		System.out.printf("s1 : %d\n", s1);
		System.out.printf("n1 : %d\n", n1);
		System.out.printf("l1 : %d\n", l1);

		//명시적 형변환
		l1 = 1000;

		n1 = (int)l1;
		s1 = (short)l1;
		b1 = (byte)l1;
		
		System.out.printf("s1 : %d\n", s1);
		System.out.printf("n1 : %d\n", n1);
		System.out.printf("b1 : %d\n", b1);

		
		b1 = (byte)10;
		s1 = (short)10;
		n1 = 10;
		l1 = (long)10;

		
		//실수형

		float f1;
		double d1;

		f1 = 1.23F; //원본

		d1 = f1;

		System.out.printf("d1 : %.2f\n", d1);

		d1 = 3.21; //원본

		f1 = (float)d1;

		System.out.printf("f1 : %.2f\n", f1);



		//다른 자료형끼리 형변환
		int n2;
		double d2;

		n2 = 123; //원본

		d2 = n2;

		System.out.println(d2); //변수를 실수로 형변환
		System.out.println((double)321); //상수를 실수로 형변환
		System.out.println(321D);
		System.out.println(321.0);


		d2 = 123.656;

		n2 = (int)d2;

		System.out.println(n2);


		//char(정수형)
		// - char는 정수형 자료형과의 형변환만 지원한다.(byte(x), short(x), int, long(x))
		// - char는 실수형 자료형과는 형변환을 지원 안한다.

		char m;
		int code;

		m = 'A';

		code = m;

		System.out.println();
		System.out.println(code);

		//문자 코드값
		// - A(65), B(66), C(67) .. Z(90)
		// - a(97) ~ z(122)
		// - 0(48) ~ 9(57)
		// - 가(44032) ~ 힣(55203)
		System.out.println((int)'A');
		System.out.println((int)'Z');
		
		System.out.println((int)'a');
		System.out.println((int)'z');
		
		System.out.println((int)'0');
		System.out.println((int)'9');
	
		System.out.println((int)'\r'); //13
		System.out.println((int)'\n'); //10
		System.out.println((int)'\t'); //9
		System.out.println((int)'\b'); //8

		System.out.println((int)'가');
		System.out.println((int)'힣');


		System.out.println((char)65);


		//
		byte b3;
		short s3;
		int n3;
		long l3;

		char c3;

		c3 = '가';

		b3 = (byte)c3; //1byte = 2byte
		s3 = (short)c3; //2byte = 2byte
		n3 = c3;
		l3 = c3;

		System.out.println(b3);
		System.out.println(s3);
		System.out.println(n3);
		System.out.println(l3);



		//
		long l4;
		float f4;
		double d4;

		f4 = 100F;
		d4 = 200D;

		//long(8byte) = float(4byte)
		//l4 = f4;

		//long(8byte) = double(8byte)
		//l4 = d4;


		//자료형 크기(X), 데이터 범위(O) <- 형변환
		// byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		// 정수 < 실수


		int total = 10 + 20 + 37;
		double avg = (double)total / 3;

		System.out.println(avg);

	}
}
