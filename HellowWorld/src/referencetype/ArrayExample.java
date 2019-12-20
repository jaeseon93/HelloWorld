package referencetype;

public class ArrayExample {
	public static void main(String[] args) {
		int[] intAry = { 1, 2, 3, 4, 5 }; // int intAry[] 이렇게도 사용가능
//		System.out.println(intAry[2]); // []자릿수를 의미. 2번째 자리인데도 2가 아니라 3인 이유는 0부터 시작되기때문에.
//		intAry[2] = 30;
//		System.out.println(intAry[2]);

//		int sum = 0;
//		for (int n = 0; n < 5; n++)
//			sum = sum + intAry[n];
//		System.out.println("합계는" +sum);

//		String[] strAry = { "HELLO", "HOME", "NICE", "GOOD" };
//		for (int i = 0; i < 4; i++)
//			System.out.println(strAry[i]);

		int[] num = new int[25];
		int sum = 0; // 합계
		double avg = 0; // 평균

		for (int i = 0; i < 25; i++) {
			num[i] = i * 2 + 2;
			sum += num[i];
//         System.out.println(num[i]);
		}
		System.out.println("배열의 합은 : " + sum);
		avg = sum / 25;
		System.out.println("평균 : " + avg);
	}
}
