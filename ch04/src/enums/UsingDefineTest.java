package enums;

public class UsingDefineTest {

	public static void main(String[] args) {
		// 상수 사용하기
		
		int maxV = UsingDefine.MAX_NUM;
		double radius = UsingDefine.EARTH_RADIUN;
		
		System.out.println("최대값 : " + maxV);
		System.out.println("최소값 : " + UsingDefine.MIN_NUM);
		System.out.println("원주율 : " + UsingDefine.PI);
	
		// 지구의 반지름과 표면적
		
		System.out.println("지구의 반지름 " + radius + "km");
		System.out.println("지구의 반지름 " + (4 * radius * radius * Math.PI) + "km^2");
		
		
	}

}
