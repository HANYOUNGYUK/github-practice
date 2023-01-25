package Car_Managemnet_System;

public class HankookOil extends Oil {
	
	//필드
	
	static HankookOil hankookOil = new HankookOil();
	
	int lifespan;
	
	
	//메서드
	public void	spent() {
		if(lifespan % 3 == 0) {
			System.out.println("한국오일" + lifespan + "년차 교체시기가 되었습니다.");
		}
	}

}
