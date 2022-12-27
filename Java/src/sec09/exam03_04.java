package sec09;

import java.util.Scanner;

public class exam03_04 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
			
		String[][] array = new String[3][3];
		
		array[0][0] = "한영욱";
		array[1][0] = "명형준";
		array[0][1] = "노진태";
		array[0][2] = "최용문";
		array[2][0] = "윤건륭";
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("이름 : " + array[i][j]);
		
		}
	}
}
}