package enums;

public class SeasonTest {

	public static void main(String[] args) {
		// 
		
		Season season = null; // null로 초기화
		season = season.여름;
		
		switch(season){
		case 봄:
			season = Season.봄;
			break;
		case 여름:
			season = Season.여름;
			break;
		case 가을:
			season = Season.가을;
			break;
		case 겨울:
			season = Season.겨울;
			break;
			
		}
		System.out.println("현제 계절은 " + season + "입니다.");
		
	}

}
