package Classes;

public class Car {
//car 클래스의 필드 선언
	String company = "현대 자동차";
	String model = "그랜저";
	String color = "검정";
	String maxSpeed = "350";
	int speed;
	
	public Car() {
		
	}
	public Car(String company, String model, String color) {
		super(); //부목 클래스 , 없어도 상관없음
		this.company = company;
		this.model = model;
		this.color = color;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
