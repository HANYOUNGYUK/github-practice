package sec07;

public class exam09 {

	public static void main(String[] args) {
		for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower<= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}
