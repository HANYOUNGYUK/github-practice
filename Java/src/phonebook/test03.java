package phonebook;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	int[][] array = new int[2][2];
	
	int i = 0;
	int j = 0;
	
	for(i=0; i<2; i++) {
		for(j=0; j<2; j++) {
			
		System.out.println("====값을 입력하세요===");
		array[i][j] = input.nextInt();
		}
	}
	System.out.println(array[i][j]);
	
	}

}
