package classes;

public class ThrowsException {

	public static void main(String[] args) {
		
		try {
			findClass();
			System.out.println("클래스가 존재함");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
	}
	
	public static void findClass() throws ClassNotFoundException {
		// throw - 예외처리 미루기(사용하는 측에서 try-catch함)
		Class.forName("java.lang.ArrayList");
		
	}
	
}
