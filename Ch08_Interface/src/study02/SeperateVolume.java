package study02;

public class SeperateVolume implements Lendable {
	String requestNo;
	String bookTitle;
	String writer;
	String borrower;
	String checkOutDate;
	byte state;
	
	public SeperateVolume(String requestNo, String bookTitle, String writer) {
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}

	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		System.out.println("*" + bookTitle + " 이(가) 반납되었습니다.\n");
	}

	@Override
	public void checkOut(String borrower, String date) {
		if(state != 0) {
			return;//대출이 된 상태이므로 무조건 return
		}
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;//대출이 된 상태
		System.out.println("* " + bookTitle + " 이(가) 대출되었습니다.");
		System.out.println("대출인: " + borrower);
		System.out.println("대출일: " + date + "\n");
	}

}
