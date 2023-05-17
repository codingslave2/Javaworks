package ifExample;

public class Array2 {

	public static void main(String[] args) {
		// 문자열에 배열 선언 및 사용
		
		String[] cars = {"Morning", "Sonata", "Sportage", "K7"};
		
		// "Sonata"를 검색하시오
		System.out.println(cars[1]);
		
		// K7을 BMW로 변경하시오
		cars[3] = "BMW";
		System.out.println(cars[3]);
		
		// 전체 출력
		for(int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
		
		// 향상된 for문
		// for(자료형 변수 : 배열 이름){}
		for(String car : cars) {
			System.out.println(car + " ");
		}
		
	}

}
