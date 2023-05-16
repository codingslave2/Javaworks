package ifExample;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		// 'y'키 - 계속 반복, 'n'키 - 반복 중단, 이외의 키 - 지원하지 않는 키 출력
		// key == 'y'(비교 안됨), 문자열 비교 equals() 메소드 사용
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("계속 반복할까요?(y/n): ");	
			String key = sc.nextLine(); // 사용자로부터 키 입력 받기
			
			if(key.equals("y")) {
				System.out.println("계속 반복합니다.");		
			}else if(key.equals("n")) {
				System.out.println("반복을 중단합니다.");
				break; // 반복 중단을 위해 루프 탈출
			}else {
				System.out.println("지원하지 않는 키입니다.");	
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
