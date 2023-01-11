package sec20;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}

//질문 : 클래스에서 뻗어나온 객체가 또 다른 클래스가 되어 다른 클래스에서 객체생성을 할수있는지??