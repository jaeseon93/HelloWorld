package Classes;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("=======================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("=======================================");
			System.out.println("선택> ");

			int menu = sc.nextInt();

			if (menu == 1) {
				createAccount();
			} else if (menu == 2) {
				accountList();
			} else if (menu == 3) {
				deposit();
			} else if (menu == 4) {

			} else if (menu == 5) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌 생성하기
	private static void createAccount() {
		Account acc = new Account();
		System.out.println("계좌번호를 입력: ");
		String ano = sc.nextLine();
		acc.setAno(ano);
		System.out.println("계좌이름을 입력: ");
		String owner = sc.nextLine();
		acc.setOwner(owner);
		System.out.println("잔액 확인: ");
		int balance = sc.nextInt();
		acc.setBalance(balance);

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = acc;
				break;
			}
		}
	}

	// 계좌 목록보기
	private static void accountList() {
		for (Account a : accountArray) {
			if (a != null)
				System.out.println(a);
		}
	}
	
	//예금하기
	private static void deposit() {
		
	}
	
	//출금하기
	private static void withdraw() {
		
	}
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		
	}
}
