package abstractex.car;

public class CarMain {

	public static void main(String[] args) {
		// 부모 타입으로 bus 객체 생성(자동 형변환)
		Car car1 = new Bus();
		
		car1.run();
		car1.refuel();
		
		// 다운 캐스팅(강제 형변환 - instanceof)
		if(car1 instanceof Bus) {
			Bus bus = (Bus)car1;
			bus.takePassenger();
		}
		
		Car car2 = new Truck();
		
		car2.run();
		car2.refuel();
		
		
		if(car2 instanceof Truck) {
			Truck truck = (Truck)car2; //강제 형변환
			truck.load();
		}
		
	}

}
