package sec06;

public class exam05_01 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1;
			
		switch(num) {
		
		case 1 :
			System.out.println("숫자 1이 나왔습니다.");
			break;
		case 2 :
			System.out.println("숫자 2가 나왔습니다.");
			break;
		case 3 :
			System.out.println("숫자 3이 나왔습니다.");
			break;
		case 4 :
			System.out.println("숫자 4가 나왔습니다.");
			break;
		case 5 :
			System.out.println("숫자 5가 나왔습니다.");
			break;
		case 6 :
			System.out.println("숫자 6이 나왔습니다.");
			break;
		}
			
	}
}

