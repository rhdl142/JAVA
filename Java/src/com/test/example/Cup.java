package com.test.example;

public class Cup {

	public String name;
	public String color;
	public String type; // 1,2,3

	public void check() {

		// Format : Ctrl + Shift + F
		if (type.equals("1")) {
			System.out.println("차가운 음료 전용");
		} else if (type.equals("2")) {
			System.out.println("따뜻한 음료 전용");
		} else if (type.equals("3")) {
			System.out.println("따뜻하고 차가운 음료 병용");
		}

	}

}
