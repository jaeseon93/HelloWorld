package Classes;

public class StudentExample {
    public static void main(String[] args) {
		String str = "Hello";
		String str1 = new String("Hello");
		
		
		Student student = new Student(); //Student에 참조할 값의 주소를 보여줌
		//만든 필드값 정의
		student.university = "오라클";
		student.studentNo = "191234-1234";
		student.studentName = "이동휘";
		student.age = 20;
		student.major = "English";
//		System.out.println(student.major);
		student.introduce();
		//메소드 호출
		Student student1 = new Student("Yedam", "921111-1111", "김고은");
		student1.introduce();
//		student.doHomework();
//		System.out.println(student);
				
	}
}
