class Ex11_Casting {
	public static void main(String[] args)	{

		//Ex11_Casting.java

		//형변환, 자료형 변환, Type Casting
		// - A라는 자료형을 B라는 자료형으로 바꾸는 작업
		// - (B)A; // () 형변환 연산자 A -> B

		//1. 암시적인 형변환
		// - 1칸 => 2칸
		// - 작은형 => 큰형
		// - 100% 안전

		byte b1 = -128; //원본
		short s1; //복사본

		//short = byte
		//큰형 = 작은형
		//암시적인 형변환
		s1 = b1;
		s1 = (short)b1;

		System.out.println(s1);


		//
		byte b2; //복사본
		short s2 = 10000; //원본

		//byte = short
		//작은형 = 큰형
		//명시적 형변환
		// - 원본 데이터가 복사본 자료형의 범위내에라면 안전하게 복사, 벗어나면 오류
		b2 = (byte)s2;

		System.out.println(b2);


		//은행 계좌
		int c1 = 2100000000; //기업은행

		short c2;//국민은행

		c2 = (short)c1;

		System.out.println("계좌 이체 결과 : " + c2);


		
	
	}
}
