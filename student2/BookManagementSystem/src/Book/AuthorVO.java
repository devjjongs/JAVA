package Book;

public class AuthorVO {
	private String name; //占싱몌옙
	private String book;
	private String career; //占싱뤄옙
	private String contact;  //占쏙옙占쏙옙처
	
	public AuthorVO() {
	}
	
	public AuthorVO(String name, String book, String career, String contact) {
		this.name = name;
		this.book = book;
		this.career = career;
		this.contact = contact;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public static void main(String[] args) {

	}

}
