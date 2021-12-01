package p02.checked_exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("text.txt"));
			String str;
			do {
				str = br.readLine();
				if (str == null) {
				} else
					System.out.println(str);
			} while (!(str == null));
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("출력할 것이 없습니다.");
		}
		System.out.println("실행 완료");
		try {
			br.close();
			System.out.println("BufferedReader를 닫았습니다.");
		} catch (IOException e) {
			
		}
	}
}
