package conditions;

public class Exercise04 {
	public static void main(String[] args) {
		int num1, num2;
		boolean run = true;
		while (run) {
			num1 = (int) (Math.random() * 6) + 1;
			num2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + num1+", " +num2 + ")");
			if (num1 + num2 == 5) {
				run = false; // break 넣어도 상관없음
			}

		}
		System.out.println("프로그램 종료");
	}
}
