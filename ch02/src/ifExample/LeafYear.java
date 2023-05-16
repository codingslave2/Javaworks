package ifExample;

import java.util.Scanner;

public class LeafYear {

	public static void main(String[] args) {
		// 윤년을 판별하는 프로그램(연도를 입력받음)
		// 4년마다 오고, 100년 단위는 윤년이 아니나, 400년 단위는 윤년이 맞음
		// year % 4 == 0 && year % 100 != 0 || year % 400 ==0
		
		System.out.println("연도를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("평년입니다.");
		}
		
		sc.close();
		
	}

}
