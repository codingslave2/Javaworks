package fruits;

public class Fruits {
	//필드
	String name; //과일 이름
	String weight; // 무게
	int price; // 가격
	
	// 생성자
	public Fruits() {}
	
	
	// 정보 출력 메소드
	public void showInfo() {
		System.out.println("과일 이름: " + name);
		System.out.println("과일 무게: " + weight);
		System.out.println("과일 가격: " + price);
	}
	
}
