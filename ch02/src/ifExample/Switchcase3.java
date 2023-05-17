package ifExample;

public class Switchcase3 {

	public static void main(String[] args) {
		// 두 수의 사칙 연산 프로그램
		
		int num1 = 10;
		int num2 = 2;
		char operator = '*';
		int result = 0;
		
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			break;
			
		case '-':
			result = num1 - num2;
			break;
			
		case 'x':
			result = num1 * num2;
			break;
			
		case '/':
			result = num1 / num2;
			break;
		
		default:
			System.out.println("입력이 잘못되었습니다.");
			break;		
		
		}
		
		System.out.println(num1 + " + " + num2 + " 는 " + result + "입니다" );
		
	}

}
