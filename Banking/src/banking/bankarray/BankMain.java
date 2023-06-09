package banking.bankarray;

import java.util.Scanner;

public class BankMain {
	// 통장 계좌를 만들 객체 배열 100개 생성
	static Account[] accountArray = new Account[100];
	static Scanner scanner = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("==========================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("==========================================");
			System.out.print("선택> ");
			
			// 메뉴 선택 변수
			int selectNum = Integer.parseInt(scanner.nextLine()); // 문자행을 숫자행으로 변형
			
			// 계좌 생성
			if(selectNum == 1) {
				createAccount();
			
			// 계좌 목록	
			}else if(selectNum == 2) {
				getAccountList();	
				
			}else if(selectNum == 3) {
				deposit();
			
			}else if(selectNum == 4) {
				withdraw();	
			
			}else if(selectNum == 5) {
				run = false;
				
				
				System.out.println("프로그램을 종료합니다.");
			}else {
				System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요.");
			}
			
		} // while 끝
		
		
	} // main() 끝
	
	private static void createAccount() {
	    System.out.println("==========================================");
	    System.out.println("계좌생성");
	    System.out.println("==========================================");

	    System.out.print("계좌번호: ");
	    String acc = scanner.nextLine();

	    // 이미 존재하는 계좌인지 확인
	    if (findAccount(acc) != null) {
	        System.out.println("결과: 이미 중복된 계좌번호입니다.");
	        return; // 중복된 계좌번호이므로 계좌 생성 중단
	    }

	    System.out.print("계좌주: ");
	    String owner = scanner.nextLine();

	    System.out.print("초기입금액: ");
	    int balance = Integer.parseInt(scanner.nextLine());

	    for (int i = 0; i < accountArray.length; i++) {
	        if (accountArray[i] == null) {
	            accountArray[i] = new Account(acc, owner, balance);
	            System.out.println("결과: 계좌가 생성되었습니다.");
	            return; // 계좌 생성 후 종료
	        }
	    }

	    System.out.println("결과: 계좌를 더 이상 생성할 수 없습니다. 계좌가 가득 찼습니다.");
	}
		
		
	
	
	// 계좌 목록을 출력하는 메소드
	private static void getAccountList(){
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) { // 배열의 요소가 null이 아닌 경우(계좌가 있으면)
				Account account = accountArray[i]; // 출력할 계좌 저장
				System.out.print("계좌번호: " + account.getAcc() + "\n");
				System.out.print("계좌주: " + account.getOwner() + "\n");
				System.out.print("잔액: " + account.getBalance() + "\n");
			}
			
		}
	}

	
	// 계좌를 생성하는 함수
	private static void deposit() {
		System.out.println("==========================================");
		System.out.println("예금");
		System.out.println("==========================================");
		
		System.out.print("계좌번호: ");
		String acc = scanner.nextLine();
		
		boolean a = true;
		while(a) {	
			
		System.out.print("출금액: ");		
			
		int money = Integer.parseInt(scanner.nextLine());
				
		if(findAccount(acc) != null) { // 계좌를 찾았다면(반환값이 있다면)
			// 예금 = 잔고 + 예금액
			Account account = findAccount(acc);
			account.setBalance(account.getBalance() - money);
			System.out.println("결과: 정상 처리 되었습니다.");
			a = false;
			}else {
				System.out.println("결과: 잔액이 부족합니다.");{
			}
			
				System.out.println("결과 : 계좌가 없습니다.");
		}
		}
	}
	
	// 계좌에서 출금하는 매소드
	
		private static void withdraw() {
			    System.out.println("==========================================");
		        System.out.println("출금");
		        System.out.println("==========================================");

		        System.out.print("계좌번호: ");
		        String acc = scanner.nextLine();

		        Account account = findAccount(acc);
		        if (account == null) {
		            System.out.println("계좌가 없습니다.");
		        }else {
		        	System.out.println("출금액: ");
		        	int balance = Integer.parseInt(scanner.nextLine());
		        }
	
		}
	
	// 계좌를 검색하는 메소드
		private static Account findAccount(String acc) {
			Account account = null; // 빈 계좌 계정을 할당
			
			for(int i=0; i<accountArray.length; i++) {
				if(accountArray[i] != null) { // 없는 계좌를 입력하면 null 예외 발생
				String dbAcc = accountArray[i].getAcc(); // 이미 저장된 계정
				if(dbAcc.equals(acc)) { // 문자열 비교 - equals() 사용
					account = accountArray[i]; // 계좌를 가저와 저장
					break; // 반복 종료
				
			}
		}
	}
			
			
			return account;
		
	}
	
	
	
} //Main 클래스 끝
