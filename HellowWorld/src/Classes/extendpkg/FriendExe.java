package Classes.extendpkg;

import java.util.Scanner;

import Classes.Account;

public class FriendExe  {

	// 회사친구와 학교친구의 연락처를 조회하는 프로그램을 만들기.
//		1)입력 2)조회 3)리스트 4)종료
// 1)입력창에는 대학교동창->입력항목 / 회사동료->입력항목 / 그외->이름,연락처
// 2)조회는 이름으로. 

	private static Friend[] friendArray = new Friend[100]; // 배열을 선언할때 임의의 숫자를 지정해야함
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) { // break구문을 만나기 전까지는 계속해서 반복 (while구문)
			System.out.println("=============================");
			System.out.println("1.입력 | 2.조회 | 3.리스트 | 4.종료 |");
			System.out.println("=============================");
			System.out.print("선택> "); // 사용자가 바로 입력하도록 ln붙이지않기!!
			int menu = sc.nextInt();

			if (menu == 1) {
				insert(); // 밑에 메소드를 선언해주기.
			} else if (menu == 2) {
				friendSearch();
			} else if (menu == 3) {
				friendList();
			} else if (menu == 4) {
				run = false; // 4번이되면 종료가 되어야 하기때문에 false로 동작을 정지시킨다.
			}
		}
		System.out.println("프로그램 종료");
	}

	// 1번.입력화면 출력하기
	private static void insert() {
		System.out.println("===========================");
		System.out.println("1.대학교동창 | 2.회사동료 | 3.그외 |");
		System.out.println("===========================");
		System.out.print("입력> "); // 사용자가 바로 입력하도록 ln붙이지않기!!
		int menu = sc.nextInt();
		// 하나의 값들만 입력하고 빠져나올것이기 때문에 반복문 불필요
		if (menu == 1) {
			univFriend(); // 밑에 메소드를 선언해주기.

		} else if (menu == 2) {
			comFriend();

		} else if (menu == 3) {
			etc();
		}

	}

	// 1번)입력창에 대학교 동창 정보칸
	private static void univFriend() {
		System.out.print("동창이름 입력: ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.print("폰번호 입력: ");
		String phone = sc.nextLine();
		System.out.print("대학이름 입력: ");
		String univ = sc.nextLine();
		System.out.print("전공 입력: ");
		String major = sc.nextLine();
		UnivFriend newunivFriend = new UnivFriend(name, phone, univ, major);
		for (int i = 0; i < friendArray.length; i++) {
			if (friendArray[i] == null) {
				friendArray[i] = newunivFriend;
				System.out.println("주소록이 등록되었습니다.");
				break; // break를 하지 않으면 100건을 다 넣어버림
			}
		}
	}

	private static void comFriend() {
		System.out.print("회사동료 이름 입력: ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.print("폰번호 입력: ");
		String phone = sc.nextLine();
		System.out.print("회사 이름 입력: ");
		String company = sc.nextLine();
		System.out.print("부서이름 입력: ");
		String dept = sc.nextLine();
		ComFriend newcomFriend = new ComFriend(name, phone, company, dept);
		for (int i = 0; i < friendArray.length; i++) {
			if (friendArray[i] == null) {
				friendArray[i] = newcomFriend;
				System.out.println("주소록이 등록되었습니다.");
				break; // break를 하지 않으면 100건을 다 넣어버림
			}
		}
	}

	private static void etc() {
		System.out.print("그외 이름 입력: ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.print("폰번호 입력: ");
		String phone = sc.nextLine();
		Friend newetc = new Friend(name, phone);
		for (int i = 0; i < friendArray.length; i++) {
			if (friendArray[i] == null) {
				friendArray[i] = newetc;
				System.out.println("주소록이 등록되었습니다.");
				break;
			}
		}
	}

//친구 이름으로 조회하기.
	private static void friendSearch() {
		System.out.println("==================");
		System.out.println("친구조회 하기  ");
		System.out.println("==================");
		System.out.print("이륾으로 조회> "); sc.nextLine();
		sc.nextLine();
		for (int i = 0; i < friendArray.length; i++) {
			Friend friend = friendArray[i];
			if (friend != null) { // friend에 값이 저장되어있다면~(널이아니면의뜻)
				System.out.print(friend.getName()); // getter를 이용해서 접근함
				System.out.print("    ");
				System.out.println();
			}
		}
	}

// 친구 목록 출력하기.
// 회사친구면 이름,폰번호,회사명,부서 출력
// 학교친구면 이름,폰번호,학교명,전공 출력
	private static void friendList() {
		System.out.println("==================");
		System.out.println("친구목록 보기  ");
		System.out.println("==================");
		System.out.print("조회> "); sc.nextLine();
		sc.nextLine();
		
		for (int i = 0; i < friendArray.length; i++) {
			Friend friend = friendArray[i];
			if (friend != null) { // friend에 값이 저장되어있다면~(널이아니면의뜻)
				System.out.print("이름: " + friend.getName()); // getter를 이용해서 접근함
				System.out.print("   ");
				System.out.print("폰번호: " + friend.getPhone());
				System.out.print("   ");
			
//				System.out.println(friend.getCompany());
//				System.out.print("    ");
//				System.out.println(cf.getDept());
//				System.out.print("    ");
			}

		}
	}

	static Friend findFriend(String name) {
		Friend friend = null;
		for (int i = 0; i < friendArray.length; i++) {
			if (friendArray[i] != null) {
				String findf = friendArray[i].getName();
				if (findf.equals(name)) {
					friend = friendArray[i];
					break;
				}
			}
		}
		return friend;
	}
}
