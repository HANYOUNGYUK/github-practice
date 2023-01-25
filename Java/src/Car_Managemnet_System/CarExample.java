package Car_Managemnet_System;

import java.util.Scanner;

public class CarExample {
			
	public static void main(String[] args) {
				
	//필드
	Car car[] = {KoreaCar.koreaCar, ChinaCar.chinaCar, JapanCar.japanCar};
	
	
	//타임루프
	for(int i=0; i<50; i++) {
		System.out.println("--------자동차 관리 시스템 -----------");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("--------숫자를 입력하세요 ----------");
		int number = input.nextInt();
		
		System.out.println(car[number]);
		
		}		
	}
}