package sec09;

import java.util.Scanner;

public class exam03_02 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int number;
		
		int[][] array = {
							{100, 200, 300},
							{200, 300, 400},	
							{300, 400, 500}
						};
		
		System.out.println("=====값을 입력하세요====");
		number = input.nextInt();
		if(number == 500) {
			System.out.println("전화번호부에 값이 존재하지 않습니다");
		}
	}
}