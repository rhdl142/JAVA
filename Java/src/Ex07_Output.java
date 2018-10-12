class Ex07_Output {
	public static void main(String[] args)	{

		//Ex07_Output.java

		//콘솔 입출력, Input Output, IO
		// - 기본 입력 장치 : 키보드
		// - 기본 출력 장치 : 모니터
		// - 기본 에러 장치 : 모니터

		//콘솔 출력
		//1. print 메소드
		// - 출력 후 개행 안함
		
		//2. println 메소드
		// - print line
		// - 출력 후 개행 함

		//3. printf 메소드(***)
		// - print format
		// - 미리 정해진 **형식 문자**를 통해서 내용을 출력
		// - 형식 문자
		//		a. %s : String
		//		b. %d : Decimal -> 정수(byte, short, int, long)
		//		c. %f : Float -> 실수(float, double)
		//		d. %c : Char
		//		e. %b : Boolean

		System.out.print("하나");
		System.out.println(100);
		System.out.print(true);
		System.out.print('\n');
		System.out.print('A');

		//요구사항]
		// - 홍길동에게 인사하세요.
		String name = "홍길동";
	
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("안녕하세요. 홍길동님");
		System.out.println("안녕하세요. " + name + "님");
		System.out.printf("안녕하세요. %s님\n", name);

		// -> 안녕하세요. 홍길동님. 잘가세요. 홍길동님.
		System.out.println("안녕하세요. " + name + "님. 잘가세요. " + name + "님.");
		System.out.printf("안녕하세요. %s님. 잘가세요. %s님.\n", name, name);

		
		//성적 출력
		String name1 = "홍길동";
		int kor1 = 100;
		int eng1 = 90;
		int math1 = 80;

        String name2 = "아무개";
		int kor2 = 88;
		int eng2 = 93;
		int math2 = 78;
		System.out.println();
		System.out.println();
		System.out.println("=======================================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[평균]");
		System.out.println("=======================================");

		System.out.println(name1 + "\t" + kor1 + "\t" + eng1 + "\t" + math1
											+ "\t" + ((kor1 + eng1 + math1) / 3.0));

		System.out.printf("%s\t%d\t%d\t%d\t%f\n"
								, name2, kor2, eng2, math2, ((kor2 + eng2 + math2) / 3.0));

        
		
		//Oracle + JDBC -> SQL
		//insert into tblBoard (seq, id, title, date, count) values (10, 'hong', '게시판입니다.', '2018-07-05', 100);

		int seq = 10;
		String id = "hong";
		String title = "게시판입니다.";
		String date = "2018-07-05";
		int count = 100;

		System.out.println("insert into tblBoard (seq, id, title, date, count) values (" + seq + ", '" + id + "', '" + title + "', '" + date + "', " + count + ");");

		System.out.printf("insert into tblBoard (seq, id, title, date, count) values (%d, '%s', '%s', '%s', %d);\n", seq, id, title, date, count);




	}
}
