package sales_statement;

public class Alcohol extends Drink{
	
	float alcper; //알콜 도수
	

	Alcohol(String name, int price, int count, float alcper) {
		super(name, price, count);
		this.alcper = alcper;	
			
	}
	
	static void printTitle() {
		System.out.println("상품평(도수[%])\t가격\t수량\t금액");
	}
	
	// 내용 데이터
		@Override
		void printDate() {
			System.out.printf("%s(%.1f) %d %d %d", name,alcper , price, count, 
							getTotalPrice());
		}

}
