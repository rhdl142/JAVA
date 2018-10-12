import java.io.*;

class Ex28_String {

	public static void main(String[] args) throws Exception {
		
		//Ex28_String.java

		//문자열, String
		// - 문자의 집합
		// - 참조형
		// - 자바에서 문자열 데이터를 조작/제어하기 위한 기능들 제공
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		m11();
	}

	public static void m11() throws Exception {
		
		//특정 문자열의 포함 유무
		// - boolean contains(String keyword)

		String txt1 = "안녕하세요. 홍길동님";

		System.out.println(txt1.contains("홍길동"));

		if (txt1.indexOf("홍길동") > -1) {}
		if (txt1.contains("홍길동")) {}

	}

	public static void m10() throws Exception {
		
		//문자열 치환
		// - 대상 문자열에서 특정 문자열을 찾아서 다른 문자열 바꾸기
		// - String replace(String old, String new)
		String txt1 = "안녕하세요. 홍길동님";
		
		System.out.println(txt1.replace("홍길동", "아무개"));
		System.out.println(txt1.replace("하하하", "아무개"));

		String txt2 = "지금 시간은 Java 수업입니다. java는 총 160시간을 수업합니다. JAVA는 아주 중요한 과목입니다.";

		//java -> 자바
		String keyword = "java";

		String result = txt2.toLowerCase().replace(keyword.toLowerCase(), "자바");
		System.out.println(result);


		//게시판
		String content = "글내용입니다. 어쩌구 저쩌구~~ 바보야";
		String word = "바보";

		if (content.indexOf(word) > -1) {
			//금지어 발견
			System.out.println("금지어 발견. 글쓰기 중단");
		} else {
			System.out.println("글쓰기 진행..");
		}

		//금지어 사용X -> 글쓰기 진행O -> **
		System.out.println(content.replace(word, "**"));


		//주민번호 입력 -> '-' 필수 입력
		//주민번호 입력 -> '-' 쓰던지.. 말던지.. 맘대로..

		String jumin = "950713-1234567";
		
		System.out.println(jumin.replace("-", ""));//삭제

		/*
		int index = jumin.indexOf("-");

		if (index > -1) {
			//'-' 제거
			jumin = jumin.substring(0, index) + jumin.substring(index + 1);
		}

		System.out.println(jumin);
		
		*/
		

		String txt3 = "    하나    둘     ";

		System.out.println(txt3.trim());
		System.out.println(txt3.replace(" ", ""));


		//red, yellow, blue -> 한글 출력
		String txt4 = "yellow";

		if (txt4.equals("red")) {
			System.out.println("빨강");
		} else if (txt4.equals("yellow")) {
			System.out.println("노랑");
		} else if (txt4.equals("blue")) {
			System.out.println("파랑");
		}
	
		System.out.println(txt4
											.replace("red", "빨강")
											.replace("yellow", "노랑")
											.replace("blue", "파랑")
		);

	}

	public static void m9() throws Exception {

		//문자열 추출
		// - char charAt(int index)
		// - String substring(int start, int end)
		//		: start(inclusive), end(exclusive)
		// - String substring(int start)
		// - indexOf와 같이 많이 사용
		String txt1 = "안녕하세요. 홍길동입니다.";

		System.out.println(txt1.substring(3, 8));
        System.out.println(txt1.substring(3, 4)); //'세'(x), "세"(o)
        
		
		String jumin = "950713-2948573";

		System.out.println(jumin.charAt(7) == '2');
		System.out.println(jumin.substring(7, 8).equals("2"));

		//몇년생?
		System.out.println("19" + jumin.substring(0, 2));


		//아래의 데이터내에서 '홍'씨 성을 가진 사람 이름을 알아내시오.(3글자)
		String data = "안녕하세요. 자바 수업중입니다. 하하하 호호호 하하하하 호호 제 이름은 홍길동입니다.";

		String keyword = "홍";

		int index = data.indexOf(keyword);

		String name = data.substring(index, index + 3);

		System.out.println(name);


		//전체 경로
		//C:\Class\Java\Ex28_String.java
		String path = "C:\\Class\\Java\\Ex28_String.java";

		//1. 파일명?
		index = path.lastIndexOf("\\"); //마지막 \의 위치
		//String filename = path.substring(index + 1, path.length()); 
		String filename = path.substring(index + 1);
		System.out.println(filename);

		//2. 확장자?
		index = filename.lastIndexOf(".");
		String extension = filename.substring(index); //.java
		System.out.println(extension);

		//3. 확장자를 뺀 파일명?
		String filename2 = filename.substring(0, index);
		System.out.println(filename2);





	}

	public static void m8() throws Exception {
		
		//(패턴) 검색
		// - boolean startsWith(String txt)
		// - boolean endsWith(String txt)
		String name = "홍길동";

		//이름이 "홍"씨 인지?
		System.out.println(name.startsWith("홍")); //가독성 높음. 활용도 낮음
		System.out.println(name.charAt(0) == '홍'); //가독성 낮음. 활용도 높음
		System.out.println(name.indexOf("홍") == 0); //가독성 낮음. 활용도 높음


		//전화번호 입력
		// - "010"으로 시작 or "011" 가능
		String tel = "011-8765-4321";

		if (tel.startsWith("010") || tel.startsWith("011")) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}

		//이름이 '동'으로 끝납니까?
		name = "홍길동";
		System.out.println(name.endsWith("동"));
		System.out.println(name.endsWith("개"));
		System.out.println(name.charAt(name.length()-1) == '동');
		System.out.println(name.lastIndexOf("동") == name.length() - 1);


		//해당 파일이 이미지입니까?
		String file = "dog.jpg"; //gif, jpg, jpeg, png

