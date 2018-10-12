import java.util.Date;
import java.util.Calendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Ex17_DateTime {

	public static void main(String[] args) throws Exception {

		//Ex17_DateTime.java
		
		//자바의 시각(시간) 데이터
		// - 클래스
		// 1. Date 클래스
		// 2. Calendar 클래스(***)

		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		m7();

	} //main()

	public static void m7() {
		
		//시각 - 시각
		//시각 + 시간
		//시각 - 시간
		//시간 + 시간
		//시간 - 시간

		//2시간 30분 
		int hour = 2;
		int min = 30;

		//2시간 30 + 40분
		min += 40;

		//2시간 70분 -> 3시간 10분
		hour += min / 60; //몫
		min = min % 60;//나머지

		System.out.printf("%d시간 %d분\n", hour, min);

	}

	public static void m6() {
		
		//시각 - 시각 = 시간
		//tick
		// - 1970-01-01 00:00:00 기준 ~ 누적 값

		//특정 시각의 틱
		Calendar now = Calendar.getInstance();
		//Calendar -> (형변환) -> Date
		Date nowDate = now.getTime();
		long nowTick = nowDate.getTime();
		System.out.println(nowTick);//1531184957299


		//현재 시각의 틱
		System.out.println(System.currentTimeMillis());


		//내 생일
		Calendar birthday = Calendar.getInstance();
		birthday.set(Calendar.YEAR, 1995);
		birthday.set(Calendar.MONTH, 9);
		birthday.set(Calendar.DATE, 20);

		//메소드 체이닝
		long birthdayTick = birthday.getTime().getTime();
		System.out.println(birthdayTick);

		//내가 태어난지 몇일째?
		System.out.println((nowTick - birthdayTick) / 1000 / 60 / 60 / 24);


		//올해 크리스마스가 몇일?
		Calendar christmas = Calendar.getInstance();
		//christmas.set(Calendar.YEAR, 2018);
		christmas.set(Calendar.MONTH, 11);
		christmas.set(Calendar.DATE, 25);
		christmas.set(Calendar.HOUR, 0);
		christmas.set(Calendar.MINUTE, 0);
		christmas.set(Calendar.SECOND, 0);

		long christmasTick = christmas.getTime().getTime();

		System.out.printf("올해 크리마스는 %d일 남았습니다.\n"
										, getDay(nowTick, christmasTick));
		
	}

	public static int getDay(long begin, long end) {

		return (int)((end - begin) / 1000 / 60 / 60 / 24);
	}



	public static void m5() {
		
		//연산
		//시각 + 시간
		// - void add(int field, int value)
		Calendar now = Calendar.getInstance();

		//100일?
		now.add(Calendar.DATE, 100);
		System.out.printf("%tF\n", now);

		//200일?
		now.add(Calendar.DATE, 100);
		System.out.printf("%tF\n", now);

		//리셋(현재 시각)
		now = Calendar.getInstance();

		now.add(Calendar.HOUR, 2);
		now.add(Calendar.MINUTE, 45);
		
		System.out.printf("%tT\n", now);

		
		
		//시각 - 시간
		now = Calendar.getInstance();

		now.add(Calendar.DATE, -100);
		System.out.printf("%tF\n", now);


	}

	public static void m4() {
	
		//날짜 & 시간 데이터 출력 > 형식 문자 제공(printf)
		Calendar now = Calendar.getInstance();

		//출력
		System.out.printf("%tF\n", now);
		System.out.printf("%tT\n", now);
		System.out.printf("%tA\n", now);
		System.out.printf("%tR\n", now);
		System.out.printf("%tr\n", now);

	}

	public static void m3() {
	
		//Calendar 생성
		//1. 현재 시각 얻어오기
		//2. 특정 시각 얻어오기(1 -> (수정) -> 내가 원하는 시각으로 만들기)
		// - void set(int, int)

		//내 생일(1995, 4, 10)
		Calendar birthday = Calendar.getInstance();
		birthday.set(Calendar.YEAR, 1995);
		birthday.set(Calendar.MONTH, 3);
		birthday.set(Calendar.DATE, 10);

		System.out.printf("제 생일은 %d년 %d월 %d일입니다.\n"
										, birthday.get(Calendar.YEAR)
										, birthday.get(Calendar.MONTH) + 1
										, birthday.get(Calendar.DATE));

	}

	public static void m1()  throws Exception  {
		//첫번째 예제
		//시스템 시각 얻어오기
		
		int n1 = 10;
		Date d1 = new Date();

		System.out.println(n1);
		System.out.println(d1); //2018-07-09 16:35:40

		//여러가지 업무 계속 진행(10초 소요)
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		reader.readLine();

		System.out.println(d1); //2018-07-09 16:35:50

	}
	
	public static void m2() {
		//두번째 예제
		//시스템 시각을 얻어오기
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);

		//c1 : 많은 값들이 모인 집합
		//집합에서 일부 원하는 값만 추출이 가능
		// - int get(int field)
		System.out.println(c1.get(1));
		System.out.println(c1.get(2));
		System.out.println(c1.get(3));
		System.out.println(c1.get(4));
		System.out.println(c1.get(5));

		int yearFlag = 1;
		System.out.println(c1.get(yearFlag));

		//캘린더 상수
		System.out.println(Calendar.YEAR);//변수
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DATE);
		System.out.println(Calendar.HOUR);
		System.out.println(Calendar.HOUR_OF_DAY);
		System.out.println(Calendar.MINUTE);
		System.out.println(Calendar.SECOND);
		System.out.println(Calendar.MILLISECOND);
		System.out.println(Calendar.DAY_OF_WEEK);
		System.out.println(Calendar.AM_PM);


		System.out.println(c1.get(Calendar.YEAR));//2018
		System.out.println(c1.get(Calendar.MONTH));//월(0~11)
		System.out.println(c1.get(Calendar.DATE));//10
		System.out.println(c1.get(Calendar.HOUR));//9(12H)
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));//9(24H)
		System.out.println(c1.get(Calendar.MINUTE));//분
		System.out.println(c1.get(Calendar.SECOND));//초
		System.out.println(c1.get(Calendar.MILLISECOND));//밀리초
		System.out.println(c1.get(Calendar.DAY_OF_WEEK));//요일(1~7)
		System.out.println(c1.get(Calendar.AM_PM));//0(오전), 1(오후)

		//오늘은 2018년 7월 10일입니다. 현재 시간은 9시 17분 30초입니다.
		Calendar now;
		now = Calendar.getInstance();
	
		System.out.printf("오늘은 %d년 %d월 %d일입니다. 현재 시간은 %s %d시 %d분 %d초입니다."
			, now.get(Calendar.YEAR)
			, now.get(Calendar.MONTH) + 1
			, now.get(Calendar.DATE)
			, now.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
			, now.get(Calendar.HOUR)
			, now.get(Calendar.MINUTE)
			, now.get(Calendar.SECOND));
		
	}
}
