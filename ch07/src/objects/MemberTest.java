package objects;

public class MemberTest {

	public static void main(String[] args) {
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		
		// 문자열 비교
		// hasoCode()와 equals()를 재정의해야 함
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 일치합니다.");
		}else {
			System.out.println("obj1과 obj2는 다릅니다.");
		}
		
	}

}
