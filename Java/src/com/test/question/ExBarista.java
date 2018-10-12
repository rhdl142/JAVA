package com.test.question;

//업무 진행하는 Main 클래스
public class ExBarista {

	public static void main(String[] args) {
		
//		Coffee coffee = new Coffee();
//		coffee.bean += 25;
//		
//		Coffee.bean += 25;
//		
//		Coffee coffee2 = new Coffee();
//		coffee2.bean += 2;
		
		
		//바리스타
		Barista barista = new Barista();
		
		//손님1
		//Espresso e1 = new Espresso(); //셀프
		Espresso e1 = barista.makeEspresso(30);
		e1.drink();
		
		Espresso e2 = barista.makeEspresso(25);
		e2.drink();
				
		Espresso[] e3 = barista.makeEspressoes(20, 5);
		
		for (Espresso e : e3) {
			e.drink();
		}
		
		
		//System.out.println(Coffee.getBean());
		//System.out.println(Coffee.getEspresso());
		//System.out.println(Coffee.getBeanTotalPrice());
		
		
		Latte l1 = barista.makeLatte(30, 300);
		l1.drink();
		
		Latte[] l2 = barista.makeLattes(25, 250, 10);
		
		for (Latte l : l2) {
			l.drink();
		}
		
		
		Americano a1 = barista.makeAmericano(20, 300, 20);
		a1.drink();
		
		Americano[] a2 = barista.makeAmericanos(20, 350, 10, 5);
		
		for (Americano a : a2) {
			a.drink();
		}
		
		
		barista.result();
		
		
	}//main
	
}

//커피
// - 객체를 만들기 위한 클래스X
// - 커피(3개의 상품)와 관련된 정적인 정보들을 보관하기 위한 클래스O
class Coffee {
	
	//*** 모든 수치 데이터는 단위 표기(*********)
	private static int bean; 		//원두 총 사용량(g)
	private static int water; 		//물 총 사용량(ml)
	private static int ice; 			//각얼음 총 사용량(개)
	private static int milk; 			//우유 총 사용량(ml)
	
	private static int beanUnitPrice = 1; 				//원두 단가(원)
	private static double waterUnitPrice = 0.2; 	//물 단가(원)
	private static int iceUnitPrice = 3; 					//얼음 단가(원)
	private static int milkUnitPrice = 4; 				//우유 단가(원)
	
	private static int beanTotalPrice; 					//원두 총 판매 가격(원)
	private static double waterTotalPrice; 			//물  총 판매 가격(원)
	private static int iceTotalPrice; 						//얼음  총 판매 가격(원)
	private static int milkTotalPrice; 					//우유  총 판매 가격(원)

