package Book;

public class BookVO {
	private String title;  //도서명
	private String author;  //저자
	private String publisher;  //출판사
	private int year;  //발행 연도
	private String genre;  //장르
	
	public BookVO() {
		
	}
	
	public BookVO(String title, String author, String publisher, int year, String genre) { 
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}
