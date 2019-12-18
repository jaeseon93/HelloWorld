package Operators;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		x++; // x = x+1
		y--; // y= y-1
		System.out.println("x:" + x + ", y: " + y);

		System.out.println(++x); // x=12

		boolean play = true;
		System.out.println(play);

		for (int i = 0; i <10;i++) {
		play = !play;
		System.out.println(play);
		
		if(play)
			System.out.println(play + "한번 더 출력");
	}
}
}
