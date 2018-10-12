class Ex26 {

	public static void main(String[] args)	{
		//Ex26.java

		//기준점 1.1.1 -> 월요일
		//System.out.println(total);//736887
		//System.out.println(total % 7); //요일
		
		//System.out.println(isLeafYear(2018));
		//System.out.println(isLeafYear(2016));
		//System.out.println(isLeafYear(2017));
		//System.out.println(isLeafYear(2000));

		System.out.println(getTotalDay(2018, 7, 12));
		System.out.println(getTotalDay(2018, 12, 31));
		System.out.println(getTotalDay(2018, 12, 31) - getTotalDay(2018, 7, 12));

	}//main

	//메소드명
	//1. setXXX() : 값을 대입. 쓰기
	//2. getXXX() : 값 반환. 읽기
	//3. isXXX() : 진위 판단. 반환값 boolean
	public static boolean isLeafYear(int year) {
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}

	}//

	public static int getTotalDay(int year, int month, int date) {
		
		//1.1.1 ~ 2018.7.12
		//int year = 2018;
		//int month = 7;
		//int date = 12;
		int total = 0; //누적(총 며칠)

		//1. 1.1.1 ~ 2017.12.31
		for (int i=1; i<year; i++) {
			total += 365;
			if (isLeafYear(i)) {
				total++;
			}
		}

		//2. 2018.1.1 ~ 2018.6.30
		for (int i=1; i<month; i++) {
			switch(i) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					total += 31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					total += 30;
					break;
				case 2:
					total += isLeafYear(year) ? 29 : 28;
					break;
			}
		}


		//3. 2018.7.1 ~ 2018.7.12
		total += date;


		return total;
	}


}
