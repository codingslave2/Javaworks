package Arrays;

import java.util.Scanner;

public class CalcScore {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true; // 상태 변수
		int[] scores = null; // 배열 변수 초기화 : null
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 |2.점수입력 |3.점수리스트 |4.분석 |5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택> ");
			
			try {
				int selectNo = Integer.parseInt(sc.nextLine());
				
				if(selectNo == 1) {
					System.out.print("학생수 > ");
					int studentNum = Integer.parseInt(sc.nextLine());
					scores = new int[studentNum];
				} else if(selectNo == 2) {
					if(scores == null) {
						System.out.println("학생수를 입력하세요");
					} else {
						for(int i=0; i<scores.length; i++) {
							System.out.print("scores["+i+"]> ");
							scores[i] = Integer.parseInt(sc.nextLine());
						}
					}
				} else if(selectNo == 3) {
					System.out.println("점수 리스트");
					if(scores == null) {
						System.out.println("학생수를 입력하세요");
					} else {
						for(int i=0; i<scores.length; i++) {
							System.out.println("scores["+i+"] = " + scores[i]);
						}
					}
				} else if(selectNo == 4) {
					// 분석 - 총점, 평균, 최고점수
					int sumV = 0;
					double avg = 0;
					int maxV = scores[0]; // 최대값은 첫번째 값으로 설정
					for(int i=0; i<scores.length; i++) {
						sumV += scores[i]; //누적 합계
						if(maxV < scores[i]) // 다음 점수가 최대값보다 크면
							maxV = scores[i]; // 점수를 최대값으로 설정함
					}
					
					
					for(int i=0; i<scores.length; i++) {
						sumV += scores[i];
					}
					
					avg = (double)sumV / scores.length;
					
					System.out.print("총점 : " + sumV);
					System.out.print("평균 : " + avg);
					System.out.print("최고점수 : " + maxV);
					
					
					// 분석 기능 추가
				} else if(selectNo == 5) {
					run = false;
					System.out.println("프로그램을 종료합니다.");
				} else {
					System.out.println("지원되지 않는 메뉴입니다. 다시 선택해 주세요.");
				}
			} catch(Exception e) {
				System.out.println("올바른 선택이 아닙니다. 다시 선택해 주세요.");
			}
		} // while 종료
		
		sc.close();
	}
}
