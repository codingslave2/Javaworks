package taketrans;

public class Bus {

	int busNumber; // 버스번호
	int passenger; // 승객수
	int money; // 수입
	
	Bus(int busNumber){
		this.busNumber = busNumber;
	}
	
	// 태우는 기능을하는 매소드
	
	void take(int money) {
		this.money = money;
		passenger++; // passenger += 1
	}
	
	void showInfo() {
		System.out.printf("%d번 버스의 수입은 %d원이고, "
				+ "승객수는 %d명 입니다.", busNumber, money, passenger);
	}
	
}
