package ifExample;

public class ArrayCalc {

	public static void main(String[] args) {
		// 베열의 총점과 평균
		// 90, 70, 85, 60 입력
		
		int[] score = new int[4];
		int total = 0;
		double avg;
		
		
		score[0] = 90;
		score[1] = 70;
		score[2] = 85;
		score[3] = 60;
		
		// 총점 계산
		
		for(int i=0; i < score.length; i++) {	
			total += score[i];	
		}
		
		// 총점
		
		
		
		// 평균 계산
		
		avg = total / score.length;
		
		// 평균
		
		
		
		// 최고 점수
		
		int maxV = score[0]; // 첫번째 값을 최고 점수로 설정
		for(int i=0; i<score.length; i++) {
			if(maxV < score[i]) { // 최대값이 다음 점수보다 높으면
				maxV = score[i]; // 최대값을
			}
		}
		
	
	
		// 출력
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("최고 점수 : " + maxV);

	}
		
}
