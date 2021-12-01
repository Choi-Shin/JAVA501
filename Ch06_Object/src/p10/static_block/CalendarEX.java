package p10.static_block;

import java.util.Calendar;

public class CalendarEX {

	public static void main(String[] args) {
		//Calendar: 추상클래스이므로 자식객체를 생성해서 객체생성해서 사용
		//Singlton개념을 이용해서 Calendar Class안에 있는 모든 변수와 메소드 사용
		 Calendar cal =  Calendar.getInstance();//일종의 Singleton
		 int year = cal.get(Calendar.YEAR);//2021
		 int month = cal.get(Calendar.MONTH)+1;                                   //10
		 int date = cal.get(Calendar.DATE);
		 
		 System.out.println(year+"/"+month+"/"+date);
	}

}
