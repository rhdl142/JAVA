class Ex30_Array {

	public static void main(String[] args)	{
	
		//Ex30_Array.java
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
	}

	public static void m5() {
		
		//배열 복사
		//1. 얕은 복사, Shallow Copy(기본 동작)
		// - 참조형 변수끼리 주소값을 복사

		//2. 깊은 복사, Deep Copy
		// - 실제 배열의 복사본을 생성

		int[] nums = { 10, 20, 30, 40, 50 }; //원본 배열
		int[] copy1;
		int[] copy2;
		int[] copy3;

		//얕은 복사
		copy1 = nums;

		//얕은 복사의 특징
		copy1[0] = 100;
		System.out.println(nums[0]);

		//깊은 복사
		copy2 = new int[nums.length];

		for (int i=0; i<nums.length; i++) {
			//요소끼리 복사(int = int)
			copy2[i] = nums[i];
		}

		copy2[0] = 1000;
		System.out.println(nums[0]);
 
	}
	
	public static void m4() {
	
		//배열의 초기화 리스트
		
		int[] ns1 = new int[] { 10, 20, 30 };
		int[] ns2 = { 10, 20, 30 };

		int[][] ns3 = new int[][] { { 10, 20, 30 }, { 40, 50, 60 } };
		int[][] ns4 = { { 10, 20, 30 }, { 40, 50, 60 } };

		int[][][] ns5 = 
		{ 
			{ 
				{ 10, 20, 30}, { 10, 20, 30}, { 10, 20, 30} 
			}, 
			{ 
				{ 10, 20, 30}, { 10, 20, 30}, { 10, 20, 30} 
			} 
		
		};
		
	}

	public static void m3() {

		

		int[] nums2 = new int[3];

		int num3 = 10;

		//자료형?
		//1. num3 의 자료형 뭐냐? > int
		//2. nums2 의 자료형 뭐냐? > int[], int배열
		//3. nums2[0] 의 자료형 뭐냐? > int
		//4. nums 의 자료형 뭐냐? > int[][], int 2차원 배열
		//5. nums[0][0] 의 자료형 뭐냐? > int
		//6. nums[0] 의 자료형 뭐냐? > int[] 

		int[][] nums = new int[2][3];

		nums[0][0] = 100;
		nums[0][1] = 200;
		nums[0][2] = 300;
		nums[1][0] = 400;
		nums[1][1] = 500;
		nums[1][2] = 600;

		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[0].length; j++) {
				System.out.println(nums[i][j]);
			}
		}

		System.out.println(nums.length);
		System.out.println(nums[0].length);
		System.out.println(nums[1].length);

	}

	public static void m2() {

		//배열 차원
		// - 다차원 배열
		// - 1차원 배열
		// - 2차원 배열
		// - 3차원 배열
		// - N차원 배열

		//2차원 배열 선언
		int[][] nums = new int[2][3];

		nums[0][0] = 100;
		nums[0][1] = 200;
		nums[0][2] = 300;
		nums[1][0] = 400;
		nums[1][1] = 500;
		nums[1][2] = 600;

		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				System.out.printf("nums[%d][%d] = %d\n", i, j, nums[i][j]);
			}
		}


		//3차원 배열
		int[][][] nums2 = new int[3][15][10];
		
		nums2[0][9][1] = 100;
		nums2[2][2][2] = 200;
		nums2[1][14][9] = 300;

		//3차원 배열 탐색 -> 3중 for문
		for (int i=0; i<3; i++) {
			for (int j=0; j<15; j++) {
				for (int k=0; k<10; k++) {
					System.out.print(nums2[i][j][k] + "   ");
				}
				System.out.println();//층 구분
			}
			System.out.println();//동 구분
		}

	}

	public static void m1() {
	
		//배열 선언
		int[] list = new int[3];
		
		//배열의 요소 초기화(= 배열 초기화)
		list[0] = 100;
		list[1] = 200;
		list[2] = 300;

		//배열 선언 + 초기화
		int[] list2 = new int[] { 100, 200, 300 };

		int[] list3 = { 100, 200, 300 };

		//배열의 길이(방의 갯수, 요소의 갯수)
		System.out.println(list.length); //length, 변수, 필드(field), 프로퍼티(property)

		//배열의 인덱스 -> 요소의 접근 수단으로 사용(방 번호)
		//인덱스의 범위
		//0(최소) ~ length-1(최대)

		//배열 탐색
		for (int i=0; i<list.length; i++) {
			System.out.println(list[i]); //[] : Indexer, 인덱서
		}

		for (int i : list) {
			System.out.println(i); //읽기 전용
		}

		//배열 복사(= 참조형 복사)
		int[] copy;

		//int[] = int[]
		copy = list; //참조 복사

		//list 수정 -> copy 수정
		//copy 수정 -> list 수정

	}

}
