package taketrans;

public class Person2 {

	String name;
	int age;
	int money;
	
	Person2(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	// 지하철를 타는 기능을 하는 매소드
	// 매개변수 - 자료형 변수 이름
	
	void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	// 사람의 정보
	
	void showInfo() {
		System.out.printf("%s님의 남은 돈은 %d원입니다.\n", name, money);
	}
	

	
		
	
	
	
	
	//void.takeBus();
	//void.shoInfo();
	
	
}
