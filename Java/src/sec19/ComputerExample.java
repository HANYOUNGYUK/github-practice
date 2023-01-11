package sec19;

public class ComputerExample {

	public static void main(String[] args) {
		
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		//객체 생성 없이 바로 Calculator의 클래스를 호출하지않는 이유는??
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCircle(r));
		//객체 생성 없이 바로 Computer의 클래스를 호출하지않는 이유는??

		
	}

}
