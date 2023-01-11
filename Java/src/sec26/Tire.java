package sec26;

public class Tire {

	//필드
	public int maxRotation;
	public int accumulatedRotation;
	public String location;

	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		++accumulatedRotation; //변수 초기화를 하지 않아도 int의 초기값은 0.
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Tire 수명 : " + (maxRotation-accumulatedRotation) + "회");
			return true;
		}
		else {
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
	}
}