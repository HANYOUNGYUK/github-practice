package Car_Managemnet_System;

public class Car {
	
	//필드
	
	static Car car[] = new Car[3];
	
	String name;
	String company;
	static int lifespan;
	
	Tire leftfronttire = new Tire();
	Tire leftbacktire = new Tire();
	Tire rightfronttire = new Tire();
	Tire rightbacktire = new Tire();
	
	Oil engineoil = new Oil();
	Oil missionoil = new Oil();
	Oil brakeoil = new Oil();
	
	//생성자
	Car(){
		this.leftfronttire = HankookTire.hankookTire;
		this.leftbacktire = HankookTire.hankookTire;
		this.rightfronttire = KumhoTire.kumhoTire;
		this.rightbacktire = KumhoTire.kumhoTire;
		this.engineoil = HankookOil.hankookOil;
		this.missionoil = KumhoOil.kumhoOil;
		this.brakeoil = BaekjongwonOil.baekjongwonOil;
	}
	
	//메서드
	public void spent() {
		if(lifespan == 50) {
			System.out.println("자동차 수명이 만료되었습니다");
		}
	}
}