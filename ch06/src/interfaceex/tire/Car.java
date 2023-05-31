package interfaceex.tire;

public class Car {
	
	// 필드(객체) - 부모행으로 형변환
	Tire frontLeftTire = new HanTire();
	Tire frontRightTire = new HanTire();
	Tire backLeftTire = new KumTire();
	Tire backRightTire = new KumTire();
	
	// 매소드
	public void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
