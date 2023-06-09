package banking.bankarray;

public class AccountTest {

	public static void main(String[] args) {
		// Account 클래스의 배열 객체 생성
		// 1개 생성
		
		Account ac = new Account("1111", "김시원", "10000");
		
		System.out.println("계좌번호: " + ac.getAcc());
		System.out.println("계좌주: " + ac.getOwner());
		System.out.println("계좌잔액: " + ac.getBalance());
		
		// Account 계정 10개 생성
		
		Account[] accountArray = new Account[10];
		
accountArray[0] = new Account("2222", "이대리", "10000");
		
		// 계좌 번호 목록을 출력하는 메소드
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null)
				System.out.println("계좌번호 " + accountArray[i].getAcc() + "\t");
				System.out.println("계좌주 " + accountArray[i].getOwner() + "\t");
				System.out.println("계좌잔액 " + accountArray[i].getBalance() + "\t");
		}
	}

}


// 계좌를 검색하는 매소드

	private static Account findAccount(String);
