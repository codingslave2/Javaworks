package downcasting;

class Animal{
	public void breathe() {
		System.out.println("동물이 숨을 쉽니다.");
	}
	
class Human extends Animal{
	public void breathe() {
		System.out.println("사람이 숨을 쉽니다.");
	}
}
	
}

public class AnimalTest {

	public static void main(String[] args) {
		// 부모 타입으로 자동 형변환을 구현
		Animal animal = new Human();
		animal.breathe();
		
		// 다운 캐스팅으로 강제 형변환 형성
		if(animal instanceof Human) {
			Human man = (Human)animal;
			man.read();
		}

	}

}
