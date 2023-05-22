package statics;

public class Card {
	static int serialNum = 100;
	int cardNum; // 카드 번호
	
	Card(){
		serialNum++; // cardNum을 1씩 증가
		cardNum = serialNum;
	}
	
	// 카드 번호를 가져오는 함수 정의
	
	int getCardNum() {
		return cardNum;
	}

}
