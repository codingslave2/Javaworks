package classpart;

public class PointText {

	public static void main(String[] args) {
		// Point 클래스의 객체 생성
		
		Point point = new Point(3, 4);
		Point point2 = new Point(10, 15);
		
//		point.x = 3; // 직접 맴버 변수의 접근 방식은 보안상 좋지 않음
//		point.y = 4;
		
		System.out.println("점(" + point.x + ", " + point.y +")");
		System.out.println("점(" + point2.x + ", " + point2.y +")");
		
	}

}
