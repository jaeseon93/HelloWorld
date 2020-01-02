package test;

import java.util.Scanner;

import test01.SwimmingPool;


public class Exam3 {
	int kor;
	int eng;
	int mat;
	int sum = kor+eng+mat;
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {		
			


		float avg = 0;
		System.out.print("name: ");
		String name = sc.nextLine();
		System.out.print("kor: ");
		int kor = sc.nextInt(); sc.nextLine();
		System.out.print("kor: ");
		int eng = sc.nextInt(); sc.nextLine();
		System.out.print("kor: ");
		int mat = sc.nextInt(); sc.nextLine();
		int sum = kor+eng+mat;
		String num = String.format("%.2f", sum);
	
		System.out.println("이름:" + name + "합계점수:" + sum );
		System.out.println(num);
	}
}
