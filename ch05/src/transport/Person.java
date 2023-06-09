package transport;

public class Person {

	String name;
	int age;
	int money;
	
	Person(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	// 요금을 내고 교통수단을 이용하는 매소드
	//Vehicle vehicle -> 상속화 다형성 이용
	public void take(Vehicle vechicle, int fee) {
		vechicle.carry(fee);
		this.money -= fee; // 가진 돈에서 요금만큼 차감
	}
	
	// 사람의 정보
	void showInfo() {
		System.out.printf("%s님의 남은 돈은 %d원 입니다\n", name, money);
	}
	
	
}
