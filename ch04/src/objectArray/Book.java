package objectArray;

public class Book {
	
	String bookName;
	String author;
	
	Book() {} // 기본 생성자
	
	
	Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	void bookInfo() {
		System.out.println(bookName + ", " + author);
	}
	
	// 책 이름을 입력하는 메소드
	void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	// 책 이름을 가져오는 메소드
	String getBookName() {
		return bookName;
	}
	
	// 저자를 입력하는 메소드
	void setAuthor(String author) {
		this.author = author;
	}
	
	// 저자를 가져오는 메소드
	String getAuthor() {
		return author;
	}
}
