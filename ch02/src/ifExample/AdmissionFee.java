package ifExample;

public class AdmissionFee {

	public static void main(String[] args) {
		// 놀이공원 입장료 계산
		// 나이별 - 8세 미만 1000, 14세 미만 2000, 20세 미만 2500, 20세 이상 3000
		int age = 20;
		int fee = 0;
		
		if(age < 8) {
			fee = 1000;
			System.out.println("취학 전 아동입니다.");
		}else if(age > 8 && age < 14) {
			fee = 2000;
			System.out.println("초등학생입니다.");
		}else if(age > 14 && age < 20) {
			fee = 2500;
			System.out.println("청소년입니다.");
		}else {
			fee = 2000;
			System.out.println("성인입니다.");
		}
		
		System.out.printf("입장료는 %d원입니다.", fee);
	}
}

