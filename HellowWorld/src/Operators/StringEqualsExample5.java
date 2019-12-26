package Operators;

public class StringEqualsExample5 {
	public static void main(String[] args) {
//		String str1 = "하재선";
//		String str2 = "하재선";
//		String str3 = new String("하재선");

//		System.out.println(str1 == str2);
//		System.out.println(str2 == str3);
//       
//		System.out.println(str1. equals (str2));
//		System.out.println(str1. equals (str3));	
//  
//        if (str1.equals (str3)) {  //클래스를 비교할경우 equals
//        	System.out.println("같은 내용입니다.");
//        } else {
//        	System.out.println("다른 내용입니다.");
	
    int score = 60;
    char grade;
    grade = (score > 90) ? 'A' : (score > 80) ? 'B' : (score > 70) ? 'C' : 'D';
    
    System.out.println(grade);
   
  }
}
