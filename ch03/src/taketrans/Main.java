package taketrans;

public class Main {

	public static void main(String[] args) {
		// 사람 객체 생성
		
		Person inbi = new Person("박인비", 10000);
		Person nara = new Person("권나라", 5000);
		
		// 버스 객체 생성
		
		Bus bus100 = new Bus(100);
		Bus bus9700 = new Bus(9700);
		
		
		// 사람이 버스를 탄다
		inbi.takeBus(bus100);
		nara.takeBus(bus100);
		
		
		
		inbi.showInfo();
		bus100.showInfo();
		
		System.out.println();
		
		nara.showInfo();
		bus100.showInfo();
		
	}

}