		if (file.endsWith(".gif") || file.endsWith(".jpg") || file.endsWith(".jpeg") || file.endsWith(".png")) {
			System.out.println("이미지");
		} else {
			System.out.println("다른 포맷");
		}



	}

	public static void m7() throws Exception {
		
		//대문소자 변환
		// - String toUpperCase()
		// - String toLowerCase()
		String txt1 = "Hello Hong";

		System.out.println(txt1.toUpperCase());
		System.out.println(txt1.toLowerCase());

		//
		txt1 = "우리가 배우고 있는 언어는 Java입니다.";

		String word = " java ";

		//1. 처음 조건 : 검색 정확도가 높음
		//2. 수정 조건 : 검색율이 높음. 정확도는 떨어짐.
		if (txt1.toUpperCase().indexOf(word.toUpperCase().trim()) > -1) {
			System.out.println("검색 결과 있음");
		} else {
			System.out.println("검색 결과 없음");
		}

	}

	public static void m6() throws Exception {
		
		//문자열 검색
		// - 사용 빈도 높음
		// - 문자열내에서 원하는 문자(문자열)을 검색 -> 발견된 위치 반환
		// - int indexOf(char c)
		// - int indexOf(String s) **
		// - int indexOf(char c, int fromIndex)
		// - int indexOf(String s, int fromIndex) **
		// - int lastIndexOf(char c)
		// - int lastIndexOf(String s) **
		// - int lastIndexOf(char c, int fromIndex)
		// - int lastIndexOf(String s, int fromIndex) **
		

		String txt1 = "안녕하세요. 홍길동입니다.";

		int result1 = txt1.indexOf('홍');
		System.out.println(result1);

		result1 = txt1.indexOf("홍길동");
		System.out.println(result1);
				
		result1 = txt1.indexOf("아무개");
		System.out.println(result1);

		if (result1 > -1) {
			System.out.println("발견 O");
		} else {
			System.out.println("발견 X");
		}



		txt1 = "안녕하세요. 하하하하하하하 홍길동입니다. 제 이름은 홍길동입니다.";

		//처음 발견되는 검색어의 위치를 반환(그 다음 검색어는 찾지 못함)
		result1 = txt1.indexOf("홍길동");
		System.out.println(result1);//7
		
		result1 = txt1.indexOf("홍길동", result1 + "홍길동".length());
		System.out.println(result1);


		System.out.println(txt1.lastIndexOf("홍길동"));


	}

	public static void m5() throws Exception {
		
		//공백 제거
		// - String trim()
		// - 원본 문자열의 공백을 제거하고 난 뒤 공백 제거된 문자열 반환
		// - 원본은 건드리지 않는다.(*******)
		// - 문자열의 시작과 끝의 연속된 공백 문자를 제거(**)

		String txt1 = "     하나     둘					  셋		    ";

		System.out.printf("[%s]\n", txt1);
		System.out.printf("[%s]\n", txt1.trim());


	}

	public static void m4() throws Exception {

		//주민 등록 번호 입력 > 반드시 '-'를 기입
		String jumin = "950713-20274351";

		if (jumin.charAt(6) == '-') {
			System.out.println("올바른 주민번호");
		} else {
			System.out.println("올바르지 않은 주민번호");
		}

		if (jumin.charAt(7) == '1') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}


		//사용자 입력값이 영문 소문자로만 구성?
		String id = "test2";

		//System.out.println((int)id);
		//System.out.println((int)'t');
		//System.out.println((int)'e');
		//System.out.println((int)'s');
		//System.out.println((int)'t');

		boolean flag = false;

		for (int i=0; i<id.length(); i++) {
			
			char c = id.charAt(i);
			//System.out.println(c);
			
			//if (c >= 'a' && c <= 'z') {
			//	System.out.println("사용 가능");
			//} else {
			//	System.out.println("사용 불가능");
			//}

			//유효성 검사는 대부분 올바르지 않는 조건을 검사한다.
			//t3e홍s4t
			if (c < 'a' || c > 'z') {
				//잘못된 문자
				System.out.println("아이디를 영소문자로만 사용하세요.");
				flag = true;
				break;//for 탈출
			}

		}

		//추가 업무 진행..
		if (!flag) {
			System.out.println("계속 진행..");
		} else {
			System.out.println("진행 중단..");
		}

		
		
	}

	public static void m3() throws Exception {
		
		//문자열 추출
		// - char charAt(int index)
		// - 문자열내의 특정 위치에 있는 문자 1개를 추출
		// - 자바는 Zero-based Index를 사용한다.

		String txt1 = "홍길동님. 안녕하세요.";
		//StringIndexOutOfBoundsException
		char c = txt1.charAt(txt1.length()-1);// 0 ~ 8
		System.out.println(c);

		for (int index=0; index<txt1.length(); index++) {
			System.out.println("문자 : " + txt1.charAt(index));
		}

	}

	public static void m2() throws Exception {
		
		//회원가입 > 이름 입력 > 이름을 2자~5자 이내로 적어주세요.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("이름 입력(2~5자) : ");

		String name = reader.readLine();

		if (name.length() >=2 && name.length() <= 5) {
			System.out.println("회원 가입 진행..");
		} else {
			System.out.println("이름 입력(2~5자)");
		}

	}

	public static void m1() throws Exception {
		
		//문자열의 길이
		// - 문자열을 구성하는 문자의 갯수
		// - int length()
		String txt1 = "abcdefg";
		System.out.println(txt1.length());

		//한글, 영어, 특수문자 등등 상관없이 자바 문자당 1개로 취급
		String txt2 = "안녕하세요. 홍길동님.";
		System.out.println(txt2.length());

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("문장 입력 : ");
		String txt3 = reader.readLine();
		System.out.printf("입력한 문장은 총 %d글자로 되어있습니다.\n", txt3.length());

	}


}
