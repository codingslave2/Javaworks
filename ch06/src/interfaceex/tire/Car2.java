package interfaceex.tire;

public class Car2 {
	
	Tire[] tires = {
		new HanTire(), // 0번
		new HanTire(), // 1번
		new KumTire(), 
		new KumTire() 
	};
	
	// 매소드
	public void run() {
		for(int i=0; i<tires.length; i++) {
			tires[i].roll();
		}
		
//		for(Tire tire : tires)
//			tire.roll(); // 향상된 for 문
	}
	
}
