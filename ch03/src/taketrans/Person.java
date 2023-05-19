package taketrans;

public class Person {

	String name;
	int age;
	int money;
	
	Person(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	// 버스를 타는 기능을 하는 매소드
	// 매개변수 - 자료형 변수 이름
	
	void takeBus(Bus bus) {
		bus.take(1300);
		this.money -= 1300;
	}
	
	// 사람의 정보
	
	void showInfo() {
		System.out.printf("%s님의 남은 돈은 %d원입니다.\n", name, money);
	}
	
	
	
		
	
	
	
	
	//void.takeBus();
	//void.shoInfo();
	
	
}
