package Classes;

public class Member {
	// 필드 4개 선언
	// private 외부로 나가지 않게 하는것
	private String name;
	private String id;
	private String password;
	private int age;

	public Member() {
		
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + "]";
	}
	// 생성자 생성
	public Member(String name, String id, String password, int age) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}

	//get 메소드
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public int getAge() {
		return age;
	}

	//set 메소드
	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
