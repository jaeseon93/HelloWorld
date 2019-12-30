package Classes.extendpkg;

public class ParrentExample {

	public static void main(String[] args) {
		Parent parent = new Child(); // 자식클래스를 부모클래스에 형변환
		parent.method1();
		parent.method2();
		// parent.method3(); //부모클래스의 정의되어 있지 않기때문에 사용불가능.
		if (parent instanceof Child) { //부모인스턴스를 자식인스턴스로 강제 형변환할 경우 체크가 필요.
			Child child = (Child) parent; // parent변수에 담겨있는 parent인스턴스를 강제로Child타입으로 형변환시킴
			child.field2 = "data2";
			child.method3();
		}
		Parent parent2 = new Parent();
		if (parent2 instanceof Child) { // parent2의 인스턴스가 child인스턴스 값이 맞는지 체크
			Child child2 = (Child) parent2;
			child2.method3();
		} else {
			System.out.println("형변환 할 수 없습니다.");
		}
		
		Object object = new Parent(); //object클래스는 모든클래스의 최상위클래스이기때문에 모든 클래스를 다 받을수 있다.
//		parent2. 을하면 parent클래스에서정의한 필드와 메스도뿐만이 아니라 다른 메소드도 나와있는것을 볼 수 있다. 그이유는 object클래스를 저장했기때문에
//		클래스를 정의 해주지 않으면 디폴트값으로 Object클래스를 받는다.
	}
}
