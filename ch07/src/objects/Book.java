package objects;

public class Book {
	
	// 필드
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	// 매소드 재정의

	@Override
	public int hashCode() {
		return bookNumber; // 해시코드 반환값과 같은 의미
	}
	
	
	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}

	@Override
	public boolean equals(Object obj) {
		// 강제 형변환
		if(obj instanceof Book) { // obj의 Book 인스턴스 객체라면
			Book book = (Book)obj; // 강제 형변환
			if(this.bookNumber == book.bookNumber)
				return true; // true 반환
		}
		return false;
	}

	
	
	

}
