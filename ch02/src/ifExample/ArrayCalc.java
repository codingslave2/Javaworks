package ifExample;

public class ArrayCalc {

	public static void main(String[] args) {
		// 베열의 총점과 평균
		// 90, 70, 85, 60 입력
		
		int[] score = new int[4];
		int total = 0;
//		int avg = 0;
		
		
		score[0] = 90;
		score[1] = 70;
		score[2] = 85;
		score[3] = 60;
		
		// 총점 계산
		
		for(int i=0; i < score.length; i++) {	
			total += score[i];	
		}
		
		// 총점
		System.out.println("총점 : " + total);
		
		
		// 평균 계산
		
		for(int j=0; j < score.length; j++) {
			int avg = total / score[0];
		}
		
		// 평균
		System.out.println("평균 : " );
		
	}

}
