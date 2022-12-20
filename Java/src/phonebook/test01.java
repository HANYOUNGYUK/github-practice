package phonebook;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] name = null;
		int[] birth = 0;
		int[] number = 0;
		
		
		System.out.println("1번:입력, 2번:조회, 3번:수정, 4번:삭제");

		
		//1번 입력기능
		for(a=0; a<100; a++) {
			System.out.println("-------이름 입력-------");
			for(i=0; i<100; i++) {
				name[i] = input.next();
			}
		
			System.out.println("-------생년월일 입력-------");
			for(k=0; k<100; k++) {
				birth[k] = input.nextInt();	
			}
			
			System.out.println("-------전화번호 입력-------");
			for(j=0; j<100; j++) {
				number[j] = input.nextInt();	
			}
		System.out.println(a);
		}
		
		
		//2번 조회기능
		
		
		System.out.println();
	}

}
