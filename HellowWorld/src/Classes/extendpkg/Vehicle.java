package Classes.extendpkg;
//vehicle 이라는 부모클래스 생성하기
public class Vehicle {
	//필드 생성
   String engine;
   String handle;
   
   //메소드 생성
   void start() {
	   System.out.println("차가 출발합니다.");
   }
   void run() {
	   System.out.println("차가 달립니다.");
   }
   void stop() {
	   System.out.println("차가 정지합니다.");
   }
}
