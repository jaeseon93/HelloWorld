package Classes.extendpkg;

public class FriendExample {

	public static void main(String[] args) {
		// 각각의배열만들기
		Friend[] fArray = new Friend[5]; // 부모클래스
		UnivFriend[] uArray = new UnivFriend[5];
		ComFriend[] cArray = new ComFriend[5];

		UnivFriend uf = new UnivFriend("펭수", "1111", "Yedam", "Java");
		ComFriend cf = new ComFriend("재선", "2222", "YDCompany", "Develop");
		Friend f = new Friend ("name","3333");
		Friend f1 = uf; // 자식클래스 인스턴스를 부모클래스 타입으로 형변환이 일어날 수 있음
		Friend f2 = cf; //자식의 필드나 메소드는 사용못함 , 부모클래스것만 사용가능

		uf.getName(); // Friend class
		uf.getPhone(); // Friend class
		uf.getUniv(); // Univ class
		uf.getMajor(); // Univ class

		f1.getName(); // Friend class
		f1.getPhone(); // Friend class
		
		fArray[0] = uf; //UnivFriend class
		fArray[1] = cf; //ComFriend class
		fArray[2] = f; //Friend class
		
		for(int i=0;i<3;i++) {
			fArray[i].introduce();
		}
		
		
	}

}
