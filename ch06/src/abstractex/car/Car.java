package abstractex.car;

public abstract class Car {
	
	public abstract void run(); // 추상 매소드
	
	
	public abstract void refuel(); // 추상 매소드
	
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
	
	
}