	private static int espresso;								//총 에스프레스 판매 개수
	private static int latte;										//총 라테 판매 개수
	private static int americano;							//총 아메리카노 판매 개수
	
	
	public static int getBean() {
		return bean;
	}
	public static void setBean(int bean) {
		Coffee.bean = bean;
	}
	public static int getWater() {
		return water;
	}
	public static void setWater(int water) {
		Coffee.water = water;
	}
	public static int getIce() {
		return ice;
	}
	public static void setIce(int ice) {
		Coffee.ice = ice;
	}
	public static int getMilk() {
		return milk;
	}
	public static void setMilk(int milk) {
		Coffee.milk = milk;
	}
	public static int getBeanUnitPrice() {
		return beanUnitPrice;
	}
	public static void setBeanUnitPrice(int beanUnitPrice) {
		Coffee.beanUnitPrice = beanUnitPrice;
	}
	public static double getWaterUnitPrice() {
		return waterUnitPrice;
	}
	public static void setWaterUnitPrice(double waterUnitPrice) {
		Coffee.waterUnitPrice = waterUnitPrice;
	}
	public static int getIceUnitPrice() {
		return iceUnitPrice;
	}
	public static void setIceUnitPrice(int iceUnitPrice) {
		Coffee.iceUnitPrice = iceUnitPrice;
	}
	public static int getMilkUnitPrice() {
		return milkUnitPrice;
	}
	public static void setMilkUnitPrice(int milkUnitPrice) {
		Coffee.milkUnitPrice = milkUnitPrice;
	}
	public static int getBeanTotalPrice() {
		return beanTotalPrice;
	}
	public static void setBeanTotalPrice(int beanTotalPrice) {
		Coffee.beanTotalPrice = beanTotalPrice;
	}
	public static double getWaterTotalPrice() {
		return waterTotalPrice;
	}
	public static void setWaterTotalPrice(double waterTotalPrice) {
		Coffee.waterTotalPrice = waterTotalPrice;
	}
	public static int getIceTotalPrice() {
		return iceTotalPrice;
	}
	public static void setIceTotalPrice(int iceTotalPrice) {
		Coffee.iceTotalPrice = iceTotalPrice;
	}
	public static int getMilkTotalPrice() {
		return milkTotalPrice;
	}
	public static void setMilkTotalPrice(int milkTotalPrice) {
		Coffee.milkTotalPrice = milkTotalPrice;
	}
	public static int getEspresso() {
		return espresso;
	}
	public static void setEspresso(int espresso) {
		Coffee.espresso = espresso;
	}
	public static int getLatte() {
		return latte;
	}
	public static void setLatte(int latte) {
		Coffee.latte = latte;
	}
	public static int getAmericano() {
		return americano;
	}
	public static void setAmericano(int americano) {
		Coffee.americano = americano;
	}
	
}

//바리스타
class Barista {
	
	//에스프레소 만들기
	public Espresso makeEspresso(int bean) {
		
		//주업무
		Espresso espresso = new Espresso();
		espresso.setBean(bean);
		
		//보조업무
		// - 카운트 누적
		//Coffee.bean = Coffee.bean + bean;
		//Coffee.bean += bean;
		Coffee.setBean(Coffee.getBean() + bean); //원두 소비량 누적
		Coffee.setEspresso(Coffee.getEspresso() + 1); //에스프레소 만든 횟수
		Coffee.setBeanTotalPrice(Coffee.getBeanTotalPrice() + (bean * Coffee.getBeanUnitPrice())); //원두 판매 누적액		
		
		return espresso;
	}
	
	
	//에스프레소 여러잔 만들기
	public Espresso[] makeEspressoes(int bean, int count) {
		
		Espresso[] espressoes = new Espresso[count];
		
		for (int i=0; i<count; i++) {
			
			//에스프레소 1잔 만들기
			//Espresso espresso = new Espresso();
			//espresso.setBean(bean);
			
			//Coffee.setBean(Coffee.getBean() + bean); //원두 소비량 누적
			//Coffee.setEspresso(Coffee.getEspresso() + 1); //에스프레소 만든 횟수
			//Coffee.setBeanTotalPrice(Coffee.getBeanTotalPrice() + (bean * Coffee.getBeanUnitPrice()));
			
			//espressoes[i] = espresso;
			
			espressoes[i] = makeEspresso(bean);
		}
		
		return espressoes;
	}
	
	
	//라테
	public Latte makeLatte(int bean, int milk) {
		
		Latte latte = new Latte();
		latte.setBean(bean);
		latte.setMilk(milk);
		
		Coffee.setBean(Coffee.getBean() + bean); //원두 소비량 누적
		Coffee.setMilk(Coffee.getMilk() + milk); //우유 소비량 누적
		
		Coffee.setLatte(Coffee.getLatte() + 1); //라테 생산 개수

		Coffee.setBeanTotalPrice(Coffee.getBeanTotalPrice() 
														+ (bean * Coffee.getBeanUnitPrice()));
		Coffee.setMilkTotalPrice(Coffee.getMilkTotalPrice() + (milk * Coffee.getMilkUnitPrice()));
		
		return latte;
	}
	
