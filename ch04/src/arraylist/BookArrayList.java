package arraylist;

import java.util.ArrayList;

import objectArray.Book;

public class BookArrayList {

	public static void main(String[] args) {
		// 책을 저장할 Arraylist의 공간 생성
		
		ArrayList<Book> bookList = new ArrayList<>();
		
		// 책 객채 생성
		Book book1 = new Book("반응형 웹사이트", "김은아");
		Book book2 = new Book("Tiny Python Project", "켄 유앤스-클릭");
		
		
		
		// bookList에 저장
		bookList.add(book1);
		bookList.add(book2);
		
		// book1, book2의 정보 출력
		book1.bookInfo();
		book2.bookInfo();
		
		
		// book의 정보(인덱싱)
		System.out.println(bookList.get(0)); // 객체의 주소
		bookList.get(0).bookInfo(); // 객체의 경로
		
		// booklist의 크기
		System.out.println(bookList.size() + "개");
		
		// 전체 요소 출력
		for(int i=0; i<bookList.size(); i++) {
			Book book = bookList.get(i);
			book.bookInfo();
		}
		
		// book2 삭제
		if(bookList.contains(book2)) {
			bookList.remove(book2);
			
		//향상 for 문(자료형 변수 : 리스트이름){}
			
			for(Book book : bookList)
				book.bookInfo();
			
		}
		
	}

}
