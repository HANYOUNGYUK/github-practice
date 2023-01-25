package Car_Managemnet_System;

public class BaekjongwonOil extends Oil {
	
	//필드
	
	static BaekjongwonOil baekjongwonOil = new BaekjongwonOil();
	
	int lifespan;
	
	
	//메서드
	public void	spent() {
		if(lifespan % 5 == 0) {
			System.out.println("백종원오일" + lifespan + "년차 교체시기가 되었습니다.");
		}
	}

}
