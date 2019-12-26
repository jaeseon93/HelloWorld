package Classes;

public class CalculatorExample {
      public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.execute();
		
		double avg = cal.avg(30, 50);  //클래스밖에서 매소드 호출할 때 도트(.)으로 불러와야 함 
	    cal.println("두수의 " + avg);
      
      }
}
