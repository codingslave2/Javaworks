package operator;

public class Operator2 {

	public static void main(String[] args) {
		// 비교 연산 : >, <, ==, !=
		
		int num1 = 7, num2 = 3;
		
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 == num2); // 같다
		System.out.println(num1 != num2); // 같지 않다
		
		
		
		
		System.out.println((num1 < num2) && (num1 != num2)); // false
		System.out.println((num1 < num2) || (num1 != num2)); // true
		System.out.println(!(num1 != num2)); // false
		
	}

}
