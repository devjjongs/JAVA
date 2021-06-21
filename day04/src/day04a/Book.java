package day04a;

public class Book {
	String title;
	String author;
	void show() {System.out.println(title + " " + author);}
	
	public Book() {
		this("","");		//	17번 생성자 호출
		System.out.println("또 다른 생성자 Book(String, String) 호출됨");
	}
	
	public Book(String title) {
		this(title, "작자미상");
		System.out.println("Book(String)에서 Book(String, String)생성자 호출됨");
	}
	
	public Book(String title, String author) {		//	9번에 호출되어 공백 생성
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐베리");
		Book loveStory = new Book("춘향전");
//		Book emptyBook = new Book();
		littlePrince.show();
		loveStory.show();		//	>> 6번의 show와 연결되며 출력
	}
}
