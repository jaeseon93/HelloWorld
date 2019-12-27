package Classes;

public class MethodExample2 {

	public static void main(String[] args) {
		double result = sum(3.3, 4.5);
		System.out.println("결과는" + result);
		// 배열을 호출
		int[] intAry = { 2, 3, 4, 5, 6, 7 };
//		int sum = 0;
		int sum = sum(intAry);
		for (int i = 0; i < intAry.length; i++) {
			sum = sum + intAry[i];
		}
		System.out.println("합계는 " + sum);

		int[] intAry2 = { 3, 4, 5 };
		sum = 0;
		sum = sum(intAry2);
		System.out.println("합계는 " + sum);

		// ( *을 다섯줄 찍어달라는뜻, "표시하고자 하는 문자열")
		printString(5,"*");


	}

	// return값이 필요한 메소드호출 (double 타입)
	public static double sum(double a, double b) {
		return a + b;
	}

	// return 값이 필요한 메소드 호출 (int타입)
	public static int sum(int[] iary) {
		int sum = 0;
		for (int i = 0; i < iary.length; i++) {
			sum = sum + iary[i];
		}
		return sum;
	}

//	*
//	**
//	***
//	****
//	*****

//	5
//	55
//	555
//	5555
//  55555

	public static void printString(int x, String str) {
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(str);
			}
			System.out.println();
		}
	}

}