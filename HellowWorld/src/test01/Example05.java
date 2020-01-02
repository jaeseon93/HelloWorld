package test01;

import java.util.Scanner;

public class Example05 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("-입력- "); 
		System.out.println("    ");
		System.out.print("품명: ");	
		String item = sc.nextLine();
		System.out.print("수량: ");
		int qty = sc.nextInt();
		sc.nextLine();
		System.out.print("단가: ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("-출력- ");
		System.out.println("    ");
		System.out.print("품명: " + item); 
		System.out.println("    ");
		System.out.println("금액 = " + (qty * price));

	}

}
