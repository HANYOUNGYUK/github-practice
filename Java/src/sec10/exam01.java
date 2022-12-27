package sec10;

import java.util.Calendar;

public class exam01 {
	public static void main(String[] args) {
		
		String week;
		String today;
		
		Calendar cal = Calendar.getInstance();
		String week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1 :
			today = week.SUNDAY; break;
			
		case 2 :
			today = week.MONDAY; break;
			
		case 3 :
			today = week.TUESDAY; break;
			
		case 4 :
			today = week.WEDNESDAY; break;
			
		case 5 :
			today = week.THURSDAY; break;
			
		case 6 :
			today = week.FRIDAY; break;
			
		case 7 :
			today = week.SATURDAY; break;
		}
		
		System.out.println("오늘 요일: " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}
		else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}

}
