package classpart;

public class Circle {

	Point center = new Point(2, 3); // Point 클래스를 맴버 변수로 사용
//	int x;
//	int y;
	int radius;
	
	public Circle(int x, int y, int radius) {
		center = new Point(x, y); //중심점 생성
		this.radius = radius; // 반지름
	}
	
	// 원의 정보 출력 메소드
	
	void showInfo() {
		System.out.printf("원의 중심은 (%d, %d)이고, 반지름은 %dcm입니다.\n", 
				center.x, center.y, radius);
	}
	
	
	
	
}
