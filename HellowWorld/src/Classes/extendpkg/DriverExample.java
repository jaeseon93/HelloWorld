package Classes.extendpkg;

public class DriverExample {

	public static void main(String[] args) {
      Driver driver = new Driver();
      Vehicle vehicle = new Vehicle();
      
      vehicle = new Bus();
      vehicle = new Truck();
      
      driver.drive(vehicle); //매개변수의 다형성.
      
      Bus bus = new Bus();
      Truck truck = new Truck();
      driver.drive(bus);
      driver.drive(truck);
      
	}

}
