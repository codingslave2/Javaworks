package Inheritance.car;

public class Car {
	// 필드
	String brand; //브랜드
	int cc; //배기량
	
	// 생성자
	Car(String brand, int cc){
		this.brand = brand;
		this.cc = cc;
	}
	String carInfo() {
		return brand + "," + cc;
	}
}
