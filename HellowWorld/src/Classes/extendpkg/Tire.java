package Classes.extendpkg;

public class Tire {
	// 필드선언하기
	int maxRotation; // 사용가능한 타이어 회전수 (10)
	int accumulateRotation; // 현재까지 타이어가 사용한 회전수
	String location; // 타이어 장착위치 (앞오, 앞왼, 뒤오, 뒤왼인지..등등)

	// 생성자 선언
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// 메소드 정의하기
	public boolean roll() { // 타이어의 축적된 회전수가 몇번인지 몇번이 사용가능한지 등 표현
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "Tire 수명: " 
		                         + (maxRotation - accumulateRotation));
		return true;
		} else {
			System.out.println("***" + location + "Tire 펑크 ***" );
			return false;
		}
	}
}
