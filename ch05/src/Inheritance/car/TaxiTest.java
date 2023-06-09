package Inheritance.car;
class Taxi extends Car {
    int PassengerCount; // 승객수

    Taxi(String brand, int cc, int passengerCount) {
        super(brand, cc); // 부모 필드 상속
        this.PassengerCount = passengerCount;
    }

    
    
    @Override
    String carInfo() {
    	return super.carInfo() + ", " + PassengerCount;
    
    }
}

public class TaxiTest {
    public static void main(String[] args) {
        // 택시 클래스의 객체 생성
        Taxi taxi = new Taxi("Ionic 5", 3000, 1);
        taxi.carInfo();
    }
}
