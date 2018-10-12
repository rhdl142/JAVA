class Ex31_Shift {

	public static void main(String[] args)	{
		
		//Ex31_Shift.java
		
		//원본 배열
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int index = 3;
		
		//시프트 작업
		//1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		//1, 2, 3, 0, 4, 5, 6, 7, 8, 9
		//nums[index] = 0;

		for (int i=nums.length-2; i>=index; i--) {
			nums[i+1] = nums[i];
		}

		nums[index] = 100;

		for (int i : nums) {
			System.out.print(i + " ");
		}
		System.out.println();


		//1, 2, 3, 100, 4, 5, 6, 7, 8, 9
		//1, 2, 3, 100, 4, 6, 7, 8, 9, 0
		index = 5;

		for (int i=index; i<nums.length-1; i++) {
			nums[i] = nums[i+1];
		}

		nums[nums.length-1] = 0;
		
		for (int i : nums) {
			System.out.print(i + " ");
		}
		System.out.println();



		
	}

}
