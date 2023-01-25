package Car_Managemnet_System;

public class HankookTire extends Tire {
	
	//필드
	
	static HankookTire hankookTire = new HankookTire();
	
	int lifespan;
	
	//생성자
	HankookTire(){
		this.hankookTire = hankookTire;
	}
	
	
	//메서드
	public void	spent() {
		if(lifespan % 3	 == 0) {
			System.out.println("한국타이어" + lifespan + "년차 교체시기가 되었습니다.");
		}
	}

}
