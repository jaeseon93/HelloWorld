package Classes;

public class MethodExample1 {
    public static void main(String[] args) {
		showName();
		showName("Jaeseon HA");
		showAge(27);
	}
    //리턴타입이 없는 메소드(void) 호출     ()매개값 
    public static void showName() {
    	System.out.println("Hello, I am Pengsu");
    }
    //리턴타입이 없고 매개값(String타입)이 있는 메소드를 호출
    public static void showName(String name) {
    	System.out.println("Hello, I am " + name);
    }
    //리턴타입이 없는 매개값(int타입)이 있는 메소드를 호출
    public static void showAge(int age) {
    	System.out.println("Hello, I am " + age + " years old");
    }
}
