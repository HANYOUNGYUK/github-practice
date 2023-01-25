package Car_Managemnet_System;

public class KumhoOil extends Oil {
	
	//필드
	
	static KumhoOil kumhoOil = new KumhoOil();
	
	int lifespan;
	
	
	//메서드
	public void	spent() {
		if(lifespan % 2 == 0) {
			System.out.println("금호오일" + lifespan + "년차 교체시기가 되었습니다.");
		}
	}

}
