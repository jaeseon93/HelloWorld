package Classes;

//예시 . 학생이라는  객체   
public class Student {
	// 필드
	String university; //학교를 나타내는 필드
	String studentNo;// 학번을나타내는 필드
	String studentName; // 이름
	String major; // 전공
	int age; // 나이
	
	// 생성자

	Student() { //매개값이 없는 생성자

	}
	Student(String university, String studentNo, String studentName){   //매개값이 3개있는 생성자.
		this.university = university; //이름이 같을경우 구분해 주기위해서 this라는 인스턴스를 붙여준다.
		this.studentNo = studentNo;
		this.studentName = studentName;
	}

	// 메소드
	void introduce() {
		System.out.println("학교는" + university + "이고" + "학번은 " + studentNo + "이고 이름은" + studentName + "입니다.");
	}

	void study() { // 공부한다라는 메소드
		System.out.println("공부한다.");
	}

	void basketBall() { // 메소드
		System.out.println("농구한다.");
	}

	void sleep() { // 메소드
		System.out.println("잠을잔다.");
	}

	void doHomework() { // 메소드
		System.out.println("숙제한다.");
	}

}
