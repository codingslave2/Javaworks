package var;

public class FloatDoubleType {

	public static void main(String[] args) {
		// 실수 자료형 - float(4바이트), double(8바이트-표준)
		// 소수점 이하의 정밀도 차이
		// 소수 7자리가 넘으면 float 오류 -> double 사용
		// double은 소수 16자리까지 출력됨
		float fNum = 1.234567899F;
		double dNum = 1.234567899F;
		
		
		System.out.println(fNum);
		System.out.println(dNum);
		
	}

}
