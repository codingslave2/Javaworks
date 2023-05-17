package ifExample;

public class Array {

	public static void main(String[] args) {
		// 정수 5개를 저장할 배열 선언
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		System.out.println("배열의 길이(크기)" + arr.length); // 5
		System.out.println(arr[0]);
		
		// 값 수정
		arr[2] = 7;
		
		
		
		// 배열의 요소 전체 출력
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i] + " ");
		}
		
		// 5개 크기를 가진 정수형 배열 선언
		int[] arr2 = {2, 4, 6, 8, 10};

		System.out.println(arr2[1]);
		
		//전체 블럭
		for(int j=0; j < arr2.length; j++) {
			System.out.println(arr2[j] + " ");
		}
		
		// 2와 4 곱하기
		System.out.println(arr2[0] * arr2[1]);

		// 2와 4의 대소비교
		
		System.out.println(arr2[0] > arr2[1]);

		
		
	}

}
