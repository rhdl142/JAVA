import java.io.BufferedReader;
import java.io.InputStreamReader;

class Ex14_Error {
	public static void main(String[] args) throws Exception 	{
		
		//Ex14_Error.java
		
		/*
		
		에러, Error
		- 오류, 버그(Bug), 예외(Exception)

		1. 컴파일 에러
		- 컴파일러가 발견
		- 컴파일 작업 시 발견
		- 컴파일러가 에러 메시지 출력
		- 난이도 낮음, 수정 쉬움
		- 문법 틀림
		- 이 에러가 발생하면 컴파일 중지 -> 실행 파일 생성 중지

		2. 런타임 에러
		- Rumtime : 프로그램 실행 중..
		- 컴파일 때 발견 X -> 실행 중 발견 O : 문법으로는 에러가 아님
		- 예외(Exception)
		- 발생 빈도 높음
		- 발견 어렵다. 수정 어렵다.
		- JRE(VM) : 에러 메시지 출력 + XXXException

		3. 논리 에러
		- 컴파일 O, 런타임 O, 결과?
		- 발견 가장 어렵다. 수정 가장 어렵다.
		- 에러 메시지가 없다.
		
		*/
		//int num

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(reader.readLine());

		System.out.println(100 / n);

		//System.out.println(10 - num++);
		

	}
}
