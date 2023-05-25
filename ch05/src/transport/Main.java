package transport;

public class Main {

	public static void main(String[] args) {
		// 사람 객체 생서
		Person p1 = new Person("조혜원", 10000);
		Person p2 = new Person("마운트", 20000);
		
		// 버스 객체 생성
		Bus bus740 = new Bus("740");
		Taxi taxi2222 = new Taxi("2222");
		
		p1.take(bus740, 1300);
		p1.take(taxi2222, 4800);
		p2.take(bus740, 1300);
		p2.take(taxi2222, 4800);
		
		
		
		p1.showInfo();
		p2.showInfo();
		
		bus740.showInfo();
		taxi2222.showInfo();
	}

}
