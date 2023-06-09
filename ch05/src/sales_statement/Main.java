package sales_statement;

public class Main {

	public static void main(String[] args) {
		// Drink 객체 생성
		
		Drink coffee = new Drink("커피", 2500, 10);
		Drink greentea = new Drink("녹차", 3000, 4);
//		Drink coffee = new Drink("커피", 2500, 10);
//		Drink coffee = new Drink("커피", 2500, 10);
		
		// Alcohol 객체 생성
		Alcohol soju = new Alcohol("소주", 4000, 5, 15.5f);
		
		Drink.printTitle(); // 클래스 이름으로 직접 접근
		coffee.printDate();
		greentea.printDate();
		
		Alcohol.printTitle();
		soju.printDate();
		
		// 총 판매 금액
		int total = coffee.getTotalPrice() + greentea.getTotalPrice() + 
				soju.getTotalPrice();
		
		System.out.printf("\n*** 합계 금액 : %d원 ***\n", total);
		
	}

}
