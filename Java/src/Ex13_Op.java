class Ex13_Op {
	public static void main(String[] args)	{

		//Ex13_Op.java

		//연산자, Operator
		// - 피연산자(Operand)를 대상으로 미리 정해진 연산(계산,행동)을 한 후에 결과값을 반환하는 역할(기호로 표현)

		int sum;

		sum = 1 + 2 * 3 - 1;

		//System.out.println(sum);


		//1. 산술 연산자
		// - +, -, *, /, %(mod, 나머지)
		// - 피연산자의 갯수 : 2개 -> 이항 연산자

		int a = 10;
		int b = 3;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);//3?
		System.out.println(a % b);

		//3.3333333
		//정수 / 정수 = 정수
		//실수 / 실수 = 실수
		//실수 / 정수 = 실수
		//정수 / 실수 = 실수
		System.out.println(10 / 3); 
		System.out.println(10.0 / 3.0);
		System.out.println((double)a / (double)b); 
        
        System.out.println(10.0 / 3);
		System.out.println((double)a / b); 


		int n1, n2, n3;

		n1 = 2100000000;
		n2 = 2100000000;

		n3 = n1 + n2;

		System.out.println(n3);
		System.out.println((long)n1 + n2);

		//모든 산술 연산자는 연산 결과의 타입을 피연산자 2개 중 더 큰 자료형으로 반환한다.(******)



        //2. 비교 연산자
		// - >, >=, <, <=, ==(equal), !=(not equal)
		// - 피연산자들의 비교 우위를 반환하는 역할
		// - 이항 연산자
		// - 연산의 결과를 항상 boolean으로 반환
		// - 피연산자는 숫자형
		// - 피연산자들은 서로 자료형이 동일해야 한다.(형변환 가능하면 달라도 된다.)

		int c = 10;
		int d = 5;

		System.out.println(c > d);
		System.out.println(c >= d);
		System.out.println(c < d);
		System.out.println(c <= d);
		System.out.println(c == d);
		System.out.println(c != d);


		//문자형(숫자)
		char c1 = 'B'; //66
		char c2 = 'C'; //67

		System.out.println(c1 < c2);

		char c3 = '가';

		System.out.println((int)'a' <= (int)c3);
		System.out.println((int)'z' >= (int)c3);

		System.out.println('a' <= c3);
		System.out.println('z' >= c3);

		System.out.println(1.5 > 1);



		//자바는 boolean을 다른 형으로 형변환할 수 없다.
		//System.out.println(100 > true);

		//참조형 - String
		// - 문자열은 비교 연산이 불가능하다.
		// - 단, ==, != 사용이 가능하다.(절대 사용하면 안된다!!! X)
		// - ==, != -> equals() 메소드 제공
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍";
		s3 = s3 + "길동";

		//System.out.println(s1 > s2);
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));



		//3. 논리 연산자
		// - &&(and), ||(or), !(not)
		// - 피연산를 가지고 특정 규칙에 따라 정해진 결과값을 반환
		// - &&, || : 이항 연산자
		// - ! : 단항 연산자
		// - 피연산자는 반드시 boolean
		// - 연산의 결과로 boolean을 반환한다.
		
		boolean b1 = true;
		boolean b2 = false;

		System.out.println(b1 && b2); //T && F = F 
		System.out.println(b1 || b2); //T || F = T
		System.out.println(!b1); // !T = F

		//논리연산의 피연산자 타입 -> boolean <- 비교 연산자의 결과
		// -> 논리 연산 + 비교 연산
		//요구사항] 나이 제한 : 19세 이상 ~ 60세 미만

		int age = 75;

		//System.out.println(19 <= age < 60);
		System.out.println(19 <= age && age < 60);
        System.out.println((19 <= age) && (age < 60));


		//쇼핑몰(red, blue, yellow, white)
        String color = "black"; //주문 색상

		System.out.println(color.equals("red") || color.equals("blue") || color.equals("yellow") || color.equals("white")); //재고 색상



		System.out.println(19 <= age && age < 60); //가독성 낮음
		System.out.println(age >= 19 && age < 60); //가독성 높음

		
		//4. 대입(할당) 연산자
		// - =
		// - +=, -=, *=, /=, %= //복합 대입 연산자
		// - LValue(변수) = RValue(상수, 변수)
		// - 이항 연산자
		// - LValue와 RValue의 자료형이 반드시 동일 -> 형변환 때문..
		// - 모든 연산자를 통틀어 연산자 우선 순위가 가장 낮다.(문장내에서 가장 마지막으로 실행)
		// - 연산자 결합 방향(순서)이 오른쪽 -> 왼쪽 실행
		
		//int sum = 1 + 2 + 3;

		int p1 = 10;
		int p2;
		int p3;

		p2 = p1;
		p3 = p1;

		p3 = p2 = p1;



		// +=
		int num = 10;
		
		//누적
		num = num + 1;
		System.out.println(num); //11

		num += 1;
		System.out.println(num); //12

		num -= 1;
		num = num - 1;
		System.out.println(num); //10

		num *= 2;
		num = num * 2;
		System.out.println(num); //40

		num /= 3;
		num = num / 3;
		System.out.println(num); //4

		num %= 3;
		num = num % 3;
		System.out.println(num);



		num = 100 - num;
		num -= 100;

		

		//5. 증감 연산자
		// - ++(증가), --(감소)
		// - 단항 연산자
		// - 피연산자의 값을 +1, -1
		// - 연산의 결과가 피연산자(원본)에게 영향을 미친다.
		// - 연산자 우선 순위가 가장 높다. : 전위 배치(++num)
		// - 연산자 우선 순위가 가장 낮다. : 후위 배치(num++)

		num = 10;
		
		++num;
		num = num + 1;
		num += 1;

		System.out.println(num);

		boolean flag = false;
		flag = !flag;
		System.out.println(flag);


		num = 10;

		--num;

		System.out.println(num);


		
		
		int result = 0;
		num = 10;

		//result = 20 + num;
		//result = 20 + ++num;
		//result = 20 + num++;

		//result = 20 + ++num;
		++num;
		result = 20 + num;

		//result = 20 + num++;
		result = 20 + num;
		num++;


		System.out.println("result = " + result);
		System.out.println("num = " + num);


		int o = 10;
		System.out.println(--o-o--);


		
		//6. 조건 연산자
		// - A ? B : C
		// - 삼항 연산자
		// - A : boolean
		// - B, C : 상수 or 변수 or 표현식 -> 값
		// - B와 C는 자료형이 동일해야 한다.
		// - 조건 연산자(if문 역할 유사)

		age = 10;

		//변수 = true ? 10 : 20;

		String msg = (age >= 19) ? "성인" : "미성년자";

		System.out.println(msg);


	
		byte t1 = 10;
		byte t2 = 20;
		byte t3 = (byte)(t1 + t2);
		System.out.println(t3);
	}
}










