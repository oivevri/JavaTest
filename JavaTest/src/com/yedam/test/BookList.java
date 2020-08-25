package com.yedam.test;

public class BookList {
//	필드
	private String bookName; // 책이름
	private String writer; // 저자
	private int number; // 책번호
//	생성자
	public BookList() {
	}
	public BookList(String bookName, String writer, int number) {
		super();
		this.bookName = bookName;
		this.writer = writer;
		this.number = number;
	}
//	메소드
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

}
