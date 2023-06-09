package polymorphism;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
}

// Human 클래스 
class Human extends Animal{
	public void move() {
		System.out.println("사람이 움직입니다.");
	}
}


// Tiger 클래스

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 움직입니다.");
	}
}

// 독수리 클래스
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 움직입니다.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		//
		
		Animal animal = new Animal();
		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		
		
		
//		
//		human.move();
//		animal.move();
//		tiger.move();
		
		moveAnimal(human);
		moveAnimal(tiger);
		moveAnimal(eagle);
		
		
	}
	// move()를 사용할 매소드 생성 - 매개변수의 다양성
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
