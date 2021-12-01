package study.board.arraylist;

import java.util.Scanner;

public class BoardMain {
	public void menu() {
		System.out.println("## 메뉴를 입력하세요. ##");
		System.out.println("1.게시판 글쓰기 2.글 목록 보기 3. 글 삭제 4.종료");
	}
	public static void main(String[] args) {
		BoardMain m = new BoardMain();
		Scanner sc = new Scanner(System.in);
		BoardSVC b = new BoardSVC();
		boolean isStop = true;
		do {
			m.menu();
			int select = sc.nextInt();
			if(select == 1) {
				b.writeArticle(sc);
			} else if (select == 2) {
				
			} else if (select == 3) {
				
			} else if (select == 4) {
				isStop = false;
			} continue;
		} while (!isStop);
	}

}
