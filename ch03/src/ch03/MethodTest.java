package ch03;

class MethodEx{
	public void SayHello() {
		System.out.println("Hello~");
	}
	
	// 두 수를 더하는 함수
	public int add(int x, int y) {
		return x + y;
	}
	
}

public class MethodTest {

	public static void main(String[] args) {
		
		// sayHello() 사용(호출), 객체 이름 -함수 이름()
		
		MethodEx method = new MethodEx();		
		method.SayHello();
		
		// sayHello2() 호출
		
		
		// add() 함수 호출
		int value = method.add(10, 20);
		System.out.println(value);
		
	}

}
