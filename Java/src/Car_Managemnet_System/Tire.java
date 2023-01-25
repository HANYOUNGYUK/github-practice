package Car_Managemnet_System;

public class Tire {

	//필드
	int lifespan;
	
	//메서드
	public void	run() {
		if(lifespan % 3 == 0) {
			System.out.println("한국타이어" + lifespan + "년차 교체시기가 되었습니다.");
		}
	}
}
