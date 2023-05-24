package singleton;

public class Company {
	// 싱글톤 패턴으로 작성
	// 유일하게 생성된 인스턴스(Company 클래스의 객체)
	private static Company instance = new Company();
	
	
	// 기본 생성자
	private Company() {
		
	}
	// instance에 접근할(사용) 매소드 생성
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
		
}
