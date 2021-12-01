package p07.polymorphism.array;
//318
public class ArrayMethod_Main {

	public static void main(String[] args) {
		//일반 클래스를 배열 사용했을때
		String[] str = new String[3];
		str[0]="홍길동1";
		str[1]="홍길동2";
		str[2]="홍길동3";
		for(int i=0; i<str.length; i++)
			System.out.println(str[i]);
		
		String[] str2 = {new String(),new String(), new String()};
		str2[0] = new String("홍길동");
		
		
		
		//배열의 다형성
		ArrayMethod[] am = new ArrayMethod[2];
        am[0] = new ArrayMethodA();
        am[1] = new ArrayMethodB();
        //for
        for(int i=0; i<am.length; i++)
			am[i].showSleepStyle();
	}

}
