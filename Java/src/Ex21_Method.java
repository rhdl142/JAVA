class Ex21_Method {
	public static void main(String[] args)	{

		//Ex21_Method.java
		// - return

		//m1();
		m2();
	}

	public static int m2() {
		
		boolean flag = true;

		if (flag) {
			return 10;
		}

		return 20;

	}

	public static void m1() {

		System.out.println("하나");

		boolean flag = true;

		if (flag) {
			System.out.println("둘");
			return; //빈 리턴문
		}

		System.out.println("셋");

	}
}
