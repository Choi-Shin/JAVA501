package p14.getters_setters;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		
//		this.hour = hour;
//		this.minute = minute;
//		this.second = second;
		setHour(hour);
		setMinute(minute);
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour<0 || hour >23)
			return;
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute<0 || minute >59)
			return;
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second<0 || second >59)
			return;
		this.second = second;
	}
	
	@Override
	public String toString() {
		String result = hour+" : "+minute+" : "+second;
		return result;
	}
}
