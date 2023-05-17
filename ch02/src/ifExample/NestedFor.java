package ifExample;

public class NestedFor {

	public static void main(String[] args) {
		// 중첩 for 문
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		// 역 삼각형
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
