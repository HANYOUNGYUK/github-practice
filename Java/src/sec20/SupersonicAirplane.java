package sec20;

public class SupersonicAirplane extends Airplane {

	//필드
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	//메서드
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다");
		}
		else {
			super.fly();
		//같은 패키지안의 클래스를 호출시는 this를 사용하지만, 다른클래스 특히 부모 클래스를 호출시는 super를 사용한다??
		}
	}

}