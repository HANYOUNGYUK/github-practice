package 계산기;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int number1;
		int number2;
	
		System.out.println("---입력---");
		System.out.println("첫번째 숫자를 입력하시오");
		number1 = input.nextInt();

		System.out.println("두번째 숫자를 입력하시오");
		number2 = input.nextInt();
		number2 = number2 + number1;
		
		System.out.println("결과: " + number2);
	
	}

}
