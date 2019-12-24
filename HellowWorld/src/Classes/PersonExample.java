package Classes;

import java.util.Scanner;

public class PersonExample {
	public static void main(String[] args) {
		// p1,p2,p3 라는 변수를 저장할때 여러가지 방법으로도 할 수 있다.
		// Person p1 = new Person();하고 p1.필드명을 저장해서 하나씩 선언할수도 있고,
		// Person p2 = new Person()하고 바로 ()안에 입력할 수 도 있다.
		Person p1 = new Person();
		p1.personName = "하재선";
		p1.age = 27;
		p1.personFood = "떡볶이";

		Person p2 = new Person("펭수", 10, "참치");

		Person p3 = new Person("펭수", 10, "빠다코코넛");

		Person[] personAry = new Person[3];

		personAry[0] = p1;
		personAry[1] = p2;
		personAry[2] = p3;

//	 for (int i = 0; i<3;i++) {
//		 personAry[i].introduce();
//	 }

// 확장 for (더 간편하다.)    //
		for (Person p : personAry) {
			p.introduce();
		}

		System.out.println("=======================================");

		System.out.println(personAry[1].personName + "는 " + personAry[1].age + "살, " + "좋아하는 음식은" + personAry[1].personFood);
 
		
		
		Scanner scanner = new Scanner(System.in);
		String inputString;

		System.out.println("******************************");
		System.out.println("이름을 입력하세요.");
		System.out.println("******************************");

		System.out.println("입력> ");
		inputString = scanner.nextLine();
		System.out.println(inputString);
		
		for (Person p : personAry) {
			p.name();
		
		if(personAry[1].personName.equals(p.name()) {
			
		}
		}
		

	}
}
