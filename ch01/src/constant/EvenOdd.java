package constant;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// 짝수 홀수 판별 프로그램
	try	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt(); //키보드에서 숫자 입력
		
		//String result = (num % 2 == 0) ? "짝수" : "홀수";
		
		String result = "";
		if(num % 2 == 0) {
			result = "짝수";
		}else {
			result = "홀수";
		}
		
		
		System.out.println(result);
		
		sc.close();
	}catch(Exception e) {}
		System.out.println("숫자를 입력해주세요");
	}

}
	
