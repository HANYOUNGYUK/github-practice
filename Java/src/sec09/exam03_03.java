package sec09;

import java.util.Scanner;

public class exam03_03 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
			
		String[] array = new String[5];
		
		array[0] = "한영욱";
		array[1] = "명형준";
		array[2] = "노진태";
		array[3] = "최용문";
		array[4] = "윤건륭";
		
		for(int i=0; i<5; i++) {
		System.out.println("이름 : " + array[i]);
		
		}
	}
}