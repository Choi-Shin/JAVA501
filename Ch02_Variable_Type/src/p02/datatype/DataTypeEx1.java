package p02.datatype;

public class DataTypeEx1 {
      //2.primitive type(기본형타입: ch2)
	//기본형 변수: 실제값
	  
	   //정수타입
	   byte by = 127; //1byte: 127~-128
	   char ch = 'a';//2byte: 0~65535
	   int chi = ch;//97
	   char ch2 = (char) chi;//4=>2byte : 강제형변환(Casting)
	   short sh = 100;//2byte: 32767~-32768
	   int    a = 10; //4byte: 21억 ~ -21억
	   long lg = 10;//8byte
	   
	   //실수타입
	   float f = 11.2f;//4byte: 부호1+지수8+가수23
	   double du = 11.2;//8byte: 부호1+지수11+가수52
	   
	   //논리타입
	   boolean bn = true;
	   
	  
	   
	public static void main(String[] args) {
		
		DataTypeEx1 dt = new DataTypeEx1();
		//1.참조타입(String):ch5
		//   참조변수:주소값
		String s = new String("홍길동");
		char c = s.charAt(0);
		System.out.println(c);
		
		//2.참조타입: 배열
		String str[] = {"홍길동1","홍길동2","홍길동3"};
		System.out.println(str[0]);
		
		System.out.println(dt.chi);
		System.out.println(dt.ch2);
	}

}
