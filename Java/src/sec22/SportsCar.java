package sec22;

public class SportsCar extends Car {		

	public void speedUp() {speed += 10;}
	
	
	//final 메소드기 때문에 재정의할수 없음.
//	public void stop()	{
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
}
