package common;

public class GarbageValueExample {
   public static void main(String[] args) {
	   int var1 = 125; //2,123,483,647
	   byte var2 = 125; // 127
	   
	   for(int i = 10; i > 0; i--) { // i = i -1 ;
		   var1 = var1 + i;          // var1 = 125 + 0
		   var2 = (byte) (var2 + i); // int -> byte 형변환(casting)
		   System.out.println("var1 : " + var1 + ", " + "var2 : " + var2);
		   
	   }
	   
 }
}
