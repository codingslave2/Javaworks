package twodimention;

public class TwoDimention1 {

	public static void main(String[] args) {
		// 정수형 2차원 배열(보기 2행 3열)
		int[][] a1 = new int[2][3];
		
		System.out.println("배열의 크기: " + a1.length); // 행의 크기
		System.out.println("배열의 크기: " + a1[0].length); // 열의 크기
		System.out.println("배열의 크기: " + a1[1].length); // 열의 크기
		
		// 전체 출력
		for(int i=0; i<a1.length; i++) {
			for(int j=0; j<a1[i].length; j++) { // 수정: a.length 대신 a[i].length
				System.out.print(a1[i][j] + " ");
			}
			System.out.println();
		}
		
//		// 데이터 지정
//		a[0][0] = 1;
//		a[0][1] = 2;
//		a[0][2] = 3;
//		a[1][0] = 4;
//		a[1][1] = 5;
//		a[1][2] = 6;
		
		// 데이터 지정2
		int [][] a2 = {
				{1, 2, 3},
				{4, 5, 6}
		};
		
		
		
		// 전체 출력
		for(int i=0; i<a2.length; i++) {
			for(int j=0; j<a2[i].length; j++) { // 수정: a.length 대신 a[i].length
				System.out.print(a2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
