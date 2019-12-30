package Classes.extendpkg;

public class Child extends Parent {
	String field2;

	//부모클래스의 메소드를 자식클래스에서 재정의함
	@Override
	void method1() {
		System.out.println("자식클래스의 메소드1");
//		super.method1();  부모클래스의 메소드를 그대로 호출하려면 놔두면 됨
	}

	@Override
	void method2() {
		System.out.println("자식클래스의 메소드2");
	}

	void method3() {
		System.out.println("자식클래스의 메소드3");
	}

}
