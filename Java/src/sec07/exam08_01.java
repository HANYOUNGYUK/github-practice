package sec07;

public class exam08_01 {

	public static void main(String[] args) {
		while(true) {
			int num = (int)	(Math.random() * 6) + 1;
			System.out.println(num);
				if (num%2 == 0) {
					break;
		}
	}
		System.out.println("========프로그램 종료========");
}
}
