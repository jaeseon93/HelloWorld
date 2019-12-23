package referencetype;

public class MethodExample {
   public static void main(String[] args) {
	  double s1 = divideBy(5,3);
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
   
}
