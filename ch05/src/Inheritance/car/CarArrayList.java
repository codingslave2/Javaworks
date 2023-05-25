package Inheritance.car;

import java.util.ArrayList;

public class CarArrayList {

    public static void main(String[] args) {
        // 자동차 3대 생성 - ArrayList에 저장
        ArrayList<Car> carList = new ArrayList<>();

        Car car1 = new Car("소나타", 2500);
        Car car2 = new Car("모닝", 1000);
        Car car3 = new Car("BMW", 3000);

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        System.out.println(carList.get(1).carInfo());

        // 전체 요소 출력
        for (int i = 0; i < carList.size(); i++) {
            Car car = carList.get(i);
            System.out.println(car.carInfo());
        }
    }
}
