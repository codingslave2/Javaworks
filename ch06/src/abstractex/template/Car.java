package abstractex.template;

public abstract class Car {
	
	public abstract void drive();
	
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// 탬플릿 매소드 정의
	// final이 있으므로 상속받을 클래스에서 재정이 필요함
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
	
}
