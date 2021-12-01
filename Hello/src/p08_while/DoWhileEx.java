package p08_while;

public class DoWhileEx {

	public static void main(String[] args) {
		int i = 0;
	
//		do ~ while은 안에 있는 문장이 최소 1번 실행을 보장
		do {
			System.out.println(i);
			i++;
		} while ( i<5 );
		
		int j = 0;
//		while문은 안에 있는 문장이 1번도 실행 못할 수 있음
		while ( j<5 ) {
			System.out.println(j);
			j++;
		}
	}

}
