package common;

public class IntExample {
    public static void main(String[] args) {
		int var1 = 10;
		int var2 = 010;
		int var3 = 0x7;
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
	
        for(int i = 0; i < 10; i++) {
//        	System.out.println(var3++);
        	System.out.printf("%2X%n", var3++);
      
        }
    }
}
