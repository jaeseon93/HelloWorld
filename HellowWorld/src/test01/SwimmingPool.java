package test01;

public class SwimmingPool {
	int memberId;
	String name;
	int phone;

	SwimmingPool() {

	}

	SwimmingPool(String name, int phone) {
        this.name = name;
        this.phone = phone;
		
	}

	SwimmingPool(int memberId, String name, int phone) {
		this.memberId = memberId;
		this.name = name;
        this.phone = phone;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "SwimmingPool [회원아이디=" + memberId + ", 회원이름=" + name + ", 폰 번호=" + phone + "]";
	}
	
	

}
