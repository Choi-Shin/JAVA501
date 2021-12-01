package study.board.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class BoardSVC {
	ArrayList<BoardVO> al = new ArrayList<>();
	BoardVO b = new BoardVO();
	public void writeArticle(Scanner sc) {
		System.out.println("[게시판 글을 작성하세요]");
		System.out.print("작성자 : ");
		b.setRegister(sc.next());
		System.out.print("이메일 : ");
		b.setEmail(sc.next());
		System.out.print("비밀번호 : ");
		b.setPasswd(sc.next());
		System.out.print("제목 : ");
		b.setSubject(sc.next());
		System.out.print("글 내용 : ");
		b.setContent(sc.next());
		BoardSVC boardSVC = new BoardSVC();
		boardSVC.addArticle(b);
	}
	
	private void addArticle(BoardVO boardVO) {
		al.add(boardVO);
	}
	
	public void listArticles(Scanner sc) {
		System.out.println();
	}
	
	public void removeArticle(Scanner sc) {
		
	}
	
	public void removeArticle(String register, String passwd) {
		
	}
}
