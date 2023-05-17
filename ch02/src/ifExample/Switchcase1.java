package ifExample;

public class Switchcase1 {

	public static void main(String[] args) {
		// switch - case문 (조건의 값이 정해져 있을 때 주로 사용)
		// 순위에 따른 메달 색상 출력
		
		
		
		int rank = 1;
		// char medalColor = ' ';
		String medalColor = " ";
		
		switch(rank) {
		case 1:
			medalColor = "Gold";
			break;
		case 2:
			medalColor = "Silver";
			break;
		case 3:
			medalColor = "Bronze";
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
			
		}
		System.out.println("메달 색깔은 " + medalColor +"입니다.");
		
		
	}

}
