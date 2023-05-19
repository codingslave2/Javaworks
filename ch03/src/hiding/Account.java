package hiding;

public class Account {

	private String acc; // 계좌번호
	private String owner; // 계좌주
	private int balance; // 잔고
	
	public Account(String acc, String owner, int balance) {
		this.acc = acc;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAcc() {
		return acc;
	}
	
	public void setAcc(String acc) {
		this.acc = acc;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
