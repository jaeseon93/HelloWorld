package Classes;

class Singleton{
	private static Singleton singleton = new Singleton();
	
	private Singleton() {   //외부에서 호출하지 못하게 함.
		
	}
	static Singleton getInsatance() { //singleton 을 호출하고자 하면 getInstance를 통해서만 호출됨
		return singleton;
	}
}

public class SingletonExample {
   public static void main(String[] args) {
	Singleton singleton = Singleton.getInsatance();
	Singleton singleton2 = Singleton.getInsatance();
	
	if(singleton == singleton2) {
		System.out.println("동일한 객체");
	}else {
		System.out.println("다른 객체");
	}
		
	}
}
}
