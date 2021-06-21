package day04;

import java.util.Scanner;

public class Rectangle {
	int width;					//	사각형의 넓이 필드
	int height;					//	사각형의 높이 필드
	
	public int getArea() {		//	사각형의 면적 계산 메소드
		return width*height;
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		
		System.out.println("사각형의 면적은 " + rect.getArea());
		
		scanner.close();
	}
}
