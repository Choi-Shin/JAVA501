package p14.getters_setters;

public class TimeTest {

	public static void main(String[] args) {
		//입력: 02, 34, 35
		Time t = new Time(02,34,35);
		//    시간:0~23
		//    분 : 0~59
		//    초 : 0~59
		//출력: 02:34:35
		//System.out.println(t.getHour()+" : "+t.getMinute()+" : "+t.second);
		System.out.println(t);//주소값 =>   2:34:35
		System.out.println(t.toString());//주소값 =>   2:34:35
		
		String str = new String("홍길동");
		System.out.println(str);
		
	}

}
