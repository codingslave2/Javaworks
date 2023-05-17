package ifExample;

import java.util.Scanner;

public class Bank1 {

	public static void main(String[] args) {
		// 은행 업무 - 예금, 출금, 잔고 확인
		Scanner sc = new Scanner(System.in);

		int balance = 0; // 은행 잔고
		int money = 0;
		boolean run = true; // 상태 (실행)변수

		while (run) {
			try {
				System.out.println("==============================");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("==============================");
				System.out.println("선택> ");

				int selNum = Integer.parseInt(sc.nextLine()); // "1"을 숫자로 변환

				switch (selNum) {
				case 1:
					System.out.println("예금액> ");
					// 잔고 = 잔고 + 예금액
					money += balance + Integer.parseInt(sc.nextLine());
					balance += money;
					//System.out.println("%d,원 정상처리 되었습니다.\n", money);
					break;
				case 2:
					System.out.println("출금액> ");
					// 출금액 = 잔고 - 예금액
					balance -= Integer.parseInt(sc.nextLine());
					System.out.println("%d,원 정상처리 되었습니다.");
					break;
				case 3:
					System.out.println("잔고> " + balance);
					break;
				case 4:
					run = false;
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
				}

			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}

		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}