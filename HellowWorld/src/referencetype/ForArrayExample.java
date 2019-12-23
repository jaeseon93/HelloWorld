package referencetype;

public class ForArrayExample {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10의합: " + sum);

		int i = 1;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("1~10의합: " + sum);
		
		// 1~100까지 3의배수의 합
		sum = 0;
		for (int j = 1; j <= 100; j++) {
			if (j % 3 == 0) { 
				sum += j;
			}

		}
		System.out.println("3의배수의합: " + sum);

//		 1~100사이의 7의배수 출력
//	    1. 1~100사이에서 7의배수 골라내기
//      2. 
		
	}

}
