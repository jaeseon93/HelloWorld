package Operators;

public class BitReverseOperatorExample {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1; // -11
		int v3 = ~v2 + 1; // -10
		System.out.println(toBinaryString(v1) +", " +v1);
		System.out.println(toBinaryString(v2) + ", " +v2);		
		System.out.println(toBinaryString(v3) + ", " +v3);
	}

	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while (str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
}
