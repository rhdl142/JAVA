package com.test.etc;

public class Ex95_RegularExpression {
	
	public static void main(String[] args) {
		
		//Ex95_RegularExpression.java
		
		/*
		
		정규 표현식, Regular Expression
		- 정규식
		- 패턴에 일치하는 문자열을 검색하는 표현식
		
		
		
		
		정규 표현식 구성 요소(문법)
		
		1. 모든 문자
			ex) "a" -> a, "test" -> test
			
		2. 모든 문자
			- .
			- wildcard(모든 문자)
			ex) "." -> 모든 문자를 검색
			ex) "..." -> 문자 3개
			ex) ".?.." -> 문자 2~3자
			ex) "a.." 
			ex) "a...d", "홍.?.동"  홍길동, 홍머길동, 홍머머동, 홍순동, 홍동, 홍머머머머동
			
			
		앞의 요소의 출현 횟수 지정
		
		3. 없음
			- 출현 횟수 : 1 ~ 1
			- 생략 불가능, 중복 불가능
			ex) "abc" -> abc
			ex) "ab?cd+e*" -> acddddddeeee
		
		4. ?
			- 출현 횟수 : 0 ~ 1
			- 생략 가능, 중복 불가능
			ex) "abc" -> abc
			ex) "a?bc" -> bc, abc
			ex) "홍?길동" -> 안녕하세요. 홍길동입니다. 그냥 길동이라고 불러주세요.
			ex) "(ab)?cd" -> cd, abcd, bcd
		
		5. +
			- 출현 횟수 : 1 ~ 무한대
			- 생략 불가능, 중복 가능
			ex) "a+bc" -> bc(x) -> abc, aabc, aaabc, aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc
		
		6. *
			- 출현 횟수 : 0 ~ 무한대
			- 생략 가능, 중복 가능
			ex) "a*bc" -> bc, abc, aabc, aaabc, aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc
		
		
		
		앞의 요소의 출현 횟수 지정+
		
		7. {n}
			- 고정 횟수 출현
			- n : 출현 횟수
			ex) "aaaaabc"
			ex) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc"
			ex) "a+bc"
			
			ex) "a{5}bc" -> ab, aab, aaabc, aaaabc, aaaaabc, aaaaaabc, aaaaaaaaabc
			ex) ".{10}"
		
		8. {n,}
			- n회 이상 ~ 무한대 출현		
			ex) "a{3,}bc"
			ex) "a.{3,}b"
		
		9. {n,m}
			- n회 이상 ~ m회 이하
			ex) "a{2,3}bc" -> aabc, aaabc
			
		
		선택
		
		10. [요소]
			- choice
			- [] 안에 나열된 요소 중 하나를 선택
			ex) "[abc]" -> a or b or c -> a, b, c
			ex) "[abc]de" -> ade, bde, cde
			ex) "[김이박최정홍]길동" -> 김길동, 이길동, 박길동, 최길동, 정길동, 홍길동
			ex) "[김이박최정홍]?길동" -> 길동, 김길동, 이길동
			ex) "[(010)(011)(016)(017)(019)]-4567-8900" ->  010-4567-8900, 019-4567-8900, 02-4567-8900 //보류
			
			- 숫자만 검색
			ex) "[0123456789]{2,4}"
			
			- 주민번호 검색
				: 숫자6자리-숫자7자리
				ex) "[0123456789]{6}-[0123456789]{7}"
						930101-1010101
			
			- 홀수로만 되어 있는 숫자 검색
				ex) "[93751]{2,3}"
			
			- 전화번호(휴대폰) 검색
				: 숫자3자리-숫자3~4자리-숫자4자리
				ex) "[0123456789]{3}-[0123456789]{3,4}-[0123456789]{4}"
				
			- 영소문자 검색
				ex) "[abcdefghijklmnopqrstuvwxyz]{3,10}"
				
			- 영대문자 검색
				ex) "[ABCDEFGHIJKLMNOPQRSTUVWXYZ]"
			
			- 영어와 숫자의 조합으로만 되어 있는 단어 검색
				ex) "[ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789]{3,10}
			
			//범위 표현(-) : 중간에 빠진 문자가 없어야 하고, 문자코드값 순서대로 배치
			- [0123456789] -> [0-9] (O)
			- [012389] -> [0-9] (X)
			- [34567] -> [3-7] (O)
			
			- [abcdefghijklmnopqrstuvwxyz] -> [a-z]
			- [ABCDEFGHIJKLMNOPQRSTUVWXYZ] -> [A-Z]
			
			- 영어와 숫자의 조합으로만 되어 있는 단어 검색
				ex) "[A-Za-z0-9]{3,10}"
				
			- 한글만 검색
				ex) "[가-힣]{5}"
			
			- 자바에서 주로 사용하는 식별자를 검색
			- 회원 가입 : 아이디 입력
				: 영문자 + 숫자 + _
				: 4자 ~ 12자 이내
				: 숫자로 시작 X
				
				ex) "[A-Za-z_][A-Za-z0-9_]{3,11}"
				ex) test123 (O),  hong (O), 123test (X), te (X), hong1234567890 (X),  $hong (X)
				
			
		11. 공백
			- \s
			ex) "[홍김박]\s?길동"
				홍길동, 이길동, 박길동, 최길동
				홍 길동, 이 길동, 박 길동, 최 길동
		
			ex) "\s[A-Z][A-Za-z0-9_]{2,}\s"
			
			
		12. 줄임
			- [0-9] -> \d
			ex) [0-9]{3}-[0-9]{3,4}-[0-9]{4}
			ex) \d{3}-\d{3,4}-\d{4}
			
			- [A-Za-z0-9_] -> \w
			ex) \d{3,10}
			
		
		정규 표현식 예제 사이트
			- http://regexlib.com
			ex) \w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}
			
			
			 
		test@test.com
		
		
		
		
		
		
		요구사항] member.dat에서 전화번호만 가져오시오.
		
		[member.dat]
		홍길동		010-8645-7353		서울시 강남구
		아무개		010-2342-4321		서울시 강동구
		테스트		010-6542-2343		서울시 강서구
		하하하		010-2343-2342		서울시 강북구
		호호호		010-4565-2343		서울시 강남구
		
		[member.dat]
		홍길동		010-8645-7353		서울시 강남구		서울시 강남구
	010-2342-4321		아무개			서울시 강동구
		테스트		010-6542-2343 하하하	서울시 강서구
			안녕하세요. 제 전화번호는	010-2343-2342입니다.		서울시 강북구
		호호호		010-4565-2343
		
		
		
		*/
	}

}
















