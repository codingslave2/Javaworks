package virtualfuntion;

public class TestA {

	// 필드
	int num;
	
	//매소드
	void aaa() {
		System.out.println("aaa() 출력");
	}
	
	public static void main(String[] args) {
		// 가상 매소드를 위햔 필드 생성
		// 인스턴스(객체) - 힙 메모리
		// 메소드 - 정적 영역(데이터 영역) - static
		TestA a1 = new TestA();
		a1.num = 10;
		a1.aaa();
		
		TestA a2 = new TestA();
		a2.num = 20;
		a2.aaa();
	}

}
