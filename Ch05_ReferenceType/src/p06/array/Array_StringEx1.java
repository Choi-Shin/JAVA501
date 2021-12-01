package p06.array;

public class Array_StringEx1 {

	public static void main(String[] args) {
		// 1.변수: 주소값
		String s1 = new String("홍길동");
		String s2 = "홍길동";
		System.out.println(s1);
		System.out.println(s2);
		// 2. Reference Type: 변수에 주소값 저장
		// (1) 배열 생성 방법1
		String st1[] = { "홍길동1", "홍길동2", "홍길동3" };
		String st11[] = { new String("홍길동1"), new String("홍길동2"), new String("홍길동3") };
		System.out.println(st1);// 참조형 변수이므로 주소값 출력
		System.out.println(st1[0]);// 참조형 변수이므로 주소값 출력
		System.out.println(st1[1]);// 참조형 변수이므로 주소값 출력
		System.out.println(st1[2]);
		// (2) 배열 생성 방법2
		String st2[] = new String[] {new String("홍길동1"), "홍길동2", new String("홍길동3")  };
		System.out.println(st2[0]);
		System.out.println(st2[1]);
		System.out.println(st2[2]);

		// (3) 배열 생성 방법3
		String st3[] = new String[3];//갯수: 3
		st3[0] = "홍길동1";
		st3[1] = new String("홍길동2");
		st3[2] = new String("홍길동3");
		
		System.out.println(st3[0]);
		System.out.println(st3[1]);
		System.out.println(st3[2]);
		
		System.out.println("========for============");
		//1.for문장을 사용한 배열 내용 출력
		for(int i=0; i<st3.length; i++) {
			System.out.println(st3[i]);
//			System.out.println(a4[0]);
//		    System.out.println(a4[1]);
//		    System.out.println(a4[2]);	
		}
		
		//2.향상된 for문장을 사용한 배열 내용 출력
		for(String t: st3) {
			System.out.println(t);
//			System.out.println(a4[0]);
//		    System.out.println(a4[1]);
//		    System.out.println(a4[2]);	
		}
	}

}
