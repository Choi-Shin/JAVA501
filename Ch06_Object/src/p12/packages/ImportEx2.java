package p12.packages;

import static java.lang.System.out;
import static java.lang.Math.*;

 public class ImportEx2 {

	static int a = 10;//공유 변수
	static String str1 = "홍길동";
	static String str2 = new String("홍길동");
	
	
	public static void main(String[] args) {
		
	
		System.out.println(Math.random());
		out.println(Math.random());
		System.out.println(Math.PI);
		System.out.println(PI);
		
		System.out.println("홍길동");
		System.out.println();
		
		ImportEx2 it1 = new ImportEx2();
		it1.a=20;
		ImportEx2 it2 = new ImportEx2();
		System.out.println(it2.a);
		//ImportEx2 it2 = new ImportEx1();//형제 관계 객체생성불가 => 상속관계는 가능
     
		System.out.println(a);
		System.out.println(str1);//원래는 주소값이 나와야하나 , 원 개발자가 추가작성해서 생성자값이 출력
		System.out.println(str2);//원래는 주소값이 나와야하나 , 원 개발자가 추가작성해서 생성자값이 출력
	}

}
