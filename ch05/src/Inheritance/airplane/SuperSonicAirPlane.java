package Inheritance.airplane;

public class SuperSonicAirPlane extends AirPlane{
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	
	
	
	@Override // 매소드 재정의
	public void fly() {
		
		//조건문 - 비행기가 초음속 비행합니다.
		if(flyMode == 2) {
			System.out.println("비행기가 초음속 비행합니다.");
		}else {
			super.fly(); // 비행기가 비행합니다.
		}
		
		
		
	}
	
}
