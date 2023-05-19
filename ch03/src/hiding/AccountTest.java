package hiding;

public class AccountTest {

	public static void main(String[] args) {
		
		// 계좌 생성
		Account account = new Account("1001-1111", "홀란드", 1000000);
		
		
		
		// 계좌 객체 생성
		
		Account a1 = new Account("1000-1234", "이몽룡", 50000);
		Account a2 = new Account("5000-1234", "시진핑", 10);
		
		
		a1.setAcc("2000-1234");
		
		System.out.println("계좌번호: " + a1.getAcc());
		System.out.println("계좌주: " + a1.getOwner());
		System.out.println("잔액: " + a1.getBalance());
		
		System.out.println();
		
		System.out.println("계좌번호: " + a2.getAcc());
		System.out.println("계좌주: " + a2.getOwner());
		System.out.println("잔액: " + a2.getBalance());
		
		
	}

}
