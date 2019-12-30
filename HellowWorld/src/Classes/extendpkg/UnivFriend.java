package Classes.extendpkg;

public class UnivFriend extends Friend {
   private String univ;
   private String major;
   
   //생성자 만들기 (오른쪽마우스 소스 - constructor using field)
public UnivFriend(String name, String phone, String univ, String major) {
	super(name, phone); //부모클래스를 가지고 있는 생성자를 호출
	this.univ = univ;
	this.major = major;
}


//getter setter 추가
public String getUniv() {
	return univ;
}

public void setUniv(String univ) {
	this.univ = univ;
}

public String getMajor() {
	return major;
}

public void setMajor(String major) {
	this.major = major;
}

//to String 만들기
@Override
public String toString() {
	return "UnivFriend [univ=" + univ + ", major=" + major + "]";
}


@Override  //friend가 가지고있는 오버라이드를 자식클래스인 univ에서 재정의함
public void introduce() {
	System.out.println("이름은: " + super.getName() + " 연락처는: " + super.getPhone() + "학교: " + univ + "전공: " + major);
}
   
   
}
