package interfaceex;

public class CalculatorTest {
	public static void main(String[] args) {
		// Calculator 인터페이스는 객체 생성 불가능
		
		
		
		// MyCalculator로 객체 생성
		MyCalculator calc = new MyCalculator();
		
		int x = 10, y = 0;
		
		System.out.println(calc.add(x, y));
		System.out.println(calc.subtract(x, y));
		System.out.println(calc.times(x, y));
		System.out.println(calc.divide(x, y));
		
		
	}
}
