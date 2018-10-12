package com.test.question;

public class ExPacker {
	
	public static void main(String[] args) {
		
		//ExPacker.java
		
		//포장하는 사람
		Packer packer = new Packer();

		//연필
		Pencil p1 = new Pencil();
		p1.setHardness("HB");
		packer.packing(p1);

		Pencil p2 = new Pencil();
		p2.setHardness("4B");
		packer.packing(p2);

		//지우개
		Eraser e1 = new Eraser();
		e1.setSize("Large");
		packer.packing(e1);

		//볼펜
		BallPointPen b1 = new BallPointPen();
		b1.setThickness(0.3);
		b1.setColor("black");
		packer.packing(b1);

		BallPointPen b2 = new BallPointPen();
		b2.setThickness(1.5);
		b2.setColor("red");
		packer.packing(b2);

		//자
		Ruler r1 = new Ruler();
		r1.setLength(30);
		r1.setShape("줄자");
		packer.packing(r1);

		//결과 확인
		packer.countPacking(0);
		packer.countPacking(1);
		packer.countPacking(2);
		packer.countPacking(3);
		packer.countPacking(4);
		
		
	}

}

//연필
class Pencil {
	
	private String hardness;
	
	public void setHardness(String hardness) {
		
		if (!hardness.equals("4B") && !hardness.equals("3B") && !hardness.equals("2B") && !hardness.equals("B") && !hardness.equals("HB") && !hardness.equals("H") && !hardness.equals("2H") && !hardness.equals("3H") && !hardness.equals("4H")) {
			System.out.println("예외");
			return;//중단
		}
		
//		if (hardness.length() < 3) {
//			System.out.println("예외");
//			//return;//중단
//		}
		
		this.hardness = hardness;
	}

	public String info() {
		
		return this.hardness + " 진하기 연필입니다";
	}
	
}


//지우개
class Eraser {
	
	private String size;
	
	public void setSize(String size) {
		
		if (!size.equals("Large") && !size.equals("Medium") && !size.equals("Small")) {
			System.out.println("예외");
			return;
		}
		
		this.size = size;
	}

	public String info() {
		
		return this.size + " 사이즈 지우개입니다.";
	}
	
}

//볼펜
class BallPointPen {
	
	private double thickness;
	private String color;
	
	public void setThickness(double thickness) {
		
		if (thickness != 0.3 && thickness != 0.5 && thickness != 0.7 && thickness != 1.0 && thickness != 1.5) {
			System.out.println("예외");
			return;
		}
		
		this.thickness = thickness;
	}

	public void setColor(String color) {
		
		String[] color2 = { "red", "blue", "green", "black" };
		boolean result = false;
		
		for (String c : color2) {
			if (color.equals(c)) {
				result = true;
				break;
			}
		}
		
		if (!result) {
			System.out.println("예외");
			return;
		}
		
		if (!color.equals("red") && !color.equals("blue") && !color.equals("green") && !color.equals("black")) {
			System.out.println("예외");
			return;
		}
		
		this.color = color;
	}
	
	public String info() {
		
		return this.color + " 색상 " + this.thickness + "mm 볼펜입니다.";
	}
	
}


//자
class Ruler {
	
	private int length;
	private String shape;
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setShape(String shape) {
		this.shape = shape;
	}

	public String info() {
		
		return this.length + "cm " + this.shape + "입니다.";
	}
	
}


//포장하는 사람
class Packer {
	
	//사무용품의 패킹 횟수 저장
	private static int pencilCount;
	private static int eraserCount;
	private static int ballPointPenCount;
	private static int rulerCount;
	
	//setter -> 카운트 증가 메소드 필요
	public static void addPencilCount() {
		Packer.pencilCount++;
	}
	
	public static void addEraserCount() {
		Packer.eraserCount++;
	}
	
	public static void addBallPointPenCount() {
		Packer.ballPointPenCount++;
	}
	
	public static void addRulerCount() {
		Packer.rulerCount++;
	}
	
	//포장하기
	public void packing(Pencil pencil) {
		//검수하기
		System.out.println("포장 전 검수 : " + pencil.info());
		//포장 후 카운트 추가
		//Packer.pencilCount++;
		Packer.addPencilCount();
		System.out.println("포장을 완료했습니다.");
	}
	
	public void packing(Eraser eraser) {
		//검수하기
		System.out.println("포장 전 검수 : " + eraser.info());
		//포장 후 카운트 추가
		Packer.addEraserCount();
		System.out.println("포장을 완료했습니다.");
	}
	
	public void packing(BallPointPen ballPointPen) {
		//검수하기
		System.out.println("포장 전 검수 : " + ballPointPen.info());
		//포장 후 카운트 추가
		Packer.addBallPointPenCount();
		System.out.println("포장을 완료했습니다.");
	}
	
	public void packing(Ruler ruler) {
		//검수하기
		System.out.println("포장 전 검수 : " + ruler.info());
		//포장 후 카운트 추가
		Packer.addRulerCount();
		System.out.println("포장을 완료했습니다.");
	}
	
	public void countPacking(int type) {
		
		if (type == 0) {
			System.out.printf("연필 : %d회\n", Packer.pencilCount);
			System.out.printf("지우개 : %d회\n", Packer.eraserCount);
			System.out.printf("볼펜 : %d회\n", Packer.ballPointPenCount);
			System.out.printf("자 : %d회\n", Packer.rulerCount);
		} else if (type == 1) {
			System.out.printf("연필 : %d회\n", Packer.pencilCount);
		} else if (type == 2) {
			System.out.printf("지우개 : %d회\n", Packer.eraserCount);
		} else if (type == 3) {
			System.out.printf("볼펜 : %d회\n", Packer.ballPointPenCount);
		} else if (type == 4) {
			System.out.printf("자 : %d회\n", Packer.rulerCount);
		}
		
	}
	
}























