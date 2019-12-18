package Operators;

public class OperatorExample {
	public static void main(String[] args) {
		int result = 0;
		int a = 10, b = 20;
//    result = a + b;
//    System.out.println("결과값은 : " + result);
		sum(30, 40);
		multi(30, 40);
	}

	public static void sum(int a, int b) {
		int result = a + b;
		System.out.println("method 결과값은 : " + result);
	}

	public static void multi(int a, int b) {
		// TODO Auto-generated method stub
		int result = a * b;
		System.out.println("method 결과값은 : " + result);

	}
}
