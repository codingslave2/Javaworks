package methods;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		// 날짜와 시간 객체 생성
		
		Date now = new Date();
		System.out.println(now);
		
		// 날짜와 시간 형식(년,월,일, 시:분:초)
		SimpleDateFormat datetime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a"); // 날짜 시간
		System.out.println(datetime.format(now));
		
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd"); // 날짜
		System.out.println(date.format(now));
		
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a"); // 시간
		System.out.println(time.format(now));
		
	}

}