package sec06;

import java.util.Scanner;

public class exam02_02 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	int score = 0;

	System.out.println("=======입력하세요=======");
	score = input.nextInt();
	
	switch(score) {
	case 90 : 
		System.out.println("등급이 A 입니다.");
		break;	
	case 80 :
		System.out.println("등급이 B 입니다.");
		break;
	case 70 : 
		System.out.println("등급이 C 입니다.");
		break;	
	case 60 :
		System.out.println("등급이 D 입니다.");
		break;
	default :
		System.out.println("불합격 입니다.");
		break;
	}
		
		}
	}


