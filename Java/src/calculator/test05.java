package calculator;

import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int Number1;
		int Number2;
		int Number3;
		int Number4 = Number1 + Number2;
		int Number5 = Number1 - Number2;
		int Number6 = Number1 * Number2;
		int Number7 = Number1 / Number2;
		
		System.out.println("---입력---");
		System.out.println("첫번째 숫자를 입력하세요.");
		Number1 = input.nextInt();

		System.out.print("두번째 숫자를 입력하세요.");
		Number2 = input.nextInt();
		
		System.out.println("연산을 선책하세요.");
		System.out.println("1-덧셈, 2-뺄셈, 3-곱셈, 4-나눗");
		Number3 = input.nextInt();
			if(Number3 == 1) {
				System.out.println("결과 :" + Number4);
			}
			if(Number3 ==2) {
				System.out.println("결과 :" + Number5);
			}
			if(Number3 ==3) {
				System.out.println("결과 :" + Number6);
			}
			if(Number3 ==4) {
				System.out.println("결과 :" + Number7);
			}
			else;
		
	}

}
