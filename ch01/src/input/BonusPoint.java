package input;

import java.util.Scanner;

public class BonusPoint {

	public static void main(String[] args) {
		// 고객의 구매 포인트 계산 프로그램
		// 보너스 포인트 = 구매 금액 x 보너스 적립율
		Scanner sc = new Scanner(System.in);
		
		// 고객의 이름을 입력 받으세요
		
		System.out.println("당신의 이름을 입력하세요.: ");
		String name = sc.nextLine();
		
		
		System.out.println("구매 금액을 입력하세요: ");
		int price = sc.nextInt();
		int bonusPoint = 0;
		double bonusRatio = 0.05;
		
		// int형 < double형
		bonusPoint = (int)(price * bonusRatio);
		
		System.out.printf("%s님의 보너스 포인트는 %d점 입니다.", name, bonusPoint);
		
	}

}
