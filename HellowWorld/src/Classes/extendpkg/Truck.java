package Classes.extendpkg;

public class Truck extends Vehicle {

	@Override
	void run() {  //vehicle클래스의 메소드run만 재정의를 해줌
		System.out.println("트럭이 달립니다.");
	}

}
