package var;

public class IntLongType {

	public static void main(String[] args) {
		// Int - 4byte : 32bit(21억 ~ 21억)
		int iNum = 1234567890; //21억 초과시 에러 발생
		
//		long 자료형은 int와 구분하기 위해 줄에 'L', 'l'
		long INum = 12345678900L; // 120억 가능
		System.out.println(INum); 
		
		
		System.out.println("int형 :" + iNum);
		//System.out.println(""iNum);

	}

}
