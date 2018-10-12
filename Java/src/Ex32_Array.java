class Ex32_Array {

	public static void main(String[] args)	{
		
		//Ex32_Array.java

		//m1();
		//m2();
		m3();
	}

	public static void m3() {
		
		int[] list1 = new int[10];

		//index 제어 연습 == 제어문 연습
		int n = 1;

		//for (int i=0; i<list1.length; i++) {
		//for (int i=0; i<list1.length; i+=2) {
		//for (int i=1; i<list1.length; i+=2) {
		for (int i=list1.length-1; i>=0; i--) {
			list1[i] = n;
			n++;
		}

		dump(list1);
		System.out.println();



		int[][] list2 = new int[5][5];

		n = 1;

		for (int i=0; i<5; i++) {
			for (int j=0; j<=i; j++) {
				list2[i][j] = n;
				n++;
			}
		}

		dump(list2);


	}

	public static void m2() {
		
		int[] list1 = { 10, 20, 30, 40, 50 };
		int[][] list2 = { { 10, 20, 30}, { 40, 50, 60 } };
		int[] list3 = { 5, 4, 3, 2, 1 };

		dump(list1);
		dump(list1);
		dump(list3);
		dump(list2);
		
		//list3 = list1;
		//list3 = list2[0];
	}

	public static void dump(int[] temp) {
		//배열의 요소가 어떤 값을 갖는지 잠시 확인 > 업무(X), 개발자(O)
		for (int i=0; i<temp.length; i++) {
			System.out.printf("%5d", temp[i]);
		}
		//temp[0] = 1000;
		System.out.println();
	}

	public static void dump(int[][] temp) {
		for (int i=0; i<temp.length; i++) {
			for (int j=0; j<temp[0].length; j++) {
				System.out.printf("%5d", temp[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}



	public static void m1() {
		
		int[][] ns = { { 10, 20, 30}, { 40, 50, 60 } };

		//ns 탐색 -> 2중 for문(i, j)
		//ns 탐색 -> 향상된 for문

		for (int[] sub : ns) {
			for (int n : sub) {
				System.out.print(n + " ");
			}
		}
		System.out.println();


	}

}
