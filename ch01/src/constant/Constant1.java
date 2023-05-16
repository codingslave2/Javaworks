package constant;

public class Constant1 {

	public static void main(String[] args) {
		// 상수 선언하기 - final 키워드를 붙이면 상수가 됨
		// 상수는 수정할 수 없음(재할당 안됨), 관례상 대문자로 사용함
		final int MAX_NUM = 100;
		
		// maxNum = 200; 수정 불가
		
		System.out.println(MAX_NUM);
		
		// 상수 활용하기 - 원의 넓기 계산
		int radius = 5;
		final double PI = 3.14;
		double area;
		
		area = (radius * radius) * PI;
		
		System.out.printf("원의 넓이는 %f입니다", area);
		
	}

}
