package test;

import java.util.Scanner;

class Sample{
	//필드를 선언
	int price;
	String item;
	int qty;
	//생성자선언 = 클래스와 이름이 같은게 생성자
	Sample() {		
	}
	Sample(int price){
		this.price = price;
	}
	Sample(int price, String item){
		this.price = price;
		this.item = item;
	}

}


public class SampleExe {

	public static void main(String[] args) {
		Sample sample = null; //new sample
		sample = new Sample(30, "apple"); 
			
		//메뉴만들기
		Scanner scn = new Scanner(System.in);
		Sample[] samAry = new Sample[100];
		int[] intAry = new int[10]; 
		Sample se = new Sample(30, "apple"); 
		samAry[0] = se; //같은 클래스 타입끼리만 대입이 가능.
		
		
		System.out.println("메뉴선택 1 2 3");
		int menu = scn.nextInt(); // 사용자가 입력하도록 기다리는 부분. //엔터키를 소진시켜주는 부분 = nextLine(); 문자열을 먼저 입력할경우에는 nextLine만
									// 쓰면 엔터키까지 소진시켜준다.
		scn.nextLine();
		System.out.println("다음 선택1");
		scn.nextLine();
		System.out.println("다음 선택2");
		scn.nextLine();

		if (1 == 1 && 2 == 1) { // 첫번째도 참이고 두번째도 참이면 오류를 출력하고 아니면 else 실행
			System.out.println("오류 !!");
		} else {
			double result = (double) 4 / 3; // 결과값이 소수점까지 나오게 하려면 강제 타입변환 시키기
		}

		cal("item", 3, 1000);

	}

	// static 메소드가 위에서 이미 실행되고 있기때문에 메인메소드 안에서 만들어줄경우, 똑같이 static을쓰고 메소드를 생성시킨다.
	// 만약에 메인메소드안에 만들지 않을경우, 따로 생성자를 생성해주어야한다.
	static int cal(String a, int b, int c) {

		return 10; // 리턴값이 필요한 메소드이기 때문에 int타입의 수를 적어준다.

	}
}
