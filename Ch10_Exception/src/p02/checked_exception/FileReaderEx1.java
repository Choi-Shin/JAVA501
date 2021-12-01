package p02.checked_exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import p01.unchecked_exception.ArrayIndexOutofBoundExceptionExample;

//Checked Exception: 컴파일시 예외발생 => 반드시 try~catch
public class FileReaderEx1 {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader("text.txt");
			br = new BufferedReader(fr);
			String str = null;
			do {
				str = br.readLine();
				if (str == null) {
				} else
					System.out.println(str);
			} while (!(str == null));
		} catch (FileNotFoundException e) {
			System.out.println("해당 위치에 파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("");
		}
		System.out.println("Done");
		try {
			br.close();
		} catch (IOException e) {

		}
	}

}
