package ifExample;

public class ArrayAlphabet {

	public static void main(String[] args) {
		// 1부터 10까지 저장하는 배열
		// numbers 배열, 객체 -> 힙 메모리
		
		int[] numbers = new int[10];
		
		for(int i=0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			System.out.print(numbers[i] + " ");
		}
		
		// 알파벳 대문자 - 저장(26자)
		
		char[] alphabets = new char[26];
		char ch = 'A';
		
		alphabets[0] = ch;
		alphabets[1] = (char)(ch + 1); // char형으로 강제 형 전환
		
		System.out.println(alphabets[0]);
		System.out.println(alphabets[1]);
		
		for(int j=0; j < alphabets.length; j++) {
			alphabets[j] = ch;
			ch = (char)(ch + 1); // 문자형을 1씩 증가
		}
		
		for(int j=0; j < alphabets.length; j++) {
			System.out.println(alphabets[j] + ", " + (int)alphabets[j]);
		}
		
		
		
	}

}
