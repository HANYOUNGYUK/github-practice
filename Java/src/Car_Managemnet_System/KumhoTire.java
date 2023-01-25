package Car_Managemnet_System;

public class KumhoTire extends Tire {
	
	//필드
	
	static KumhoTire kumhoTire = new KumhoTire();
	
	int lifespan;
	
	
	//메서드
	public void	spent() {
		if(lifespan % 2 == 0) {
			System.out.println("금호타이어" + lifespan + "년차 교체시기가 되었습니다.");
		}
	}

}
