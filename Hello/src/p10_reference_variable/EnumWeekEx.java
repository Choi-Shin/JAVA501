package p10_reference_variable;

// Calendar : Class 이름 (java에서 만들어 놓은 class)
// 날짜, 년도, 월, 일 데이터 가져올 때 사용
import java.util.Calendar;

public class EnumWeekEx {

	public static void main(String[] args) {
//		Week : data type, today:변수명
		Week today;
		
//		today = 0;
		today = Week.THURSDAY;
		today = Week.FRIDAY;
		
//		열거타입 : 참조타입이기 때문에 null값을 허용
		today = null;

		Calendar cal = Calendar.getInstance();
//		week에는 1(일요일) ~ 7(토요일) 사이의 정수값
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1:
				today = Week.SUNDAY;
				break;
			case 2:
				today = Week.MONDAY;
				break;
			case 3:
				today = Week.TUESDAY;
				break;
			case 4:
				today = Week.WEDNESDAY;
				break;
			case 5:
				today = Week.THURSDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
			case 7:
				today = Week.SATURDAY;
				break;
		}
		
		System.out.println("오늘 요일 = " + today);
		
		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부 합니다.");
		}
	}

}








