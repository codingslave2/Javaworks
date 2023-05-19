package taketrans;

public class Main2 {

	public static void main(String[] args) {
		// 사람 객체 생성
		
		Person2 inbi = new Person2("박인비", 10000);
		Person2 nara = new Person2("권나라", 5000);
		
		// 버스 객체 생성
		
		Subway subway2 = new Subway("분당선");
		
		
		
		// 사람이 버스를 탄다
		inbi.takeSubway(subway2);
		nara.takeSubway(subway2);
		
		
		
		inbi.showInfo();
		subway2.showInfo();
		
		System.out.println();
		
		nara.showInfo();
		subway2.showInfo();
		
	}

}
