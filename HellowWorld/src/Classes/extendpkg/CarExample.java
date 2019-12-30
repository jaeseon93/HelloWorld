package Classes.extendpkg;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car(); // car 인스턴스를 선언
		// car의 run메소드를 호출 ,run이 한번씩 실행될때마다 accumulateRotation은 하나씩 커져가서 결국
		// maxRotation값에 다가감.

		for (int i = 0; i <= 10; i++) {
			int problemLocation = car.run(); //아무문제가 없으면 0값을 호출
			
			switch(problemLocation) {
			case 1:  //run의 1을 return했음
				System.out.println("앞왼쪽 타이어 교체필요");
				car.tires[0] = new HankookTire("앞왼쪽",10);
				break;
			case 2:  //run의 2을 return했음
				System.out.println("앞오른쪽 타이어 교체필요");
				car.tires[1] = new KumhoTire("앞오른쪽",11);
				break;
			case 3:  //run의 3을 return했음
				System.out.println("뒤왼쪽 타이어 교체필요");
				car.tires[2] = new HankookTire("뒤왼쪽",13);
				break;
			case 4:  //run의 4을 return했음
				System.out.println("뒤오른쪽 타이어 교체필요");
				car.tires[3] = new KumhoTire("뒤오른쪽",12);
				
			}
			System.out.println("--------------------------"); //돌아갔다는걸 구분하기위해 달아둠

		}
	}

}
