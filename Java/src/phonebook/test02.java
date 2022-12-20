package phonebook;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] name = new String[3];
		int[] birth = new int[3];
		int[] number = new int[3];
		
		// System.out.println("1번:입력, 2번:조회, 3번:수정, 4번:삭제");
		
		//1번 목표설정 : 
		for(int i=0; i<3; i++) {
			System.out.println("-------이름 입력-------");
			name[i] = input.next();
			System.out.println("-------생년월일 입력-------");
			birth[i] = input.nextInt();
			System.out.println("-------전화번호 입력-------");
			number[i] = input.nextInt();
			System.out.print("name" + name[i] + "birth" + birth[i] + "number" + number[i]);
			}
		}
	
	}