	public Latte[] makeLattes(int bean, int milk, int count) {
		
		Latte[] lattes = new Latte[count];
		
		for (int i=0; i<count; i++) {
			lattes[i] = makeLatte(bean, milk);
		}
		
		return lattes;
	}
	
	
	
	//아메리카노
	public Americano makeAmericano(int bean, int water, int ice) {
		
		Americano americano = new Americano();
		americano.setBean(bean);
		americano.setWater(water);
		americano.setIce(ice);
		
		Coffee.setBean(Coffee.getBean() + bean); //원두 소비량 누적
		Coffee.setWater(Coffee.getWater() + water); //물 소비량 누적
		Coffee.setIce(Coffee.getIce() + ice); //얼음 소비량 누적
		
		Coffee.setAmericano(Coffee.getAmericano() + 1); //아메리카노 생산 개수

		Coffee.setBeanTotalPrice(Coffee.getBeanTotalPrice() 
														+ (bean * Coffee.getBeanUnitPrice()));
		Coffee.setWaterTotalPrice(Coffee.getWaterTotalPrice()
														+ (water * Coffee.getWaterUnitPrice()));
		Coffee.setIceTotalPrice(Coffee.getIceTotalPrice()
														+ (ice * Coffee.getIceUnitPrice()));
		
		return americano;
	}
	
	public Americano[] makeAmericanos(int bean, int water, int ice, int count) {
		
		Americano[] americanos = new Americano[count];
		
		for (int i=0; i<count; i++) {
			americanos[i] = makeAmericano(bean, water, ice);
		}
		
		return americanos;		
	}
	
	
	//결산
	public void result() {
		
		System.out.println("=====================");
		System.out.println("결산");
		System.out.println("=====================");
		
		System.out.println("음료 판매량");
		System.out.printf("에스프레소 : %d잔\n", Coffee.getEspresso());
		System.out.printf("라테 : %d잔\n", Coffee.getLatte());
		System.out.printf("아메리카노 : %d잔\n", Coffee.getAmericano());
		System.out.println();
		
		System.out.println("원재료 소비량");
		System.out.printf("원두 : %dg\n", Coffee.getBean());
		System.out.printf("우유 : %dml\n", Coffee.getMilk());
		System.out.printf("물 : %dml\n", Coffee.getWater());
		System.out.printf("얼음 : %d개\n", Coffee.getIce());
		System.out.println();
		
		System.out.println("매출액");
		System.out.printf("원두 : %,d원\n", Coffee.getBeanTotalPrice());
		System.out.printf("우유 : %,d원\n", Coffee.getMilkTotalPrice());
		System.out.printf("물 : %,d원\n", (int)Coffee.getWaterTotalPrice());
		System.out.printf("얼음 : %,d원\n", Coffee.getIceTotalPrice());
		
	}
	
}//Barista

//에스프레소
class Espresso {
	private int bean; //원두량(g)
	
	public void setBean(int bean) {
		this.bean = bean;
	}
	
	public void drink() {
		System.out.printf("원두 %dg으로 만들어진 에스프레소입니다.\n", this.bean);
	}
}

//라테
class Latte {
	private int bean; //원두량(g)
	private int milk; //우유량(ml)
	
	public void setBean(int bean) {
		this.bean = bean;
	}
	
	public void setMilk(int milk) {
		this.milk = milk;
	}
	
	public void drink() {
		System.out.printf("원두 %dg, 우유 %dml로 만들어진 라테입니다.\n"
										, this.bean, this.milk);
	}
}

//아메리카노
class Americano {
	private int bean; //원두량(g)
	private int water; //물 용량(ml)
	private int ice; //각얼음(개)
	
	public void setBean(int bean) {
		this.bean = bean;
	}
	
	public void setWater(int water) {
		this.water = water;
	}
	
	public void setIce(int ice) {
		this.ice = ice;
	}
	
	public void drink() {
		System.out.printf("원두 %dg, 물 %dml, 각얼음 %d개로 만들어진 아메리카노입니다.\n"
										, this.bean, this.water, this.ice);
	}
}


















