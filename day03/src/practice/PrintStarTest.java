package practice;

import java.util.Scanner;

public class PrintStarTest {

	public static void main(String[] args) {
		int line;
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오>>");
		line = input.nextInt();
		
		for(int i=line-1; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		input.close();
	}
}
