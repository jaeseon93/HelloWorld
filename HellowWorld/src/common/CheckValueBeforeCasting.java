package common;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 128;
//		Byte // byte와 다름 Byte라고 하는 클래스가 있음.
		if (i > Byte.MAX_VALUE || i < Byte.MIN_VALUE) {
			System.out.println("byte 타입으로 변환불가.");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
	}
}