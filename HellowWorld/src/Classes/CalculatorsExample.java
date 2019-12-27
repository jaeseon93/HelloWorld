package Classes;

class Calculators {
	static double PI = 3.14159; // 정적변수 대문자로표기(PI), 두단어이상은 _ 로표기 (예> EARTH_AREA)
	String color;

	//static이 안붙은 아이는 '인스턴스매소드'
	void setColor(String color) {
		this.color = color;
	}

	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int a, int b) {
		return a - b;
	}

}

public class CalculatorsExample {
	public static void main(String[] args) {

		Calculators cal = new Calculators(); //위에 생성자 생성은 안되어있지만 생략되어있다고 생각하면 된다.
		cal.color = "White";
		cal.setColor("Orange");  //인스턴스메소드는 반드시 인스턴스 선언후, 사용
		
		cal.plus(4, 5);   //static메소드는 calculators가 접근해도 된다.
		Calculators.plus(6, 7); //static(정적)메소드는 ' 클래스명.메소드 'calculators가 접근해도 된다.   위에거보다 이게 더 편하고 좋다.
		
		
	
	}
}
