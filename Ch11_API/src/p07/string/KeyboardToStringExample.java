package p07.string;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
	   //읽은 바이트를 저장하기 위한 배열 생성
		byte b[] = new byte[100];
		//키보드 입력내용을 배열에 저장하고, 바이트수 변수에 저장
		int readByteNo = System.in.read(b);
		System.out.println(readByteNo-2);
		for(int i=0; i<b.length; i++)
			System.out.println(b[i]);
		
		String str2 = new String(b,0,readByteNo-2);//숫자코드값 => 문자열 코드값
        System.out.println(str2);
	}

}
