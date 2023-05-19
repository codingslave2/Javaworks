package taketrans;

public class Subway {

	String lineNumber; // 지하철 번호
	int passengerCount; // 승객수
	int money; // 수입
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// 승객 탑승용 매소드
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.printf("지하철 %s의 수입은 %d원이고, 승객 수는 %d명입니다.\n", 
				lineNumber, money, passengerCount);
	}
	
	
}
