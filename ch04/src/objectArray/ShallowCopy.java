package objectArray;

public class ShallowCopy {

	public static void main(String[] args) {
		// 객체 배열의 복사
		Book[] array1 = new Book[5];
		Book[] array2 = new Book[5];
		
		array1[0] = new Book("반응형 웹사이트", "김은아");
		array1[1] = new Book("Tiny Python Project", "켄 유앤스-클릭");
		array1[2] = new Book("혼자 공부하는 자바", "신용권");
		array1[3] = new Book("슬램덩크", "이노우에 타케히코");
		array1[4] = new Book("노인과 바다", "어니스트 헤밍웨이");
		
		// array2는 기본 생성자로 생성
		
		array2[0] = new Book();
		array2[1] = new Book();
		array2[2] = new Book();
		array2[3] = new Book();
		array2[4] = new Book();
		
		// array2의 배열 요소를 array2에 복사
		
		
		
		// array2의 배열 요소를 가져와서 array2에 입력함
		for(int i=0; i<array2.length; i++) {
			array2[i].setBookName(array1[i].getBookName());
		}
		
		
		
		
		// array1을 array2에 복사
		for(int i=0; i<array2.length; i++) {
			array2[i] = array1[i];
		}
		
		
		// 첫번째 책 내용을 수정, 변경
		
		array2[0].setBookName("미생1");
		array2[0].setAuthor("윤태호");
		
		
		// array1 출력
		for(int i=0; i<array1.length; i++) {
			array1[i].bookInfo();
		}
		
		System.out.println();
		
		// array2 출력
		for(int i=0; i<array2.length; i++) {
			array2[i].bookInfo();
		}
		
		
	}

}
