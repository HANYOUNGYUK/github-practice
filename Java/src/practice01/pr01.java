package practice01;

import java.util.Scanner;

public class pr01 {

	public static void main(String[] args) {
	//한 층의 높이가 5m일 때, 건물이 몇 층인지 입력받아 높이를 출력하라.
		
	Scanner input = new Scanner(System.in);
	
	final int Height = 5;
	int Floor = 0;
	
	for(int i=0; i<3; i++) {
		System.out.println("----건물의 층수를 입력하시오----");
		Floor = input.nextInt();
		System.out.println("건물의 총 높이는 " + Height * Floor + "m 입니다");
		}
		
	}

}
