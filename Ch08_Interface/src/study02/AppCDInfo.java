package study02;

public class AppCDInfo extends CDInfo implements Lendable {
	String borrower;
	String checkOutDate;
	
	public AppCDInfo(String registerNo, String title) {
		super(registerNo, title);
	}
	
	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		System.out.println("*" + title + "CD가 반납되었습니다.\n");
		System.out.println();
	}
	@Override
	public void checkOut(String borrower, String date) {
		if(state != 0) {
			return;
		}
		this.state = 1;
		System.out.println("* " + title + " CD가 대출되었습니다.");
		System.out.println("대출인: " + borrower);
		System.out.println("대출일: " + date + "\n");
	}
}
