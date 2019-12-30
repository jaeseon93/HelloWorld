package Classes.extendpkg;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {

		super(location, maxRotation);  //부모메소드 Tire를 호출
	}

	@Override //재정의하기
	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명: "
		                              + (maxRotation - accumulateRotation));
			return true;
		} else {
			System.out.println("***" + location + "HankookTire 펑크 ***");
			return false;
		}
	}
}
