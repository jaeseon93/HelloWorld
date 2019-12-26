package conditions;

public class IfExample {
	public static void main(String[] args) {
		int score = 97;

		if (score >= 90) {
			if (score >= 95) {
				System.out.println("점수가 95보다 큽니다.");
				System.out.println("등급은 A+ 입니다.");
			}
			if (score < 95)
				System.out.println("등급은 A");
		}

		else {
			if (score > 80) {
				System.out.println("등급이 B");

			} else {
				if (score > 70) {
					System.out.println("등급이 C");
				}

			}
		}

//		if (score < 90) {
//			System.out.println("점수가 93보다 작습니다.");
//			System.out.println("등급은 B");
//		}
	}
}
