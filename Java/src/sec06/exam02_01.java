package sec06;

import java.util.Scanner;

public class exam02_01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int score = 100;
	
		System.out.println("====================");
		System.out.println("숫자를 입력하시기 바랍니다.");
		
		score = input.nextInt();
		
		if(score>=90) {
			System.out.println("점수가 90점 이상입니다.");
			System.out.println("등급이 A등급 입니다.");
		
		}
		else {
			System.out.println("점수가 90점 미만입니다.");
			System.out.println("등급이 B등급 입니다.");
		}
		
		System.out.println(score);
	}

}


