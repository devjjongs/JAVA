package day04b;

import java.util.Scanner;
class Book{
	String title, author;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {
	public static void main(String[] args) {
		Book [] Book = new Book[2];
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<Book.length; i++) {
			System.out.print("제목 >> ");
			String title = scanner.nextLine();
			System.out.print("저자 >> ");
			String author = scanner.nextLine();
			Book[i] = new Book(title, author);
		}
		for(int i=0; i<Book.length; i++)
			System.out.print("(" + Book[i].title + ", " + Book[i].author + ")");
		
		scanner.close();
	}

}
