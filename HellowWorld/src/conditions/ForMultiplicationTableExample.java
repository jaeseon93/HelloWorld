package conditions;

public class ForMultiplicationTableExample {
   public static void main(String[] args) {
	for (int m = 1; m <= 9; m++) {
		System.out.println("***" + m + "단 ***");
    for (int n = 2; n <=9; n++) { 
    	System.out.print(n + "X" + m + " = " + (m*n) + "|");
    }
	}
}
}
