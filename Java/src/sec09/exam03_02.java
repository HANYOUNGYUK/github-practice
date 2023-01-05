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
			System.out.println("전화번호부에 값이 존재합니다");
		}
	}
}

// 이중 for문 안에서 if문을 돌려 value값과 input 값을 비교하여 일치하는지 안하는지 확인하기.
// array는 주소값을 가지고 있기 때문에 value값을 나열해서 찾아야한다.	