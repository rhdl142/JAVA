import java.util.Random;

class Ex29_Array {

	public static void main(String[] args)	{
		
		//Ex29_Array.java
		//Array, 배열
		// - 같은 자료형의 변수들을 여러개 모아놓은 집합
		// - 집합 자료형(참조형, Reference Type)
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();

		//m8(); //String
		//m9(); //StringBuilder
		
		//m10();
		//m11();
		//m12();
		//m13();
		m14();

	}//

	public static void m14() {

		//프로젝트 진행 시
		// - 임의의 다량의 데이터 필요 > 데이터 생성 프로그램 구현

		//회원 관리 프로그램
		// - 회원 정보
		//		a. 이름 : 문자열
		//		b. 나이 : 숫자
		//		c. 성별 : 숫자(1 - 남자, 2 - 여자)
		//		d. 주소 : 문자열

		//100명 -> 배열
		int count = 100;

		//회원 정보 저장소
		String[] name = new String[count];
		int[] age = new int[count];
		int[] gender = new int[count];
		String[] address = new String[count];
		
		//난수 생성기
		Random rnd = new Random();
		
		//이름을 만들기 위한 베이스 데이터
		String[] n1 = { "김", "이", "박", "최", "정", "한", "지", "임", "안", "조" };
		String[] n2 = { "대", "은", "창", "미", "준", "수", "영", "우", "진", "리", "인", "재", "하", "길", "동", "혁" };

		//System.out.println(n1[rnd.nextInt(n1.length)] + n2[rnd.nextInt(n2.length)] + n2[rnd.nextInt(n2.length)]);


		String[] a1 = { "서울시", "경기도", "인천시", "강원시", "전주시", "부산시" };
		String[] a2 = { "서대문구", "동대문구", "중구", "강서구", "강남구" };
		String[] a3 = { "역삼동", "대치동", "천호동", "길동", "풍납동" };


		for (int i=0; i<name.length; i++) {
			//100회
			//이름
			name[i] = n1[rnd.nextInt(n1.length)] + n2[rnd.nextInt(n2.length)] + n2[rnd.nextInt(n2.length)];

			//나이
			age[i] = rnd.nextInt(40) + 20;

			//성별
			gender[i] = rnd.nextInt(2) + 1;

			//주소
			address[i] = a1[rnd.nextInt(a1.length)] + " " + a2[rnd.nextInt(a2.length)] + " " + a3[rnd.nextInt(a3.length)] + " " + (rnd.nextInt(20) + 1) + "-" + (rnd.nextInt(20) + 1);
		}
		
		//출력
		for (int i=0; i<name.length; i++) {
			System.out.printf("%s\t%d\t%s\t%s\n"
											, name[i]
											, age[i]
											, gender[i] == 1 ? "남자" : "여자"
											, address[i]);
		}
		
	}
	

	public static void m13() {
		
		/*

		//배열 초기화
		// - 배열은 방을 만든 직후에 사용자가 직접 초기화를 하지 않더라도 자동으로 초기화가 된다.
		//		(모든 참조형의 특징. 단, 문자열 예외)
		// - 정수형 : 0
		// - 실수형 : 0.0
		// - 논리형 : false
		// - 문자형 : \0(null 문자)
		// - 참조형 : null


		//int num;
		//System.out.println(num);

		int[] nums = new int[5];
		System.out.println(nums[0]);

		double[] nums2 = new double[5];
		System.out.println(nums2[4]);

		boolean[] nums3 = new boolean[5];
		for (boolean b : nums3) {
			System.out.println(b);
		}

		String[] nums4 = new String[5];
		for (String s : nums4) {
			System.out.println(s);
		}
		//배열 초기화 : 생성자(Constructor)

		//배열 초기화 : 초기자(Initializer)
		String[] names = new String[5];
		
		names[0] = "홍길동";
		names[1] = "아무개";
		names[2] = "가가가";
		names[3] = "나나나";
		names[4] = "다다다";

		String[] names2 = new String[] { "홍길동", "아무개", "가가가", "나나나", "다다다" };

		int a = 10;

		int b;
		b = 10;
		
		String[] names3;
		names3 = new String[] { "홍길동", "아무개", "가가가", "나나나", "다다다" };

		//반드시 변수와 초기화 리스트를 한문장에 구현(***)
		String[] names4 = { "홍길동", "아무개", "가가가", "나나나", "다다다" };

		//아래 표현은 불가능
		String[] names5;
		names5 = { "홍길동", "아무개", "가가가", "나나나", "다다다" };


		int[] nums5 = { 10, 20, 30, 40, 50 };
		boolean[] nums6 = { true, false, false, true, false };

		*/
	}

