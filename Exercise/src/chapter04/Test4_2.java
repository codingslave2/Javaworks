package chapter04;

public class Test4_2 {

	public static void main(String[] args) {
		// random 매소드
		while(true) {
			int dice1 = (int)(Math.random()*6) + 1;
			int dice2 = (int)(Math.random()*6) + 1;
			System.out.println(dice1 + ',' + dice2);
			if(dice1 + dice2 == 5) break;
		}
		
		
		
		// 4x + 5y = 60
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if((4 * x + 5 * y) == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
		
		
		
		
		
	}

}
