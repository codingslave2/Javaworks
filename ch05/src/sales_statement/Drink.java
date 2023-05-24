package sales_statement;

public class Drink {
	// 필드
	protected String name; // 상품명
	protected int price; //가격
	protected int count; // 수량
	
	// 생성자
	Drink(String name, int price, int count){
		this.name = name;
		this.price = price;
		this.count = count;
	}
	// 판매 금액을 가져올 매소드
	int getTotalPrice() {
		// 금액 = 가격 * 수량
		return price * price;
	}
	
	// 제목 출력
	static void printTitle() {
		System.out.println("상품평\t가격\t수량\t금액");
	}
	
	
	// 내용 데이터
	void printDate() {
		System.out.println(name + "\t" + price + "\t" + count + "\t" + getTotalPrice());
	}
	
	
	
}
