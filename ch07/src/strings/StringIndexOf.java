package strings;

public class StringIndexOf {

	public static void main(String[] args) {
		
		// indexOf() - 찾는 문지의 첫 위치가 반환(리턴)
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("파이썬");
		System.out.println(location);
		
		if(location != -1) { // 못찾으면 -1을 반환
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련없는 책이군요");
		}
	}

}
