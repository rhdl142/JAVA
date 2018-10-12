package com.test.example;
import java.util.Random;

public class Box {

	private Marcaron[] list = new Marcaron[10];
	
	public void cook() {
		

		Random rnd = new Random();
		String[] colors = { "red", "blue", "yellow", "white", "pink", "purple", "green", "black" };
		
		for (int i=0; i<list.length; i++) {
			
			Marcaron m = new Marcaron();
			
			m.setSize(rnd.nextInt(11) + 5);
			m.setColor(colors[rnd.nextInt(colors.length)]);
			m.setThickness(rnd.nextInt(20) + 1);
			
			this.list[i] = m;
			
		}
		
		System.out.println("마카롱을 10개 만들었습니다.");
		
	}
	
	
	public void check() {
		
		int passCount = 0;
		int failCount = 0;
		
		for (Marcaron m : this.list) {
			if (checkMarcaron(m)) {
				passCount++;
			} else {
				failCount++;
			}
		}
		
		System.out.println("[박스 체크 결과]"); 
		System.out.printf("QC 합격 갯수 : %d개\r\n", passCount);
		System.out.printf("QC 불합격 갯수 : %d개\r\n", failCount);
	}
	
	private boolean checkMarcaron(Marcaron m) {
		
		if (m.getSize() < 8 || m.getSize() > 14) {
			return false;
		}
		
		if (!m.getColor().equals("red") && !m.getColor().equals("blue") && !m.getColor().equals("yellow") && !m.getColor().equals("white") && !m.getColor().equals("purple") && !m.getColor().equals("green") && !m.getColor().equals("red")) {
			return false;
		}
		
		if (m.getThickness() < 3 || m.getThickness() > 18) {
			return false;
		}
		
		
		return true;
	}
	
	
	public void list() {
		
		System.out.println("[마카롱 목록]");
		
		for (int i=0; i<list.length; i++) {
			
			System.out.printf("%d번 마카롱 : %dcm(%s, %dmm) : %s\n"
										, i+1
										, this.list[i].getSize()
										, this.list[i].getColor()
										, this.list[i].getThickness()
										, checkMarcaron(this.list[i]) ? "합격" : "불합격");
			
		}
		
	}
	
}







