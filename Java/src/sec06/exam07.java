package sec06;

public class exam07 {

	public static void main(String[] args) {
		char grade = 'B';
				
		switch(grade) {
		case 'A' :
			System.out.println("우수 회원입니다.");
		break;
		
		case 'B' :
			System.out.println("일반 회원입니다.");
		break;
		
		default:
			System.out.println("손님입니다.");
		}
	}

}
