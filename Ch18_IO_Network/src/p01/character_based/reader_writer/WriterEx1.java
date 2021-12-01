package p01.character_based.reader_writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriterEx1 {

	public static void main(String[] args) {
		FileWriter fw = null;
		FileReader fr = null;
		try {
			fw = new FileWriter("fw.txt");
			char[] arr = {'j','a','v','a','O','r','a','c','l','e'};
			for (int i=0; i<arr.length; i++) {
				fw.write(arr[i]);
			}			
			
		} catch (IOException e) {
			System.out.println("file dosn't exist");
		}
		
		try {
			fw.close();
		} catch (IOException e) {
		}
	}

}
