package p05.trywithresouces;

public class TryWithResourceExample {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("file.txt");
			fis.read();
			throw new Exception("강제적 예외 처리");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
			}
		}
		
		// (try-with-resources)
		try (FileInputStream fis2 = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception("강제적 예외처리");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
		}
	}

}
