package singleton.card;

public class CardCompany {
	
	private static CardCompany instance;
	
	private CardCompany() {
		
	}
	
	//getInstance() 매소드 생성
	public static CardCompany getInstance() {
		if(instance == null) {
			if(instance == null) {
				instance = new CardCompany();
			}
			return instance;
		}
		public Card createCard() {
			Car card = new Car();
			return card;
		}
	}
	
	
}
