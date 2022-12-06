package 계산기;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int number1;
		int number2;
		int number3;
	
		while(true) {
			System.out.println("---입력---");
			System.out.println("첫번째 숫자를 입력하시오");
			number1 = input.nextInt();

			System.out.println("두번째 숫자를 입력하시오");
			number2 = input.nextInt();

			number3 = number2 + number1;
			System.out.println("결과: " + number3);
		}
	}

}
