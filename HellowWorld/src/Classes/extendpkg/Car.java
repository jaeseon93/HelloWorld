package Classes.extendpkg;

public class Car {
	// 필드 4개 선언 . Tire 클래스의 생성자를 호출해서 씀
//	Tire frontLeft = new Tire("앞왼쪽", 6);
//	Tire frontRight = new Tire("앞오른쪽", 3);
//	Tire backLeft = new Tire("뒤왼쪽", 3);
//	Tire backRight = new Tire("뒤오른쪽", 4);

	// 위의 필드를 배열로 써보기
	Tire[] tires = { new Tire("앞왼쪽", 6), new Tire("앞오른쪽", 3), new Tire("뒤왼쪽", 3), new Tire("뒤오른쪽", 4) };

	void stop() { // stop 메소드를 선언해줌
		System.out.println("[자동차가 멈춥니다]");
	}

	int run() { // 타이어가 펑크가 나면 알려주고 몇번째 위치에서 나는건지 나타내주는 메소드가 run.roll을 호출
		System.out.println("[자동차가 달립니다]");
		for (int i = 0; i < tires.length; i++) {
			if (tires[i].roll() == false) { // 첫번째 필드 방법을쓰려면 배열대신frontLeft가오면됨.
				stop();
				return i + 1;
				// 왼.앞. 위치는 내가 임의로 예를 들어줌
			}
		} //위의 배열값으로 나타면 밑에 애들을 굳이 다 적어줄 필요가 없음. (for구문으로 반복해서 돌려주면됨) 
//		if (frontRight.roll() == false) {
//			stop();
//			return 2; // 오.앞.
//		}
//		if (backLeft.roll() == false) {
//			stop();
//			return 3; // 왼.앞. 위치는 내가 임의로 예를 들어줌
//		}
//		if (backRight.roll() == false) {
//			stop();
//			return 4; // 왼.앞. 위치는 내가 임의로 예를 들어줌
//		}
		return 0; // 0 값을 리턴하면 아무문제가 없다고 선언.
	}

}
