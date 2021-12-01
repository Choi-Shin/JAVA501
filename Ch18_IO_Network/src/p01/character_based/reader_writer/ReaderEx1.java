package p01.character_based.reader_writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderEx1 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("fw.txt");
			int readData;
			try {
				while ((readData=fr.read()) != -1) {
					System.out.println((char)fr.read());
				}
			} catch (IOException e) {
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		}
		
		
	}

}
