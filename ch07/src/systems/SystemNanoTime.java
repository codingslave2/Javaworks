package systems;

public class SystemNanoTime {

	public static void main(String[] args) {
		
		double start, end;
		start = System.nanoTime();
		
		long sum = 0;
		for(int i=1; i<1000000000; i++) {
			sum += i;
		}
		end = System.nanoTime();
		
		System.out.printf("계산에 소요된 시간: %f 나노초", (end-start));
		System.out.printf("계산에 소요된 시간: %f 초", (end-start)/1000000000);
		
		
	}

}
