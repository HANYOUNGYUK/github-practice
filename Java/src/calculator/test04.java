package calculator;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int firstNum;
		int secondNum;
		int selectNum;
		int result = 0;

		while (true) {
//		int result = 0;
			System.out.println("---입력---");
			System.out.println("첫번째 숫자를 입력하세요.");

			firstNum = input.nextInt();

			System.out.print("두번째 숫자를 입력하세요.");

			secondNum = input.nextInt();

			System.out.println("연산을 선책하세요.");
			System.out.println("1-덧셈, 2-뺄셈, 3-곱셈, 4-나눗셈, 5-종료");
			selectNum = input.nextInt();

			switch (selectNum) {
			case 1:
				result = Sum(firstNum, secondNum);
				break;
			case 2:
				result = firstNum - secondNum;
				break;
			case 3:
				result = firstNum * secondNum;
				break;
			case 4:
				result = firstNum / secondNum;
				break;
			case 5:
				break;
			default:
				System.out.println("잘못된 숫자를 입력했습니다.");
			}
			if(selectNum == 5) break;
			System.out.println(result);
			
		}

	}

	public static int Sum(int first, int second) {
		return first + second;
	}

}
