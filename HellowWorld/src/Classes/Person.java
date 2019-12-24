package Classes;
//사람이라는 객체의 클래스를 만들기.
public class Person {
	String personName;
	String personColor;
	String personFood;
	String area;
	int age;
	
 //생성자
	Person(){
		
	}
	
	Person(String personName, int age, String personFood){   //매개값이 3개있는 생성자.
		this.personName = personName; //이름이 같을경우 구분해 주기위해서 this라는 인스턴스를 붙여준다.
		this.age = age;
		this.personFood = personFood;
	}
	
//메소드
	void introduce() {
		System.out.println("이름은 " + personName + "이고 나이는" + age + "," + "좋아하는 음식은" + personFood + "입니다.");
	}
	void sleep() {
		System.out.println("꿀잠잔다.");
	}
	void exercise() {
		System.out.println("수영한다.");
	}
	void watchMovie() {
		System.out.println("영화본다.");
	}
}
