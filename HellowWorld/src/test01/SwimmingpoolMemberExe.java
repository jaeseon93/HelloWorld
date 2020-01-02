package test01;

import java.util.Scanner;

import Classes.Account;
import Classes.extendpkg.Friend;

public class SwimmingpoolMemberExe {

	private static SwimmingPool[] mem = new SwimmingPool[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("============*수영장 회원 관리*=====================");
			System.out.println("                                             ");
			System.out.println("=====================================------==");
			System.out.println("1.회원추가 | 2.회원수정 | 3.회원삭제 | 4.회원리스트 | 5.종료 ");
			System.out.println("=============================================");
			System.out.print("선택> ");
			int menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				memberAdd(); // 밑에 선언한 메소드를 호출하도록 적음.
			} else if (menu == 2) {
				memberRevison();
			} else if (menu == 3) {
				memberDlete();
			} else if (menu == 4) {
				memberList();
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void memberAdd() {
		System.out.println("=========");
		System.out.println("회원추가하기  ");
		System.out.println("=========");

		System.out.print("회원 번호 입력: ");
		int memberId = sc.nextInt();
		sc.nextLine();
		System.out.print("회원 이름 입력: ");
		String name = sc.nextLine();
		System.out.print("회원 폰번호 입력: ");
		int phone = sc.nextInt();

		SwimmingPool newMem = new SwimmingPool(memberId, name, phone);
		for (int i = 0; i < mem.length; i++) {
			if (mem[i] == null) {
				mem[i] = newMem;
				System.out.println("회원이 추가되었습니다.");
				break;
			}
		}
	}

	private static void memberRevison() {
		System.out.println("=========");
		System.out.println("회원수정하기  ");
		System.out.println("=========");
		System.out.print("회원아이디로 조회> ");
		int memberId = sc.nextInt();
		System.out.println("조회결과> ");
		SwimmingPool sp = findMem(memberId);
		if (sp != null) {
			System.out.print("회원이름: " + sp.getName() + "   ");
			System.out.print("회원 폰번호: " + sp.getPhone() + "   ");
			System.out.println();
			System.out.println("회원수정> ");
			System.out.print("회원이름 입력: ");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.print("회원 폰번호 입력: ");
			int phone = sc.nextInt();
			sc.nextLine();
			System.out.println("회원정보가 수정되었습니다.");
		}

	}

	private static void memberDlete() {
		// 회원 삭제
		System.out.println("=========");
		System.out.println("회원삭제 ");
		System.out.println("=========");
		System.out.print("삭제 할 회원아이디 조회> ");
		int memberId = sc.nextInt();
		System.out.println("조회결과 = ");
		SwimmingPool sp = findMem(memberId);
		if (sp != null) {
			System.out.print("회원번호: " + sp.getMemberId() + "   ");
			System.out.print("회원이름: " + sp.getName() + "   ");
			System.out.print("회원 폰번호: " + sp.getPhone() + "   ");
			System.out.println();			
		} else{
			
			
		}

	}

	private static void memberList() {
		System.out.println("=========");
		System.out.println("회원리스트  ");
		System.out.println("=========");
		for (int i = 0; i < mem.length; i++) {
			SwimmingPool sp = mem[i];
			if (sp != null) {
				System.out.print("회원 아이디: " + sp.getMemberId() + "    ");
				System.out.print("회원 이름: " + sp.getName() + "    ");
				System.out.print("회원 폰번호: " + sp.getPhone() + "    ");
				System.out.println();
			}
		}
	}

	static SwimmingPool findMem(int memberId) {
		SwimmingPool sp = null;
		for (int i = 0; i < mem.length; i++) {
			if (mem[i] != null) {
				int findM = mem[i].getMemberId();
				if (findM == memberId) {
					sp = mem[i];
					break;
				}
			}
		}
		return sp;
	}

}