	public static void m12() {

		//조건(if, swtich), 반복(for, while, do while, for), 분기(break, continue)	

		//향상된 for문
		// - Enhanced For Statement
		// - forEach문
		// - 배열을 대상으로 하는 반복문
		int[] nums = new int[5];

		nums[0] = 5;
        nums[1] = 7;
        nums[2] = 3;
        nums[3] = 1;
        nums[4] = 9;

		//배열 탐색 > 출력
		for (int i=0; i<nums.length; i++) {
			//System.out.println(nums[i]); //읽기
			nums[i] = nums[i] * 2; //쓰기
		}

		//향상된 for문
		// - 용도 : 읽기 전용 탐색(***)
		// - 배열의 방을 순차적으로 접근한다.
		//for (변수 : 배열) {
		//}
		for (int n : nums) {
			//System.out.println(n); //읽기
			n = n * 2; //쓰기
		}

		for (int n : nums) {
			System.out.println(n);
		}
        
	
	}


	public static void m11() {
		/*
		//배열의 복사(= 참조형의 복사. 단, 문자열 제외)
		// - 실제 배열의 복사가 아닌 참조 변수의 주소값 복사

		int a = 100; //원본
		int b; //복사본

		b = a;//복사

		a = 200; //원본(복사본) 수정
		System.out.println(b);


		int[] ns1 = new int[3]; //원본
		ns1[0] = 100;
		ns1[1] = 200;
		ns1[2] = 300;

		int[] ns2;// = new int[3]; //복사본

		//int[] = int[]
		ns2 = ns1;

		System.out.println(ns2[0]); //복사본 확인(복사 성공 유무)

		ns1[0] = 500; //원본 수정
		
		System.out.println(ns2[0]); //복사본 확인
	

		

		int m1;
		int[] m2 = new int[3];

		m1 = 100;

		//m2 = m1; //int[] = int
		m2[0] = m1; //int = int


		m1 = m2; //int = int[]


		char c = "a";

		String s = 'a';

		*/
	}


	public static void m10() {
		
		//배열의 길이는 불변이다.
		// - 한번 만든 방의 갯수는 절대로 수정할 수 없다.
		// -> 배열의 길이를 미리 예측!!!!!
		//int[] kor = new int[300];


		//동적 배열
		// - 컴파일 작업때는 배열의 길이가 미정, 런타임 작업때 배열의 길이가 결정.
		int count = 300;//사용자 입력 -> 학생수

		int[] kor = new int[count];

		System.out.println(kor.length);

	}

	public static void m9() {

		//StringBuilder
		System.out.println("StringBuilder 테스트");

		//시간 재기
		long start = System.currentTimeMillis();

		//업무
		StringBuilder txt = new StringBuilder("홍길동");//****

		for (int i=0; i<400000; i++) {
			txt.append(".");
		}

		//시간 재기
		long end = System.currentTimeMillis();

		//결과 출력
		System.out.printf("결과 : %,d자, 소요 시간 : %,dms\n"
											, txt.length()
											, end - start);
	}


	public static void m8() {

		//String
		System.out.println("String 테스트");

		//시간 재기
		long start = System.currentTimeMillis();

		//업무
		String txt = "홍길동";

		for (int i=0; i<400000; i++) {
			txt += ".";
		}

		//시간 재기
		long end = System.currentTimeMillis();

		//결과 출력
		System.out.printf("결과 : %,d자, 소요 시간 : %,dms\n"
											, txt.length()
											, end - start);
	}

	public static void m7() {
		
		//m6()의 행동을 업무 때문에 반드시 구현해야 하는 경우..
		//String -> StringBuilder

		int n1 = 10; //값형
		String s1 = "홍길동"; //참조형(예외)
		//String s2 = new String("홍길동"); //참조형 스타일로 생성
		StringBuilder s2 = new StringBuilder("홍길동"); //참조형(정석)

		//모든 참조형
		//Date d1 = new Date();


		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s1.length());
		System.out.println(s2.length());

		s1 = s1 + "님";
		//s2 = s2 + "님";//X
		s2.append("님");

