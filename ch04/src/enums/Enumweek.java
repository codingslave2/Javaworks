package enums;

import java.util.Calendar;

public class Enumweek {

	public static void main(String[] args) {
		Week today = null; // 객체 자료형은 null 초기화
		
		Calendar cal = Calendar.getInstance();
		
		//System.out.println(cal.get(Calendar.YEAR));
		int day = cal.get(Calendar.DAY_OF_WEEK);
		// 0-일, 1-월, 2-화, 3-수, 4-목, 5-금, 6-토
		System.out.println(day);
		
		switch(day) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		System.out.println("Today is " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 영화 보러갑니다.");
		}else {
			System.out.println("열심히 프로그램 코딩합니다.");
		}
		
	}

}
