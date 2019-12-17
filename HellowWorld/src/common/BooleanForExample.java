package common;

public class BooleanForExample {
	public static void main(String[] args) {
		int var1 = 88;
		var1 = 10;
		for (int i = 0; i < 10; i++) {
		}
		// 60점을 넘으면 pass 아니면 fail
		// 90점을 넘으면 양호, 70점을 넘으면 보통, 아니면 미흡.

//		if (var1 > 60)
//			System.out.println("pass");
//		else
//			System.out.println("fail");
//		if (var1 > 90)
//			System.out.println("양호");
//		else if (var1 > 70)
//			System.out.println("보통");
//		else
//			System.out.println("미흡");
		if (var1 > 90) {
			System.out.println("A");
			if (var1 > 95) {
				System.out.println("A+");
			}
			
		} if (var1 > 80) {
		  if (var1 > 85)
			System.out.println("B");
		  else System.out.println("B+");
		  
		} else if (var1 > 70) {
			System.out.println("C");
		} else if (var1 > 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
