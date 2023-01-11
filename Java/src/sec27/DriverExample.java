package sec27;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); // = bus.run();
		driver.drive(taxi); // = taxi.run();
	}
		//bus와 taxi를 굳이 객체를 생성하여 넣는 이유??
}