		System.out.println(s1);
		System.out.println(s2);


	}

	public static void m6() {
		
		//자바에서 문자열을 대상으로 되도록 하면 안되는 행동
		
		//1. 크기가 큰 문자열을 수정
		String txt1 = "안녕하세요. 하나 둘 셋 넷안녕하세요. 하나 둘 셋 넷안녕하세요. 하나 둘 셋 넷안녕하세요. 하나 둘 셋 넷안녕하세요. 하나 둘 셋 넷안녕하세요. 하나 둘 셋 넷안녕하세요. 하나 둘 셋 넷안녕하세요. 하나 둘 셋 넷안녕하세요. 하나 둘 셋 넷";

		txt1 = txt1 + ".";//***

		//2. 잦은 문자열 수정

		String txt2 = "홍길동";

		for (int i=0; i<100; i++) {
			txt2 += ".";
		}

		System.out.println(txt2);
	
	}









	public static void m5() {
		
		//** 자바에서 문자열은 불변(immutable)이다.
		//** 자바에서 배열은 불변이다.
		//모든 값형
		int n1 = 10;
		int n2 = 10;

		System.out.println(n1 == n2);

		int n3 = 5;
		n3 = n3 + 5;
		
		System.out.println(n1 == n3);

		
		//모든 참조형(String)
		String s1 = "홍길동";
		String s2 = "홍길동";

		System.out.println(s1 == s2);//하면 안된다.(******)
		System.out.println(s1.equals(s2));

		String s3 = "홍";
		s3 = s3 + "길동";

		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
	}

	public static void m4() {
		
		//각 자료형으로 배열 선언

		//정수 배열
		byte[] list1 = new byte[3];
		list1[0] = 100;
		System.out.println(list1[0]);

		//실수 배열
		double[] list2 = new double[3];
		list2[0] = 3.14;
		System.out.println(list2[0]);

		//문자 배열
		String name = "홍길동";

		char[] list3 = new char[3];
		list3[0] = '홍';
		list3[1] = '길';
		list3[2] = '동';

		for (int i=0; i<list3.length; i++) {
			System.out.print(list3[i]);
		}
		System.out.println();

		
		//논리 배열
		boolean[] list4 = new boolean[3];
		list4[0] = true;
		System.out.println(list4[0]);

		//---------------------------

		//참조형 배열
		String[] list5 = new String[3];
		list5[0] = "홍길동";
        list5[1] = "아무개";

		System.out.println(list5[0]);

		//자바에서는 모든 자료형으로 배열을 만들 수 있다.(*****)
		// + 자료형으로 변수를 만들 수 있다.

		//BufferedReader[] reader = new BufferedReader[3];
        

	}

	public static void m3() {

		//int nums[] = new int[5];
		int[] nums = new int[5];

		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		nums[3] = 400;
		nums[4] = 500;

		//배열 탐색
		//루프 변수 -> 배열의 방번호(index)
		for (int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	
		//StringIndexOutOfBoundsException
		//ArrayIndexOutOfBoundsException(***********)
		//System.out.println(nums[-1]);
		//System.out.println(nums[5]);

		
	}

	public static void m2() {
		
		//요구사항] 학생 3명 > 국어 점수 > 총점, 평균
		//요구사항] 학생 300명

		//배열 사용
		// - 자료형[] 배열명(변수명) = new 자료형[길이];
		int[] kor = new int[300];
		
		kor[0] = 100;
		kor[1] = 90;
		kor[2] = 80;
		// + 297
	
		//int total = kor[0] + kor[1] + kor[2]; //+ kor[3] + kor[4] + .. + kor[299]
		int total = 0;
		
		for (int i=0; i<kor.length; i++) {
			total += kor[i];
		}

		double avg = total / (double)kor.length;

		System.out.printf("총점 : %d점, 평균 : %.1f\n", total, avg);



		int n1;
		int n2;
		int n3;

		int[] m = new int[3];

		for (int i=0; i<3; i++) {
			//ni
			//자바는 식별자를 조합해서 만들 수 가 없다.(****)
			m[i] = i;

		}

	}

	public static void m1() {
		
		//요구사항] 학생 3명 > 국어 점수 > 총점, 평균
		//요구사항] 학생 300명
		int kor1;
		int kor2;
		int kor3;
		// + 297

		kor1 = 100;
		kor2 = 85;
		kor3 = 70;
		// + 297

		int total = kor1 + kor2 + kor3; // + kor4 + kor5.. + kor300(+297)
		double avg = total / 3.0; //3.0 -> 300.0

		System.out.printf("총점 : %d점, 평균 : %.1f\n", total, avg);

	}

}
