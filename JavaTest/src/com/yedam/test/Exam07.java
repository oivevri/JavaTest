package com.yedam.test;

import java.sql.Blob;
import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		BookList[] bookList = null;
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int cnt = 0;

		while (run) {
			System.out.println("1.도서 수 2.등록 3.삭제 4.전체목록 9.종료");
			System.out.println("-----------------------");
			System.out.println("선택> ");

			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				System.out.println("도서 수> ");
				int bookNum = scn.nextInt(); scn.nextLine();
				bookList = new BookList[bookNum];
			
			} else if (selectNo == 2) {	
				System.out.println("도서 등록");
				System.out.println("책 이름> ");
				String bookName = scn.nextLine();

				System.out.println("저자> ");
				String writer = scn.nextLine();

				System.out.println("책 번호> ");
				int number = scn.nextInt();
				scn.nextLine();

				BookList book = new BookList(bookName, writer, number);
				for (int i = 0; i < bookList.length; i++) {
					if (bookList[i] == null) {
						bookList[i] = book;
						break;
					}
				}
			} else if (selectNo == 3) {
				System.out.println("도서 삭제");
				System.out.println("책 번호> ");
				int delNm = scn.nextInt();
				for(int i = delNm; i<bookList.length; i++) {
					if (bookList[i].getNumber() == delNm) {
						bookList[i] = null;break;
						} 
					}
				cnt++;
			
			} else if (selectNo == 4) {
				for (BookList bl : bookList) {
					System.out.println("전체목록 보기");
					{
						if (bl != null) {
							System.out.println("책이름: " + bl.getBookName() 
							+ ", 책번호: " + bl.getNumber()
							+ ", 저자: "	+ bl.getWriter());
						}
					}
				}
			} else if (selectNo == 9) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
