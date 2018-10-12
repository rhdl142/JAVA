//클래스 임포트
//import 패키지명.클래스명;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Ex10_BufferedReader {
	public static void main(String[] args) throws Exception {
		//Ex10_BufferedReader.java
		//사전 작업
		//1. throws Exception
		//2. 클래스 임포트, Class Import

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		/*
		System.out.println("문자를 입력하세요."); //Label
			
		//reader //입력 도구
		String txt = reader.readLine(); //System.in.read() 동일 행동

		System.out.println(txt);
		
		/ *
		주석..
		* /
		txt = reader.readLine();
		System.out.println(txt);


		//이름을 입력하면.. 인사를 해주는 프로그램
		System.out.print("이름 입력 : ");

		String name = reader.readLine();

		System.out.printf("안녕하세요. %s님~\n", name);
		 */
		


		//요구사항] 태어난 년도를 입력받아 나이를 출력하시오.
		//조건] 현재 : 2018년

		System.out.print("태어난 년도 : ");

		String data = reader.readLine();

		//System.out.println(2018 - data); //2018 - "1995"

		//문자열(숫자) -> 숫자(숫자) : 변환 작업
		//Short.parseShort("100");
		//Byte.parseByte("100");
		//Long.parseLong("100");
		//Float.parseFloat("3.14");
		//Double.parseDouble("3.14");
		//Boolean.parseBoolean("true");
		int year = Integer.parseInt(data);//"1995" -> 1995

		//System.out.println(2018 - year);
		System.out.printf("태어난 년도가 %s년이면 나이는 %d세입니다.\n"
										, data, 2018 - year);


		//BufferedReader 사용
		//입력
		//"문자열" -> (그대로) -> "문자열"
		//"문자열" -> parseXXX() -> 숫자
		//"문자열" -> ? -> 문자

		String data2 = reader.readLine(); //"a" -> 'a'
		char c = data2.charAt(0);

	}
}
