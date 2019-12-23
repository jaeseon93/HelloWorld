package referencetype;

//메인 메소드 밑에 항상 다른 메소드가 와야한다.
//각 메소드 안에 값들을 선언해주고 메인에서 표현한다.
public class MethodExample {
	public static void main(String[] args) {
		double s1 = divideBy(5, 3);
		System.out.println("s+1: " + s1);
		String result = printResult("재선");
		System.out.println(result);
	}

	public static double divideBy(int a, int b) {
		double result = (double) a / b;
		System.out.println(result);
		return result;
	}

	public static String printResult(String name) {
		String str = "안녕하세요" + name + "씨.";
		return str;
	}

	public static double calculator(double a, double b, String cal) {
		if (cal.equals("+")) {
			double result = a + b;
			return result;
		}
		if (cal.equals("-")) {
			double result = a - b;
			return result;
		}
		if (cal.equals("*")) {
			double result = a * b;
			return result;
		}
		if (cal.equals("/")) {
			double result = a / b;
			return result;
		}
		if (cal.equals("%")) {
			double result = a % b;
			return result;
		}
		
	}
}
