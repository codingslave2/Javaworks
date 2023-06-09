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
		
		// lastIndexOf()
		String uri = "/board/boarList.jsp";
		int uri_idx1 = uri.indexOf('/'); // 앞에있는 '/'
		
		System.out.println(uri_idx1);
		
		int uri_idx2 = uri.lastIndexOf('/'); // 뒤에있는 '/'
		System.out.println(uri_idx2);
	}
	
	
	
}
