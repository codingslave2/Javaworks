package fruits;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.포도 | 2.바나나 | 3.복숭아");
		System.out.println("선택> ");
		
		int menu = Integer.parseInt(scan.nextLine());
		
		Fruits fruits = null; // 전역으로 생성
		
		if(menu == 1) {
			fruits = new Grape();
			
		}else if(menu == 2) {
			fruits = new Banana();
			
		}else if(menu == 3) {
			fruits = new Peach();
			
		}
		scan.close();
		fruits.showInfo();
	}

}
