package calculator;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int fisrtNum;
		int seconNum;
		int result;
	
		System.out.println("---입력---");
		System.out.println("첫번째 숫자를 입력하시오");
		fisrtNum = input.nextInt();

		System.out.println("두번째 숫자를 입력하시오");
		seconNum = input.nextInt();

		result = seconNum + fisrtNum;
		System.out.println("결과: " + result);
	
	}

}
