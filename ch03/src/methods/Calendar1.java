package methods;

import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		// Calendar 클래스 사용
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.getCalendarType());
		
		// 날짜 - 월에 1을 더해줌(1월 - 0번 인덱스)
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		// 월이 10 미만이면 0을 포함하여 두자리 문자로 표기하며, 아니면 그대로 표기함
		String strMonth = (month < 10) ? ("0" + month) : ("" + month);
		int date = cal.get(Calendar.DATE);
		String strDate = (date < 10) ? ("0" + date) : ("" + date);
		
		System.out.println(year);
		System.out.println(strMonth);
		System.out.println(date);
		
		// 시간
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		// 요일 : 1-일, 2-월, 3-화, 4-수, 5-목, 6-금, 7-토
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		String[] days = new String[]{"일", "월", "화", "수", "목", "금", "토"};
		
//		System.out.printf("%d년 %d월 %d일\n", year, month, date); // 숫자형 d 
//		System.out.printf("%d시 %d분 %d초\n", hour, minute, second);
//		System.out.println("오늘은 " + days[day-1] + "요일입니다.");
		
		
		System.out.printf("%d년 %s월 %s일\n", year, strMonth, date); // 문자형 s
		System.out.printf("%d시 %d분 %d초\n", hour, minute, second);
		System.out.println("오늘은 " + days[day-1] + "요일입니다.");
		
		
	}

}
