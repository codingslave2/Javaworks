package abstractex.phone;

public class Phone {
	//필드
	public String owner; //주인
	
	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 매소드
	public void powerOn() {
		System.out.println("폰 전원을 켭니다");
	}
	
	public void powerOff() {
		System.out.println("폰 전원을 끕니다");
	}
}
