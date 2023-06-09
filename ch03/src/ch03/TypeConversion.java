package ch03;

public class TypeConversion {

	public static void main(String[] args) {
		 // 형 변환
		 // 묵시적 형변형(자동 형변형)
		int iNum = 20;
		float fNum = iNum; // 4바이트 실수형
		
		System.out.println(iNum); // 20
		System.out.println(fNum); // 20.0
		
		double dNum;
		dNum = iNum + fNum;
		
		System.out.println(dNum); // 40.0
		
		// 명시적 형변환(강제 형변환)
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum2 = (int)dNum1 + (int)fNum2; // 1 + 0
		int iNum3 = (int)(dNum1 + fNum2); // (1.2+0.9=2.1) = 2
		
		
		
		System.out.println(iNum2);
		System.out.println(iNum3);
	}

}
