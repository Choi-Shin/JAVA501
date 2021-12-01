package p02_data_type2;

public class CharEx {

	public static void main(String[] args) {
//		char data 변수는 내부적으로 이진수를 갖고 있는데, 영문자 : ascii code값을 갖고있음
//		ascii : American Standard Code for Information Interchange
		char c1 = 'A';
		char c2 = 65;
		// unicode라는 의미 : 전세계 모든 국가 언어의 글자를 포함 
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		int uniCode = c1;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);

	}

}
