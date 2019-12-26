package Classes;

import java.util.Scanner;

public class BankApplication {

	// 계좌들이 저장될 수 있는 저장소를 만들기.
	// 1.여러개를 저장할 수있는 것은 배열. 배열 필드를 하나 선언한다.[100개까지저장가능]
	// 메인 메소드에서 바로 사용할 수 있도록 배열필드선언에도 static을 붙임.안붙어있으면 메인에서 사용 못함.
	// 2.키보드로부터 입력을 받아야 하기때문에 scanner도 선언해줌.(키보드로부터읽겠다)
	// scanner를 선언해주면 import를 지정해주어야 한다.
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("=======================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("=======================================");
			System.out.print("선택> "); // 사용자가 바로 입력하도록 ln붙이지않기!!

			// 사용자가 입력한 숫자를 읽겠다는 뜻.
			int menu = sc.nextInt();

			if (menu == 1) {
				createAccount(); // 밑에 선언한 메소드를 호출하도록 적음.
			} else if (menu == 2) {
				accountList();
			} else if (menu == 3) {
				deposit();
			} else if (menu == 4) {
				withdraw();
			} else if (menu == 5) {
				run = false; // 5번이되면 종료가 되어야 하기때문에 false로 동작을 정지시킨다.
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌 생성하기 (1번화면 출력하기)
	private static void createAccount() {
		System.out.println("---------");
		System.out.println("계좌생성 : ");
		System.out.println("---------");

		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("계좌주 : ");
		String owner = sc.next();
		System.out.print("초기입금액 : ");
		int balance = sc.nextInt();

		// 하나의 계좌 객체를 만들기
		Account newAccount = new Account(ano, owner, balance);
		// 배열의 null값에 하나하나씩 잘 들어가도록 명력문만들어주기. ==null값인지 조사를한다는뜻.
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}

	// 계좌 목록보기
	private static void accountList() {
		System.out.println("---------");
		System.out.println("계좌목록 : ");
		System.out.println("---------");

		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if (account != null) { // account에 값이 저장되어있다면~(널이아니면의뜻)
				System.out.print(account.getAno()); // getter를 이용해서 접근함
				System.out.print("    ");
				System.out.print(account.getOwner());
				System.out.print("    ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}

	// 예금하기
	private static void deposit() {
		System.out.println("---------");
		System.out.println("예금 ");
		System.out.println("---------");
		System.out.println("계좌번호: ");
		String ano = sc.next();
		System.out.println("예금액: ");
		int money = sc.nextInt();

		// account 객체를 배열에서 찾아오기
		Account account = findAccount(ano); // findAccount메소드로 리턴해서 찾기.
		if (account == null) {
			System.out.println("계좌를 찾을 수 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("예금이 성공되었습니다.");
	}

	// 출금하기
	private static void withdraw() {
		System.out.println("---------");
		System.out.println("출금 ");
		System.out.println("---------");
		System.out.println("계좌번호: ");
		String ano = sc.next();
		System.out.println("출금액: ");

		int money = sc.nextInt();

		// account 객체를 배열에서 찾아오기
		Account account = findAccount(ano); // findAccount메소드로 리턴해서 찾기.
		if (account == null) {
			System.out.println("계좌를 찾을 수 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("출금이 성공되었습니다.");
	}

//	 Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if (dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return null;
	}
}
